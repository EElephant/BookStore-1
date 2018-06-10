//根据isbn删除书籍
function deleteStock(isbn){
    if(confirm("你确定删除该用户吗?")){
        location.href="deleteStock?isbn="+(isbn);
    }
}

//修改，现根据isbn查询库存详细信息，以供修改
function queryStockDetails(isbn){
    location.href="queryStock?isbn="+(isbn);
}