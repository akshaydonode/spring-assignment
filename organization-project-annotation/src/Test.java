package com.capgemini.spring.test;

import com.capgemini.spring.org.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class Test{

	public static void main(String a[]){
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Organization organization = context.getBean(Organization.class);
		System.out.println("welcome");
		System.out.println(organization);
	}

}