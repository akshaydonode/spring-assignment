package com.capgemini.calculator.service.impl;

import com.capgemini.calculator.service.Calculator;
import org.springframework.stereotype.*; 

@Component("calculatorImpl")
public class CalculatorImpl implements Calculator{

	public Integer add(Integer num1, Integer num2){
		System.out.println(num1+num2);
		return (num1+num2);
	}

	public void divide(int num1,int num2){
	
			System.out.println(num1/num2);
		
	}
}