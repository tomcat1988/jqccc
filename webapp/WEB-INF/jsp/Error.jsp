<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath%>">
</head>
<body>
	<h1 id="show"></h1>	
	<script type="text/javascript"> 
		var t=5;//设定跳转的时间 
		setInterval("refer()",3000); //启动1秒定时 
		function refer(){ 
			if(t==0){ 
				location.href="javascript:history.go(-1)"; 
			} 
			document.getElementById('show').innerHTML=""+t+"秒后跳转到上一页面"; // 显示倒计时 
			t--; // 计数器递减 
		} 
	</script> 
</body>
</html>