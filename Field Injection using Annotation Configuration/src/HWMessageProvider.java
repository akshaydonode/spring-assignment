package com.capgemini.spring.provider;


import org.springframework.stereotype.Component;
import com.capgemini.spring.*;


//@Component
public class HWMessageProvider implements MessageProvider{

	public String getMessage(){
		return "Hello World...";
	}

}