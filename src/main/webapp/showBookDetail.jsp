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

    <sb:head/>
</head>
<body>
<%--导航栏--%>
<s:include value="header.jsp"/>
<div class="container-fluid">
    <%--内容--%>
    <s:form action="updateBook" method="POST">
        <s:hidden name="book.isbn"/>
        <s:textfield name="book.title" label="书名"/>
        <s:textfield name="book.author" label="作者"/>
        <s:textfield name="book.publisher" label="出版社"/>
        <s:textfield name="book.m_price" label="发行价格"/>
        <s:textfield name="book.p_price" label="出售价格"/>
        <s:textfield name="book.type0" label="类别"/>
        <s:submit value="确认修改"/>
    </s:form>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/scripts.js"></script>
<script src="/js/bootstrap-datepicker.js"></script>
<script src="/js/bootstrap.js"></script>
</html>