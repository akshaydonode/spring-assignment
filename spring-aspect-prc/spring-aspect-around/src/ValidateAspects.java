package com.capgemini.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

@Component
@Aspect
public class ValidateAspects{
	@Around("execution(* com.capgemini.spring.calculatorimpl.CalculatorImpl.add(..))")
	public void addValidate(ProceedingJoinPoint pjp)throws Throwable{
		Object[] args = pjp.getArgs();
		Integer firstArg = Integer.parseInt(args[0].toString());
		Integer secondArg = Integer.parseInt(args[1].toString());	
		if(firstArg >0 && secondArg > 0){
			pjp.proceed();
			System.out.println("Added Successfully");
		}else{
			System.out.println("Number should be greater than zero");
		}
	}
	
	@Around("execution(* com.capgemini.spring.calculatorimpl.CalculatorImpl.divide(..))")
	public void divideValidate(ProceedingJoinPoint pjp)throws Throwable{
		Object[] args = pjp.getArgs();
		Double firstArg = Double.parseDouble(args[0].toString());
		Double secondArg = Double.parseDouble(args[1].toString());	
		if(secondArg > 0){
			pjp.proceed();
			System.out.println("Divide Successfully");
		}else{
			System.out.println("Number should be greater than zero");
		}
	}
}