package com.infops.service.fallback;

import org.springframework.stereotype.Component;

import com.infops.model.User;
import com.infops.service.UserFeignClient;

@Component
public class UserFeignClientFallback implements UserFeignClient {

//	@Override
//	public String login(User user) {
//		return "出现异常了"+ user.getUserName();
//	}
//	@Override
//	public String login() {
//		return "出现异常了";
//	}

	@Override
	public String login(int count) {
		// TODO Auto-generated method stub
		return "出现异常了"+ count;
	}

}
