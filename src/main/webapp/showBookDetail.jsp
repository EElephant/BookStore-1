<%--
  Created by IntelliJ IDEA.
  User: 一贱你就笑
  Date: 2018/6/10
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>修改书籍信息</title>

    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script
            src="https://code.jquery.com/jquery-1.12.4.js"
            integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
            crossorigin="anonymous"></script>

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <script>
        //根据id删除书籍
        function deleteBookF(id){
            if(confirm("你确定删除该用户吗？")){
                location.href="deleteBook?id="+id;
            }
        }

        //修改，现根据isbn查询书籍详细信息，以供修改
        function queryBookDetailsF(isbn){
            location.href="queryBookDetail?isbn="+isbn;
        }


    </script>
    <sb:head/>
</head>
<body>
<%--导航栏--%>
<s:include value="header.jsp"/>
<div class="container-fluid">
    <%--内容--%>
    <div align="center">
    <s:form action="updateBook" theme="bootstrap" namespace="/" method="POST" cssStyle="width: 50%">
        <s:hidden name="book.isbn"/>
        <s:hidden name="book.id"/>
        <s:hidden name="book.skuid"/>
        <s:hidden name="book.type1"/>
        <s:hidden name="book.descrtion"/>
        <s:hidden name="book.language"/>
        <s:hidden name="book.edition"/>
        <s:hidden name="book.package"/>
        <s:hidden name="book.format"/>
        <s:hidden name="book.publisher_time"/>
        <s:hidden name="book.paper"/>
        <s:hidden name="book.page"/>
        <s:hidden name="book.words"/>
        <s:hidden name="book.comment_counts"/>
        <s:hidden name="book.content_detail"/>
        <s:hidden name="book.imgs"/>
        <s:textfield name="book.title" label="书名"/>
        <s:textfield name="book.author" label="作者"/>
        <s:textfield name="book.publisher" label="出版社"/>
        <s:textfield name="book.m_price" label="发行价格"/>
        <s:textfield name="book.p_price" label="出售价格"/>
        <s:textfield name="book.type0" label="类别"/>
        <s:submit cssClass="btn btn-outline-danger my-2 my-sm-0" value="确认修改"/>
    </s:form>
    </div>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/scripts.js"></script>
<script src="/js/bootstrap-datepicker.js"></script>
<script src="/js/bootstrap.js"></script>
</html>