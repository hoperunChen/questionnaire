<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap 101 Template</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="_js/lib/bootstrap/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="_js/jquery/jquery-1.11.3.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="_js/lib/bootstrap/js/bootstrap.min.js"></script>
<script src="_js/constants.js"></script>
<script src="_js/content_init.js"></script>
<script src="_js/data.js"></script>
</head>
<body>
	<div class="container">
		<div class="bs-docs-grid">
			<div id="content" class="row show-grid">
			
				<%@ include file="base_page.jsp"%>
			</div>
		</div>
	</div>
	<script>
		($("#row").attr("id"));
	</script>
</body>
</html>