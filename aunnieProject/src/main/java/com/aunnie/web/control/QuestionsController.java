package com.aunnie.web.control;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.service.QuestionsService;

@Controller
public class QuestionsController {
	private static final Logger log = LoggerFactory.getLogger(QuestionsController.class);

	@Resource(name="QuestionsService")
	private QuestionsService service;
	
	@RequestMapping("/questionList")
	public ModelAndView list(){
		
		return new ModelAndView("list2","list",service.getAll());
		
	}
}
