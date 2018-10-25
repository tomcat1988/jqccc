<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<script type="text/javascript"  src="jq/jquery.js"></script>
<title>userInfo</title>
</head>
<body>
	<div align="center">
		<form action="<%=basePath%>updateRentinfo" method="post" onsubmit="return sub()">
		 <table cellpadding="0px" cellspacing="0px" border="1px">
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
		 			<img alt="征信详情" src="">
		 		</td>
		 	</tr>
		 	<tr>
		 		<td>身份证信息</td>
		 		<td>
		 			<img alt="身份证详情" src="">
		 		</td>
		 	</tr>
		 	<tr>
		 		<td>银行流水账单</td>
		 		<td>
		 			<img alt="银行流水账单" src="">
		 		</td>
		 	</tr>
		 	<tr>
		 		<td>审核意见</td>
		 		<td>
		 			<select name="Rentinfo.checksecondmsg" id="checksecondmsg">
		 				<option value="5">--请选择--</option>
		 				<option value="1">通过</option>
		 				<option value="0">不通过</option>
		 			</select>
		 			<input TYPE="hidden" VALUE="${userInfo.rentid}" name="Rentinfo.rentid">
		 		</td>
		 	</tr>
		 </table>
		 	<input type="submit" value="确认提交" >
		 </form>
	</div>
	<script type="text/javascript">
		var selectFalg=false;
		function sub(){
			if($("#checksecondmsg").val()!=5){
				selectFalg=true;
				return true;
			}else{
				selectFalg=false;
				return false;
			}
		}
	</script>
	
	
</body>
</html>