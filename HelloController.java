package com.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping("/hello");
public class HelloController {
@RequestMapping("/test1")
	public String display()
	{
		return "index";
	}	
@RequestMapping("/test2")
public String display1()
{
	return "index1";
}
}
