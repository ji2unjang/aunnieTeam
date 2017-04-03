package com.aunnie.web.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.OrderDetailDTO;
import com.aunnie.web.service.OrderDetailService;

@Controller
public class OrderDetailController {
	
	@Resource(name="OrderDetailService")
	private OrderDetailService ods;
	
	@RequestMapping("/detailList")
	public ModelAndView list(){
		return new ModelAndView("detailList","detailList",ods.selectAllS());
	}
	
	@RequestMapping("/Dedaildetail")
	public ModelAndView OrderDetail(@RequestParam("order_no")int order_no){
		return new ModelAndView("detail","dto",ods.selectOneS(order_no));
	}
	
	@RequestMapping("/detailwriteForm")
	public String writeForm(){
		return "detailwriteForm";
	}
	
	@RequestMapping("/detailwriteOk")
	public String write(@ModelAttribute("dto")OrderDetailDTO dto){
		ods.insertS(dto);
		return "redirect:/detailList";
	}
	
	@RequestMapping("/detailmodifyForm")
	public ModelAndView detailmodifyForm(
			@RequestParam("order_no")int order_no){
		
		return new ModelAndView("detailmodifyForm","dto",ods.selectOneS(order_no));
	}
	
	@RequestMapping("detailmodifyOk")
	public String detailmodifyOk(@ModelAttribute("dto")OrderDetailDTO dto){
		ods.updateS(dto);
		return "redirect:/detailList";
	}
	@RequestMapping("/detaildelete")
	public String detaildelete(@ModelAttribute("order_no")int order_no){
		
		ods.deleteS(order_no);
		return "redirect:/detailList";
	
	}
}
