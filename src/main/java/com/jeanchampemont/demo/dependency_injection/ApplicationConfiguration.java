package com.jeanchampemont.demo.dependency_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jeanchampemont.demo.dependency_injection.repository.FooBarRepository;
import com.jeanchampemont.demo.dependency_injection.repository.impl.FooBarRepositoryImpl;

@Configuration
@ComponentScan("com.jeanchampemont.demo.dependency_injection.service")
public class ApplicationConfiguration {
	
	@Bean
	public FooBarRepository fooBarRepository() {
		return new FooBarRepositoryImpl();
	}
}
