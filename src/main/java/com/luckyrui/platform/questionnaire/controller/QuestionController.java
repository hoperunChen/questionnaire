package com.luckyrui.platform.questionnaire.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luckyrui.platform.questionnaire.model.page.PageQuestion;
import com.luckyrui.platform.questionnaire.service.AnswerService;
import com.luckyrui.platform.questionnaire.service.QuestionService;
import com.luckyrui.platform.utils.ApiUtils;

@RequestMapping("/question")
@Controller
public class QuestionController {
	
	@Resource
	QuestionService questionService;
	
	@Resource
	AnswerService answerService;
	
	@RequestMapping(value="get_all_question",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getQuestions(){
		List<PageQuestion> rtn = questionService.getAllQuestionsWithPage();
		return ApiUtils.getSuccess(rtn);
	}
	
	@RequestMapping(value="submit_que",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> submitQue(String[] question){
		answerService.submitAnswer(question);
		return ApiUtils.getSuccess();
	}
}
