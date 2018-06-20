<%--
  Created by IntelliJ IDEA.
  User: 一贱你就笑
  Date: 2018/6/17
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>书籍搜索</title>

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
<div class="container-fluid" >
    <%--内容--%>
        <h2>请输入需要查询的书籍编号(isbn):</h2>
        <div class="row">
            <div class="col-auto offset-4" style="position: relative;margin-bottom: auto;margin-top:10px;margin: 0 auto; margin-top: 50px" >
                <s:form class="form-inline form-horizontal" action="queryBook">
                    <s:textfield class="form-control mr-sm-2" type="text" name="isbn" placeholder="Search" aria-label="Search" style="width: 300px"/>
                    <s:submit class="btn btn-outline-danger my-2 my-sm-0" type="submit" value="搜索"/>
                </s:form>
            </div>
        </div>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/scripts.js"></script>
<script src="/js/bootstrap-datepicker.js"></script>
<script src="/js/bootstrap.js"></script>
</html>