package com.aunnie.web.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aunnie.web.dto.MemberDTO;
import com.aunnie.web.service.MemberService;

//return : view x , data 
@RestController
public class RestMemberController {

	@Resource(name="memberService")
	private MemberService service;
	@RequestMapping("/server01")
	public List<MemberDTO> search(@RequestParam int no){
		System.out.println(no);
		
		return service.getAll();
	}
}
