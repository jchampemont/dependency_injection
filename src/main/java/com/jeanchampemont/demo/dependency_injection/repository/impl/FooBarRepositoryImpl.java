package com.jeanchampemont.demo.dependency_injection.repository.impl;

import com.jeanchampemont.demo.dependency_injection.repository.FooBarRepository;

public class FooBarRepositoryImpl implements FooBarRepository {

	public String findFoo() {
		return "Foo";
	}

	public String findBar() {
		return "Bar";
	}

}
