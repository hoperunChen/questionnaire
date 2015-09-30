<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
<form id="question_form"  method="post">
	<div>
		<input id="submit_button" type="button"  value="提交" />
	</div>
</form>

<script>
	(function(){
		var data = Data.getData("/question/get_all_question");
		$(data.response).each(function(i, n) {
			var answer = "";
			$(n.queAnswers).each(function(j,a){
				answer += "<div class='radio'><label><input type='radio' name ='question"+n.queId+"' value='"+n.queId+"_"+a.id+"'/>"+a.answer+"</label></div>";
			});
			$("#question_form").append(
				"<div  class='answer col-xs-12 col-md-6'><div class='panel panel-info'>"+
				"<div class='panel-heading'>Q"+(i+1)+":"+ 
				n.queQuestion.question+
				"</div>"
				+"<div  class='panel-body'>"+answer+"</div>"+
			"</div></div>");
		});
		
		$("#submit_button").on("click",function(){
			var form = $("#question_form");
			form.attr("action",CONFIG_ROOT+"/question/submit_que");
			alert(form.attr("action"));
			if(validateForm())
				form.submit();
			else
				alert("不要漏选哦");
		});
		
		function validateForm(){
			var flag = true;
			$("#question_form").find(".answer").each(function(i,n){
				var val = $(n).find('input:radio:checked').val();
				console.log(val);
				if(!val){
					flag = false;
				}
				
			});
			return flag;
		}
	})();
</script>
</div>