package com.capgemini.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
import com.capgemini.spring.render.*;


public class TestUsingAnnotationWithConstructor{
	public static void main(String args[]){
	ApplicationContext context = new  ClassPathXmlApplicationContext("context_Constructor.xml");
	MessageRendererUsingAnnotationWithConstructor renderer = context.getBean(MessageRendererUsingAnnotationWithConstructor.class);
	renderer.render();
	}
}