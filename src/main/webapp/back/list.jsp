<%@ page language="java" contentType="text/html; charset=UTF-16"
    pageEncoding="UTF-16"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>
<%@ include file="../header.jsp" %>
</head>
<body>
	<div class="container">
		<ul class="nav nav-tabs">
		  <li role="presentation" class="active"><a href="#">题目</a></li>
<!-- 		  <li role="presentation"><a href="#">答案</a></li> -->
		</ul>
		<ul class="nav nav-pills">
		  <li role="presentation" class="active"><a href="edit.jsp">添加</a></li>
		</ul>
		<table class="table table-striped">
      <thead>
        <tr>
          <th>#</th>
          <th>题目</th>
          <th>是否显示</th>
          <th>排序</th>
          <th>答案</th>
          <th>操作</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th scope="row">1</th>
          <td>Mark</td>
          <td>Otto</td>
          <td>@mdo</td>
          <td>@mdo</td>
          <td>
          	<a class="btn btn-default" href="view.jsp">查看</a>
          	<a class="btn btn-default" href="edit.jsp">修改</a>
          	<a class="btn btn-default">删除</a>
          </td>
        </tr>
        <tr>
          <th scope="row">2</th>
          <td>Jacob</td>
          <td>Thornton</td>
          <td>@fat</td>
          <td>@mdo</td>
          <td>
          	<a class="btn btn-default" href="view.jsp">查看</a>
          	<a class="btn btn-default" href="edit.jsp">修改</a>
          	<a class="btn btn-default">删除</a>
          </td>
        </tr>
        <tr>
          <th scope="row">3</th>
          <td>Larry</td>
          <td>the Bird</td>
          <td>@twitter</td>
          <td>@mdo</td>
          <td>
          	<a class="btn btn-default" href="view.jsp">查看</a>
          	<a class="btn btn-default" href="edit.jsp">修改</a>
          	<a class="btn btn-default">删除</a>
          </td>
        </tr>
      </tbody>
    </table>
	</div>
	<script>
		(function(){
			var data = Data.getData("/question/get_all_question");
			
		})();
	</script>
</body>
</html>