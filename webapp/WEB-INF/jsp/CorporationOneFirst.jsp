<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jq/jquery.js"></script>
<title>个人法人信息列表界面</title>
</head>
<body>
	<center>
		<form action="<%=basePath%>cor/checkSuccess" onsubmit="return sub()" method="post">
			<table border="2" cellpadding="10" cellspacing="0" bordercolor="red">
				<tr>
					<td>法人名称</td>
					<td>
						<input type="hidden" value="${corp.corid }" name="corporation.corid"/>
						<input type="text" readonly="readonly" value="${corp.corname }"/>
					</td>
				</tr>
				<tr>
					<td>身份证号</td>
					<td><input type="text" readonly="readonly" value="${corp.coridcard }"/></td>
				</tr>
				<tr>
					<td>电话</td>
					<td><input type="text" readonly="readonly" value="${corp.cortel }"/></td>
				</tr>
				<tr>
					<td>邮箱</td>
					<td><input type="text" readonly="readonly" value="${corp.cormail }"/></td>
				</tr>
				<tr>
					<td>居住地址</td>
					<td><input type="text" readonly="readonly" value="${corp.coraddress }"/></td>
				</tr>
				<tr>
					<td>身份证信息查询是否通过</td>
					<td><input type="text" readonly="readonly" value="${corp.checkidcard }"/></td>
				</tr>
				<tr>
					<td>二审人员姓名</td>
					<td><input type="text" readonly="readonly" value="${corp.checksecondname }"/></td>
				</tr>
				<tr>
					<td>二审日期</td>
					<td>
						<input type="text" readonly="readonly" value='<fmt:formatDate value="${corp.checkseconddate }" pattern="yyyy-MM-dd"/>'/>
					</td>
				</tr>
				<tr>
					<td>二审人员意见</td>
					<td>
						<c:choose>
							<c:when test="${corp.checksecondmsg==1 }">
								<input type="text" readonly="readonly" value="通过"/>
							</c:when>						
							<c:otherwise>
								<input type="text" readonly="readonly" value="不通过"/>
							</c:otherwise>
						</c:choose>
					</td>
				</tr>
				<tr>
					<td>审核意见</td>
					<td>
						<select id="checkmsg" name="corporation.checkfirstmsg">
							<option value="2">--请选择--</option>
							<option value="1">通过</option>
							<option value="0">不通过</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"/></td>
					<td><input type="button" onclick="retQueryCorp()" value="返回"/></td>
				</tr>
			</table>
		</form>
	</center>
</body>
<script type="text/javascript">
	//返回
	function retQueryCorp()
	{
		window.location.href="<%=basePath%>cor/queryCorpList/1";
	}
	function sub()
	{
		if($("#checkmsg").val()!=2)
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