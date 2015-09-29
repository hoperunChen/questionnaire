package com.luckyrui.platform.questionnaire.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.luckyrui.platform.questionnaire.dao.QueQuestionDao;
import com.luckyrui.platform.questionnaire.model.QueAnswer;
import com.luckyrui.platform.questionnaire.model.QueQuestion;
import com.luckyrui.platform.questionnaire.model.page.PageQuestion;
import com.luckyrui.platform.questionnaire.service.QuestionService;

/**
 * 问卷问题业务类
 * 
 * @author chenrui
 *
 */
@Service
public class QuestionServiceImpl implements QuestionService {

	/**
	 * 问题dao
	 */
	@Resource
	QueQuestionDao queQuestionQao;

	@Override
	public List<PageQuestion> getAllQuestionsWithPage() {
		List<Map<String, Object>> result = queQuestionQao.selectAllShowPage();
		return returnPageQuestion(result);
	}

	private List<PageQuestion> returnPageQuestion(List<Map<String, Object>> result) {
		List<PageQuestion> rtn = new ArrayList<PageQuestion>();
		for (Map<String, Object> question : result) {
			PageQuestion pq = null;
			String qId = (String) question.get("q_id");
			if(containsQue(rtn, qId)){
				int index = indexOfQueById(rtn,qId);
				pq = rtn.get(index);
			}else{
				pq = new PageQuestion();
				rtn.add(pq);
			}
			pq.setQueQuestion(getQuestion(question));
			pq.addQueAnswers(getAnswer(question));
		}
		return rtn;
	}

	private QueQuestion getQuestion(Map<String, Object> question) {
		QueQuestion q = new QueQuestion();
		q.setId((String) question.get("q_id"));
		q.setQuestion((String) question.get("question"));
		return q;
	}

	private QueAnswer getAnswer(Map<String, Object> question) {
		QueAnswer a = new QueAnswer();
		a.setId((String) question.get("a_id"));
		a.setAnswer((String) question.get("answer"));
		return a;
	}

	private boolean containsQue(List<PageQuestion> ques, String id) {
		for (PageQuestion que : ques) {
			if (que.getQueId() != null && que.getQueId().equals(id))
				return true;
		}
		return false;
	}
	
	private int indexOfQueById(List<PageQuestion> ques,String id){
		for (int i = 0; i < ques.size(); i++) {
			PageQuestion pq = ques.get(i);
			if(pq.getQueId()!=null&&pq.getQueId().equals(id))
				return i;
		}
		return -1;
		
	}

}
