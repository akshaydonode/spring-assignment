package com.capgemini.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
import com.capgemini.spring.render.*;


public class TestUsingAnnotationWithSetter{
	public static void main(String args[]){
	ApplicationContext context = new  ClassPathXmlApplicationContext("context_setter.xml");
	MessageRenderer renderer = context.getBean(MessageRenderer.class);
	renderer.render();
	}
}