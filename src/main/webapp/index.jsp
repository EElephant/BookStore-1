<%--
  Created by IntelliJ IDEA.
  User: yimiao
  Date: 2018/5/29
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>主页</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/book.css" rel="stylesheet">

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
    <div class="row" style="margin-left: 2%;margin-right: 2%;">
        <%--左侧分类导航--%>
        <div class="col-md-2">
            <div class="type-nav">
                <table class="table">
                <thead>
                <tr>
                    <th>
                        分类
                    </th>
                </tr>
                </thead>
                <tbody>
                <tr class="table-danger">
                    <td>
                        <a class="btn" href="#">国学/古籍</a>
                    </td>
                </tr>
                <tr class="table-active">
                    <td>
                        <a class="btn" href="#">外语学习</a>
                    </td>
                </tr>
                <tr class="table-success">
                    <td>
                        <a class="btn" href="#">小说</a>
                    </td>
                </tr>
                <tr class="table-warning">
                    <td>
                        <a class="btn" href="#">文学</a>
                    </td>
                </tr>
                <tr class="table-danger">
                    <td>
                        <a class="btn" href="#">童书</a>
                    </td>
                </tr>
                <tr class="table-active">
                    <td>
                        <a class="btn" href="#">青春文学</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        </div>
        <%--中间内容--%>
        <div class="col-md-8">
            <%--搜索栏--%>
            <div class="row">
                <div class="col-auto offset-4" style="position: relative;margin-bottom: auto;margin-top:10px;">
                    <form class="form-inline form-horizontal">
                        <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">搜索</button>
                    </form>
                </div>
            </div>
            <%--风车活动栏--%>
            <div class="row" style="margin-bottom: 10px">
                <div class="col-md-12 carousel slide" id="carousel-1">
                    <ol class="carousel-indicators">
                        <li data-slide-to="0" data-target="#carousel-1" class="active">
                        </li>
                        <li data-slide-to="1" data-target="#carousel-1">
                        </li>
                        <li data-slide-to="2" data-target="#carousel-1">
                        </li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block w-100 h-100" alt="活动" src="https://img10.360buyimg.com/da/jfs/t19540/333/2393621913/123620/d724e86/5af3ee48N49bc9814.jpg!q80.webp"/>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100 h-100" alt="活动" src="https://img10.360buyimg.com/da/jfs/t19540/333/2393621913/123620/d724e86/5af3ee48N49bc9814.jpg!q80.webp"/>
                        </div>
                        <div class="carousel-item">
                            <img class="d-block w-100 h-100" alt="活动" src="https://img10.360buyimg.com/da/jfs/t19540/333/2393621913/123620/d724e86/5af3ee48N49bc9814.jpg!q80.webp"/>
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carousel-1" data-slide="prev">
                        <span class="carousel-control-prev-icon"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carousel-1" data-slide="next">
                        <span class="carousel-control-next-icon"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
            <%--书籍展示栏--%>
            <div class="row">
                <div class="col-md-3"  onclick="action">
                    <div class="card bookcard">
                        <a href="#">
                        <img class="card-img-top" src="https://img13.360buyimg.com/n2/jfs/t6781/272/2580953264/430056/373a6d62/598d11a1Nc4ff4c57.jpg" href="#"/>
                        </a>
                        <div class="card-block">
                            <h5 class="card-title">
                                Card title
                            </h5>
                            <p class="card-text text-lg-right text-danger">
                                ¥18.80
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3"  onclick="action">
                    <div class="card">
                        <img class="card-img-top" alt="Bootstrap Thumbnail First" src="https://www.layoutit.com/img/people-q-c-600-200-1.jpg">
                        <div class="card-block">
                            <h5 class="card-title">
                                Card title
                            </h5>
                            <p class="card-text">
                                Cras justo odio, dapibus ac fa
                            </p>
                            <p>
                                <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3"  onclick="action">
                    <div class="card">
                        <img class="card-img-top" alt="Bootstrap Thumbnail First" src="https://www.layoutit.com/img/people-q-c-600-200-1.jpg">
                        <div class="card-block">
                            <h5 class="card-title">
                                Card title
                            </h5>
                            <p class="card-text">
                                Cras justo odio, dapibus ac fa
                            </p>
                            <p>
                                <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-3"  onclick="action">
                    <div class="card">
                        <img class="card-img-top" alt="Bootstrap Thumbnail First" src="https://www.layoutit.com/img/people-q-c-600-200-1.jpg">
                        <div class="card-block">
                            <h5 class="card-title">
                                Card title
                            </h5>
                            <p class="card-text">
                                Cras justo odio, dapibus ac fa
                            </p>
                            <p>
                                <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%--右侧登录栏--%>
        <div class="col-md-2" >
            <div class="login-nav">
                <s:actionerror theme="bootstrap"/>
                <s:actionmessage theme="bootstrap"/>
                <s:fielderror theme="bootstrap"/>

                <h2><s:property  value="popedom"/></h2>
                <s:form action="login" theme="bootstrap" namespace="/" cssClass="form-horizontal" label="登录" method="POST">
                    <s:textfield name="username" cssClass="input-sm"  elementCssClass="col-xs-8" label="账号"/>
                    <s:password name="password" cssClass="input-sm"  elementCssClass="col-xs-8" label="密码"/>
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-md-9">
                            <s:submit cssClass="btn btn-sm btn-primary" value="登陆"/> &nbsp;&nbsp;&nbsp;&nbsp;
                            <s:reset cssClass="btn btn-sm btn-danger" value="重置"/>
                        </div>
                    </div>
                </s:form>
            </div>
        </div>
    </div>
</div>
<script src="js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>
</html>