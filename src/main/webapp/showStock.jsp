<%--
  Created by IntelliJ IDEA.
  User: 一贱你就笑
  Date: 2018/6/10
  Time: 2:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<html>
<head>
    <title>库存管理</title>

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
    <script src="js/jquery.min.js"></script>
    <script src="js/scripts.js"></script>
    <script src="/js/bootstrap-datepicker.js"></script>
    <script src="/js/bootstrap.js"></script>
    <script>
        //根据id删除库存
        function deleteStockF(id){
            if(confirm("你确定删除该用户吗?")){
                alert(id);
                location.href="deleteStock?id="+(id);
            }
        }

        //修改，现根据isbn查询库存详细信息，以供修改
        function queryStockDetailsF(isbn){
            alert(isbn);
            location.href="queryStockDetail?isbn="+(isbn);
        }
    </script>
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
            <th>书籍编号</th>
            <th>库存数量</th>
            <th>入库时间</th>
        </tr>

        <s:iterator value="stockList" status="stat" var="stocking">
            <tr>
                <td><s:property value="#stocking.id" /></td>
                <td><s:property value="#stocking.isbn" /></td>
                <td><s:property value="#stocking.number" /></td>
                <td><s:property value="#stocking.dateTime" /></td>
                <th><a href="addNewStock.jsp">添加</a></th>
                <th><a href="javascript:queryStockDetailsF('<s:property value="isbn"/>')">修改</a></th>
                <th><a href="javascript:deleteStockF('<s:property value="id"/>')">删除</a></th>
            </tr>
        </s:iterator>
    </table>
</div>
</body>
</html>