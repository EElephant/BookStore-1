<%--
  Created by IntelliJ IDEA.
  User: yimiao
  Date: 2018/6/3
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>注册</title>

    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

    <script src="/js/jquery-1.12.4.js"/>

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

    <div class="row" style="margin-top: 150px">

        <div class="col-md-offset-4 col-md-4" >
            <form class="form-horizontal" action="register.action" method="post">
                <fieldset>
                    <div id="legend" class="">
                        <legend class="">创建账户</legend>
                    </div>
                    <div class="col-md-offset-4 col-auto">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="control-label">用户名*</label>
                                    <input type="text" name="username" class="form-control" required="required" pattern="[0-9a-zA-Z]{*}" minlength="6" maxlength="20">
                                    <p class="help-block">只允许英文字母或数字</p>
                            </div>

                            <div class="form-group">
                                <label class="control-label">邮箱*</label>
                                    <input type="email" name="email" class="form-control" required="required">
                            </div>

                            <div class="form-group">
                                <label class="control-label">手机号码*</label>
                                <input type="tel" name="phone" class="form-control" required="required" pattern="[0-9a-zA-Z]{*}">
                            </div>

                            <div class="form-group">
                                <label class="control-label">密码*</label>
                                    <input type="password" name="password" class="form-control" required="required" pattern="[0-9a-zA-Z]{*}" minlength="6" maxlength="20">
                            </div>

                            <div class="form-group">
                                <img class="w-100" id="kaptchaImg" src="/kaptcha.jpg"/>
                            </div>

                            <div class="form-group">
                                <label class="control-label">验证码*</label>
                                    <input type="text" name="kaptchaVerifyCode" class="form-control" required="required">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label"></label>
                                <label class="control">
                                    <input type="checkbox" value="我已阅读并同意网站的使用条件及隐私声明。" required="required">
                                    我已阅读并同意网站的使用条件及隐私声明。
                                </label>
                        </div>


                        <div class="control-group col-md-6">
                            <label class="control-label"></label>

                            <!-- Button -->
                            <div class="controls">
                                <button class="btn btn-primary btn-block">注册</button>
                            </div>
                        </div>

                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</html>