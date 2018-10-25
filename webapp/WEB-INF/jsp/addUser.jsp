<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
  <script type="text/javascript" src="<%=basePath%>jq/jquery.js"></script>
    <base href="<%=basePath%>">
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
 	<div>
 	<form action="<%=basePath%>/insert" method="post" id="sub">
 		<input  id="username"  name="username" placeholder="请输入用户名" type="text"><p>
 		<input  id="userpwd"  name="userpwd" placeholder="请输入密码" type="text"><p>
 		<input  id="usernickname"  name="usernickname" placeholder="请输入昵称" type="text"><p>
    	<input type="text" name="usertel" class="form-control"  id="phone" placeholder="请输入手机号" maxlength=11>
    	<input type="button" class="btn btn-block btn-flat" id="verify_refresh" onclick="getMsgNum(this)" value="免费获取验证码"><p>
    	<input class="form-control" id="msg_num" placeholder="请输入验证码"><span id="sp"></span><p>
    	<input type="button" onclick="validateNum(this)" value="注册">
	</form>
</div>
<script type="text/javascript">
var messageData;
var wait = 60; // 短信验证码120秒后才可获取下一个

/**
 * 获取验证码
 * @param that
 */
function getMsgNum(that) {
    var phoneNumber = $('#phone').val();
    setButtonStatus(that); // 设置按钮倒计时
    var obj = {
        phoneNumber: phoneNumber
    };

    $.ajax({
        url:"<%=basePath%>/sendMsg", // 后台短信发送接口
        type: 'post',
        dataType: 'json',
        contentType: "application/json",
        async: false, //false 同步
        data: JSON.stringify(obj),
        xhrFields: {
            withCredentials: true
        },
        success: function (result) {
            if(result.code == '200') {
                messageData = result.data;
            }else {
                alert("错误码:" + data.code + "  错误信息:" + data.message);
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(XMLHttpRequest.status);
            console.log(XMLHttpRequest.readyState);
            console.log(textStatus);
        }
    });
}
/**
 * 设置按钮状态
 */
function setButtonStatus(that) {
    if (wait == 0) {
        that.removeAttribute("disabled");
        that.value="免费获取验证码";
        wait = 60;
    } else {
        that.setAttribute("disabled", true);
        that.value=wait+"秒后可以重新发送";
        wait--;
        setTimeout(function() {
            setButtonStatus(that)
        }, 1000)
    }
}

/**
* 注册按钮
*/
function validateNum() {
	var mobile_code = $('#msg_num').val();
  var obj={
		  code:mobile_code 
		  
  };

    $.ajax({
        url:"<%=basePath%>/validateNum", // 验证接口
        type: 'post',
        dataType: 'json',
        contentType: "application/json",
        data: JSON.stringify(obj),
        success: function (data) {
           //业务处理
           if(data.result=="success"){
        	  $("#sub").submit();
        	   <%-- ocation.href="<%=basePath%>/insert"; --%>
        	   alter("注册成功!!")
           }else{
        	   /* $("#sp").html("验证失败!!!").css("color","red"); */
        	    alter("注验证码错误!!")
           }
        },
        
    });
}


</script>
  </body>
</html>