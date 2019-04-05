package com.capgemini.spring.provider;

import com.capgemini.spring.*;
import org.springframework.stereotype.Component;

@Component
public class HWMessageProvider implements MessageProvider{

	public String getMessage(){
		return "Hello World...";
	}

}