package com.aunnie.web.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.CategoryDTO;
import com.aunnie.web.service.CategoryService;
import com.aunnie.web.service.DivisionService;
import com.aunnie.web.service.ProductService;
import com.aunnie.web.service.SectionService;

@Controller
public class ManageProductController {
	
	@Resource(name="productService")
	private ProductService service;
	@Resource(name="categoryService")
	private CategoryService cs;
	@Resource(name="divisionService")
	private DivisionService ds;
	@Resource(name="sectionService")
	private SectionService ss;
	@Resource(name="categoryService")
	private CategoryService cgs;
	
	@RequestMapping("/insertProduct")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView("admin/insertProduct");
		mv.addObject("list", service.getAll());
		mv.addObject("categories", cs.getAll());
		mv.addObject("divisions", ds.getAll());
		mv.addObject("sections", ss.getAll());
		return mv;
	}
	
	@RequestMapping("category_no_division")
	@ResponseBody
	public List<CategoryDTO> cate_no(@RequestParam(name="no")int no){
		System.out.println("cate_no"+no);
		List<CategoryDTO> list= cgs.getOne(no);
		return list;
	}
	
}
