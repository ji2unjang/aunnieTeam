package com.aunnie.web.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.service.ProductOptionService;

@Controller
public class ProductOptionController {
	
	@Resource(name="productOptionService")
	private ProductOptionService service;
	
	@RequestMapping("/poptionList")
	public ModelAndView list(){
		return new ModelAndView("list2","list",service.getAll());
	}
}
