package com.capgemini.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;

@Component
@Aspect
public class ValidateAspects{
	@After("execution(* com.capgemini.spring.calculatorimpl.CalculatorImpl.add(..))")
	public void addValidate(){
		System.out.println("Add Successfully");
	}
	
	@After("execution(* com.capgemini.spring.calculatorimpl.CalculatorImpl.divide(..))")
	public void divideValidate(){
		System.out.println("Divide Successfully");
	}
}