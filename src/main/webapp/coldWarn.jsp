<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />

<!-- Bootstrap core CSS -->
<link href="<%=basePath%>assets/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="<%=basePath%>assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>assets/css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>assets/js/gritter/css/jquery.gritter.css" />
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>assets/lineicons/style.css">

<!-- Custom styles for this template -->
<link href="<%=basePath%>assets/css/style.css" rel="stylesheet">
<link href="<%=basePath%>assets/css/style-responsive.css"
	rel="stylesheet">

<script src="<%=basePath%>assets/js/chart-master/Chart.js"></script>
</head>
<body>
	
	
	<section id="main-content">
		<section class="wrapper">
			<!-- 内容开始 -->
			<div class="showback">
				<h4>
					<i class="fa fa-angle-right"></i> 所有警报
				</h4>
				<!-- 页面内容 -->
				<form id="frm1" class="form-horizontal tasi-form" action="<%=basePath%>coldwarn/getAll/coldwarns/1" method="post">
					<button type="submit"  class="btn btn-theme03">查找警报</button>
					<button type="button"  class="btn btn-theme03" onclick="addcoldwarnAdd()">新增警报</button>
					<div class="form-group">
						<label class="col-sm-2   control-label">警报名称:</label>
						<div class="col-sm-5">
							<input type="text" name="warnname"  class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2  control-label"> 警报编号：</label>
						<div class="col-sm-5">
							<input type="text" name="warncode"  class="form-control">
						</div>
					</div>
				</form>
			</div>
			
			<div class="showback">
				<!-- 内容开始 -->
				<table class="table table-hover">
					<thead>
						<tr>
							<th>序号</th>
							<th>警报编号</th>
							<th>警报名称</th>
							<th>警报类型</th>
							<th>警报阀值</th>
							<th>通知方式</th>
							<th>通知频率</th>
							<th>通知地址</th>
							<th>创建人</th>
							<th>创建时间</th>
							<th>修改人</th>
							<th>修改时间</th>
							<th>操作</th>
						</tr>
					</thead>
						<c:if test="${not empty allColdWarn  }">
						<tbody>
						<c:forEach items="${allColdWarn }" var="fl" varStatus="status">
						
							<tr>
								<td data-target="#${status.index+1}" data-toggle="modal"><a href="javascript:;">${status.index+1}</a>
									<input type="hidden" value="${fl.rowid }" name="rowid"/>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.warncode }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.warnname }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<c:if test="${fl.warntype ==1}">
										温度
									</c:if>
									<c:if test="${fl.warntype ==2}">
										湿度
									</c:if>
									<c:if test="${fl.warntype ==3}">
										火灾
									</c:if>
									<c:if test="${fl.warntype ==4}">
										烟雾
									</c:if>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.threshold }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<c:if test="${fl.notifytype ==1}">
										短信
									</c:if>
									<c:if test="${fl.notifytype ==2}">
										邮件
									</c:if>
									<c:if test="${fl.notifytype ==3}">
										站内消息
									</c:if>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.notifyinterval }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.notifyaddr }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.creator }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<fmt:formatDate value="${fl.createdt }"  pattern="yyyy-MM-dd"/>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.modifyby }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<fmt:formatDate value="${fl.modifydt }"  pattern="yyyy-MM-dd"/>
								</td>
								<td>
									<a href="<%=basePath%>coldwarn/getOne/coldwarn/${fl.rowid}/1">查看</a>
									<a href="<%=basePath%>coldwarn/getOne/coldwarn/${fl.rowid}/2">编辑</a>
									<a href="<%=basePath%>coldwarn/delete/coldwarn/${fl.rowid}">删除</a>
								</td>
							</tr>
						
						</c:forEach>  
					</tbody>
					<tfoot>
							<tr align="center">
								<td colspan="11">
									<a href="<%=basePath%>coldwarn/getAll/coldwarn/${pageInfo.getFirstPage()}" class="btn btn-success btn-ms ">首页</a>
									<c:if test="${pageNum>1 }">	
									<a href="<%=basePath%>coldwarn/getAll/coldwarn/${pageNum-1 }" class="btn btn-success btn-ms ">&lt;&lt;上一页</a>
									</c:if>	
									<c:if test="${pageNum<pageInfo.getLastPage() }">
									<a href="<%=basePath%>coldwarn/getAll/coldwarn/${pageNum+1 }" class="btn btn-success btn-ms ">下一页&gt;&gt;</a>
									</c:if>
									<a href="<%=basePath%>coldwarn/getAll/coldwarn/${pageInfo.getLastPage() }" class="btn btn-success btn-ms "> 尾页</a>
						    		<font size="3">
						    			共	<font color="red">${pageInfo.getTotal() }</font>条数据
						    				当前	<font color="#0000ff">${pageInfo.getPageNum()}</font>
						    					<font color="red">/${pageInfo.getPages()}</font>页</font>
						    	</td>
							</tr>
						</tfoot>
							</c:if>
							<c:if test="${empty  allColdWarn}">
								<tr align="center"><td colspan="11"><font color="red">对不起，暂无需要警报信息~</font></td></tr>
							</c:if>	
									
				</table>
			</div>
			<!-- 内容结束 -->
		</section>
		<!--/wrapper -->
	</section>
	<!-- /MAIN CONTENT -->
	
<script type="text/javascript">
	function addcoldwarnAdd(){
		window.location.href="<%=basePath%>coldWarnAdd.jsp";
	}	
	




</script>	



 </body>
</html>