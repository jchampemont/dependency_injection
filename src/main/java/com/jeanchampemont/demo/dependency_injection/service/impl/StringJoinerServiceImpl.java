package com.jeanchampemont.demo.dependency_injection.service.impl;

import com.jeanchampemont.demo.dependency_injection.service.StringJoinerService;

public class StringJoinerServiceImpl implements StringJoinerService {

	public String join(String a, String b) {
		return a + b;
	}

}
