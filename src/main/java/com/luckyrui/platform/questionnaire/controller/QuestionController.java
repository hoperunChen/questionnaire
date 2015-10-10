package com.luckyrui.platform.questionnaire.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	
	/**
	 * 投票页面获取问题列表
	 * @return
	 */
	@RequestMapping(value="get_all_question",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getQuestions(){
		List<PageQuestion> rtn = questionService.getAllQuestionsWithPage();
		return ApiUtils.getSuccess(rtn);
	}
	
	/**
	 * 提交结果
	 * @param question
	 * @return
	 */
	@RequestMapping(value="submit_que",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> submitQue(HttpServletRequest request){
		Map<String, String[]> params = request.getParameterMap();
		List<String[]> values = new ArrayList<String[]>(params.values());
		String [] question = new String[values.size()];
		for (int i = 0; i < values.size(); i++) {
			String[] valueArray = values.get(i);
			if(valueArray!=null){
				String value = valueArray[0];
				question[i] = value;
			}
		}
		answerService.submitAnswer(question);
		return ApiUtils.getSuccess();
	}
	
	
	/**
	 * 添加问题
	 * @param question
	 * @param answer
	 * @param sort
	 * @param visible
	 * @return
	 */
	@RequestMapping(value="add_question",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> addQuestion(String question,String[] answer,String sort,String visible){
		return questionService.addQuestion(question, answer, sort, visible);
	}
	
	
	/**
	 * 删除问题
	 * @param qqaId
	 * @return
	 */
	@RequestMapping(value="delete_question",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteQuestion(String qqaId){
		questionService.deleteQuestion(qqaId);
		return ApiUtils.getSuccess();
	}
}
