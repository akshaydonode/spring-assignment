package com.capgemini.Calculator.aspects;

import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*; 

@Component
@Aspect
public class ValidationAspect{


	/*@AfterThrowing (pointcut="execution(* com.capgemini.calculator.service.impl.CalculatorImpl.divide(..))", throwing = "ex")
    	public void logThrowAdd(JoinPoint joinpoint, Throwable ex) throws Throwable  
	{
		System.out.println("exception"+ex);
	}*/

	@AfterThrowing (pointcut="execution(* com.capgemini.calculator.service.impl.CalculatorImpl.divide(..))", throwing = "ex")
    	public void logThrowDivide(JoinPoint pjp, Throwable ex) throws Throwable  
	{
		
		System.out.println("exception"+ex);
		
	}

}