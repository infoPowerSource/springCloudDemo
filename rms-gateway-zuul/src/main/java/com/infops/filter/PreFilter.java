package com.infops.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// 希望发生作用返回true
		return true;
	}

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		RequestContext ctx=RequestContext.getCurrentContext();
		HttpServletRequest request=ctx.getRequest();
		
		String key =request.getParameter("key");
		System.out.println(key + " access filter 1");
		if("1".equals(key)) {
			ctx.setSendZuulResponse(false);
		}
		
	//	String token=request.getHeader("token");
		//ctx.set("thirdFilter",false);  定义一个开关，控制过滤器执行与否
//		if(StringUtils.isEmpty(token)) {
//			ctx.setSendZuulResponse(false);
//			ctx.setResponseStatusCode(401);
//			ctx.setResponseBody("{\"msg\":\"401,access without permission,pls login first.\"}");
//			return "access denied";
//		}
//		return "pass";
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		//return "pre";
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		// 数越小优先级越高
		return 0;
	}

}
