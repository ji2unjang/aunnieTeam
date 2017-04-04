package com.aunnie.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aunnie.web.dao.ReviewDAO;
import com.aunnie.web.dto.ReviewDTO;
@Service("reviewService")
public class ReviewServiceImple implements ReviewService{

	@Resource(name="reviewDAO")
	private ReviewDAO dao;
	
	@Override
	public List<ReviewDTO> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public ReviewDTO readOne(int review_no) {
		// TODO Auto-generated method stub
		return dao.selectOne(review_no);
	}

	@Override
	public void writeOne(ReviewDTO rdto) {
		// TODO Auto-generated method stub
		dao.insertOne(rdto);
	}

	@Override
	public void modifyOne(ReviewDTO rdto) {
		// TODO Auto-generated method stub
		dao.updateOne(rdto);
	}

	@Override
	public void deleteOne(int review_no) {
		// TODO Auto-generated method stub
		dao.deleteOne(review_no);
	}

}
