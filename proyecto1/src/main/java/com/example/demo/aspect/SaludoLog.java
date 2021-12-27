package com.example.demo.aspect;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.AspectPoint;
import com.example.demo.service.Impl.AspectService;


@Aspect
@Configuration
public class SaludoLog {
	
	//@Autowired
	//public AspectService aspectService;
	
	
	long start;
	
	final String data="within(com.example.demo..*)";
	
	//final String data = aspectService.listAllAspectPoint().get(0).getPackageLog();
	
	
	
	
    @Before(data)
    public void before(JoinPoint joinPoint) {
    	LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("---------Starting Interceptor --------------------" );
    	start = System.currentTimeMillis();
    	String log = "the intercepted method is: " + joinPoint.getSignature().getName() + ", of the class: " + joinPoint.getSignature().getDeclaringTypeName() + ", with the following arguments " + " >>>";
    	for (Object arg : joinPoint.getArgs()) {
    		log += " ARG: " + arg +",";    		
    	}
    	LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
    }
    
    
    @AfterReturning(value = data, returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String log ="<<< Return << " + joinPoint.getSignature().getName() + ": " + result;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
        long time = System.currentTimeMillis() - start;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("execution time: {} ms", time);

    }

    @AfterThrowing(value = data, throwing = "exception")
    public void after(JoinPoint joinPoint, Exception exception) {
        String log ="<<< Return Exception << " + joinPoint.getSignature().getName() + ": " + exception.getClass().getSimpleName();
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
        long time = System.currentTimeMillis() - start;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("execution time: {} ms", time);
    	
    }

}