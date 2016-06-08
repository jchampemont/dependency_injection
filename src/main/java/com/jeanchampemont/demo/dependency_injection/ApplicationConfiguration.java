package com.jeanchampemont.demo.dependency_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jeanchampemont.demo.dependency_injection.repository.FooBarRepository;
import com.jeanchampemont.demo.dependency_injection.repository.impl.FooBarRepositoryImpl;

/**
 * There is several ways to define beans with Spring. Here we are using two different ways:
 * 
 * - Using the @ComponentScan annotation, all classes in the specified package and sub packages will be
 * scanned for @Component annotations (and similar annotations such as @Service, @Repository, etc...)
 * The matching classes will be instantiated and considered as being Spring beans.
 * 
 * - Using methods in Configuration classes annotated with @Bean. Here we are manually defining 
 * a FooBarRepository bean, using the newly created instance of the FooBarRepositoryImpl class.
 *
 */
@Configuration
@ComponentScan("com.jeanchampemont.demo.dependency_injection.service")
public class ApplicationConfiguration {
	
	@Bean
	public FooBarRepository fooBarRepository() {
		return new FooBarRepositoryImpl();
	}
}
