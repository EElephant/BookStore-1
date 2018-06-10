//根据isbn删除书籍
function deleteBook(isbn){
    if(confirm("你确定删除该用户吗?")){
        location.href="deleteBook?id="+(isbn);
    }
}

//修改，现根据isbn查询书籍详细信息，以供修改
function queryBookDetails(isbn){
    location.href="queryBook?id="+(isbn);
}