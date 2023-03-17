package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name="esp")
	public Employee getEmployee()
	{
		return new Employee();
	}
}
