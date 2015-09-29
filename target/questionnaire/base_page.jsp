<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
<form id="question_form"  method="post">

	<div>
	<input type="button" onclick="mysubmit()" value="提交" />
	</div>
</form>

<script>
	var data = Data.getData("/question/get_all_question");
	$(data.response).each(function(i, n) {
		var answer = "";
		$(n.queAnswers).each(function(j,a){
			answer += "<input type='radio' name ='question' value='"+n.queId+"_"+a.id+"'/>"+a.answer;
		});
		alert($("#question_form"));
		$("#question_form").append(
			"<div class='col-xs-6 col-md-4'>Q"+(i+1)+":"+ 
			n.queQuestion.question+
			"</br>"
			+"<div>"+answer+"</div>"+
		"</div>");
	});
	
	function mysubmit(){
		var form = $("#question_form");
		form.attr("action",CONFIG_ROOT+"/question/submit_que");
		alert(form.attr("action"));
		form.submit();
	}
</script>
</div>