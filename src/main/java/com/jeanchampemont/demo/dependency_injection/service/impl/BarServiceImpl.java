package com.jeanchampemont.demo.dependency_injection.service.impl;

import javax.inject.Inject;

import com.jeanchampemont.demo.dependency_injection.repository.FooBarRepository;
import com.jeanchampemont.demo.dependency_injection.service.BarService;

public class BarServiceImpl implements BarService {
	
	@Inject
	public BarServiceImpl(FooBarRepository repo) {
		this.repo = repo;
	}
	
	private FooBarRepository repo;

	public String getBar() {
		return repo.findBar();
	}

}
