package com.aunnie.web.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dao.MemberDAO;
import com.aunnie.web.dao.MemberOracleDAO;

@Controller
public class MemberController {

	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberDAO dao;
	
	
	@RequestMapping("/memberList")
	
	public ModelAndView list(){
		System.out.println("Dao : " + dao);
		return new ModelAndView("list","list",dao.selectAll());
	}
}
