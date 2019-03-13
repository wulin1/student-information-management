<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018-11-18
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>专业管理界面</title>
    <style type="text/css">
        .indexcss {
            position: absolute;
            top: 100px;
            right: 300px;
            width: 900px;
        }

        table{
            width:600px;
            height:50px;
        }
    </style>
</head>
<body>
<%@include file="header.jsp"%>


<div class="indexcss">
<div>
    <form  action="inSpec"  method="post">
    <p>
        <input type="text" name="name" value="" placeholder="请输入您的专业名称" /> <input type="submit" value="添加专业"/>
    </p>
    </form>
</div>
<table class="providerTable" cellspacing="1" border="1"  >
    <tr class="firstTr">
        <th >编号</th>
        <th>专业名称</th>
        <th >操作</th>
    </tr>
    <c:forEach var="list" items="${list }">
        <tr >
            <td >
                <span>${list.number }</span>
            </td>
            <td >
                <span>${list.name }</span>
            </td>
            <td >
                <span><a href="number=${list.number }">删除</a></span>
                <span><a href="">修改</a></span>
            </td>
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
