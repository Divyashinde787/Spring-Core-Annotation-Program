package org.techub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ridder {

	@Autowired
	@Qualifier("bike") 
	Vehicle vehicle;
	public void setVehicle(Vehicle vehicle)
	{
		this.vehicle=vehicle;
	}
	public void show()
	{
		vehicle.special();
	}
}

