package com.yash2.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash2/collection/cconfig.xml");
		emp Emp1=(emp) context.getBean("EMP1");
		System.out.println(Emp1.getName());
		System.out.println(Emp1.getPhones());
		System.out.println(Emp1.getAddresses());
		System.out.println(Emp1.getCourses());
		System.out.println(Emp1.getProps());
		System.out.println(Emp1.getPhones().getClass().getName());
		
		
	}

}
