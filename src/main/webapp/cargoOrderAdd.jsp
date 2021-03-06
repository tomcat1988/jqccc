﻿<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>新增订单</title>

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

</head>

<body>
	<!--main content start-->
	<section id="main-content">
		<section class="wrapper">
			<!-- 内容开始 -->
			<div class="col-md-12 mt">
				<div class="content-panel">
					<h4>
						<i class="fa fa-angle-right"></i>XX详情<a  class="fa fa-angle-right" href="javascript:history.go(-1)">返回</a>
					</h4>
					<hr>
					<form  method="post" action="<%=basePath%>/cargoorder/add/cargoorder" >
					<table class="table table-hover">
                            <tr>
							<th>订单</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.orderno"  >
                                
							</td>
						</tr>
                            <tr>
							<th>起运地</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.origin"  >
                                
							</td>
						</tr>
                            <tr>
							<th>目的地</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.destination"  >
                                
							</td>
						</tr>
                            <tr>
							<th>客户/货主</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.customer"  >
                                
							</td>
						</tr>
                            <tr>
							<th>联系电话</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.tel"  >
                                
							</td>
						</tr>
                            <tr>
							<th>要求发货时间</th>
							<td>
					 			<input type="text" style="border: none;"  readonly="readonly"  >
                                
							</td>
						</tr>
                            <tr>
							<th>要求到货时间</th>
							<td>
					 			<input type="text" style="border: none;"  readonly="readonly"  >
                                
							</td>
						</tr>
                            <tr>
							<th>重量</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.gw"  >
                                
							</td>
						</tr>
                            <tr>
							<th>体积</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.cbm"  >
                                
							</td>
						</tr>
                         <tr>
							<th>货物类型</th>
							<td>
								<select class="col-sm-3" name="cargoOrder.cargotype" id="power">
									<option class="form-control" value="0">--请选择--</option>
									<option class="form-control" value="1">普货</option>
									<option class="form-control" value="2">冷链</option>
									<option class="form-control" value="3">危险品</option>
								</select>
							</td>
						</tr>
                            <tr>
							<th>备注</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.remark"  >
                                
							</td>
						</tr>
                            <tr>
							<th>创建人</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.creator" value="管理员"   >
                                
							</td>
						</tr>
                            <tr>
							<th>创建时间</th>
							<td>
					 			<input type="text" style="border: none;" readonly="readonly"  >
                                
							</td>
						</tr>
                            <tr>
							<th>修改人</th>
							<td>
					 			<input type="text" style="border: none;" name="cargoOrder.modifyby" value="管理员"  >
                                
							</td>
						</tr>
                            <tr>
							<th>修改时间</th>
							<td>
					 			<input type="text" style="border: none;"  readonly="readonly">
                                
							</td>
						</tr>
						<tr>
							<td>
								<input type="submit" value="提交" />
								<input type="button" onclick="retQueryCorp()" value="返回"/>
							</td>
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
	function retQueryCorp()
	{
		window.location.href="<%=basePath%>/basebox/getAll/basebox/1";
	}




</script>	
<script type="text/javascript">
	function jsdate() {
		var b = document.getElementsByName("qj.endtime");
		var s = document.getElementsByName("qj.startime");

		var bd = b[0].value;
		var sd = s[0].value;

		var arr = bd.split("-");
		var oldtime = new Date(arr[0], arr[1], arr[2]);
		var oldtimes = oldtime.getTime();

		var arrt = sd.split("-");
		var newtime = new Date(arrt[0], arrt[1], arrt[2]);
		var newtimes = newtime.getTime();

		var input = document.getElementById("in");

		if (b[0].value != "" && s[0].value != "") {
			if (newtimes > oldtimes) {
				confirm("MDZZ");
				return;
			} else {
				var diff = oldtimes - newtimes;
				var days = diff / (1000 * 60 * 60 * 24);
				input.value = days;
			}
		}
	}

	function zfs() {
		var zf = document.getElementById("zf").value;
		if (zf.length > 30) {
			alert("发布内容请控制在20字以内");
			document.getElementById("zf").focus();
		}
	}

	function as() {
		var yg = document.getElementById("yg").value;
		var sz = "";
		sz = yg.split(";");
		var dx = document.getElementById("dx").value;
		var dxid = document.getElementById("dxid").value;
		document.getElementById("dx").value = dx + ";" + sz[1];
		document.getElementById("dxid").value = dxid + ";" + sz[0];

	}
</script>

<script>
	function getTime() {
		var today = new Date();
		var h = today.getHours();
		var m = today.getMinutes();
		var s = today.getSeconds();
		// add a zero in front of numbers<10
		m = checkTime(m);
		s = checkTime(s);
		document.getElementById('showtime').innerHTML = h + ":" + m + ":" + s;
		t = setTimeout(function() {
			getTime()
		}, 500);
	}

	function checkTime(i) {
		if (i < 10) {
			i = "0" + i;
		}
		return i;
	}
</script>
<script type="text/javascript">
	function b3() {
		var currdate = new Date();
		var predate = new Date(currdate.getTime() - 0 * 24 * 60 * 60 * 1000)
				.toLocaleDateString();
		var pre = predate.replace("/", "-");
		var pre = pre.replace("/", "-");
		document.getElementById("d12").value = pre;

		var nextdate = new Date(currdate.getTime() + 3 * 24 * 60 * 60 * 1000)
				.toLocaleDateString();
		var next = nextdate.replace("/", "-");
		var next = next.replace("/", "-");
		document.getElementById("d13").value = next;

	}
</script>
<script type="text/javascript">
	function b4() {
		var currdate = new Date();
		var predate = new Date(currdate.getTime() - 0 * 24 * 60 * 60 * 1000)
				.toLocaleDateString();
		var pre = predate.replace("/", "-");
		var pre = pre.replace("/", "-");
		document.getElementById("d12").value = pre;

		var nextdate = new Date(currdate.getTime() + 7 * 24 * 60 * 60 * 1000)
				.toLocaleDateString();
		var next = nextdate.replace("/", "-");
		var next = next.replace("/", "-");
		document.getElementById("d13").value = next;

	}
</script>

<script type="text/javascript">
	
	
	
	
</script>

<script >
	//custom select box

	$(function() {
		$('select.styled').customSelect();
	});
	
	
</script>
</html>
