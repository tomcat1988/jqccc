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
	<section id="main-content" >
		<section class="wrapper">
			<!-- 内容开始 -->
			<div class="showback">
				<h4 >
					<i class="fa fa-angle-right"></i> 公司详细信息
				</h4>
			</div>
			<div class="showback" align="center">
				<form action="/com/updateComList" method="post" id="subform">
					<table class="table table-bordered table-striped table-condensed" style="text-align: center;">
						<tr>
							<td align="center">公司编码</td>
							<td align="center">
								<input type="hidden" value="${com.comid }" name="comid">
								<input type="hidden" value="${com.comcorid }"name="comcorid">
								<input type="text" style="border: none;" value="${com.comid }" readonly="readonly" id="comid">
							</td>
						</tr>
						<tr>
							<td align="center">公司名称</td>
							<td align="center"><input type="text" style="border: none;" value="${com.comname }" readonly="readonly"></td>
						</tr>
						<tr>
							<td align="center">公司类型</td>
							<td align="center"><input type="text" style="border: none;" value="${com.comtype }" readonly="readonly"></td>
						</tr>
						<tr>
							<td align="center">公司注册资金</td>
							<td align="center"><input type="text" style="border: none;" value="${com.comreg }" readonly="readonly"></td>
						</tr>
						<tr>
							<td align="center">公司法人id</td>
							<td align="center"><input type="text" style="border: none;" value="${com.comcorid }" readonly="readonly"></td>
						</tr>
						<tr>
							<td align="center">公司成立日期</td>
							<td align="center"><input type="text" style="border: none;" value="<fmt:formatDate value="${com.combuidate}" pattern="yyyy-MM-dd"></fmt:formatDate>" readonly="readonly"></td>
						</tr>
						<tr>
							<td align="center">公司工商注册日期</td>
							<td align="center"><input type="text" style="border: none;" value="<fmt:formatDate value="${com.comregdate}" pattern="yyyy-MM-dd"></fmt:formatDate>" readonly="readonly"></td>
						</tr>
						<tr>
							<td align="center">公司业务</td>
							<td align="center"><input type="text" style="border: none;" value="${com.comwork }" readonly="readonly"></td>
						</tr>
						<tr>
							<td align="center">公司地址</td>
							<td align="center"><input type="text" style="border: none;" value="${com.comaddress }" readonly="readonly"></td>
						</tr>
						<c:if test="${empInfo.power=='一级管理'}">
							<tr>
								<td align="center">二级审核人id</td>
								<td align="center"><input type="text" style="border: none;" value="${com.checksecondid }" readonly="readonly"></td>
							</tr>
							<tr>
								<td align="center">二级审核日期</td>
								<td align="center">
									<input type="text" style="border: none;" value="<fmt:formatDate value="${com.checkseconddate }" pattern="yyyy-MM-dd"/>" readonly="readonly">
								</td>
							</tr>
							<tr>
								<td align="center">二级审核信息</td>
								<td align="center"><input type="text" style="border: none;" value="${com.checksecondmsg }" readonly="readonly"></td>
							</tr>
						</c:if>
						<tr>
							<td align="center">公司审核状态</td>
							<td align="center"><input type="text" style="border: none;" value="${com.comstatus }" readonly="readonly"></td>
						</tr>
						<tr>
							<td align="center">法人名称</td>
							<td align="center"><input type="text" style="border: none;" value="${com.corname }" readonly="readonly"></td>
						</tr>
						<tr>
							<td style="padding-top: 60px">营业执照</td>
							<td align="center">
								<img alt="营业执照" src="/img/${com.compath }">
							</td>
						</tr>
						<tr>
							<td align="center">审核意见</td>
							<td align="center">
								<c:if test="${empInfo.power=='一级管理'}">
						 			<select id="chec" name="com.checkfirstmsg">
						 				<option value="5">--请选择--</option>
						 				<option value="1">通过</option>
						 				<option value="0">驳回</option>
						 			</select>
						 		</c:if>
						 		<c:if test="${empInfo.power=='二级管理'}">
						 			<select id="chec" name="com.checksecondmsg">
						 				<option value="5">--请选择--</option>
						 				<option value="1">通过</option>
						 				<option value="0">驳回</option>
						 			</select>
						 		</c:if>
					 		</td>
						</tr>
				</table>
				<input type="button" onclick="mit()" value="提交">
				</form>
				<font color="red">${cuowu }</font>
			</div>
			<!-- 内容结束 -->
			<!-- 弹出框 -->
			<div class="modal fade" id="1" tabindex="-1"
			 aria-labelledby="myModalLabel" aria-hidden="true" style="border: solid;">
				
			</div>	
			<!-- 弹出框结束 -->
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
<script type="text/javascript">
	function mit()
	{
		if($("#chec").val()=='5')
		{
			alert("请填写审核信息");
		}else{
			var corid=$("input[name='comcorid']").val();
			$.ajax({				
				url:"<%=basePath%>cor/getCorStatus",
				data:{"corid":corid},
				dataType:"json",
				type:"post",
				success:function(data){
					if(data.result){
						$("#subform").submit();
						alert("审核成功!");
					}else{
						alert("法人信息未审核");
					}
				},
				error:function(data){
					alert("请求失败");
				}
			});
		}
	}

</script>

<script type="text/javascript"
	src="<%=basePath%>My97DatePickers/WdatePicker.js"></script>

</html>
