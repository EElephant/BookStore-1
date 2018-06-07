/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/7 15:40
 * @version V1.0
 */
package top.yimiaohome.dao;

import javassist.bytecode.ClassFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//泛型类，实现泛型接口BaseDao
@Transactional
public class BaseDaoImpl<T,PK extends Serializable> implements BaseDao<T,PK> {

    @Autowired
    SessionFactory sessionFactory;

    Logger logger;
//  当前实体的类
    private Class<T> entityClass;

    public BaseDaoImpl(){
        this.entityClass = null;
        this.logger = null;
//        获取当前运行类的类型
        Class c = this.getClass();
//        获取当前运行类的泛型父类类型，由所有类型的公用高级接口 Type 接收
        Type t = c.getGenericSuperclass();
//        如果接收到的类型属于泛型参数
        if (t instanceof ParameterizedType){
//            获取泛型类的参数（即本类的 <T,PK>)
            Type[] p = ((ParameterizedType) t).getActualTypeArguments();
//            转换类型
            this.entityClass = (Class<T>)p[0];
//            配置 log
            logger = LogManager.getLogger(entityClass.getName());
        }
    }

//  获取当前session
    private Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }

//  依据主键获取实体。假设没有对应的实体，返回null
    @Override
    public T get(PK id) {
        return this.getSession().get(entityClass,id);
    }

//  依据主键获取实体。假设没有对应的实体，返回null
    @Override
    public T load(PK id) {
        return this.getSession().load(entityClass,id);
    }
//  更新
    @Override
    public void update(T entity) {
        this.getSession().update(entity);
    }
//  插入
    @Override
    public int save(T entity) {
        return (int) this.getSession().save(entity);
    }
//  更新或插入
    @Override
    public void saveOrUpdate(T entity) {
        this.getSession().saveOrUpdate(entity);
    }
// 删除（根据实体）
    @Override
    public void delete(T entity) {
        this.getSession().delete(entity);
    }
//  删除（根据主键）
    @Override
    public void delete(PK id) {
        this.getSession().delete(this.load(id));
    }
//  批量查找
    @Override
    public List<T> findAll() {
        return this.getSession().createCriteria(entityClass).list();
    }
//  批量查找（根据hql）
    @Override
    public List<T> findAll(String hql, Map<String,Object> params){
        logger.info("find "+entityClass.getName()+ " by :"+hql);
        Query query = this.getSession().createQuery(hql);
        for (String key : params.keySet()){
            query.setParameter(key,params.get(key));
        }
        return (List<T>)query.getResultList();
    }
//  批量删除
    @Override
    public void delete(PK[] ids) {
        for (PK id : ids){
            this.delete(id);
        }
    }

}
