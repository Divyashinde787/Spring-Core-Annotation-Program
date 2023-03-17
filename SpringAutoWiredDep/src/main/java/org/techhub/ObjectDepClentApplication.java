package org.techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ObjectDepClentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r= new ClassPathResource("student.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		
		Object obj = bf.getBean("c");
		College c= (College)obj;
		
		c.show();		

	}

}
