package org.techhub;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	@Autowired
	Engine e;
	public void setEngine(Engine e)
	{
	this.e=e;	
	}
	public void show() {
	System.out.println(e.getName()+"\t"+e.getChesis());
	}

}
