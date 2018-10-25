<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
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

<title>修改员页面</title>

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
<script type="text/javascript" src="<%=basePath%>assets/My97DatePickers/WdatePicker.js"></script>

<script src="<%=basePath%>assets/js/chart-master/Chart.js"></script>
<style type="text/css">
#parent {
	width: 300px;
	height: 35px;
	overflow: hidden;
	
}

#parent select {
	background: transparent;
	border: 1 solid silver;
	padding-left: 10px;
	width: 220px;
	height: 100%;
}
</style>
</head>

<body>
	<!-- 导航栏 --><jsp:include page="common.jsp"></jsp:include>
	<!--main content start-->
	<section id="main-content">
		<section class="wrapper">
			<!-- 内容开始 -->
			<div class="showback">
				<h4>
					<i class="fa fa-angle-right"> <a
						href="<%=basePath%>emp/selectEmp/1">员工列表</a>
					</i> <i class="fa fa-angle-right"> <a
						href="javascript:history.go(-1)">返回</a>
					</i>
				</h4>
				<!-- 页面内容 -->

				<form class="form-horizontal style-form" method="post" action="<%=basePath%>emp/updateEmp">
					<table class="tableCss" align="center">
					<tr>
						<td><label>员工姓名：</label></td>
						<td>	
							<input type="hidden" name="emp.empid" value="${e.empid }">
							<input type="text" class="form-control" 
							onblur="return cename();" name="empname" id="empname" value="${e.empname }">
						</td>
					</tr>
					<tr>
						<td><label>员工账号：</label></td>
						<td><input type="text" class="form-control" onblur="return ceusername();" name="emp.empusername" id="empusername" value="${e.empusername }"></td>
					</tr>
					<tr>
						<td><label>登录密码：</label></td>
						<td>
							<input type="password" class="form-control" onblur="return cepassword();"	name="emp.emppwd" value="${e.emppwd }">
						</td>
					</tr>
					<tr>
						<td><label>员工权限：</label></td>
						<td>
							<div id="parent">
								<select class="col-sm-3" name="emp.power" id="power">
									<option class="form-control" value="no">--请选择--</option>
									<option class="form-control" value="一级管理">一级管理</option>
									<option class="form-control" value="二级管理">二级管理</option>
									<option class="form-control" value="超级管理员">超级管理员</option>
								</select>
							</div>
						</td>
					</tr>
					<tr>
						<td><button onclick="return yanzheng();" type="submit" class="btn btn-primary btn-lg btn-block">提交</button></td>
					</tr>
					</table>
				</form>
			</div>
		</section>
	</section>
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

