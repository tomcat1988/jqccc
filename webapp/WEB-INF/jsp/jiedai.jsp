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
    <center>
    	<form action="<%=basePath%>rent/rent" method="post" enctype="multipart/form-data">
			  用户昵称:<input type="text" name="usernickname"><br>
			  性别:<input type="radio" name="usersex" value="0">男
			  <input type="radio" name="usersex" value="1">女<br>
			  身份证正反面:<input type="file" name="idcard" ><br>
			  银行流水:<input type="file" name="bank" ><br>
			  <input type="submit" value="申请贷款">
    	</form>
    </center>
  </body>
</html>
