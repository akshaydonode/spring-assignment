package com.capgemini.Calculator.aspects;

import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*; 

@Component
@Aspect
public class ValidationAspect{


	@AfterReturning(pointcut="execution(* com.capgemini.calculator.service.impl.CalculatorImpl.add(..))", returning="retVal")
    	public void addValidation(Object retVal) 
	{
		System.out.println(Integer.parseInt(retVal.toString()));
	}

}