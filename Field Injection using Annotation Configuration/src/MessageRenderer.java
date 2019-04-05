package com.capgemini.spring.render;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.Component;
import com.capgemini.spring.*;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class MessageRenderer{
	@Autowired
	private MessageProvider messageProvider;


	
	public void render(){
		System.out.println(messageProvider.getMessage());
	}
	
	
}