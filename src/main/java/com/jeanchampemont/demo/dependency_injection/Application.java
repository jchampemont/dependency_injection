package com.jeanchampemont.demo.dependency_injection;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jeanchampemont.demo.dependency_injection.service.FooBarService;

public class Application {
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ApplicationModule());
		FooBarService fooBarService = injector.getInstance(FooBarService.class);
		System.out.println(fooBarService.getFooBar());
	}
	
}
