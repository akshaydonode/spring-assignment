package com.capgemini.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Before;

@Component
@Aspect
public class ValidateAspects{
	@Before("execution(* com.capgemini.spring.calculatorimpl.CalculatorImpl.add(..))")
	public void addValidate(){
		System.out.println("Add Successfully");
	}
	
	@Before("execution(* com.capgemini.spring.calculatorimpl.CalculatorImpl.divide(..))")
	public void divideValidate(){
		System.out.println("Divide Successfully");
	}
}