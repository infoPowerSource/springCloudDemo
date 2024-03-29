package com.infops.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ThirdFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		RequestContext ctx=RequestContext.getCurrentContext();
		return ctx.sendZuulResponse();
	}

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		RequestContext ctx=RequestContext.getCurrentContext();
		HttpServletRequest request=ctx.getRequest();
		String key =request.getParameter("key");
		System.out.println(key + " access filter 3");
		if("3".equals(key)) {
			ctx.setSendZuulResponse(false);
		}
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

}
