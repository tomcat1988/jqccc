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
					<i class="fa fa-angle-right"></i> 所有点位
				</h4>
				<!-- 页面内容 -->
				<form id="frm1" class="form-horizontal tasi-form" action="<%=basePath%>coldpoint/getAll/coldpoints/1" method="post">
					<button type="submit"  class="btn btn-theme03">查找点位</button>
					<button type="button"  class="btn btn-theme03" onclick="addcoldpointAdd()">新增点位</button>
					<div class="form-group">
						<label class="col-sm-2   control-label">点位名称:</label>
						<div class="col-sm-5">
							<input type="text" name="pointname"  class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2  control-label"> 点位编号：</label>
						<div class="col-sm-5">
							<input type="text" name="pointcode"  class="form-control">
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
							<th>点位编号</th>
							<th>点位名称</th>
							<th>点位类型</th>
							<th>点位状态</th>
							<th>安装仓库</th>
							<th>备注</th>
							<th>创建人</th>
							<th>创建时间</th>
							<th>修改人</th>
							<th>修改时间</th>
							<th>操作</th>
						</tr>
					</thead>
						<c:if test="${not empty allColdPoint  }">
						<tbody>
						<c:forEach items="${allColdPoint }" var="fl" varStatus="status">
						
							<tr>
								<td data-target="#${status.index+1}" data-toggle="modal"><a href="javascript:;">${status.index+1}</a>
									<input type="hidden" value="${fl.rowid }" name="rowid"/>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.pointcode }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.pointname }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<c:if test="${fl.pointtype ==1}">
										温度监控
									</c:if>
									<c:if test="${fl.pointtype ==2}">
										湿度监控
									</c:if>
									<c:if test="${fl.pointtype ==3}">
										火灾监控
									</c:if>
									<c:if test="${fl.pointtype ==4}">
										烟雾监控
									</c:if>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<c:if test="${fl.status ==1}">
										正常
									</c:if>
									<c:if test="${fl.status ==2}">
										停用
									</c:if>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.hubcode }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.remark }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.creator }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<fmt:formatDate value="${fl.createdt }"  pattern="yyyy-MM-dd"/>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.modifyby }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<fmt:formatDate value="${fl.modifydt }"  pattern="yyyy-MM-dd"/>
								</td>
								<td>
									<a href="<%=basePath%>coldpoint/getOne/coldpoint/${fl.rowid}/1">查看</a>
									<a href="<%=basePath%>coldpoint/getOne/coldpoint/${fl.rowid}/2">编辑</a>
									<a href="<%=basePath%>coldpoint/delete/coldpoint/${fl.rowid}">删除</a>
								</td>
							</tr>
						
						</c:forEach>  
					</tbody>
					<tfoot>
							<tr align="center">
								<td colspan="11">
									<a href="<%=basePath%>coldpoint/getAll/coldpoint/${pageInfo.getFirstPage()}" class="btn btn-success btn-ms ">首页</a>
									<c:if test="${pageNum>1 }">	
									<a href="<%=basePath%>coldpoint/getAll/coldpoint/${pageNum-1 }" class="btn btn-success btn-ms ">&lt;&lt;上一页</a>
									</c:if>	
									<c:if test="${pageNum<pageInfo.getLastPage() }">
									<a href="<%=basePath%>coldpoint/getAll/coldpoint/${pageNum+1 }" class="btn btn-success btn-ms ">下一页&gt;&gt;</a>
									</c:if>
									<a href="<%=basePath%>coldpoint/getAll/coldpoint/${pageInfo.getLastPage() }" class="btn btn-success btn-ms "> 尾页</a>
						    		<font size="3">
						    			共	<font color="red">${pageInfo.getTotal() }</font>条数据
						    				当前	<font color="#0000ff">${pageInfo.getPageNum()}</font>
						    					<font color="red">/${pageInfo.getPages()}</font>页</font>
						    	</td>
							</tr>
						</tfoot>
							</c:if>
							<c:if test="${empty  allColdPoint}">
								<tr align="center"><td colspan="11"><font color="red">对不起，暂无需要点位信息~</font></td></tr>
							</c:if>	
									
				</table>
			</div>
			<!-- 内容结束 -->
		</section>
		<!--/wrapper -->
	</section>
	<!-- /MAIN CONTENT -->
	
<script type="text/javascript">
	function addcoldpointAdd(){
		window.location.href="<%=basePath%>coldPointAdd.jsp";
	}	
	




</script>	



 </body>
</html>