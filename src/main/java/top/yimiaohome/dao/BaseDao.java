/**
 * @Package top.yimiaohome.dao
 * @Description: TODO
 * @author yimiao
 * @date 2018/6/7 15:38
 * @version V1.0
 */
package top.yimiaohome.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T, PK extends Serializable> {
    // 依据主键获取实体。假设没有对应的实体。返回 null。
    public T get(PK id);
    // 依据主键获取实体。假设没有对应的实体。抛出异常。
    public T load(PK id);
    // 更新实体
    public void update(T entity);
    // 存储实体到数据库
    public int save(T entity);
    // 添加或更新实体
    public void saveOrUpdate(T entity);
    // 删除指定的实体
    public void delete(T entity);
    // 依据主键删除指定实体
    public void delete(PK id);
    // 查询所有
    public List<T> findAll();
    // 删除所有
    public void delete(PK[] ids);
    // 根据hql查询对象
    public List<T> findAll(String hql, Map<String,Object> params);
}
