package com.jeanchampemont.demo.dependency_injection;

import com.google.inject.AbstractModule;
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

public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(BarService.class).to(BarServiceImpl.class);
		bind(FooService.class).to(FooServiceImpl.class);
		bind(FooBarService.class).to(FooBarServiceImpl.class);
		bind(StringJoinerService.class).to(StringJoinerServiceImpl.class);
		
		bind(FooBarRepository.class).toInstance(new FooBarRepositoryImpl());
	}

}
