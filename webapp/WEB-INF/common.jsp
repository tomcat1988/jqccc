﻿<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

<title>后台</title>

<!-- Bootstrap core CSS -->
<link href="<%=basePath%>assets/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="<%=basePath%>assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="<%=basePath%>assets/css/style.css" rel="stylesheet">
<link href="<%=basePath%>assets/css/style-responsive.css"
	rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>	
	<section id="container">
		<!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
		<!--header start-->
		<header class="header black-bg">
			<div class="sidebar-toggle-box">
				<div class="fa fa-bars tooltips" data-placement="right"
					data-original-title="Toggle Navigation"></div>
			</div>
			<!--logo start-->
			<a href="<%=basePath%>emp/index" class="logo"><b>后台管理系统</b></a>
			
			<div class="top-menu">
				<ul class="nav pull-right top-menu">
					<li><a class="logout" href="<%=basePath%>emp/">退出登录</a></li>
				</ul>
			</div>
			<div class="top-menu">
				<ul class="nav pull-right top-menu">
					<li><a class="logout"
						href="javascript:location.replace('<%=basePath%>emp/localScreen')">锁屏</a></li>
				</ul>
			</div>
		</header>
		<!--header end-->

		<!--sidebar start-->
		<aside>
			<div id="sidebar" class="nav-collapse ">
				<!-- sidebar menu start-->
				<ul class="sidebar-menu" id="nav-accordion">

					<p class="centered">
						<a href="<%=basePath%>emp/selectUserInfo/1"><img
							src="<%=basePath%>assets/img/ui-liuwenli.png" class="img-circle"
							width="60"></a>
					</p>
					<h5 class="centered">${empInfo.empusername }</h5>
					
					<c:if test="${showlist.power}">
					<li class="mt"><a href="/emp/shouye"> <i
							class="fa fa-dashboard"></i> <span>首页</span>
					</a></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-desktop"></i> <span>借贷审核管理</span>
					</a>
						<ul class="sub">
							<li>
								 <a href="/emp/rentst">待审核列表</a>
							</li>
							<li>
								<a href="/emp/renten">已审核列表</a>
							</li>							
						</ul></li>
						
					<li class="sub-menu"><a href="javascript:;"> <i
						class="fa fa-desktop"></i> <span>理财审核管理</span>
					</a>
					<ul class="sub">
						<li>
							 <a href="<%=basePath%>emp/bk_list_pro">待审核列表</a>
						</li>
						<li>
							<a href="<%=basePath%>emp/bk_list_pro_isChecked">已审核列表</a>
						</li>							
					</ul></li>
					
					<li class="sub-menu"><a href="javascript:;"> <i
						class="fa fa-desktop"></i> <span>公司审核管理</span>
					</a>
					<ul class="sub">
						<li>
							 <a href="/com/checkComList/1">待审核列表</a>
						</li>
						<li>
							<a href="/com/queryComList/1">已审核列表</a>
						</li>							
					</ul></li>
					
					<li class="sub-menu"><a href="javascript:;"> <i
						class="fa fa-desktop"></i> <span>产品审核管理</span>
					</a>
					<ul class="sub">
						<li>
							 <a href="/proo/productList/1">待审核列表</a>
						</li>
						<li>
							<a href="/proo/lookquryList/1">已审核列表</a>
						</li>							
					</ul></li>
					
					<li class="sub-menu"><a href="javascript:;"> <i
						class="fa fa-desktop"></i> <span>用户管理</span>
					</a>
					<ul class="sub">
						<li>
							 <a href="/emp/bk_FinaInfo">补充用户投资信息</a>
							 <a href="/emp/bk_RentInfo">补充用户贷款信息</a>
						</li>													
					</ul></li>
					
					<li class="sub-menu"><a href="javascript:;"> <i
						class="fa fa-desktop"></i> <span>个人管理</span>
					</a>
					<ul class="sub">
						<li>
							 <a href="/emp/selectUserInfo/1">查看个人信息</a>
						</li>	
						<li>
							 <a href="/emp/selectUserInfo/2">修改个人信息</a>
						</li>												
					</ul></li>
					</c:if>
					
 					<c:if test="${!showlist.power}"> 
					<li class="sub-menu"><a href="javascript:;"> <i
						class="fa fa-desktop"></i> <span>员工管理</span>
					</a>
					<ul class="sub">
						<li>
							 <a href="<%=basePath%>emp/selectEmp/1">员工列表</a>
						</li>												
					</ul></li>
					
					<li class="sub-menu"><a href="javascript:;"> <i
						class="fa fa-desktop"></i> <span>页面管理</span>
					</a>
					<ul class="sub">						
						<li><a href="/emp/noticeadd">添加网站通知</a></li>
						<li><a href="/emp/noticeaddlist">查询网站通知</a></li>
						<li><a href="/emp/noticeaddtupian">添加网站首页图片</a></li>
						<li><a href="/emp/noticeaddlisttupian">查询首页图片</a></li>
					</ul></li>
					</c:if>
					<%-- <li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-desktop"></i> <span>管理组</span>
					</a>
						<ul class="sub">
							<li>
								<%
									if (list.contains("1")) {
								%> <a href="bk_deptlist.jsp">部门管理</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("2")) {
								%> <a href="<%=basePath%>bk_emplist.jsp">员工管理</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("3")) {
								%> <a href="<%=basePath%>bk_userslist.jsp">用户管理</a> <%
 	}
 %>
							</li>
						</ul></li>
						
						
						
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-desktop"></i> <span>网站内容管理</span>
					</a>
						<ul class="sub">
							<li><a href="<%=basePath%>/noticeadd.jsp">添加网站通知</a></li>
							<li><a href="<%=basePath%>/noticeaddlist.jsp">查询网站通知</a></li>
							<li><a href="<%=basePath%>/noticeaddtupian.jsp">添加网站首页图片</a></li>
							<li><a href="<%=basePath%>/noticeaddlisttupian.jsp">查询首页图片</a></li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-desktop"></i> <span>财务管理</span>
					</a>
						<ul class="sub">
							<li>
								<%
									if (list.contains("4")) {
								%> <a href="<%=basePath%>/Withdrawallist.jsp">提现管理</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("5")) {
								%> <a href="<%=basePath%>/BankCardllist.jsp">银行卡管理</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("6")) {
								%> <a href="<%=basePath%>/Rechargelist.jsp">充值记录</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("7")) {
								%> <a href="<%=basePath%>/Poundagelist.jsp">手续费记录</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("8")) {
								%> <a href="<%=basePath%>/Tradelist.jsp">交易记录</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("9")) {
								%> <a href="<%=basePath%>/Borrowmoneylist.jsp">借贷信息列表</a> <%
 	}
 %>
							</li>
						</ul></li>

					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-desktop"></i> <span>借贷管理</span>
					</a>
						<ul class="sub">
							<li>
								<%
									if (list.contains("15")) {
								%><a href="<%=basePath%>emp/bk_list_pro">»投标列表</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("16")) {
								%><a href="<%=basePath%>/bk_input_pro.jsp">»添加投标</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("17")) {
								%><a href="<%=basePath%>/bk_biao_list.jsp">»标种列表</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("18")) {
								%><a href="<%=basePath%>/bk_input_biao.jsp">»添加标种</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("19")) {
								%><a href="<%=basePath%>/bk_moneylist.jsp">»所有借款</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("20")) {
								%><a href="<%=basePath%>/bk_money_check.jsp">»待审核的借款</a> <%
 	}
 %>
							</li>
							<li>
								<%
									if (list.contains("21")) {
								%><a href="<%=basePath%>/bk_list_pro.jsp">»招标中的借款</a>
								<%
									}
								%>
							</li>
							<li>
								<%
									if (list.contains("22")) {
								%><a href="<%=basePath%>/bk_huankuanlist.jsp">»还款</a> 
								<%
									}
								%>
							</li>
							
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-cogs"></i> <span>认证项管理</span>
					</a>
						<ul class="sub">
							<li>
								<%
									if (list.contains("10")) {
								%> <a
								href="<%=basePath%>/limitapplyforlist.jsp">»信用额度申请</a>
								<%
									}
								%>
							</li>
							<li>
								<%
									if (list.contains("11")) {
								%> <a
								href="<%=basePath%>/anewuserinfolist.jsp">»新用户认证资料</a>
								<%
									}
								%>
							</li>
							<li>
								<%
									if (list.contains("12")) {
								%> <a
								href="<%=basePath%>/basicinfoList.jsp">»用户资料认证</a>
								<%
									}
								%>
							</li>
							<li>
								<%
									if (list.contains("13")) {
								%> <a
								href="<%=basePath%>/approvestatistics.jsp">»认证资料统计</a>
								<%
									}
								%>
							</li>
							<li>
								<%
									if (list.contains("14")) {
								%> <a
								href="<%=basePath%>/approvelist.jsp">»认证项设置</a>
								<%
									}
								%>
							</li>
						</ul></li>
					<li class="sub-menu"><a href="javascript:;"> <i
							class="fa fa-cogs"></i> <span>权限管理</span>
					</a>
						<ul class="sub">
							<li>								
								<%
									if (list.contains("100")){
								%>  <a
								href="<%=basePath%>/limit.jsp">权限列表</a>
								<%
									}
								%>
							</li>
						</ul></li> --%>
						
					
				</ul>

			</div>

		</aside>
		<!--sidebar end-->

		<!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
		<!--main content start-->
		<!-- /MAIN CONTENT -->

		<!--main content end-->
		<!--footer start-->
		<footer class="site-footer">
			<div class="text-center">
				2014 - Alvarez.is <a href="http://www.mycodes.net/" target="_blank">Դ��֮��</a>
				<a href="blank.html#" class="go-top"> <i class="fa fa-angle-up"></i>
				</a>
			</div>
		</footer>
		<!--footer end-->
	</section>

	<!-- js placed at the end of the document so the pages load faster -->
	<script src="assets/js/jquery.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>
	<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
	<script class="include" type="text/javascript"
		src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="assets/js/jquery.scrollTo.min.js"></script>
	<script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


	<!--common script for all pages-->
	<script src="assets/js/common-scripts.js"></script>

	<!--script for this page-->

	<script>
		//custom select box

		$(function() {
			$('select.styled').customSelect();
		});
	</script>

</body>
</html>

