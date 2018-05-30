<%--
  Created by IntelliJ IDEA.
  User: yimiao
  Date: 2018/5/30
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>header</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container-fluid">
<%--导航栏--%>
<div class="row">
    <div class="col-12 bg-danger">
        <ul class="col-12 nav pull-right">
            <li class="col-auto offset-2 mr-auto">
                <a class="text-white" href="#">主页</a>
            </li>
            <li class="col-auto">
                <a class="text-white" href="#">登录</a>
            </li>
            <li class="col-auto">
                <a class="text-white" href="#">注册</a>
            </li>
            <li class="dropdown col-auto">
                <a class="dropdown-toggle text-white" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">客户</a>
                <div class="dropdown-menu dropdown-menu-right bg-danger" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item text-white" href="#">Action</a>
                    <a class="dropdown-item text-white" href="#">Another action</a>
                    <a class="dropdown-item text-white" href="#">Something else here</a>
                    <div class="dropdown-divider">
                    </div> <a class="dropdown-item text-white" href="#">Separated link</a>
                </div>
            </li>
            <li class="col-2"></li>
        </ul>
    </div>
</div>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/scripts.js"></script>
<script src="/js/bootstrap.js"></script>
</html>
