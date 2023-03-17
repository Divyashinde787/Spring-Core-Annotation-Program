package org.technew;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name="person")
	 public Person getPerson(){
        Person p = new Person();
        p.setName("kb");
        p.setAge(26);
        return p;
    }
}
