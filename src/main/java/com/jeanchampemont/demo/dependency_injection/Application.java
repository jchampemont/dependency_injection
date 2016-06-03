package com.jeanchampemont.demo.dependency_injection;

import com.jeanchampemont.demo.dependency_injection.service.FooBarService;

public class Application {
	
	public static void main(String[] args) {
		FooBarService fooBarService = Factory.buildFooBarService();
		System.out.println(fooBarService.getFooBar());
	}
	
}
