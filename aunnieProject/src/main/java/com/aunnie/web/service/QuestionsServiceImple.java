package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.QuestionsDAO;
import com.aunnie.web.dto.QuestionsDTO;

@Service("QuestionsService")
public class QuestionsServiceImple implements QuestionsService{

	@Resource(name="questionsDAO")
	private QuestionsDAO dao;
	
	
	@Override
	public List<QuestionsDTO> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public QuestionsDTO readOne(int q_no) {
		// TODO Auto-generated method stub
		return dao.selectOne(q_no);
	}

	@Override
	public void writeOne(QuestionsDTO qdto) {
		// TODO Auto-generated method stub
		dao.insertOne(qdto);
	}

	@Override
	public void modifyOne(QuestionsDTO qdto) {
		// TODO Auto-generated method stub
		dao.updateOne(qdto);
	}

	@Override
	public void deleteOne(int q_no) {
		// TODO Auto-generated method stub
		dao.deleteOne(q_no);
	}

}
