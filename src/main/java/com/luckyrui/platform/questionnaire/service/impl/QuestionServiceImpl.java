package com.luckyrui.platform.questionnaire.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.luckyrui.platform.questionnaire.dao.QueAnswerDao;
import com.luckyrui.platform.questionnaire.dao.QueQuestionAnswerDao;
import com.luckyrui.platform.questionnaire.dao.QueQuestionDao;
import com.luckyrui.platform.questionnaire.model.QueAnswer;
import com.luckyrui.platform.questionnaire.model.QueQuestion;
import com.luckyrui.platform.questionnaire.model.QueQuestionAnswer;
import com.luckyrui.platform.questionnaire.model.page.PageQuestion;
import com.luckyrui.platform.questionnaire.service.QuestionService;
import com.luckyrui.platform.utils.ApiUtils;
import com.luckyrui.platform.utils.BaseUtils;

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
	QueQuestionDao queQuestionDao;
	
	@Resource
	QueAnswerDao queAnswerDao;
	
	@Resource
	QueQuestionAnswerDao queQuestionAnswerDao;

	@Override
	public List<PageQuestion> getAllQuestionsWithPage() {
		List<Map<String, Object>> result = queQuestionDao.selectAllShowPage();
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
			pq.setId((String) question.get("qa_id"));
			pq.setQueQuestion(getQuestion(question));
			pq.addQueAnswers(getAnswer(question));
		}
		return rtn;
	}

	private QueQuestion getQuestion(Map<String, Object> question) {
		QueQuestion q = new QueQuestion();
		q.setId((String) question.get("q_id"));
		q.setQuestion((String) question.get("question"));
		q.setVisible((String) question.get("q_visible"));
		q.setSort((Integer) question.get("q_sort"));
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

	@Override
	public Map<String, Object> addQuestion(String question, String[] answer, String sort, String visible) {
		try {
			validateAddData(question, answer, sort, visible);
		} catch (Exception e) {
			return ApiUtils.getError(e.getMessage());
		}
		QueQuestion questionEntity = new QueQuestion();
		String questionId = BaseUtils.getUUID();
		questionEntity.setId(questionId);
		questionEntity.setQuestion(question);
		questionEntity.setSort(Integer.parseInt(sort));
		questionEntity.setVisible(visible);
		questionEntity.setCreateTime(new Date());
		questionEntity.setCreateUser("u");
		queQuestionDao.insert(questionEntity);
		for (String ans : answer) {
			String ansId = BaseUtils.getUUID();
			QueAnswer answerEneity = new QueAnswer();
			answerEneity.setId(ansId);
			answerEneity.setAnswer(ans);
			answerEneity.setCreateTime(new Date());
			answerEneity.setCreateUser("u");
			queAnswerDao.insert(answerEneity);
			String qqaId = BaseUtils.getUUID();
			QueQuestionAnswer qqa = new QueQuestionAnswer();
			qqa.setId(qqaId);
			qqa.setAnswerId(ansId);
			qqa.setQuestionId(questionId);
			qqa.setSort(Integer.parseInt(sort));
			qqa.setCreateTime(new Date());
			qqa.setCreateUser("u");
			queQuestionAnswerDao.insert(qqa);
			
		}
		
		return ApiUtils.getSuccess();
	}
	
	public void validateAddData(String question, String[] answer, String sort, String visible) throws Exception{
		if(BaseUtils.isEmpty(question))
			throw new Exception("question is null");
		if(BaseUtils.isEmpty(answer))
			throw new Exception("answer is null");
	}

	@Override
	public void deleteQuestion(String qqaId) {
		queQuestionAnswerDao.deleteByPrimaryKey(qqaId);
	}

}
