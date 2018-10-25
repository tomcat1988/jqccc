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

<title>已审核列表</title>

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
			<!-- 内容开始 -->
			<div class="showback">
				<h4>
					<i class="fa fa-angle-right"></i>已审核列表
				</h4>
				<!-- 页面内容 -->
				<form id="frm1" class="form-horizontal tasi-form" action="<%=basePath%>fin/queryFinaListByCheck/1" method="post">
					<button type="submit"  class="btn btn-theme03">查找</button>
					<div class="form-group">
						<label class="col-sm-2   control-label">用户昵称:</label>
						<div class="col-sm-5">
							<input type="text" name="usernickname" value="${regMap.usernickname}" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2  control-label"> 理财编号：</label>
						<div class="col-sm-5">
							<c:if	test="${regMap.finid==0}">
								<input type="text" name="finid" value="" class="form-control">
							</c:if>
							<c:if	test="${regMap.finid!=0}">
								<input type="text" name="finid" value="${regMap.finid}" class="form-control">
							</c:if>
						</div>
					</div>
				</form>
			</div>
				<div class="showback">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>序号</th>
								<th>理财编号</th>
								<th>用户身份证号</th>
								<th>用户昵称</th>
								<th>用户银行卡号</th>
								<th>用户手机号</th>
								<th>产品名称</th>
								<th>理财产品类型</th>
								<th>产品最低投标金额</th>
								<th>产品收益率</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${finalList }" var="fl" varStatus="status">
								<tr>
									<td data-target="#${status.index+1}" data-toggle="modal"><a href="javascript:;">${status.index+1}</a>
										<input type="hidden" value="${fl.finid }" name="financeinfo.finid"/>
										<input type="hidden" value="${fl.userid }" name="financeinfo.userid"/>
										<input type="hidden" value="${fl.proid }" name="financeinfo.proid"/>
									</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.finid }</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.useridcard }</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.usernickname }</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.usercard }</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.usertel }</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.proname }</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.protype }</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.proprice }</td>
									<td data-target="#${status.index+1}" data-toggle="modal">${fl.proprofit }</td>
									<td>
										<a href="<%=basePath%>fin/queryFinaOne/${fl.finid}/2">查看</a>
									</td>
								</tr>
							</c:forEach>  

						</tbody>
						<tfoot>
							<c:choose>
								<c:when test="${finalList!=null}">
							<tr align="center">
							
								<td colspan="11">
									<a href="<%=basePath%>fin/queryFinaListByCheck/${pageInfo.getFirstPage()}" class="btn btn-success btn-ms ">首页</a>
								<c:if test="${pageNum>1 }">	
									<a href="<%=basePath%>fin/queryFinaListByCheck/${pageNum-1 }" class="btn btn-success btn-ms ">&lt;&lt;上一页</a>
								</c:if>	
								<c:if test="${pageNum<pageInfo.getLastPage() }">
									<a href="<%=basePath%>fin/queryFinaListByCheck/${pageNum+1 }" class="btn btn-success btn-ms ">下一页&gt;&gt;</a>
								</c:if>
								<a href="<%=basePath%>fin/queryFinaListByCheck/${pageInfo.getLastPage() }" class="btn btn-success btn-ms "> 尾页</a>
							    <font size="3">
							    	共	<font color="red">${pageInfo.getTotal() }</font>条数据，
							    	当前	<font color="#0000ff">${pageInfo.getPageNum()}</font>
							    		<font color="red">/${pageInfo.getPages()}</font>页
								</font>
								</td>
							</tr>
								</c:when>
								<c:otherwise>
									<tr align="center"><td colspan="11"><font color="red">暂无完成审核的信息~</font></td></tr>
								</c:otherwise>

							</c:choose>	

						</tfoot>
					</table>
				</div>
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

<script>
	//custom select box

	$(function() {
		$('select.styled').customSelect();
	});
</script>
</html>
