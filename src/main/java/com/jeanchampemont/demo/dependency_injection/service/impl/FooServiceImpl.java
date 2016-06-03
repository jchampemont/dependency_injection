package com.jeanchampemont.demo.dependency_injection.service.impl;

import javax.inject.Inject;

import com.jeanchampemont.demo.dependency_injection.repository.FooBarRepository;
import com.jeanchampemont.demo.dependency_injection.service.FooService;

public class FooServiceImpl implements FooService {
	
	@Inject
	public FooServiceImpl(FooBarRepository repo) {
		this.repo = repo;
	}
	
	private FooBarRepository repo;

	public String getFoo() {
		return repo.findFoo();
	}

}
