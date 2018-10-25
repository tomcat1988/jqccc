<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main</title>
<base href="<%=basePath%>">
</head>
<body>

	欢迎${empInfo.empname}登录

	<button onclick="cfborrow()">我要贷款</button>
	<script type="text/javascript">
		function cfborrow(){
			location.href="cfborrow";
		}
	</script>
</body>
</html>