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
<title>个人理财信息列表界面</title>
</head>
<body>
	<center>
		<form action="<%=basePath%>fin/checkSuccess" onsubmit="return sub()" method="post">
			<table border="2" cellpadding="10" cellspacing="0" bordercolor="red">
				<tr>
					<td>用户昵称</td>
					<td>
						<input type="hidden" value="${fina.finid }" name="financeinfo.finid"/>
						<input type="hidden" value="${fina.userid }" name="financeinfo.userid"/>
						<input type="hidden" value="${fina.proid }" name="financeinfo.proid"/>
						<input type="text" readonly="readonly" value="${fina.usernickname }"/>
					</td>
				</tr>
				<tr>
					<td>身份证号</td>
					<td><input type="text" readonly="readonly" value="${fina.useridcard }"/></td>
				</tr>
				<tr>
					<td>性别</td>
					<td>
						<c:if test="${fina.usersex==1 }">
							<font>男</font>
						</c:if>
						<c:if test="${fina.usersex==0 }">
							<font>女</font>
						</c:if>
					</td>
				</tr>
				<tr>
					<td>出生日期</td>
					<td><input type="text" readonly="readonly" value="<fmt:formatDate value="${fina.userdate }" pattern="yyyy-MM-dd"/>"/></td>
				</tr>
				<tr>
					<td>银行卡号</td>
					<td><input type="text" readonly="readonly" value="${fina.usercard }"/></td>
				</tr>
				<tr>
					<td>电话</td>
					<td><input type="text" readonly="readonly" value="${fina.usertel }"/></td>
				</tr>
				<tr>
					<td>邮箱</td>
					<td><input type="text" readonly="readonly" value="${fina.usermail }"/></td>
				</tr>
				<tr>
					<td>居住地址</td>
					<td><input type="text" readonly="readonly" value="${fina.useraddress_now }"/></td>
				</tr>
				<tr>
					<td>工资</td>
					<td><input type="text" readonly="readonly" value="${fina.usermoney }"/></td>
				</tr>
				<tr>
					<td>产品名称</td>
					<td><input type="text" readonly="readonly" value="${fina.proname }"/></td>
				</tr>
				<tr>
					<td>理财产品类型</td>
					<td><input type="text" readonly="readonly" value="${fina.protype }"/></td>
				</tr>
				<tr>
					<td>产品最低投标金额</td>
					<td><input type="text" readonly="readonly" value="${fina.proprice }"/></td>
				</tr>
				<tr>
					<td>产品收益率</td>
					<td><input type="text" readonly="readonly" value="${fina.proprofit }"/></td>
				</tr>
				<tr>
					<td>身份证信息查询是否通过</td>
					<td><input type="text" readonly="readonly" value="${fina.checkidcard }"/></td>
				</tr>
				<tr>
					<td>二审人员姓名</td>
					<td><input type="text" readonly="readonly" value="${fina.checksecondname }"/></td>
				</tr>
				<tr>
					<td>二审日期</td>
					<td>
						<input type="text" readonly="readonly" value='<fmt:formatDate value="${fina.checkseconddate }" pattern="yyyy-MM-dd"/>'/>
					</td>
				</tr>
				<tr>
					<td>二审人员意见</td>
					<td>
						<c:choose>
							<c:when test="${fina.checksecondmsg==1 }">
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
						<select id="checkmsg" name="financeinfo.checkfirstmsg">
							<option value="2">--请选择--</option>
							<option value="1">通过</option>
							<option value="0">不通过</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"/></td>
					<td><input type="button" onclick="retQueryFina()" value="返回"/></td>
				</tr>
			</table>
		</form>
	</center>
</body>
<script type="text/javascript">
	//返回
	function retQueryFina()
	{
		window.location.href="<%=basePath%>fin/queryFinaList/1";
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