package com.aunnie.web.control;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.service.MemberService;

@Controller
public class MemberController {

	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	@Resource(name="memberService")
	private MemberService service;
	
	
	@RequestMapping("/memberList")
	public ModelAndView list(){
		return new ModelAndView("list","list",service.getAll());
	}
}
