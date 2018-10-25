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

</head>

<body>
<div class="modal-header" align="center">
	<button type="button" class="close" data-dismiss="modal"
		aria-hidden="true">&times;</button>
	<h4 class="modal-title" id="myModalLabel">借款详情</h4>
</div>
<div class="modal-body" align="center">
	<form action="<%=basePath%>rentinfo/updateRentinfo" method="post" onsubmit="return sub()">
	 <table cellpadding="0px" cellspacing="10px" border="1px">
	 	<tr>
	 		<td>姓名</td>
	 		<td>		 			
	 			<input type="text" value="${userInfo.usernickname }" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>身份证</td>
	 		<td>
	 			<input type="text" value="${userInfo.useridcard}" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>性别</td>
	 		<td>
	 			<c:if test="${userInfo.usersex==1}">
		 			<input type="text" value="男" readonly="readonly">
	 			</c:if>
	 			<c:if test="${userInfo.usersex==0}">
		 			<input type="text" value="女" readonly="readonly">
	 			</c:if>
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>出生日期</td>
	 		<td>
	 			<input type="text"  readonly="readonly"  value='<fmt:formatDate value="${userInfo.userdate }" pattern="yyyy-MM-dd" />' >
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>银行卡号</td>
	 		<td>
	 			<input type="text" value="${userInfo.usercard}" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>婚姻状况</td>
	 		<td>
	 			<c:if test="${userInfo.usermarry==1}">
	 				<input type="text" value="未婚" readonly="readonly">
	 			</c:if>
	 			<c:if test="${userInfo.usermarry==0}">
	 				<input type="text" value="已婚" readonly="readonly">
	 			</c:if>
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>电话号码</td>
	 		<td>
	 			<input type="text" value="${userInfo.usertel}" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>邮箱</td>
	 		<td>
	 			<input type="text" value="${userInfo.usermail}" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>现居住地址</td>
	 		<td>
	 			<input type="text" value="${userInfo.useraddress_now}" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>户口地址</td>
	 		<td>
	 			<input type="text" value="${userInfo.useraddress}" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>公司名称</td>
	 		<td>
	 			<input type="text" value="${userInfo.usercomname }" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>公司地址</td>
	 		<td>
	 			<input type="text" value="${userInfo.usercomaddress }" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>职称</td>
	 		<td>
	 			<input type="text" value="${userInfo.usercomjob}" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>工资</td>
	 		<td>
	 			<input type="text" value="${userInfo.usermoney }" readonly="readonly">
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>征信详情</td>
	 		<td>
	 			 <a href="<%=basePath%>LinRun.htm" target="blank">查看详情</a>
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>身份证信息</td>
	 		<td>
	 			<a href="<%=basePath%>shenfenzheng.htm" target="blank">查看详情</a>
	 		</td>
	 	</tr>
	 	<tr>
	 		<td>银行流水账单</td>
	 		<td>
	 			<a href="<%=basePath%>Liushui.htm" target="blank">查看详情</a>
	 		</td>
	 	</tr>
	 	<tr>
		<td>二审人员姓名</td>
			<td><input type="text" readonly="readonly" value="${userInfo.checksecondname }"/></td>
		</tr>
		<tr>
			<td>二审日期</td>
			<td>
				<input type="text" readonly="readonly" value="<fmt:formatDate value="${userInfo.checkseconddate }" pattern="yyyy-MM-dd"/>"/>
			</td>
		</tr>
		<tr>
			<td>二审人员意见</td>
			<td>
				<c:choose>
					<c:when test="${userInfo.checksecondmsg==1 }">
						<input type="text" readonly="readonly" value="通过"/>
					</c:when>						
					<c:otherwise>
						<input type="text" readonly="readonly" value="已驳回"/>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
	 	<tr>
	 		<td>审核意见</td>
	 		<td>
	 			<select name="rentinfo.checksecondmsg" id="chec">
	 				<option value="5">--请选择--</option>
	 				<option value="1">通过</option>
	 				<option value="0">不通过</option>
	 			</select>
	 			<input TYPE="hidden" VALUE="${userInfo.rentid}" name="rentinfo.rentid">
	 		</td>
	 	</tr>
	 </table>
	 	<input type="submit" value="确认提交" onclick="mit()" >
	 </form>
	<div class="modal-footer" align="center">
		<button type="button" class="btn btn-default" 
			data-dismiss="modal">关闭</button>
	</div>
</div>
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
<script type="text/javascript">
	function mit()
	{
		if($("#chec").val()==5)
		{
			alert("请填写审核信息");
		}
	}
	function sub()
	{
		if($("#chec").val()!=5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
</script>
</html>
