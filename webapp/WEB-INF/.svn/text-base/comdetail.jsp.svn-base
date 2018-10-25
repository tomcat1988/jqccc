<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
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
</head>

<body>
	<!-- 导航栏 --><jsp:include page="common.jsp"></jsp:include>
	<!--main content start-->
	<section id="main-content">
		<section class="wrapper">
			<div class="showback">
				<h4>
					<i class="fa fa-angle-right"></i> 已审核的公司
				</h4>
			</div>
			<!-- 内容开始 -->
			<div class="showback" align="center">
				<table class="table table-bordered table-striped table-condensed">
					<caption> </caption>  
					<thead>
						<tr>
							<th class="numeric">公司id</th>
							<td>${com.comid}</td>
						</tr>
						<tr>	
							<th class="numeric">公司名称</th>
							<td>${com.comname}</td>
						</tr>
						<tr>								
							<th class="numeric">公司类型</th>
							<td>${com.comtype}</td>
						</tr>
						<tr>								
							<th class="numeric">公司注册资金</th>
							<td>${com.comreg }</td>
						</tr>
						<tr>								
							<th class="numeric">公司法人id</th>
							<td>${com.comcorid}</td>
						</tr>
						<tr>								
							<th class="numeric">公司成立日期</th>
							<td>
					 				<fmt:formatDate value="${com.combuidate }" pattern="yyyy-MM-dd" />
					 		</td>
						</tr>
						<tr>								
							<th class="numeric">公司工商注册日期</th>
							<td>
					 				<fmt:formatDate value="${com.comregdate }" pattern="yyyy-MM-dd" />
					 		</td>
						</tr>
						<tr>								
							<th class="numeric">公司业务</th>
							<td>
					 			<td>${com.comwork}</td>	
					 		</td>
						</tr>
						<tr>								
							<th class="numeric">公司地址</th>
							<td>${com.comaddress}</td>
						</tr>
						<c:if test="${empInfo.power=='一级管理'}">
							<tr>								
								<th class="numeric">一级审核人id</th>
								<td>${com.checkfirstid}</td>
							</tr>
							<tr>								
								<th class="numeric">一级审核日期</th>
								<td>
						 				<fmt:formatDate value="${com.checkfirstdate }" pattern="yyyy-MM-dd" />
						 		</td>
							</tr>
							<tr>								
								<th class="numeric">一级审核信息</th>
								<td>${com.checkfirstmsg}</td>
							</tr>
						</c:if>
						<tr>								
							<th class="numeric">二级审核人id</th>
							<td>${com.checksecondid}</td>
						</tr>
						<tr>								
							<th class="numeric">二级审核日期</th>
							<td>
					 				<fmt:formatDate value="${com.checkseconddate }" pattern="yyyy-MM-dd" />
					 		</td>
						</tr>
						<tr>								
							<th class="numeric">二级审核信息</th>
							<td>${com.checksecondmsg}</td>
						</tr>
						<tr>								
							<th class="numeric">法人名称</th>
							<td>${com.corname }</td>
						</tr>
						<tr >								
							<th class="numeric">营业执照</th>
							<td><input type="button" value="显示执照" onclick="switchShow()">&nbsp;&nbsp;<input type="button" value="隐藏执照" onclick="switchHide()"> <img id="zz" alt="营业执照" src="/img/${com.compath }" style="display: none;"></td>
						</tr>
					</thead>
				</table>
			</div>
			<!-- /content-panel -->



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
	 function switchHide(){
		//说明是隐藏图片
			document.getElementById('zz').style.display ="none";
	 }
	 function switchShow(){
			//说明是显示图片
			document.getElementById('zz').style.display ="";
	}













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
	function b5() {
		var currdate = new Date();
		var predate = new Date(currdate.getTime() - 0 * 24 * 60 * 60 * 1000)
				.toLocaleDateString();
		var pre = predate.replace("/", "-");
		var pre = pre.replace("/", "-");
		document.getElementById("d12").value = pre;

		var nextdate = new Date(currdate.getTime() + 30 * 24 * 60 * 60 * 1000)
				.toLocaleDateString();
		var next = nextdate.replace("/", "-");
		var next = next.replace("/", "-");
		document.getElementById("d13").value = next;

	}
</script>

<script>
	//custom select box

	$(function() {
		$('select.styled').customSelect();
	});
</script>
</html>
