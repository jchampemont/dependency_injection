package com.jeanchampemont.demo.dependency_injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jeanchampemont.demo.dependency_injection.service.FooBarService;

public class Application {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		FooBarService fooBarService = context.getBean(FooBarService.class);
		
		System.out.println(fooBarService.getFooBar());
		
		context.close();
	}
	
}
