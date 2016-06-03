package com.jeanchampemont.demo.dependency_injection;

import com.jeanchampemont.demo.dependency_injection.repository.FooBarRepository;
import com.jeanchampemont.demo.dependency_injection.repository.impl.FooBarRepositoryImpl;
import com.jeanchampemont.demo.dependency_injection.service.BarService;
import com.jeanchampemont.demo.dependency_injection.service.FooBarService;
import com.jeanchampemont.demo.dependency_injection.service.FooService;
import com.jeanchampemont.demo.dependency_injection.service.StringJoinerService;
import com.jeanchampemont.demo.dependency_injection.service.impl.BarServiceImpl;
import com.jeanchampemont.demo.dependency_injection.service.impl.FooBarServiceImpl;
import com.jeanchampemont.demo.dependency_injection.service.impl.FooServiceImpl;
import com.jeanchampemont.demo.dependency_injection.service.impl.StringJoinerServiceImpl;

/**
 * 
 * This is a really bad example of a static Factory building all application classes.
 *
 */
public class Factory {
	private static FooBarRepository fooBarRepository = null;
	
	private static FooService fooService = null;
	
	private static BarService barService = null;
	
	private static StringJoinerService stringJoinerService = null;
	
	private static FooBarService fooBarService = null;
	
	public static FooBarRepository buildFooBarRepository() {
		if(fooBarRepository == null) {
			fooBarRepository = new FooBarRepositoryImpl();
		}
		return fooBarRepository;
	}
	
	public static FooService buildFooService() {
		if(fooService == null) {
			fooService = new FooServiceImpl(buildFooBarRepository());
		}
		return fooService;
	}
	
	public static BarService buildBarService() {
		if(barService == null) {
			barService = new BarServiceImpl(buildFooBarRepository());
		}
		return barService;
	}
	
	public static StringJoinerService buildStringJoinerService() {
		if(stringJoinerService == null) {
			stringJoinerService = new StringJoinerServiceImpl();
		}
		return stringJoinerService;
	}
	
	public static FooBarService buildFooBarService() {
		if(fooBarService == null) {
			fooBarService = new FooBarServiceImpl(buildFooService(), buildBarService(), buildStringJoinerService());
		}
		return fooBarService;
	}
}
