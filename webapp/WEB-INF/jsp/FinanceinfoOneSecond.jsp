<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
						<input type="hidden" value="${fina.finid }" id="finid" name="financeinfo.finid"/>
						<input type="hidden" value="${fina.userid }" id="userid" name="financeinfo.userid"/>
						<input type="hidden" value="${fina.proid }" id="proid" name="financeinfo.proid"/>
						<input type="text" readonly="readonly" value="${fina.usernickname }"/>
					</td>
				</tr>
				<tr>
					<td>身份证号</td>
					<td>
						<input type="text" readonly="readonly" value="${fina.useridcard }" id="useridcard"/>
						<c:choose>
							<c:when test="${checkinfo!=null }">
								<span id="sp">${checkinfo.checkidcard }</span>
							</c:when>
							<c:otherwise>
								<input type="button" value="检验身份证信息" onclick="checkId()"/>
								<font id="msg"></font>
							</c:otherwise>
						</c:choose>
					</td>
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
					<td>审核意见</td>
					<td>
						<select id="chec" name="financeinfo.checksecondmsg">
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
	var flag = false;
	//返回
	function retQueryFina()
	{
		window.location.href="<%=basePath%>fin/queryFinaList/1";
	}
	//查询身份证信息
	function checkId()
	{
		//获取查询当前用户的id
		var userid = $("#userid").val();
		//获取输入身份证号码
		var useridcard = $("#useridcard").val();
		$.ajax({
			//请求地址
			url:"<%=basePath%>cor/checkIdCard",
			type:"post",//请求方式
			data:{"idcard":useridcard,"userid":userid,"corid":0},//传送的数据
			dataType:"json",//预计返回的字符串类型
			beforeSend:function(data)//加载执行方法
			{
				$("#msg").html("查询中.......");
			},
			error:function(data)
			{
				alert("请求失败");
			},
			success:function(data)
			{
				if(data.resultcode=="200")
				{
					//查询信息准确
					$("#msg").html("该身份证号所属地区是:"+data.area+",性别:"+data.sex+",出生日期:"+data.birthday+"<br/>身份证是否泄露:"+data.tips1+"<br/>身份证是否挂失:"+data.tips2);
				}
				else
				{
					//查询错误的身份证信息
					$("#msg").html(data.error);
				}
			}
		});
		flag = true;
		return;
	}
	//提交
	function sub()
	{
		if(flag && ($("#chec").val()!=2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	$(function(){
		if($("#sp").html()!=null && $("#sp").html()!="")
		{
			flag = true;
		}
	});
</script>
</html>