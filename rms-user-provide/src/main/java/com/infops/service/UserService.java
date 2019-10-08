package com.infops.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infops.model.User;

@RestController
public class UserService {
	
	private Logger logger=LoggerFactory.getLogger(UserService.class);
	/*
	 * @RequestMapping(value="/login",method=RequestMethod.GET) public String
	 * login() throws Exception{ return "用户已验证"; }
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST) 
	public String login(@RequestParam("count") int count) throws Exception{
		logger.info("这是### provide ---8081 as" + count);
		return "用户已验证"; 
	}
	
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public boolean login(@RequestParam("name") String name,@RequestParam("pwd") String pwd) throws Exception{
//		return "admin".equals(name) && "12345".equals(pwd);
//	}
	
	/*
	 * @RequestMapping(value="/login",method=RequestMethod.POST) public boolean
	 * login(@RequestBody User user) throws Exception{ return
	 * "admin".equals(user.getUserName()) && "12345".equals(user.getPassWord()); }
	 */
	
//	@RequestMapping(value="/login",method=RequestMethod.POST)
//	public String login(@RequestBody User user) throws Exception{
//		if("admin".equals(user.getUserName()) && "12345".equals(user.getPassWord())) {
//			return "验证通过";
//		}
//		return "验证没通过";
//	}
}
