package com.jeanchampemont.demo.dependency_injection.service.impl;

import org.springframework.stereotype.Service;

import com.jeanchampemont.demo.dependency_injection.service.StringJoinerService;

@Service
public class StringJoinerServiceImpl implements StringJoinerService {

	public String join(String a, String b) {
		return a + b;
	}

}
