<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
						<input type="hidden" value="${corp.corid }" id="corid" name="corporation.corid"/>
						<input type="text" readonly="readonly" value="${corp.corname }" name="corporation.corname"/>
					</td>
				</tr>
				<tr>
					<td>身份证号</td>
					<td>
						<input type="text" readonly="readonly" value="${corp.coridcard }" id="idcard" name="corporation.coridcard"/>
						<input type="button" value="检验身份证信息" onclick="checkId()"/>
						<font id="msg"></font>
					</td>
				</tr>
				<tr>
					<td>电话</td>
					<td><input type="text" readonly="readonly" value="${corp.cortel }" name="corporation.cortel"/></td>
				</tr>
				<tr>
					<td>邮箱</td>
					<td><input type="text" readonly="readonly" value="${corp.cormail }" name="corporation.cormail"/></td>
				</tr>
				<tr>
					<td>居住地址</td>
					<td><input type="text" readonly="readonly" value="${corp.coraddress }" name="corporation.coraddress"/></td>
				</tr>
				<tr>
					<td>审核意见</td>
					<td>
						<select id="chec" name="corporation.checksecondmsg">
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
	var flag = false;
	//返回
	function retQueryCorp()
	{
		window.location.href="<%=basePath%>cor/queryCorpList/1";
	}
	//查询身份证信息
	function checkId()
	{
		//获取查询当前法人的id
		var corid = $("#corid").val();
		//获取输入身份证号码
		var idcard = $("#idcard").val();
		$.ajax({
			//请求地址
			url:"<%=basePath%>cor/checkIdCard",
			type:"post",//请求方式
			data:{"idcard":idcard,"corid":corid,"userid":0},//传送的数据
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
</script>
</html>