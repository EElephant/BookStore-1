<%@ page import="top.yimiaohome.model.Book" %><%--
  Created by IntelliJ IDEA.
  User: yimiao
  Date: 2018/6/6
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%Book book= (Book) session.getAttribute("book");%>
<html>
<head>
    <title><%=book.getTitle()%></title>

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
                   <div class="col-md-12" style="height: 420px;">
                       <div style="width: 350px;height: 420px;">
                           <div class="book_img" style="width: 350px;height: 350px">

                           </div>
                           <div class="book_imgs" style="width: 350px;height: 70px;">

                           </div>
                       </div>
                       <div style="height: 420px;">
                           <div class="book_title"><%=book.getTitle()%></div>
                           <div class="book_author"><%=book.getAuthor()%></div>
                           <br>
                           <br>
                           <div class="book_price">书城价  <span>￥<%=book.getPresentPrice()%></span> [<%=book.getPresentPrice()/book.getMarketPrice()%>折] [定价 ￥<%=book.getMarketPrice()%>]</div>
                           <br>
                           <br>
                           <br>
                           <br>

                           <a class="btn btn-danger btn-lg addToShoppingCar" href="addToShoppingCar">加入购物车</a>

                       </div>
                   </div>
                    <div class="col-md-12">

                    </div>
                </div>
            </div>
            <%--右侧登录栏--%>
            <div class="col-md-2" >

            </div>
        </div>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</html>