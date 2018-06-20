<%--
  Created by IntelliJ IDEA.
  User: v-chenzebin
  Date: 2018/4/19
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>登录</title>

    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/style.css" rel="stylesheet">

    <script src="/js/jquery-1.12.4.js"/>

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <sb:head/>
</head>
<body>
<%--导航栏--%>
<s:include value="/header.jsp"/>
<div class="container" style="margin-top: 200px">
    <div class="row">

        <div class="col-md-offset-3 col-md-9" >

            <s:actionerror theme="bootstrap"/>
            <s:actionmessage theme="bootstrap"/>
            <s:fielderror theme="bootstrap"/>

            <h2><s:property  value="popedom"/></h2>
            <s:form action="login" theme="bootstrap" namespace="/" cssClass="form-horizontal" label="登录" method="POST">
                <s:textfield name="username" cssClass="input-sm"  elementCssClass="col-xs-4" label="账号"/>
                <s:password name="password" cssClass="input-sm"  elementCssClass="col-xs-4" label="密码"/>
                <div class="form-group">
                    <div class="col-sm-offset-3 col-md-9">
                        <s:submit cssClass="btn btn-primary" value="登陆"/> &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
                        <s:reset cssClass="btn btn-danger" value="重置"/>
                    </div>
                </div>
            </s:form>
        </div>

        <div class="col-md-3"></div>
    </div>
</div>
<script src="js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>
