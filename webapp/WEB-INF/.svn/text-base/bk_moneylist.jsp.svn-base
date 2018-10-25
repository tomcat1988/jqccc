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
					<i class="fa fa-angle-right"></i> 所有的借款
				</h4>
				<!-- 页面内容 -->
				<form id="frm1" class="form-horizontal tasi-form"
					action="<%=basePath%>rentinfo/queryRentinfoListOK/1" method="post">


					<button type="submit" onclick="serch();" class="btn btn-theme03">查找</button>

					<div class="form-group">
						<label class="col-sm-2   control-label">用户昵称:</label>
						<div class="col-sm-5">
							<input type="text" name=usernickname value="${resMap.usernickname }" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2   control-label">借贷编号:</label>
						<div class="col-sm-5">
							<c:if test="${resMap.rentid!=0 }">
								<input type="text" name="rentid" value="${resMap.rentid }" class="form-control">
							</c:if>
							<c:if test="${resMap.rentid==0 }">
								<input type="text" name="rentid" value="" class="form-control">
							</c:if>
						</div>
					</div>
				</form>
				<!-- 页面内容 -->
			</div>


			<!-- 内容开始 -->
			<div class="showback">
				<table class="table table-bordered table-striped table-condensed">
					<thead>
						<tr>
							<th class="numeric">序号</th>
							<th class="numeric">借贷编号</th>
							<th class="numeric">用户编号</th>
							<th class="numeric">用户昵称</th>
							<th class="numeric">贷款金额</th>
							<th class="numeric">贷款用途</th>
							<th class="numeric">支付方式</th>
							<th class="numeric">还款期限</th>
							<th class="numeric">申请日期</th>
							<th class="numeric">审核状态</th>
							<th class="numeric">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${RentinfoList}" var="list" varStatus="status">
							<tr>
								<td>${status.index+1 }</td>
								<td>${list.rentid}</td>
					 			<td>${list.userid}</td>
					 			<td>${list.usernickname}</td>
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
								<td><a href="javascript:;" data-target="#${status.index+1}"
									data-toggle="modal">查看</a></td>
							</tr>
							<!-- 弹出框 -->
							<div class="modal fade" id="${status.index+1}" tabindex="-1"
								role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title" id="myModalLabel">借款详情</h4>
										</div>
										<div class="modal-body">
										
											<div class="alert alert-success">
												<b><font><font>借贷编号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font>${list.rentid}</font></font>
											</div>

											<div class="alert alert-info">
												<b><font><font>用户编号&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font>${list.userid}</font></font>
											</div>
											<div class="alert alert-success">
												<b><font><font>用户昵称&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font>${list.usernickname}</font></font>
											</div>
											<div class="alert alert-info">
												<b><font><font>贷款金额&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font>${list.userrent}元</font></font>
											</div>
											<div class="alert alert-success">
												<b><font><font>贷款用途&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font>${list.userrentfor }</font></font>
											</div>
											<div class="alert alert-info">
												<b><font><font>支付方式&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font><c:if test="${list.userpay==1}">主动还款</c:if>
												 			<c:if test="${list.userpay==2}">自动扣款</c:if>
												 </font></font>
											</div>
											<div class="alert alert-success">
												<b><font><font>还款期限&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font>${list.userpaydate}</font></font>
											</div>
											<div class="alert alert-info">
												<b><font><font>申请日期&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font><fmt:formatDate value="${list.userappdate }" pattern="yyyy-MM-dd" /></font></font>
											</div>
											<div class="alert alert-success">
												<b><font><font>审核状态&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></font></b>
												<font><font>${list.rentstatus}</font></font>
											</div>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">关闭</button>
										</div>
									</div>
								</div>
							</div>
						</c:forEach> 
						<tr align="center">
							<td colspan="11">
								<c:choose>
									<c:when test="${RentinfoList!=null }">
										<a href="<%=basePath%>rentinfo/queryRentinfoListOK/${PageInfo.getFirstPage()}"
											class="btn btn-success btn-ms ">首页</a> 
										<c:if test="${page>1}">
										<a href="<%=basePath%>rentinfo/queryRentinfoListOK/${page-1}"
											class="btn btn-success btn-ms ">&lt;&lt;上一页</a> 
										</c:if>
										<c:if test="${page<PageInfo.getLastPage()}">
										<a href="<%=basePath%>rentinfo/queryRentinfoListOK/${page+1}"
											class="btn btn-success btn-ms "> 下一页&gt;&gt;</a>
										</c:if>
										<a href="<%=basePath%>rentinfo/queryRentinfoListOK/${PageInfo.getLastPage()}"
											class="btn btn-success btn-ms "> 尾页</a>
										<font size="3">共<font color="red">${PageInfo.getTotal()}</font>条数据，当前<font color="#0000ff">${PageInfo.getPageNum()}</font><font
												color="red">/${PageInfo.getLastPage()}</font>页
										</font>
									</c:when>
						 			<c:otherwise>
						 				<font color="red">${error}</font>
						 			</c:otherwise>
								</c:choose>
							</td>
						</tr>
					</tbody>

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
