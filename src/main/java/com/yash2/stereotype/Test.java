package com.yash2.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/yash2/stereotype/stereoconfig.xml");
		Student s1=con.getBean("s1",Student.class);
		Student s2=con.getBean("s1",Student.class);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s1.getAddress());
	}

}
//singleton  only single object will be created every tym hascode will be the same they didnt make the new object;
//proptotype: whenevr we call it it make new object for those bin hascode will be different;