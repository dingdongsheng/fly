package com.cosmos.fly.web.config.interceptor;

import java.nio.charset.Charset;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StreamUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CheckAuthInterceptor extends HandlerInterceptorAdapter{
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		
		ServletInputStream inputStream = request.getInputStream();
		Charset charset = null;
		StreamUtils.copyToString(inputStream, charset);
		String str = charset.toString();
		System.out.println(str);
		return true;
	}

}
