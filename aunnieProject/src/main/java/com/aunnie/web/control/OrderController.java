package com.aunnie.web.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.OrderDTO;
import com.aunnie.web.service.OrderService;

@Controller
public class OrderController {	
	@Resource(name="orderService")
	private OrderService os;
	
	@RequestMapping("/orderList")
	public ModelAndView list(){
		return new ModelAndView("orderList","list",os.selectAll());
	}

	@RequestMapping("/orderdetail")
	public ModelAndView orderdetail(
			@RequestParam("order_no")int order_no){
		return new ModelAndView("orderDetail","dto",os.selectOne(order_no));
				
	}
	@RequestMapping("/writeForm")
	public String writeForm(){
		
		return "writeForm";
	}
	@RequestMapping("/writeOk")
	public String write(
			@ModelAttribute("dto")OrderDTO dto,
			HttpServletRequest req){
		
		os.insert(dto);
		return "redirect:/orderList";
	}
	
	@RequestMapping("/modifyForm")
	public ModelAndView modifyForm(
			@RequestParam("order_no") int order_no){

		return new ModelAndView("modifyForm","dto",os.selectOne(order_no));
	}
	@RequestMapping("/modifyOk")
	public String modifyOk(
			@ModelAttribute("dto")OrderDTO dto){
		
		return "redirect:/orderList";
	}
	public String delete(
			@ModelAttribute("order_no")int order_no){
		os.delete(order_no);
		return "redirect:/orderList";
	}
	
}
