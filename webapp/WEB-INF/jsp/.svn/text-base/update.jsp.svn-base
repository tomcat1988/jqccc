<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改</title>
</head>
<body>
	<center>
		<div>
			<form action="<%=basePath%>updateuser" method="post">
				用户名:<input type="text" name="username" value="${user.username }" readonly="readonly"><p>
				密码:<input type="text" name="userpwd" value="${user.userpwd }"><p>
				电话号码:<input type="text" name="usertel" value="${user.usertel }"><p>
				邮箱:<input type="text" name="usermail" value="${user.usermail }"><p>
				昵称:<input type="text" name="usernickname" value="${user.usernickname }"><p>
				户口地址:<input type="text" name="useraddress" value="${user.useraddress }" readonly="readonly"><p>
				薪资:<input type="text" name="usermoney" value="${user.usermoney }"><p>
				公司:<input type="text" name="usercomname" value="${user.usercomname }"><p>
				公司地址:<input type="text" name="usercomaddress" value="${user.usercomaddress }"><p>
				<input type="hidden" name="userid" value="${userid }"><p>
				<input type="submit" value="提交修改">
			</form>
		</div>
	</center>
</body>
</html>