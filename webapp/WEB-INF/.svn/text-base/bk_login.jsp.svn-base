<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>登录--管理系统</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=basePath%>assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="<%=basePath%>assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="<%=basePath%>assets/css/style.css" rel="stylesheet">
    <link href="<%=basePath%>assets/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
   <!--  [if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif] -->
    <%--  //location.href="<%=basePath%>main.jsp"; --%>
    <script type="text/javascript" src="<%=basePath%>Jquery/jquery-1.7.2.min.js"></script>
  	<script type="text/javascript">
  		$(document).ready(function(){
  			$("#bt").click(function(){
  				/* var user = document.getElementById("uid").value;
  				var password = document.getElementById("pwd").value;
  				$.post("/emp/empLogin",{"emp.empusername":user,"emp.emppwd":password},function(date){
  					if(date.result="error"){
  						alert("登陆失败！");
  					}else{
  						//alert("登陆成功！");
						
						location.href="/WEB-INF/bk_index";
  					}
  				}); */
  				
  					$.ajax({
  						url:"<%=basePath%>emp/empLogin",
  						data:{"emp.empusername":$("#uid").val(),"emp.emppwd":$("#pwd").val()},
  						dataType:"json",
  						type:"post",
  						success:function(data){
  							if(data.result=="success"){
  								location.href="/emp/index"; 
  							}else{
  								alert("用户名或者密码错误");
  							}
  						},
  						error:function(data){
  							alert("请求失败");
  						}
  					});
  				
  			});
  		});
  	</script>
  </head>

  <body>

      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
	  	
		      <form class="form-login" id="fr" methods="post" action="index.html" onsubmit="return false">
		        <h2 class="form-login-heading">富二贷管理系统</h2>
		        <div class="login-wrap">
		            <input type="text" id="uid" class="form-control" placeholder="User ID" autofocus>
		            <br>

		            <input type="password" id="pwd" class="form-control" placeholder="Password">

		            <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal" href="login.html#myModal">忘记密码 ?  </a>
		
		                </span>
		            </label>
		            <button id="bt" class="btn btn-theme btn-block" href="index.html" type="submit"><i class="fa fa-lock"></i> 登录</button>
		            <hr>
		            
		            <div class="login-social-link centered">
		            <p>欢迎富二贷员工登录祝您愉快每一天</p>
		               <!--  <button class="btn btn-facebook" type="submit"><i class="fa fa-facebook"></i> Facebook</button>
		                <button class="btn btn-twitter" type="submit"><i class="fa fa-twitter"></i> Twitter</button> -->
		            </div>
		
		        </div>
		
		          <!-- Modal 忘记密码弹框 -->
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">忘记密码?</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>请拨打15671627994联系超级管理员获取登录密码！</p>
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">确&nbsp;定</button>
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->
		
		      </form>	  	
	  	
	  	</div>
	  </div>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="<%=basePath%>assets/js/jquery.js"></script>
    <script src="<%=basePath%>assets/js/bootstrap.min.js"></script>

    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="<%=basePath%>assets/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("<%=basePath%>img/11111.jpg", {speed: 500});
    </script>


  </body>
</html>
