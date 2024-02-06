package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;
	
	public Example(String subject) {
		// TODO Auto-generated constructor stub
		this.subject=subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("STarting example...........");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Destroyin example..........");
	}
	
	
}
