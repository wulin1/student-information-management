<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-11-09
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>登录</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="../static/js/login.js"></script>
</head>

<div align="center" class="loginwidth" >
    <form class="form"  action="login"  method="post">
    <h1>登录</h1>
    <p>
        <label>账户：</label><input  name="name" type="text" placeholder="请输入您的账户"  style="width:300px; height:25px;"/>
    </p>
    <p>
        <label>密码：</label><input  name="password" type="password" placeholder="请输入您的号码"style="width:300px; height:25px;"/>
    </p>
        <div id="error_box"><br/></div>
    <div ><button onclick="foLogin()" style="width:70px; height:40px;" type="submit">登录</button></div>
    </form>
</div>
</body>
</html>
