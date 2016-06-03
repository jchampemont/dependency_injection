package com.jeanchampemont.demo.dependency_injection.service.impl;

import com.jeanchampemont.demo.dependency_injection.service.BarService;
import com.jeanchampemont.demo.dependency_injection.service.FooBarService;
import com.jeanchampemont.demo.dependency_injection.service.FooService;
import com.jeanchampemont.demo.dependency_injection.service.StringJoinerService;

public class FooBarServiceImpl implements FooBarService {
	
	public FooBarServiceImpl(FooService foo, BarService bar, StringJoinerService joiner) {
		this.foo = foo;
		this.bar = bar;
		this.joiner = joiner;
	}
	
	private FooService foo;
	
	private BarService bar;
	
	private StringJoinerService joiner;

	public String getFooBar() {
		return joiner.join(foo.getFoo(), bar.getBar());
	}
}
