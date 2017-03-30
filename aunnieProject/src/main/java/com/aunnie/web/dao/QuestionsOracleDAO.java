package com.aunnie.web.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.aunnie.web.dto.QuestionsDTO;

@Repository("questionsDAO")
public class QuestionsOracleDAO implements QuestionsDAO{

	@Autowired
	private SqlSession session;
	
	@Override
	public List<QuestionsDTO> selectAll() {
	
		return session.selectList("com.aunnie.questions.selectAll");
	}

	@Override
	public QuestionsDTO selectOne(int q_no) {
		
		return session.selectOne("com.aunnie.questions.selectOne",q_no);
	}

	@Override
	public void insertOne(QuestionsDTO qdto) {
		session.insert("com.aunnie.questions.insertOne",qdto);
		
	}

	@Override
	public void updateOne(QuestionsDTO qdto) {
		session.update("com.aunnie.questions.updateOne",qdto);
		
	}

	@Override
	public void deleteOne(int q_no) {
		session.delete("com.aunnie.questions.deleteOne",q_no);
			
	}

}
