package com.capgemini.spring.test;

import com.capgemini.spring.org.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{

	public static void main(String a[]){
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Organization organization = context.getBean(Organization.class);
		System.out.println("welcome");
		System.out.println(organization);
	}

}