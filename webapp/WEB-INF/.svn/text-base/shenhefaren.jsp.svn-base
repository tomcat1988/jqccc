<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

<title>DASHGUM - FREE Bootstrap Admin Template</title>

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

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="<%=basePath%>/jQuery-Canvas/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/jQuery-Canvas/js/jquery-1.8.3.min.js"></script>
    
</head>

<body>
	<!-- 导航栏 --><jsp:include page="common.jsp"></jsp:include>
	<!--main content start-->
	<section id="main-content">
		<section class="wrapper" >
			<!-- 内容开始 -->
			<div class="showback">
				<h4 >
					<i class="fa fa-angle-right"></i> 法人详细信息
				</h4>
			</div>
			<div class="showback" align="center">
				<form action="/cor/checkSuccess" method="post" onsubmit="return sub()">
					<input type="hidden" value="${corp.corid }" name="corid"><br>
					<input type="hidden" value="${corp.comid }" name="comid"><br>
					<table class="table table-bordered table-striped table-condensed" >
						<tr>
							<td>法人id</td>
							<td><input type="text" style="border: none;" value="${corp.corid }" readonly="readonly" id="corid"></td>
						</tr>
						<tr>
							<td>法人名称</td>
							<td><input type="text" style="border: none;" value="${corp.corname }" readonly="readonly"></td>
						</tr>
						<tr>
							<td>法人身份证号码</td>
							<td>
					 			<input type="text" id="coridcard" style="border: none;" value="${corp.coridcard }" readonly="readonly">
					 			<c:choose>
									<c:when test="${checkinfo!=null }">										
									</c:when>
									<c:otherwise>
										<input type="button" value="检验身份证信息" onclick="checkId()"/>
									</c:otherwise>
								</c:choose>
								<span id="idcardinfo">${checkinfo.checkidcard }</span>
					 		</td>
						</tr>
						<tr>
							<td>法人电话</td>
							<td><input type="text" style="border: none;" value="${corp.cortel }" readonly="readonly"></td>
						</tr>
						<tr>
							<td>法人邮箱</td>
							<td><input type="text" style="border: none;" value="${corp.cormail }" readonly="readonly"></td>
						</tr>
						<tr>
							<td>法人居住地址</td>
							<td><input type="text" style="border: none;" value="${corp.coraddress }" readonly="readonly"></td>
						</tr>
						<c:if test="${empInfo.power=='一级管理'}">
							<tr>
								<td>二级审核人id</td>
								<td><input type="text" style="border: none;" value="${corp.checksecondid }" readonly="readonly"></td>
							</tr>
							<tr>
								<td>二级审核日期</td>
								<td><input type="text" style="border: none;" value="<fmt:formatDate value="${corp.checkseconddate }" pattern="yyyy-MM-dd"/>" readonly="readonly"></td>
							</tr>
							<tr>
								<td>二级审核信息</td>
								<td>
									<c:if test="${corp.checksecondmsg=='1' }">
										<input type="text" style="border: none;" value="通过" readonly="readonly">
									</c:if>
									<c:if test="${corp.checksecondmsg=='0' }">
										<input type="text" style="border: none;" value="已驳回" readonly="readonly">
									</c:if>
								</td>
							</tr>
						</c:if>
						<tr>
							<td>法人审核状态</td>
							<td><input type="text" style="border: none;" value="${corp.corstatus }" readonly="readonly"></td>
						</tr>
						<tr>
							<td>法人名称</td>
							<td><input type="text" style="border: none;" value="${corp.corname }" readonly="readonly"></td>
						</tr>
						<tr>
							<td>审核意见</td>
							<td>
								<c:if test="${empInfo.power=='一级管理'}">
									<c:choose>
										<c:when test="${corp.checkfirstmsg=='0'}">
											<input type="hidden" value="0" name="corporation.checkfirstmsg">
											<input type="text" style="border: none;" value="不通过" readonly="readonly">
										</c:when>
										<c:when test="${corp.checkfirstmsg=='1'}">
											<input type="hidden" value="1" name="corporation.checkfirstmsg">
											<input type="text" style="border: none;" value="通过" readonly="readonly">
										</c:when>
										<c:otherwise>
											<select id="chec" name="corporation.checkfirstmsg">
								 				<option value="5">--请选择--</option>
								 				<option value="1">通过</option>
								 				<option value="0">不通过</option>
								 			</select>
										</c:otherwise>
									</c:choose>
						 			
						 		</c:if>
						 		<c:if test="${empInfo.power=='二级管理'}">
						 			<c:choose>
										<c:when test="${corp.checksecondmsg=='0'}">
											<input type="hidden" value="0" name="corporation.checksecondmsg">
											<input type="text" style="border: none;" value="不通过" readonly="readonly">
										</c:when>
										<c:when test="${corp.checksecondmsg=='1'}">
											<input type="hidden" value="1" name="corporation.checksecondmsg">
											<input type="text" style="border: none;" value="通过" readonly="readonly">
										</c:when>
										<c:otherwise>
											<select id="chec" name="corporation.checksecondmsg">
								 				<option value="5">--请选择--</option>
								 				<option value="1">通过</option>
								 				<option value="0">不通过</option>
								 			</select>
										</c:otherwise>
									</c:choose>						 		
						 		</c:if>
					 			<input type="hidden" style="border: none;" value="${userInfo.rentid}" name="rentinfo.rentid">
					 		</td>
						</tr>
					</table>
					<input type="submit" onclick="mit()" value="确认提交">
				</form>
			</div>
			<!-- 内容结束 -->
		</section>
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

<script type="text/javascript">
	
	//查询身份证信息
	function checkId()
	{
		//获取查询当前用户的id
		var corid = $("#corid").val();
		//获取输入身份证号码
		var coridcard = $("#coridcard").val();
		$.ajax({
			//请求地址
			url:"<%=basePath%>cor/checkIdCard",
			type:"post",//请求方式
			data:{"idcard":coridcard,"userid":0,"corid":corid},//传送的数据
			dataType:"json",//预计返回的字符串类型
			beforeSend:function(data)//加载执行方法
			{
				$("#idcardinfo").html("查询中.......");
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
					$("#idcardinfo").html("该身份证号所属地区是:"+data.area+",性别:"+data.sex+",出生日期:"+data.birthday);
				}
				else
				{
					//查询错误的身份证信息
					$("#idcardinfo").html(data.error);
				}
			}
		});
		flag = true;
		return;
	}
	//提交
	function sub()
	{
		if($("#idcardinfo").html!="" && $("#idcardinfo")!=null && ($("#chec").val()!=5))
		{
			return true;
		}
		else
		{
			alert("请确认审核信息是否填写或者身份信息是否校验");
			return false;
		}
	}
</script>

</html>
