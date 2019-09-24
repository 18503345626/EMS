<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page pageEncoding="UTF-8" isELIgnored="false" import="java.util.*" contentType="text/html;UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="../css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							<fmt:formatDate value="<%=new java.util.Date() %>" pattern="yyyy-MM-dd"></fmt:formatDate>
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								头像
							</td>
							<td>
								姓名
							</td>
							<td>
								工资
							</td>
							<td>
								年龄
							</td>
							<td>
								部门名称
							</td>
							<td>
								操作
							</td>
						</tr>
						<c:forEach items="${requestScope.dept.list}" var="emp">

						<tr class="row1">						   
							<td>
								${emp.emp_id}
							</td>
							<td>
								<img width="40px" height="40px" src="${pageContext.request.contextPath}/upload/${emp.cover}" />
							</td>
							<td>
								${emp.empname}
							</td>
							<td>
								${emp.salary}
							</td>
							<td>
								${emp.age}
							</td>
							<td>
								${dept.deptname}
							</td>
							<td>
								<a href=${pageContext.request.contextPath}/emp/deleteById.do?empId=${emp.emp_id}&&id=${dept.dept_id}>delete emp</a>&nbsp;<a href="${pageContext.request.contextPath}/emp/selectOne.do?empId=${emp.emp_id}&&id=${dept.dept_id}">update emp</a>
							</td>
							</c:forEach>
						</tr>

					</table>
					
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
