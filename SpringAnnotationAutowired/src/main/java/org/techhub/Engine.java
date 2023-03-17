package org.techhub;

import org.springframework.beans.factory.annotation.Value;

public class Engine {

	@Value("FLAT")
	private String name;
	@Value("CH1234@")
	private String chesis;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChesis() {
		return chesis;
	}
	public void setChesis(String chesis) {
		this.chesis = chesis;
	}
	
}
