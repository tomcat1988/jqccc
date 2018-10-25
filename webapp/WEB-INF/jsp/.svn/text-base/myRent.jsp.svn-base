<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    		<table align="center" cellpadding="0" cellspacing="0" bordercolor="red">
 				<tr>
					<td>序号</td>
					<td>贷款用途</td>
					<td></td>
					<td></td>
					<td></td> 				
 				</tr>   
	 				<c:forEach items="${allRent }" varStatus="status" var="l">		
	    			<tr>
	    				<td>${status.index+1 }</td>
	    				<td>${l.userrentfor }</td>
	    				<td></td>
	    				<td></td>
	    				<td></td>
	    			</tr>
    			</c:forEach>
    		</table>
    	</center>
    	
    	<form action="<%=basePath%>/rent/ab" id="fenye">
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
