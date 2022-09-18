package com.masai2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class A {

	@Value("${100}")
	int roll;
	
	@Value("Bivek")
	String name;
	
	@Value("60")
	int marks;
	
	
	@Autowired
	private B b1;
	
	@SuppressWarnings("unused")
	@Autowired
	private List<String> cities;
	
	public void funA() {
		System.out.println("inside funA of A");
		System.out.println(b1);
	}
	
	
}
