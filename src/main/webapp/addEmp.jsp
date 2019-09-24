<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page pageEncoding="UTF-8" isELIgnored="false" import="java.util.*" contentType="text/html;UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html >
	<head>
		<title>add Emp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="./css/style.css" />
		<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
		<script type="application/javascript">
			$(function () {
				$.ajax({
					url:"${pageContext.request.contextPath}/dept/selectAjax.do",
					type:"GET",
					dataType:"JSON",
					success:function (depts){
					    var se=$("#se");
						for(var i=0;i<depts.length;i++){
                          var d= $("<option value="+depts[i].dept_id+">"+depts[i].deptname+"</option>");
                           se.append(d);
						}
                    }
				});
            });
		</script>
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
								<a href="#">Main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						add Emp info:
					</h1>
					<form action="${pageContext.request.contextPath}/emp/addOneOne.do" method="post" enctype="multipart/form-data">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									头像:
								</td>
								<td valign="middle" align="left">
									<input type="file" name="upload" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									姓名:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="empname" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									工资:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="salary" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									年龄:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="age" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									部门:
								</td>
								<td valign="middle" align="left">
									<select id="se" name="dept_id">
									</select>
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="提交" />
						</p>
					</form>
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
