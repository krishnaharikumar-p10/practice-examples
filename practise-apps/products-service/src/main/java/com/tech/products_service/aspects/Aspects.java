package com.tech.products_service.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspects {
	
	@After("execution(* com.tech.products_service.service.ProductService.createProduct(..))")
	public void afteraddlog() {
	    System.out.println("The product is created");
	}

	@Before("execution(* com.tech.products_service.service.ProductService.*(..))")
	public void allmethods() {
	    System.out.println("Method called...");
	}

	@Around("execution(* com.tech.products_service.service.ProductService.createProduct(..))")
	public Object aroundaddProductlog(ProceedingJoinPoint joinpoint) throws Throwable {
	    System.out.println("Before Adding Product");
	    Object result = joinpoint.proceed();
	    System.out.println("After Adding Product");
	    return result;
	}
	
	@Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
	public void getController() {
		System.out.println("A GET method was called in controller");
	}
	
	@Before("@within(org.springframework.stereotype.Service)")
    public void logControllerMethods() {
		System.out.println("A method in a Service is about to run");
    }

	
	
	
	
	
	
	
	
}
