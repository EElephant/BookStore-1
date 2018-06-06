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
    <title>修改密码</title>

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
            <form class="form-horizontal" action="repassword.action" method="post">
                <fieldset>
                    <div id="legend" class="">
                        <legend class="">修改密码</legend>
                    </div>
                    <div class="col-md-offset-4 col-auto">
                        <div class="col-md-6">

                            <div class="form-group">
                                <label class="control-label">原密码*</label>
                                    <input type="password" name="oldPassword" class="form-control" required="required" pattern="[0-9a-zA-Z]{*}" minlength="6" maxlength="20">
                            </div>

                            <div class="form-group">
                                <label class="control-label">新密码*</label>
                                <input type="password" name="newPassword" class="form-control" required="required" pattern="[0-9a-zA-Z]{*}" minlength="6" maxlength="20">
                            </div>

                            <div class="form-group">
                                <label class="control-label">重复密码*</label>
                                <input type="password" name="rePassword" class="form-control" required="required" pattern="[0-9a-zA-Z]{*}" minlength="6" maxlength="20">
                            </div>

                            <div class="form-group">
                                <img class="w-100" src="/kaptcha.jpg"/>
                            </div>

                            <div class="form-group">
                                <label class="control-label">验证码*</label>
                                    <input type="text" name="kaptchaVerifyCode" class="form-control" required="required">
                            </div>
                        </div>


                        <div class="control-group col-md-6">
                            <label class="control-label"></label>

                            <!-- Button -->
                            <div class="controls">
                                <button class="btn btn-primary btn-block">修改密码</button>
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