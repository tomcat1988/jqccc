<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

<title>二级审核查询单个理财产品页面</title>

<!-- Bootstrap core CSS -->
<link href="<%=basePath%>assets/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="<%=basePath%>assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>assets/css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>assets/js/gritter/css/jquery.gritter.css" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>assets/lineicons/style.css">

<!-- Custom styles for this template -->
<link href="<%=basePath%>assets/css/style.css" rel="stylesheet">
<link href="<%=basePath%>assets/css/style-responsive.css"
	rel="stylesheet">

<script src="<%=basePath%>assets/js/chart-master/Chart.js"></script>
<script type="text/javascript">
	
	//查询身份证信息
	function checkId()
	{
		//获取查询当前用户的id
		var userid = $("#userid").val();
		//获取输入身份证号码
		var useridcard = $("#useridcard").val();
		$.ajax({
			//请求地址
			url:"<%=basePath%>cor/checkIdCard",
			type:"post",//请求方式
			data:{"idcard":useridcard,"userid":userid,"corid":0},//传送的数据
			dataType:"json",//预计返回的字符串类型
			beforeSend:function(data)//加载执行方法
			{
				$("#msg").html("查询中.......");
			},
			error:function(data)
			{
				alert("请求失败");
			},
			success:function(data)
			{
				if(data.resultcode=="200")
				{
					//查询信息准确
					$("#sp").html("该身份证号所属地区是:"+data.area+",性别:"+data.sex+",出生日期:"+data.birthday+"<br/>身份证是否泄露:"+data.tips1+"<br/>身份证是否挂失:"+data.tips2);
				}
				else
				{
					//查询错误的身份证信息
					$("#sp").html(data.error);
				}
			}
		});
	};
	
	//提交
	function sub()
	{
		if($("#sp").html()!=null && $("#sp").html()!="" && ($("#chec").val()!="2"))
		{
			$("#fff").submit();
		}
		else
		{
			alert("请确认审核信息是否填写或者身份信息是否校验");
		}
	};
	
</script>
</head>

<body>
	<!-- 导航栏 --><jsp:include page="common.jsp"></jsp:include>
	<!--main content start-->
	<section id="main-content">
		<section class="wrapper">
			<!-- 内容开始 -->
			<div class="col-md-12 mt">
				<div class="content-panel">
					<h4>
						<i class="fa fa-angle-right"></i> 投资详情记录<a  class="fa fa-angle-right" href="javascript:history.go(-1)">返回</a>
					</h4>
					<hr>
					<form action="<%=basePath%>fin/checkSuccess"  method="post" id="fff">
					<table class="table table-hover">
						<tr>
							<th>用户名</th>
							<td>
								<input type="hidden" style="border: none;" value="${fina.finid }" id="finid" name="financeinfo.finid"/>
								<input type="hidden" style="border: none;" value="${fina.userid }" id="userid" name="financeinfo.userid"/>
								<input type="hidden" style="border: none;" value="${fina.proid }" id="proid" name="financeinfo.proid"/>
								<input type="text" style="border: none;" readonly="readonly" value="${fina.usernickname }"/>
							</td>
						</tr>
						<tr>
							<th>身份证号</th>
							<td>
								<input type="text" style="border: none;" readonly="readonly" value="${fina.useridcard }" id="useridcard"/>
								<c:choose>
									<c:when test="${checkinfo!=null }">
									</c:when>
									<c:otherwise>
										<input type="button" value="检验身份证信息" onclick="checkId()"/>
									</c:otherwise>
								</c:choose>
								<span id="sp">${checkinfo.checkidcard }</span>
							</td>
						</tr>
						<tr>
							<th>性别</th>
							<td>
								<c:if test="${fina.usersex==1 }">
									<font>男</font>
								</c:if>
								<c:if test="${fina.usersex==0 }">
									<font>女</font>
								</c:if>
							</td>
						</tr>
						<tr>
							<th>出生日期</th>
							<td><input type="text" style="border: none;" readonly="readonly" value="<fmt:formatDate value="${fina.userdate }" pattern="yyyy-MM-dd"/>"/></td>
						</tr>
						<tr>
							<th>银行卡号</th>
							<td><input type="text" style="border: none;" readonly="readonly" value="${fina.usercard }"/></td>
						</tr>
						<tr>
							<th>电话</th>
							<td><input type="text" style="border: none;" readonly="readonly" value="${fina.usertel }"/></td>
						</tr>
						<tr>
							<th>邮箱</th>
							<td><input type="text" style="border: none;" readonly="readonly" value="${fina.usermail }"/></td>
						</tr>
						<tr>
							<th>产品名称</th>
							<td><input type="text" style="border: none;" readonly="readonly" value="${fina.proname }"/></td>
						</tr>
						<tr>
									<th>产品类型</th>
									<td>
										<c:choose>
											<c:when test="${fina.protype==1 }">
												<input type="text" readonly="readonly" value="小金金"/>
											</c:when>
											<c:when test="${fina.protype==2 }">
												<input type="text" readonly="readonly" value="小卷卷"/>
											</c:when>						
											<c:otherwise>
												<input type="text" readonly="readonly" value="小票票"/>
											</c:otherwise>
										</c:choose>
									</td>
								</tr>
						<tr>
							<th>产品最低投标金额</th>
							<td><input type="text" style="border: none;" readonly="readonly" value="${fina.proprice }"/></td>
						</tr>
						<tr>
							<th>用户投资金额</th>
							<td><input type="text" style="border: none;" readonly="readonly" value="${fina.userrmb }"/></td>
						</tr>
						<tr>
							<th>产品收益率</th>
							<td><input type="text" style="border: none;" readonly="readonly" value="${fina.proprofit }"/></td>
						</tr>
						
					</table>
					</form>
				</div>
				<!-- --/content-panel ---->
			</div>
			<!-- 内容结束 -->
		</section>
		<!--/wrapper -->
	</section>
	<!-- /MAIN CONTENT -->
</body>

<!--custom switch-->
<!-- js placed at the end of the document so the pages load faster -->
<script src="<%=basePath%>assets/js/jquery.js"></script>
<script src="<%=basePath%>assets/js/bootstrap.min.js"></script>
<script class="include" type="text/javascript"
	src="<%=basePath%>assets/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="<%=basePath%>assets/js/jquery.scrollTo.min.js"></script>
<script src="<%=basePath%>assets/js/jquery.nicescroll.js"
	type="text/javascript"></script>
	<script type="text/javascript" src="<%=basePath%>jq/jquery.js"></script>


<!--common script for all pages-->
<script src="<%=basePath%>assets/js/common-scripts.js"></script>

<!--script for this page-->
<script src="<%=basePath%>assets/js/jquery-ui-1.9.2.custom.min.js"></script>

<!--custom switch-->
<script src="<%=basePath%>assets/js/bootstrap-switch.js"></script>

<!--custom tagsinput-->
<script src="<%=basePath%>assets/js/jquery.tagsinput.js"></script>

<!--custom checkbox & radio-->

<script type="text/javascript"
	src="<%=basePath%>assets/js/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
<script type="text/javascript"
	src="<%=basePath%>assets/js/bootstrap-daterangepicker/date.js"></script>
<script type="text/javascript"
	src="<%=basePath%>assets/js/bootstrap-daterangepicker/daterangepicker.js"></script>

<script type="text/javascript"
	src="<%=basePath%>assets/js/bootstrap-inputmask/bootstrap-inputmask.min.js"></script>


<script src="<%=basePath%>assets/js/form-component.js"></script>

<script type="text/javascript"
	src="<%=basePath%>My97DatePickers/WdatePicker.js"></script>


</html>
