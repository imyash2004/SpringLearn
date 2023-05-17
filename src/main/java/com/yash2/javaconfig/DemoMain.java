package com.yash2.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new AnnotationConfigApplicationContext(javaConfig.class);
		Student s1=con.getBean("getStudent",Student.class);
		System.out.println(s1);
		s1.study();
	}

}
