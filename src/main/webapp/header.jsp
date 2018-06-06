<%--
  Created by IntelliJ IDEA.
  User: yimiao
  Date: 2018/5/30
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>header</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/book.css" rel="stylesheet">

</head>
<body>
<div class="container-fluid">
<%--导航栏--%>
<div class="row">
    <div class="col-md-12 bg-danger">
        <ul class="w-100 nav pull-right">
            <li class="col-auto col-md-offset-2 mr-auto">
                <a class="text-white" href="/index.jsp">主页</a>
            </li>
            <li class="col-auto">
                <a class="text-white" href="/login.jsp">登录</a>
            </li>
            <li class="col-auto">
                <a class="text-white" href="/register.jsp">注册</a>
            </li>
            <li class="dropdown col-auto">
                <a class="dropdown-toggle text-white" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">我的账户</a>
                <div class="dropdown-menu dropdown-menu-right bg-danger" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item text-white" href="/user/account.jsp">我的账号</a>
                    <a class="dropdown-item text-white" href="/user/order.jsp">我的订单</a>
                    <a class="dropdown-item text-white" href="/logout.action">退出登录</a>
                </div>
            </li>
            <li class="cart">
                <a href="/user/cart.jsp"></a>
            </li>
            <li class="col-md-2"></li>
        </ul>
    </div>
</div>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/scripts.js"></script>
<script src="/js/bootstrap.js"></script>
</html>
