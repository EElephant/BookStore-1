<%@ page import="top.yimiaohome.model.UserDetail" %><%--
  Created by IntelliJ IDEA.
  User: yimiao
  Date: 2018/6/7
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>Title</title>


    <link href="/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="/css/bootstrap-datepicker.min.css" rel="stylesheet" media="screen">

    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <sb:head/>
</head>
<body>
<%--导航栏--%>
<s:include value="/header.jsp"/>
<div class="container-fluid">
    <%--内容--%>
    <div class="col-md-4 offset-md-4" style="margin-top: 100px;">
        <form class="form-horizontal" action="userDetailUpdate.action" method="post">
            <fieldset>
                <div id="legend" class="">
                    <legend class="">用户信息</legend>
                </div>
                <div class="offset-md-2 col-md-8">

                    <%
                        UserDetail userDetail = (UserDetail) request.getAttribute("userDetail");
                    %>
                    <input type="text" name="idUserDetail" value="<%=userDetail.getIdUserDetail()%>" class="form-control" hidden="hidden">
                    <input type="text" name="idUser" value="<%=userDetail.getIdUser()%>" class="form-control" hidden="hidden">
                    <div class="form-group">
                        <label class="control-label">FirstName</label>
                        <input type="text" name="firstName" value="<%=""+userDetail.getFirstName()%>" class="form-control" maxlength="30">
                    </div>
                    <div class="form-group">
                        <label class="control-label">LastName</label>
                        <input type="text" name="lastName" value="<%=""+userDetail.getLastName()%>" class="form-control" maxlength="30">
                    </div>
                    <div class="form-group">
                        <label class="control-label">Sex</label>
                        <input type="radio" name="sex" value="男" autocomplete="off" <%if(userDetail.getSex().equals("男")){out.println("checked");}%>>Male
                        <input type="radio" name="sex" value="女" autocomplete="off" <%if(userDetail.getSex().equals("女")){out.println("checked");}%>>Female
                    </div>
                    <div class="form-group">
                        <label class="control-label">Birthday</label>
                        <input type="text" class="form-control date" id="date" name="birthday" value="<%=""+userDetail.getBirthday()%>" class="form-control" maxlength="30">

                    </div>

                    <div class="control-group">
                        <label class="control-label"></label>

                        <!-- Button -->
                        <div class="controls">
                            <button class="btn btn-primary btn-block">保存</button>
                        </div>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>
</div>
</body>
<script src="/js/jquery.min.js"/>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/bootstrap-datepicker.js"></script>
<script>
    $('#date').datepicker({
        autoclose:true,
        format:"yyyy-mm-dd",
        startDate:"1900-01-01",
        endDate:"Date()"
    })
</script>
</html>