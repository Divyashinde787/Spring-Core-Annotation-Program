package org.techhub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name="e")
	public Engine getEngine()
	{
		return new Engine();
	}

	@Bean(name="c")
	public Car getCar() 
	{
		return new Car();
	}
}
