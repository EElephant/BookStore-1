<%--
  Created by IntelliJ IDEA.
  User: 一贱你就笑
  Date: 2018/6/10
  Time: 0:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>库存管理</title>

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
<%--内容--%>
<h2>这是库存搜索</h2>
<div class="row">
    <div class="col-auto offset-4" style="position: relative;margin-bottom: auto;margin-top:10px;">
        <form class="form-inline form-horizontal" action="stock">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">搜索</button>
        </form>
    </div>
</div>
<h2>这是书籍搜索</h2>
<div class="row">
    <div class="col-auto offset-4" style="position: relative;margin-bottom: auto;margin-top:10px;">
        <form class="form-inline form-horizontal" action="queryBook">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">搜索</button>
        </form>
    </div>
</div>

</body>
<script src="js/jquery.min.js"></script>
<script src="js/scripts.js"></script>
<script src="/js/bootstrap-datepicker.js"></script>
<script src="/js/bootstrap.js"></script>
</html>