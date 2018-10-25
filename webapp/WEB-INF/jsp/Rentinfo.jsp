<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<script type="text/javascript"  src="jq/jquery.js"></script>
<title>Rentinfo</title>
</head>
<body>
	<div align="left">欢迎${empInfo.empname}登录</div>
	<div align="center">
		<iframe allowtransparency="true" 
		frameborder="0" width="400" height="100" scrolling="no" 
		src="//tianqi.2345.com/plugin/widget/index.htm?s=1&z=1&t=0&v=0&d=3&bd=0&k=&f=&ltf=009944&htf=cc0000&q=1&e=1&a=1&c=54511&w=385&h=96&align=center">
		</iframe>
	<iframe src="<%=basePath%>jQuery-Canvas/index.html" marginheight="10" frameborder="0" width="500" height="100" scrolling="no" ></iframe>
	<script charset="Shift_JIS" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.js"></script>
	 	<table cellpadding="0px" cellspacing="0px" border="1px">
	 		<tr>
	 			<td>序号</td>
	 			<td>用户编号</td>
	 			<td>贷款金额</td>
	 			<td>贷款用途</td>
	 			<td>支付方式</td>
	 			<td>还款期限</td>
	 			<td>申请日期</td>
	 			<td>审核状态</td>
	 			<td>操作</td>
	 		</tr>
	 		<c:forEach items="${RentinfoList}" var="list" varStatus="st">
	 			<tr>
	 				<td>${st.index+1 }</td>
		 			<td>${list.userid}</td>
		 			<td>${list.userrent}</td>
		 			<td>${list.userrentfor }</td>
		 			<c:if test="${list.userpay==1}">
		 				<td>主动还款</td>
		 			</c:if>
		 			<c:if test="${list.userpay==2}">
		 				<td>自动扣款</td>
		 			</c:if>
		 			<td>${list.userpaydate}</td>
		 			<td>
		 				<fmt:formatDate value="${list.userappdate }" pattern="yyyy-MM-dd" />
		 			</td>
		 			<td>${list.rentstatus}</td>
		 			<td>
		 				<a href="<%=basePath%>getOneUserInfo/${list.rentid}"><input type="button" value="查看"></a>
		 			</td>
	 			</tr>
	 		</c:forEach>
	 	</table>
	 		<!--分页 -->
	 		<c:choose>
	 			<c:when test="${RentinfoList!=null }">
		 			<a href="<%=basePath%>queryRentinfoList/${PageInfo.getFirstPage()}" style="text-decoration: none;">首页</a>
		 		<c:if test="${page>1}">
				 	<a href="<%=basePath%>queryRentinfoList/${page-1}" style="text-decoration: none;">上一页</a>
		 		</c:if>
		 		<c:if test="${page<PageInfo.getLastPage()}">
				 	<a href="<%=basePath%>queryRentinfoList/${page+1}" style="text-decoration: none;">下一页</a>
		 		</c:if>
		 			<a href="<%=basePath%>queryRentinfoList/${PageInfo.getLastPage()}" style="text-decoration: none;">末页</a>
	 			</c:when>
	 			<c:otherwise>
	 				<font color="red">${error}</font>
	 			</c:otherwise>
	 		</c:choose>
	</div>
</body>
</html>