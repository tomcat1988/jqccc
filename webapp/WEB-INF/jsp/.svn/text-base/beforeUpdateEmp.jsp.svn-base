<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript"  src="<%=basePath%>jq/jquery.js"></script>
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
    		<form action="/emp/updateEmp" method="post">
    		    <input name="a" value="${e.power }" id="a" type="hidden"><br>
    			<input type="hidden" name="empid" value="${e.empid }"><br>
    			用户名:<input type="text" name="empusername" value="${e.empusername }"><br>
    			密码:<input type="password" name="emppwd" value="${e.emppwd }"><br>
    			员工姓名:<input type="text" name="empname" value="${e.empname }"><br>
    			权限:<select name="power" id="power" >
	    				<option value="一级管理">一级管理</option>
	    				<option value="二级管理">二级管理</option>
	    				<option value="超级管理员">超级管理员</option>
    			    </select><br>
    			<input type="submit" value="修改">
    		</form>
    	
    	</center>
    	<script type="text/javascript">
    		window.onload=function(){
    			var powera=$("#a").val();
    			$("#power").val(powera);
    		}
    	
    	</script>
  </body>
</html>
