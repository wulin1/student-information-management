
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>学生管理系统</title>
</head>
<body class="login">
<style type="text/css">
  .inde_b{
    background:darkcyan;
    height: 80px;
  }
  li {list-style-type:none;}
  .div1{
    border: 3px solid #00F;
    height: 500px;
    width: 180px;
  }
</style>
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
  <div class="menu_section">
    <div class="inde_b">
      <h2>学生信息管理系统后台</h2>
    </div>
    <ul class="div1">
      <li><a><i class=""></i> 专业管理 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="specialty">专业信息管理</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-edit"></i> 班级管理 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="javascript:;">班级信息设置</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-bug"></i> 学生管理 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="javascript:;">学生系统添加</a></li>
          <li><a href="javascript:;">学生信息查询</a></li>
        </ul>
      </li>
    </ul>
  </div>

</div>
</body>
</html>