package com.example.demo.config;


import java.time.Instant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class TestInterceptor implements HandlerInterceptor{
	 Logger logger = LoggerFactory.getLogger(TestInterceptor.class);
	 @Override
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	   throws Exception {
	  // TODO Auto-generated method stub
	  
		 long startTime = Instant.now().toEpochMilli();
		 logger.info("Request URL::" + request.getRequestURL().toString() +
		  ":: Start Time=" + Instant.now());
		 request.setAttribute("startTime", startTime);
		 
		 logger.info("Executing Before Handler method...");
		 return true;
	 }
	 @Override
	 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	   ModelAndView modelAndView) throws Exception {
	  logger.info("Executing After Handler method...");
	 }
	 @Override
	 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	   throws Exception {
	  // TODO Auto-generated method stub
	  logger.info("After completing request...");
	 
	 } 
}
