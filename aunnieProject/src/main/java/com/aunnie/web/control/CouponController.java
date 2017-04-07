package com.aunnie.web.control;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aunnie.web.dto.CouponDTO;
import com.aunnie.web.service.CouponService;

@Controller
public class CouponController {
	@Resource(name="couponService")
	private CouponService cs;
	
	@RequestMapping("/cList")
	public ModelAndView list(){
		System.out.println("리스트까지는 된다.");
		return new ModelAndView("cList", "list", cs.getAll());
	}
	
	@RequestMapping("/cDetail")
	public ModelAndView detail(
			@RequestParam("coupon_no")int coupon_no){
		return new ModelAndView("cDetail", "dto", cs.getOne(coupon_no));
	}
	
	@RequestMapping("/cWriteForm")
	public String writeForm(){
		return "cWriteForm";
	}
	
	@RequestMapping("/cWriteOk")
	public String write(
			@ModelAttribute("dto")CouponDTO dto,
			HttpServletRequest req){
		cs.writeOne(dto);
		System.out.println("sql이 안됨");
		return "redirect:/cList";
	}
	
	@RequestMapping("/cModifyForm")
	public ModelAndView modifyForm(
			@RequestParam("coupon_no")int coupon_no){
		return new ModelAndView("cModifyForm", "dto",cs.getOne(coupon_no));
	}
	
	@RequestMapping("/cModifyOk")
	public String modifyOk(
			@ModelAttribute("dto")CouponDTO dto){
		cs.modifyOne(dto);
		return "redirect:/cList";
	}
	
	@RequestMapping("/cDelete")
	public String delete(
			@RequestParam("coupon_no")int coupon_no){
		cs.deleteOne(coupon_no);
		return "redirect:/cList";
	}
	
}
