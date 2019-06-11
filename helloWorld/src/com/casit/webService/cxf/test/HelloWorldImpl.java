package com.casit.webService.cxf.test;

import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorld {

	public String hello(String name) {
		System.out.println(name);
		return "hello "+name;
	}

}
