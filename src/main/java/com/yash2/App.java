package com.yash2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        student student1=(student) context.getBean("student1");
        System.out.println(student1);
        student student2=(student)context.getBean("student2");
        System.out.println(student2);
    }
}



