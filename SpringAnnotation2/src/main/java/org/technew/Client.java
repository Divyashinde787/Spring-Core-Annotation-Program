package org.technew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person p =  context.getBean("person",Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
	}
}
