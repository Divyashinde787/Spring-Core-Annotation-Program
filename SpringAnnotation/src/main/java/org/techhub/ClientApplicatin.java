package org.techhub;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplicatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		//context.register(Config.class);
		//context.refresh();
	Employee emp=(Employee)context.getBean("esp");
	
	emp.show();
	}
}
