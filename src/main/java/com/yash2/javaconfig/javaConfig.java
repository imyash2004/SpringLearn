package com.yash2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.yash2.javaconfig")
public class javaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean 
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}

}
