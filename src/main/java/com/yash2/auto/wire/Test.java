package com.yash2.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash2/auto/wire/autoconfig.xml");
		emp emp1=context.getBean("emp1",emp.class);
		System.out.println(emp1 );

	}

}
