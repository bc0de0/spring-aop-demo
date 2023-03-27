package com.javabytes.springaopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before(value = "execution(* com.javabytes.springaopdemo.ShoppingCart.checkOut())")
	public void beforeLogger() {
		System.out.println("logging some stuff");
	}
	@After(value = "execution(* *.*.*.*.checkOut(..))")
	public void afterLogger() {
		System.out.println("logging some stuff in the end");
	}

}
