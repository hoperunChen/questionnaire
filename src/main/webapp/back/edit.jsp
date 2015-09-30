<%@ page language="java" contentType="text/html; charset=UTF-16"
	pageEncoding="UTF-16"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>
<%@ include file="../header.jsp"%>
<link rel="stylesheet" href="view.css" />
</head>
<body>
	<div class="container">
		<ul class="nav nav-pills">
			<li role="presentation" class="active"><a href="list.jsp">列表</a></li>
			<li role="presentation" class="active"><a href="#">提交</a></li>
		</ul>
		<nav class="navbar navbar-default">
		<form>
			<div class="container-fluid">
				<div class="navbar-header">
					<span class="navbar-brand">题目</span>
				</div>
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-4">
					<p class="navbar-text">
						<input type="text" class="form-control" placeholder="Search">
					</p>
				</div>
			</div>
			<div class="container-fluid">
				<div class="navbar-header">
					<span class="navbar-brand">是否显示</span>
				</div>
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-4">
					<p class="navbar-text">
						<input type="text" class="form-control" placeholder="Search">
					</p>
				</div>
			</div>
			<div class="container-fluid">
				<div class="navbar-header">
					<span class="navbar-brand">排序</span>
				</div>
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-4">
					<p class="navbar-text">
						<input type="text" class="form-control" placeholder="Search">
					</p>
				</div>
			</div>
			<div class="container-fluid">
				<div class="navbar-header">
					<span class="navbar-brand">答案</span>
				</div>
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-4">
					<div id="text">
					<p class="navbar-text ">
						<input type="text" class="form-control" placeholder="Search">
					</p>
					</div>
					<p class="navbar-text">
						<button class="btn btn-default" type="submit">add</button>
					</p>
				</div>
			</div>
<!-- 			<div class="container-fluid"> -->
<!-- 				<div class="span7 text-center"> -->
<!-- 					<input class="btn btn-default" id="submit_button" type="button"  value="提交" /> -->
<!-- 				</div> -->
<!-- 			</div> -->
		</form>
		</nav>
	</div>
	<script>
		(function() {
			var data = Data.getData("/question/get_all_question");

		})();
	</script>
</body>
</html>