<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"  src="jq/jquery.js"></script>
</head>
<body>

	<div align="center">
		<table cellpadding="0px" cellspacing="0px" border="0px">
			<tr>
				<td>用户名</td>
				<td>
					<input type="text" name="emp.empusername" value="赵六" id="username">
				</td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="emp.emppwd" value="123456" id="pwd"></td>
			</tr>
			<tr>
				<td><input type="button"  value="登录" onclick="login()"></td>
			</tr>
		</table>
	</div>
		<script type="text/javascript">
		function login(){
			$.ajax({
				url:"<%=basePath%>emp/empLogin",
				data:{"emp.empusername":$("#username").val(),"emp.emppwd":$("#pwd").val()},
				dataType:"json",
				type:"post",
				success:function(data){
					if(data.result=="success"){
						location.href="<%=basePath%>queryRentinfoList/1"; 
					}else{
						alert("用户名或者密码错误");
					}
				},
				error:function(data){
					alert("请求失败");
				}
			});
		}
		
		</script>

</body>
</html>