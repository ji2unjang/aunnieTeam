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
	public QuestionsDTO getOne(int no) {
		// TODO Auto-generated method stub
		return dao.selectOne(no);
	}

	@Override
	public void writeOne(QuestionsDTO dto) {
		// TODO Auto-generated method stub
		dao.insertOne(dto);
	}

	@Override
	public void modifyOne(QuestionsDTO dto) {
		// TODO Auto-generated method stub
		dao.updateOne(dto);
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		dao.deleteOne(no);
	}

}
