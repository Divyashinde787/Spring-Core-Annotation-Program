package org.techhub;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	@Value("1")
	 private int id;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Value("5600")
	private int sal;
	@Value("Ramayana")
	 private String name;
	
	public void show()
	{
		System.out.println(id+"\t"+name+"\t"+sal);
	}

}
