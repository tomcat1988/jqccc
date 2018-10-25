<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h2>${pro.proname}</h2><!-- 理财产品名称 -->
		<button onclick="jion()">加&nbsp;入</button><span id="nnn">添&nbsp;加</span>
	</div>

	<div>	
		<p>银行代表：<span>${pro.probank }</span></p><!-- 银行代表 -->
		<p>投标期限：<span>${pro.proday }个月</span></p><!-- 投标期限 -->
		<p>公司名称：<span>${pro.comname }</span></p><!-- 理财产品投标公司 -->
		<p>起投金额：<span>${pro.proprice }元</span></p><!-- 最低起投金额 -->
		<p>风险评估：<span><c:if test="${pro.riskassess ==1}">低</c:if> 
						<c:if test="${pro.riskassess ==2}">中</c:if>
						<c:if test="${pro.riskassess ==3}">高</c:if></span></p><!-- 风险评估 123 -->
		<p>产品介绍：<span>${pro.proinfo }</span></p><!-- 产品介绍 -->
		<p>服务协议：<span>${pro.agreeservice }</span></p><!-- 服务协议 -->
	</div>
	
</body>
</html>