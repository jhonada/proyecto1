package com.example.demo.aspect;


import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
public class UsuarioLog {
	
	/*
	long start;

    @Before("execution(* com.example.demo.service.Impl.UsuarioServiceImpl.*(..))")
    public void before(JoinPoint joinPoint) {
    	LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("---------Starting Interceptor UsuarioLog--------------------");
    	start = System.currentTimeMillis();
    	String log = joinPoint.getSignature().getName() + " >>>";
    	for (Object arg : joinPoint.getArgs()) {
    		log += "\n ARG: " + arg;    		
    	}
    	LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
    }
    
    
    @AfterReturning(value = "execution(* com.example.demo.service.Impl.UsuarioServiceImpl.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String log ="<<< Return << " + joinPoint.getSignature().getName() + ": " + result;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
        long time = System.currentTimeMillis() - start;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("execution time: {} ms", time);

    }

    @AfterThrowing(value = "execution(* com.example.demo.service.Impl.UsuarioServiceImpl.*(..))", throwing = "exception")
    public void after(JoinPoint joinPoint, Exception exception) {
        String log ="<<< Return Exception << " + joinPoint.getSignature().getName() + ": " + exception.getClass().getSimpleName();
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
        long time = System.currentTimeMillis() - start;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("execution time: {} ms", time);
    	
    }*/

}

/*
import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class SaludoLog {
	
	long start;

    @Before("execution(* com.example.demo.service.Impl.SaludoService.*.*(..))")
    public void before(JoinPoint joinPoint) {
    	LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("---------Starting Interceptor--------------------");
    	start = System.currentTimeMillis();
    	String log = joinPoint.getSignature().getName() + " >>>";
    	for (Object arg : joinPoint.getArgs()) {
    		log += "\n ARG: " + arg;    		
    	}
    	LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
    }
    
    
    @AfterReturning(value = "execution(* com.example.demo.service.Impl.SaludoService.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String log ="<<< Return << " + joinPoint.getSignature().getName() + ": " + result;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
        long time = System.currentTimeMillis() - start;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("execution time: {} ms", time);

    }

    @AfterThrowing(value = "execution(* com.example.demo.service.Impl.SaludoService.*.*(..))", throwing = "exception")
    public void after(JoinPoint joinPoint, Exception exception) {
        String log ="<<< Return Exception << " + joinPoint.getSignature().getName() + ": " + exception.getClass().getSimpleName();
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info(log);
        long time = System.currentTimeMillis() - start;
        LogManager.getLogger(joinPoint.getSignature().getDeclaringTypeName()).info("execution time: {} ms", time);
    	
    }

}*/