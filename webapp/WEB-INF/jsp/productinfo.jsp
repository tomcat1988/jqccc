<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jq/jquery.js"></script>
<script type="text/javascript">
	$(function (){	
		$("#probody").empty();
		$.ajax({
			url:"/proList",
			type:"post",
			dataType:"json",
			cache:false,
			async:false,
			success:function(data){
					var s ="";
				    $(data.result).each(function(){
				    	
				    	s+='<tr><td><a href="/proone?proid='+this.proid+'">'+this.proname+''+
						   '</td><td>'+this.proprofit+'%'+
						   '</td><td>'+this.proday+
						   '</td><td>'+this.proprice+'起'+
						   '</td><td><button onclick="join()">立即加入</button></td></tr>';
						   
				    });
				    $("#probody").append(s);
			}
		
		});
	})
	
</script>
</head>
<body>
	产品信息展示：
	<table>
		<tr><td>产品名称</td><td>产品收益率</td><td>投标期限</td><td>投标金额</td><td>状态</td></tr>
		 <!-- 点击理财产品名称可查看理财产品的详细信息
		 		点击立即加入可进行投标该理财产品
		  -->
		<tbody id="probody">
		      
		</tbody>
		
	</table>
	
	
</body>
</html>