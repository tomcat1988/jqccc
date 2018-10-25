<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<title>一审审核意见</title>
</head>
<body>
	<center>
		<table>
			<tr>
				<td>序号</td>
				<td>理财产品编号</td>
				<td>理财产品名称</td>
				<td>理财产品类型</td>
				<td>理财产品代理银行</td>
				<td>产品投标期限</td>
				<td>企业名称</td>
				<td>产品总额</td>
				<td>产品最低投标金额</td>
				<td>风险评估</td>
				<td>二审人姓名</td>
				<td>二审人意见</td>
				<td>二审日期</td>
				<td>审核意见</td>
			</tr>
			<c:forEach items="${list }" var="n" varStatus="sta">
				<td>${sta.index+1 }</td>
				<td>${n.proid }</td>
				<td>${n.proname }</td>
				<td>${n.protype }</td>
				<td>${n.probank }</td>
				<td>${n.proday }</td>
				<td>${n.comname }</td>
				<td>${n.promoney }</td>
				<td>${n.proprice }</td>
				<td>${n.riskassess }</td>
				<td>
					<input type="text" readonly="readonly" value="${checksecondname }"/></td>
				</td>
				<td>
					<c:choose>
							<c:when test="${checksecondmsg==1 }">
								<input type="text" readonly="readonly" value="通过"/>
							</c:when>						
							<c:otherwise>
								<input type="text" readonly="readonly" value="不通过"/>
							</c:otherwise>
						</c:choose>
				</td>
				<td>
					<input type="text" readonly="readonly" value='<fmt:formatDate value="${checkseconddate }" pattern="yyyy-MM-dd"/>'/>
				</td>
				<td>
					<select id="checkmsg" name="productinfo.checkfirstmsg">
							<option value="2">--请选择--</option>
							<option value="1">通过</option>
							<option value="0">不通过</option>
						</select>
				</td>
			</c:forEach>
		</table>
	</center>
</body>
</html>