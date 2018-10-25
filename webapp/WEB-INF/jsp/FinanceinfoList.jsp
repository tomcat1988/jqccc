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
<title>审核人员审核理财信息列表界面</title>
</head>
<body>
	<center>
		<table border="2" cellpadding="10" cellspacing="0" bordercolor="red">
			<tr>
				<td>序号</td>
				<td>理财编号</td>
				<td>用户身份证号</td>
				<td>用户昵称</td>
				<td>用户银行卡号</td>
				<td>用户手机号</td>
				<td>产品名称</td>
				<td>理财产品类型</td>
				<td>产品最低投标金额</td>
				<td>产品收益率</td>
				<td>操作</td>
			</tr>
			<c:choose>
			    <c:when test="${finaList!=null }">
					<c:forEach items="${finaList }" var="fl" varStatus="sta">
						<tr>
							<td>
								${sta.index+1 }
								<input type="hidden" value="${fl.finid }" name="financeinfo.finid"/>
								<input type="hidden" value="${fl.userid }" name="financeinfo.userid"/>
								<input type="hidden" value="${fl.proid }" name="financeinfo.proid"/>
							</td>
							<td>${fl.finid }</td>
							<td>${fl.useridcard }</td>
							<td>${fl.usernickname }</td>
							<td>${fl.usercard }</td>
							<td>${fl.usertel }</td>
							<td>${fl.proname }</td>
							<td>${fl.protype }</td>
							<td>${fl.proprice }</td>
							<td>${fl.proprofit }</td>
							<td><a href="<%=basePath%>fin/queryFinaOne/${fl.finid}">查看</a></td>
						</tr>
					</c:forEach>
			    </c:when>
			    <c:otherwise>
			    	<tr>
			    		<td colspan="11" align="center">
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
				<c:when test="${finaList!=null }">
					<a href="<%=basePath%>fin/queryFinaList/${pageInfo.getFirstPage() }">首页</a>
					<c:if test="${pageNum>1 }">
						<a href="<%=basePath%>fin/queryFinaList/${pageNum-1 }">上一页</a>
					</c:if>
					<c:if test="${pageNum<pageInfo.getLastPage() }">
						<a href="<%=basePath%>fin/queryFinaList/${pageNum+1 }">下一页</a>
					</c:if>
					<a href="<%=basePath%>fin/queryFinaList/${pageInfo.getLastPage() }">尾页</a>
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>
		</div>
	</center>
</body>
</html>