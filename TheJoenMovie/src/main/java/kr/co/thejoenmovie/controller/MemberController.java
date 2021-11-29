package kr.co.thejoenmovie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import kr.co.thejoenmovie.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	@GetMapping("/member/login")
	public String login(){
		return "/member/login";
	}
	@GetMapping("/member/terms")
	public String terms(){
		return "/member/terms";
	}
	@GetMapping("/member/register")
	public String register(){
		return "/member/register";
	}
	
}
