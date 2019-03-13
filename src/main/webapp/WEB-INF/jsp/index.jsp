<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-11-09
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>"></base>
    <title>首页</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js' " language="javascript"
            type="text/javascript"></script>
    <link href="../static/css/index.css"
          rel="stylesheet" type="text/css" />

    <style type="text/css">
        .hbd{
            position: absolute;
            top: 100px;
            right: 300px;
            width: 900px;
        }

    </style>
</head>
<body>
<%@include file="header.jsp"%>
        <div class="hbd">
        <h1 >欢迎界面</h1>
            <p>欢迎使用学生后台管理系统</p>
        </div>

</body>
</html>
