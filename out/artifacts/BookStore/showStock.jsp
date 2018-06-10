<%--
  Created by IntelliJ IDEA.
  User: 一贱你就笑
  Date: 2018/6/5
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>显示库存</title>

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
<div class="container-fluid">
    <%--内容--%>
        <table border="1" width="50%">
            <tr>
                <th>id</th>
                <th>出版编号</th>
                <th>库存数量</th>
                <th>出版时间</th>
            </tr>

            <s:iterator value="stockList" status="stat" var="stocking">
                <tr>
                    <td><s:property value="#stocking.id" /></td>
                    <td><s:property value="#stocking.isbn" /></td>
                    <td><s:property value="#stocking.number" /></td>
                    <td><s:property value="#stocking.stockingTime" /></td>
                    <th><a href="addStock.jsp">添加</a></th>
                    <th><a href="javascript:queryStockDetails('<s:property value="isbn"/>')">修改</a></th>
                    <th><a href="javascript:deleteStock('<s:property value="isbn"/>')">删除</a></th>
                </tr>
            </s:iterator>
        </table>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/scripts.js"></script>
<script src="/js/bootstrap-datepicker.js"></script>
<script src="/js/bootstrap.js"></script>
<script src="/js/stock.js"></script>
</html>