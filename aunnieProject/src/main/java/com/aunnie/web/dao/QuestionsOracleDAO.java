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
	public QuestionsDTO selectOne(int no) {
		
		return session.selectOne("com.aunnie.question.selectOne",no);
	}

	@Override
	public void insertOne(QuestionsDTO dto) {
		session.insert("com.aunnie.question.insertOne",dto);
		
	}

	@Override
	public void updateOne(QuestionsDTO dto) {
		session.update("com.aunnie.question.updateOne",dto);
		
	}

	@Override
	public void deleteOne(int no) {
		session.delete("com.aunnie.question.deleteOne",no);
			
	}

}
