package com.capgemini.spring.test;

import org.springframework.context.*;
import org.springframework.context.support.*;
import com.capgemini.spring.calculatorimpl.*;
import com.capgemini.spring.calculator.*;

public class Test{

		public static void main(String a[]){
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator calculator = (Calculator)context.getBean("calculatorimpl");
		calculator.add(10,10) ;
		calculator.divide(25.0,5.0);
	}

}