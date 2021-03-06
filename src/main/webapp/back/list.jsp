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
		<table id="list" class="table table-striped">
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
	        
	      </tbody>
	    </table>
	</div>
	<script>
		(function(){
			var data = Data.getData("/question/get_all_question");
			console.log(data);
			$(data.response).each(function(i,n){
				var trEl = "<tr><th scope='row'>"+(i+1)+"</th>";
				trEl += "<td>"+n.queQuestion.question+"</td>";
				trEl += "<td>"+n.queQuestion.visible+"</td>";
				trEl += "<td>"+n.queQuestion.sort+"</td>";
				trEl += "<td></td>";
				trEl += "<td><a class='btn btn-default' href='view.jsp'>查看</a><a class='btn btn-default' href='edit.jsp'>修改</a><a name='deleteBtn' id='"+n.id+"' class='btn btn-default'>删除</a></td>";
				trEl += "</tr>";
				$("#list tbody").append(trEl);			
			});
			
			$("[name=deleteBtn]").on("click",function(){
				var qqaId = $(this).attr("id");
				var params = {};
				params.qqaId = qqaId;
				Data.submit("/question/delete_question",params);
				window.location.reload();
			});
		})();
	</script>
</body>
</html>