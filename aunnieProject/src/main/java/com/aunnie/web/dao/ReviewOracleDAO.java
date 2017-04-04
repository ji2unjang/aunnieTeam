package com.aunnie.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.ReviewDTO;

@Repository("reviewDAO")
public class ReviewOracleDAO implements ReviewDAO{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<ReviewDTO> selectAll() {
		return session.selectList("com.aunnie.review.selectAll");
	}

	@Override
	public ReviewDTO selectOne(int review_no) {
		return session.selectOne("com.aunnie.review.selectOne", review_no);
		
	}

	@Override
	public void insertOne(ReviewDTO rdto) {
		session.insert("com.aunnie.review.insertOne",rdto);
		
	}

	@Override
	public void updateOne(ReviewDTO rdto) {
		System.out.println(rdto.getReview_no());
		session.update("com.aunnie.review.updateOne",rdto);
		
	}

	@Override
	public void deleteOne(int review_no) {
		session.delete("com.aunnie.review.deleteOne",review_no);
		
	}
	

}
