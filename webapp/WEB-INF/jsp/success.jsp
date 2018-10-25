<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <script type="text/javascript"  src="<%=basePath%>jq/jquery.js"></script>
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
    	<center>
    		<table align="center" cellpadding="0" cellspacing="0" border="1" >
 				<tr>
					<td>序号</td>
					<td>用户名</td>
					<td>身份证号</td>
					<td>性别</td>
					<td>婚姻</td>
					<td>户口</td>
					<td>公司名</td>
					<td>公司地址</td>
					<td>电话</td>
					<td>邮箱</td> 
					<td>薪资</td> 
					<td>出生日期</td>
					<td>操作</td>  				
 				</tr>   
	 				<c:forEach items="${list}" varStatus="status" var="n">		
	    			<tr>
	    				<td>${status.index+1 }</td>
	    				<td>${n.username}</td>
	    				<td>${n.useridcard}</td>
	    				<td>
	    					<c:if test="${n.usersex==1}">男</c:if>
	    				<c:if test="${n.usersex==0}">女</c:if>
	    				</td>
	    				<td>
	    					<c:if test="${n.usermarry==1}">已婚</c:if>
	    				<c:if test="${n.usermarry==0}">未婚</c:if>
	    				</td>
	    				<td>${n.useraddress}</td>
	    				<td>${n.usercomname}</td>
	    				<td>${n.usercomaddress}</td>
	    				<td>${n.usertel}</td>
	    				<td>${n.usermail}</td>
	    				<td>${n.usermoney}</td>
	    				<td><fmt:formatDate value="${n.userdate}" pattern="yyyy-MM-dd" /></td>
	    				<td>
	    					<a href="<%=basePath%>query/${n.userid}/1">查看</a>&nbsp;&nbsp;
	    					<a href="<%=basePath%>query/${n.userid}/2">修改</a>
	    				</td>
	    			</tr>
    			</c:forEach>
    		</table>
    	</center>
    	
    	<form action="" id="fenye">
    		<input type="hidden" value="${p.pageNum }" name="nowPage" id="nowPage">
    		<input type="hidden" value="${p.pages }" name="size" id="size">
    	</form>
    	<div align="center">
    		 <font>当前${p.pageNum }/${p.pages }</font>
    		 <a href="javascript:firstPage()">首页</a>
	         <a href="javascript:lastPage()">上一页</a>
	         <a href="javascript:nextPage()">下一页</a>
	         <a href="javascript:endPage()">尾页</a><br>
    	</div>
    	<script type="text/javascript">
	    	 function nextPage(){
	             var nowPage=$("#nowPage").val();
	             nowPage=parseInt(nowPage);
	             var pageCount=$("#size").val();
	             pageCount=parseInt(pageCount);
	             if(nowPage>=pageCount){
	                 alert("已是最后一页");
	                 return;
	             }else{
	                 nowPage=nowPage+1;
	             }
	             $("#nowPage").val(nowPage);
	             $("#fenye").submit();
	         }
	    	 function lastPage(){
	             var nowPage=$("#nowPage").val();
	             nowPage=parseInt(nowPage);
	             if(nowPage==1){
	                 return;
	             }else{
	                 nowPage=nowPage-1;
	             }
	             $("#nowPage").val(nowPage);
	             $("#fenye").submit();
	         }
	         function firstPage(){
	             var nowPage=$("#nowPage").val(1);
	             $("#fenye").submit();
	         }
	         function endPage(){
	             var pageCount=$("#size").val();
	             pageCount=parseInt(pageCount);
	             $("#nowPage").val(pageCount);
	             $("#fenye").submit();
	         }
    	</script>
  </body>
</html>