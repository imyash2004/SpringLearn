package com.yash2.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/yash2/spel/spel.xml");
		// TODO Auto-generated method stub
		Demo d1=con.getBean("demo",Demo.class);
		System.out.println(d1);

	}

}




//how to invoke static method and variable;
//T(class).method(parameter)
//T(class).variable
