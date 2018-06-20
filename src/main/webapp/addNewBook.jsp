<%--
  Created by IntelliJ IDEA.
  User: 一贱你就笑
  Date: 2018/6/12
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>添加书籍</title>

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
    <div align="center">
    <s:form action="addBook" namespace="/" theme="bootstrap" method="POST" cssStyle=" align-content:left; width: 50%" validate="true">
        <s:textfield name="skuid" label="商品编号"/>
        <s:textfield name="isbn" label="书籍编号"/>
        <s:textfield name="title" label="书名"/>
        <s:textfield name="author" label="作者"/>
        <s:textfield name="publisher" label="出版社"/>
        <s:textfield name="m_price" label="发行价格"/>
        <s:textfield name="p_price" label="出售价格"/>
        <s:textfield name="type0" label="类别"/>
        <s:submit value="提交" cssClass="btn btn-outline-danger my-2 my-sm-0"/>
        <s:reset value="重置" cssClass="btn btn-outline-danger my-2 my-sm-0"/>
        <s:fielderror></s:fielderror>
    </s:form>
    </div>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/scripts.js"></script>
<script src="/js/bootstrap-datepicker.js"></script>
<script src="/js/bootstrap.js"></script>
</html>