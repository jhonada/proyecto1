package com.example.demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
	 
	 @Autowired
	 TestInterceptor interceptor;
	 @Override
	 public void addInterceptors(InterceptorRegistry registry) {
	  // this interceptor will be applied to all URLs
	  registry.addInterceptor(interceptor);
	 } 
}
