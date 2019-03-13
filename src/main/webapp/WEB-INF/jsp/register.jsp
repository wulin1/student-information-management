<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-11-09
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<h1>欢迎来到注册页面</h1>
<table>
<form class="form"  action="regist"  method="post">
    用户名：<input type="text" name="name" placeholder="用户名" /><br />
    密&nbsp;&nbsp; 码：<input type="password" name="password" placeholder="密码" /><br />
    年&nbsp;&nbsp; 龄：<input type="text" name="age" placeholder="年龄" /><br />
    性&nbsp;&nbsp; 别：<input type="text" name="sex" placeholder="性别" /><br /><br /><br />
    <button type="submit" >注册</button>

</form>
</table>
</body>
</html>
