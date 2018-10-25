<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</head>
<body>
	<center>
		<table border="2" cellpadding="10" cellspacing="0" bordercolor="red">
			<tr>
				<td>序号</td>
				<td>公司名称</td>
				<td>公司类型</td>
				<td>公司注册资金</td>
				<td>公司法人</td>
				<td>公司地址</td>
				<td>审核</td>
			</tr>
			<c:choose>
			    <c:when test="${list!=null }">
					<c:forEach items="${list }" var="cl" varStatus="sta">
						<tr>
							<td>${sta.index+1 }</td>
							<td>${cl.comname }</td>
							<td>${cl.comtype }</td>
							<td>${cl.comreg }</td>
							<td>${cl.corname }</td>
							<td>${cl.comaddress }</td>
							<td><a>审核</a></td>
						</tr>
					</c:forEach>
			    </c:when>
			    <c:otherwise>
			        <span>123123123123</span>
			    </c:otherwise>
			</c:choose>
		</table>
		<a href="<%=basePath%>company/checkComList/1">首页</a>&nbsp;&nbsp;<a href="<%=basePath%>company/checkComList/2">尾页</a>
	</center>

</body>
</html>