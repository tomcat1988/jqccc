<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
  	<div style="float: right;">
  		<iframe id="fancybox-frame" name="fancybox-frame1507894301138" frameborder="0" scrolling="no" hspace="0"  src="http://i.tianqi.com/index.php?c=code&a=getcode&id=25&h=100&w=155"></iframe>
    </div>	
    	<center>
    		<form action="/emp/addEmp" method="post">
    			用户名:<input type="text" name="empusername"><br>
    			密码:<input type="password" name="emppwd"><br>
    			员工姓名:<input type="text" name="empname"><br>
    			权限:<select name="power">
    				<option value="一级管理">一级管理</option>
    				<option value="二级管理">二级管理</option>
    				<option value="超级管理员">超级管理员</option>
    			</select><br>
    			<input type="submit" value="申请增加"> 
    		</form>
    		<form action="/emp/selectEmp" method="post">
    			姓名:<input type="text" name="likeName">
    			权限:<select name="power"><br>
    				<option value="一级管理">一级管理</option>
    				<option value="二级管理">二级管理</option>
    				<option value="超级管理员">超级管理员</option>
    			</select><br>
    			<input type="submit" value="查询">
    		</form>
    	</center>
  </body>
</html>
