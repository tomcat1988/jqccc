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
					<i class="fa fa-angle-right"></i> 所有订单
				</h4>
				<!-- 页面内容 -->
				<form id="frm1" class="form-horizontal tasi-form" action="<%=basePath%>cargoorder/getAll/cargoorders/1" method="post">
					<button type="submit"  class="btn btn-theme03">查找订单</button>
					<button type="button"  class="btn btn-theme03" onclick="addcargoorderAdd()">新增订单</button>
					<div class="form-group">
						<label class="col-sm-2   control-label">订单编号:</label>
						<div class="col-sm-5">
							<input type="text" name="orderno"  class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2  control-label"> 联系方式：</label>
						<div class="col-sm-5">
							<input type="text" name="tel"  class="form-control">
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
							<th>订单</th>
							<th>起运地</th>
							<th>目的地</th>
							<th>客户/货主</th>
							<th>联系电话</th>
							<th>要求发货时间</th>
							<th>要求到货时间</th>
							<th>重量</th>
							<th>体积</th>
							<th>货物类型</th>
							<th>备注</th>
							<th>创建人</th>
							<th>创建时间</th>
							<th>修改人</th>
							<th>修改时间</th>
							<th>操作</th>
						</tr>
					</thead>
						<c:if test="${not empty allCargoOrder  }">
						<tbody>
						<c:forEach items="${allCargoOrder }" var="fl" varStatus="status">
						
							<tr>
								<td data-target="#${status.index+1}" data-toggle="modal"><a href="javascript:;">${status.index+1}</a>
									<input type="hidden" value="${fl.rowid }" name="rowid"/>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.orderno }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.origin }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.destination }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.customer }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.tel }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<fmt:formatDate value="${fl.startdt }"  pattern="yyyy-MM-dd"/>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<fmt:formatDate value="${fl.enddt }"  pattern="yyyy-MM-dd"/>
								</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.gw }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">${fl.cbm }</td>
    						    <td data-target="#${status.index+1}" data-toggle="modal">
									<c:if test="${fl.cargotype ==1}">
										普货
									</c:if>
									<c:if test="${fl.cargotype ==2}">
										冷链
									</c:if>
									<c:if test="${fl.cargotype ==3}">
										危险品
									</c:if>
								</td>
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
									<a href="<%=basePath%>cargoorder/getOne/cargoorder/${fl.rowid}/1">查看</a>
									<a href="<%=basePath%>cargoorder/getOne/cargoorder/${fl.rowid}/2">编辑</a>
									<a href="<%=basePath%>cargoorder/delete/cargoorder/${fl.rowid}">删除</a>
								</td>
							</tr>
						
						</c:forEach>  
					</tbody>
					<tfoot>
							<tr align="center">
								<td colspan="11">
									<a href="<%=basePath%>cargoorder/getAll/cargoorder/${pageInfo.getFirstPage()}" class="btn btn-success btn-ms ">首页</a>
									<c:if test="${pageNum>1 }">	
									<a href="<%=basePath%>cargoorder/getAll/cargoorder/${pageNum-1 }" class="btn btn-success btn-ms ">&lt;&lt;上一页</a>
									</c:if>	
									<c:if test="${pageNum<pageInfo.getLastPage() }">
									<a href="<%=basePath%>cargoorder/getAll/cargoorder/${pageNum+1 }" class="btn btn-success btn-ms ">下一页&gt;&gt;</a>
									</c:if>
									<a href="<%=basePath%>cargoorder/getAll/cargoorder/${pageInfo.getLastPage() }" class="btn btn-success btn-ms "> 尾页</a>
						    		<font size="3">
						    			共	<font color="red">${pageInfo.getTotal() }</font>条数据
						    				当前	<font color="#0000ff">${pageInfo.getPageNum()}</font>
						    					<font color="red">/${pageInfo.getPages()}</font>页</font>
						    	</td>
							</tr>
						</tfoot>
							</c:if>
							<c:if test="${empty  allCargoOrder}">
								<tr align="center"><td colspan="11"><font color="red">对不起，暂无需要订单信息~</font></td></tr>
							</c:if>	
									
				</table>
			</div>
			<!-- 内容结束 -->
		</section>
		<!--/wrapper -->
	</section>
	<!-- /MAIN CONTENT -->
	
<script type="text/javascript">
	function addcargoorderAdd(){
		window.location.href="<%=basePath%>cargoOrderAdd.jsp";
	}	
	




</script>	



 </body>
</html>