package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//context.register(Config.class);
		//context.refresh();
		Car c = (Car)context.getBean("c");
		c.show();
		
	}
}
