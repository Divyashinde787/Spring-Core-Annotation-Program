package org.techub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean(name="r")
	public Ridder getRidder()
	{
		return new Ridder();
	}
	@Bean(name="bike")
	public Bike getBike(){
		return new Bike();
	}
	@Bean("name=car")
	public Car getCar() {
		return new Car();
	}
	
}
