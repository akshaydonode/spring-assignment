package com.capgemini.spring.calculatorimpl;

import org.springframework.stereotype.*;
import com.capgemini.spring.calculator.*;

@Component("calculatorimpl")
public class CalculatorImpl implements Calculator{

	public void add(Integer num1,Integer num2){
		System.out.println(num1+num2);
	}
	public void divide(Double num1,Double num2){
		System.out.println(num1/num2);
	}
}