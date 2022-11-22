package com.it.backend.component;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter{
	
	private static final Log LOG=LogFactory.getLog(ExampleComponent.class);
	//Primero
	@Override
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) 
	throws Exception{
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
		
	}
	//Segundo
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) 
			throws Exception{
		long startTime=(long) request.getAttribute("startTime");
		LOG.info("--REQUEST URL: '"+request.getRequestURL().toString()+"'--Total Time:'"+(System.currentTimeMillis()- startTime)+"'ms");
		
		
	}

}
