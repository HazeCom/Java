package com.masai2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.masai2")
@PropertySource("")
public class AppConfig {
	
	@SuppressWarnings("unused")
	@Autowired
	private Environment environment;
	
	@Bean("cities")
	public List<String> getCities(){
		List<String> cities = new ArrayList<>();
		cities.add("delhi");
		cities.add("chennai");
		cities.add("mumbai");
		return cities;
	}
	
	@Bean("b1")
	public B getB() {
		return new B();
	}
}
