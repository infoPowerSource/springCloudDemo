package com.infops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infops.model.User;
import com.infops.service.UserFeignClient;

@RestController
public class LoginController {
	@Autowired
	private UserFeignClient userFeignClient;
	
	
//	 @RequestMapping("/userLogin") 
//	 public String login() { 
//		 return "收到结果"+userFeignClient.login(); 
//	}
	 
	
	/*
	 * @RequestMapping("/userLogin") public String login(@RequestParam("name")
	 * String name,@RequestParam("pwd") String pwd) {
	 * if(userFeignClient.login(name,pwd)) { return "Hello"+ name; }else return
	 * "fail"+ name; }
	 */
	
	/*
	 * @RequestMapping("/userLogin") public String login(@RequestParam("name")
	 * String name,@RequestParam("pwd") String pwd) { User user=new User();
	 * user.setUserName(name); user.setPassWord(pwd);
	 * if(userFeignClient.login(user)) { return "Hello"+ name; }else return "fail"+
	 * name; }
	 */
	
	/*
	 * @RequestMapping("/userLogin") public String login(@RequestParam("name")
	 * String name,@RequestParam("pwd") String pwd) { User user=new User();
	 * user.setUserName(name); user.setPassWord(pwd); return
	 * userFeignClient.login(user); }
	 */
	
	@RequestMapping("/userLogin")
	public String login() {
		for(int i=0;i<10;i++) {
			userFeignClient.login(i);
		}
		return "负载均衡demo";
	}
}
