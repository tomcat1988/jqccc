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
<script type="text/javascript"  src="<%=basePath%>jq/jquery.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
	<div align="center">
		<form action="<%=basePath%>login" method="post">
				用户名:<input type="text" name="username" value="zhaoyun" ><p>
				密码:<input type="password" name="userpwd" value="123456" ><p>
				<input type="button"  value="登录" onclick="login(this)">&nbsp;&nbsp;&nbsp;
				还没有账号？<a href="<%=basePath%>/add" >立即注册</a></p>
		</form>
	</div>
		<script type="text/javascript">
		function login(){
			var username=$("input[name='username']").val();
			var userpwd=$("input[name='userpwd']").val();
			$.ajax({
				url:"<%=basePath%>login",
				data:{username:username,userpwd:userpwd},
				dataType:"json",
				type:"post",
				success:function(data){
					if(data.result=="success"){
						location.href="<%=basePath%>cor/queryCorpList"; 
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