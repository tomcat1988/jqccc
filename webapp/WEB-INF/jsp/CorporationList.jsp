<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>审核人员审核法人信息列表界面</title>
</head>
<body>
	<center>
		<table border="2" cellpadding="10" cellspacing="0" bordercolor="red">
			<tr>
				<td>序号</td>
				<td>法人名称</td>
				<td>身份证号</td>
				<td>电话</td>
				<td>邮箱</td>
				<td>居住地址</td>
				<td>操作</td>
			</tr>
			<c:choose>
			    <c:when test="${corpList!=null }">
					<c:forEach items="${corpList }" var="cl" varStatus="sta">
						<tr>
							<td>
								${sta.index+1 }
								<input type="hidden" value="${cl.corid }" name="corporation.corid"/>
							</td>
							<td>${cl.corname }</td>
							<td>${cl.coridcard }</td>
							<td>${cl.cortel }</td>
							<td>${cl.cormail }</td>
							<td>${cl.coraddress }</td>
							<td><a href="<%=basePath%>cor/queryCorpOne/${cl.corid}">查看</a></td>
						</tr>
					</c:forEach>
			    </c:when>
			    <c:otherwise>
			    	<tr>
			    		<td colspan="7" align="center">
				        	<span>${queryFailure }</span>
				        </td>
			    	</tr>
			    </c:otherwise>
			</c:choose>
		</table>
	</center>
	<center>
		<div>
			<!-- 分页 -->
			<c:choose>
				<c:when test="${corpList!=null }">
					<a href="<%=basePath%>cor/queryCorpList/${pageInfo.getFirstPage() }">首页</a>
					<c:if test="${pageNum>1 }">
						<a href="<%=basePath%>cor/queryCorpList/${pageNum-1 }">上一页</a>
					</c:if>
					<c:if test="${pageNum<pageInfo.getLastPage() }">
						<a href="<%=basePath%>cor/queryCorpList/${pageNum+1 }">下一页</a>
					</c:if>
					<a href="<%=basePath%>cor/queryCorpList/${pageInfo.getLastPage() }">尾页</a>
				</c:when>
				<c:otherwise>
					
				</c:otherwise>
			</c:choose>
		</div>
	</center>
</body>
</html>