function cename() {
	var ename = document.getElementById("ename").value;
	var k = new RegExp("^(?!_)(?!.*?_$)[a-zA-Z0-9_\u4e00-\u9fa5]+$");
	if (k.test(ename) != true) {
		alert("名字不能含有非法字符");
		document.getElementById("ename").value = "";
		return false;
	}
	if (ename.length > 11) {
		alert("只能输出2-10个字符");
		document.getElementById("ename").value = "";
		return false;
	}
	if (ename.length < 2) {
		alert("只能输出2-10个字符");
		document.getElementById("ename").value = "";
		return false;
	}
}
function ceidcard() {
	var ebirths = document.getElementById("ebirths").value;//生日
	if (ebirths == "" || ebirths == null) {
		alert("请先填写出生年月日");
		return false;
	}
	var eidcard = document.getElementById("eidcard").value;//身份证号码
	var reg = /(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
	if (reg.test(eidcard) == false) {
		alert("身份证输入有误，请核对");
		return false;
	}
	var year = eidcard.substring(6, 10);//获取输入身份证的年限
	var eyear = ebirths.substring(0, 4);
	if (year != eyear) {
		alert("身份证号码年份与出生年份不对,请核对后输入");
		return false;
	}
	var month = eidcard.substring(10, 12);//获取输入身份证的月份 
	var emonth = ebirths.substring(5, 7);
	if (month != emonth) {
		alert("身份证号码月份与出生月份不对,请核对后输入");
		return false;
	}
	var day = eidcard.substring(12, 14);//获取输入身份证的日子
	var eday = ebirths.substring(8, 10);
	if (day != eday) {
		alert("身份证号码日份与出生日份不对,请核对后输入");
		return false;
	}
	var temp_date = new Date(year, parseFloat(month) - 1, parseFloat(day));
	if (temp_date.getFullYear() != parseFloat(year)
			|| temp_date.getMonth() != parseFloat(month) - 1
			|| temp_date.getDate() != parseFloat(day)) {
		alert("身份证号码有误");
		return false;
	}
}



function cephone(){
	var ephone = document.getElementById("ephone").value;
	var e =/^1(3|4|5|7|8)\d{9}$/;
	if(ephone.length!=11){
		alert("请输入11位的手机号码");
		return false; 
	}
	if(e.test(ephone)==false){
		 alert("手机号码有误，请重填"); 
	     return false; 
	}
	
}
function cemail(){
	var email = document.getElementById("email").value;
	var ee =/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
	if (ee.test(email)==false) {
		alert("邮箱格式有误，请重填"); 
	    return false; 
	}
}
function cepostno(){
	var epostno = document.getElementById("epostno").value;
	if(epostno.length>10){
		alert("部门过长，请重填密码（2-10）个汉字"); 
	    return false;
	}if(epostno.length<2){
		alert("部门过短，请重填密码（2-10）个汉字"); 
	    return false;
	}
	
}
function cepassword(){
	var epassword = document.getElementById("epassword").value;
	if(epassword.length>16){
		alert("密码过长，请重填密码（6-16）位"); 
	    return false; 
	}
	if(epassword.length<6){
		alert("密码过段，请重填密码（6-16）位"); 
	    return false; 
	}
	
}

function yanzheng() {
	var ename = document.getElementById("ename").value;
	var ebirths = document.getElementById("ebirths").value;
	var eidcard = document.getElementById("eidcard").value;
	var ephone = document.getElementById("ephone").value;
	var email = document.getElementById("email").value;
	var epostno = document.getElementById("epostno").value;
	var etimes = document.getElementById("etimes").value;
	var epassword = document.getElementById("epassword").value;
	var eyear1 = ebirths.substring(0, 4);
	var tyear1 = etimes.substring(0, 4);
	if (ename == "" || ename == null) {
		alert("姓名不能为空");
		return false;
	}
	var k = new RegExp("^(?!_)(?!.*?_$)[a-zA-Z0-9_\u4e00-\u9fa5]+$");
	if (k.test(ename) != true) {
		alert("名字不能含有非法字符");
		document.getElementById("ename").value = "";
		return false;
	}
	if (ename.length > 11) {
		alert("只能输出2-10个字符");
		document.getElementById("ename").value = "";
		return false;
	}
	if (ename.length < 2) {
		alert("只能输出2-10个字符");
		document.getElementById("ename").value = "";
		return false;
	}
	if (ebirths == "" || ebirths == null) {
		alert("出生年月日不能为空");
		return false;
	}
	if (eidcard == "" || eidcard == null) {
		alert("身份证号码不能为空");
		return false;
	}
	if (ebirths == "" || ebirths == null) {
		alert("请先填写出生年月日");
		return false;
	}
	var eidcard = document.getElementById("eidcard").value;//身份证号码
	var reg = /(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
	if (reg.test(eidcard) == false) {
		alert("身份证输入有误，请核对");
		return false;
	}
	var year = eidcard.substring(6, 10);//获取输入身份证的年限
	var eyear = ebirths.substring(0, 4);
	if (year != eyear) {
		alert("身份证号码年份与出生年份不对,请核对后输入");
		return false;
	}
	var month = eidcard.substring(10, 12);//获取输入身份证的月份 
	var emonth = ebirths.substring(5, 7);
	if (month != emonth) {
		alert("身份证号码月份与出生月份不对,请核对后输入");
		return false;
	}
	var day = eidcard.substring(12, 14);//获取输入身份证的日子
	var eday = ebirths.substring(8, 10);
	if (day != eday) {
		alert("身份证号码日份与出生日份不对,请核对后输入");
		return false;
	}
	var temp_date = new Date(year, parseFloat(month) - 1, parseFloat(day));
	if (temp_date.getFullYear() != parseFloat(year)
			|| temp_date.getMonth() != parseFloat(month) - 1
			|| temp_date.getDate() != parseFloat(day)) {
		alert("身份证号码有误");
		return false;
	}
	if (ephone == "" || ephone == null) {
		alert("电话号码不能为空");
		return false;
	}
	var e =/^1(3|4|5|7|8)\d{9}$/;
	if(ephone.length!=11){
		alert("请输入11位的手机号码");
		return false; 
	}
	if(e.test(ephone)==false){
		 alert("手机号码有误，请重填"); 
	     return false; 
	}
	if (email == "" || email == null) {
		alert("邮箱不能为空");
		return false;
	}
	var ee =/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
	if (ee.test(email)==false) {
		alert("邮箱格式有误，请重填"); 
	    return false; 
	}
	if (epostno == "" || epostno == null) {
		alert("请填写职位");
		return false;
	}
	if(epostno.length>10){
		alert("部门过长，请重填密码（2-10）个汉字"); 
	    return false;
	}if(epostno.length<2){
		alert("部门过短，请重填密码（2-10）个汉字"); 
	    return false;
	}
	
	if (etimes == "" || etimes == null) {
		alert("请填写入职时间");
		return false;
	}
	if((tyear1-eyear1)<16){
		alert("未满16周岁，不能雇佣此员工");
	}
	if (epassword == "" || epassword == null) {
		alert("请输入登入密码");
		return false;
	}
	if(epassword.length>16){
		alert("密码过长，请重填密码（6-16）位"); 
	    return false; 
	}
	if(epassword.length<6){
		alert("密码过段，请重填密码（6-16）位"); 
	    return false; 
	}
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
