package com.j3.model;

import javax.persistence.Entity;

@Entity
public class Car extends PassagerVehicle {
int noofDoors;

public int getNoofDoors() {
	return noofDoors;
}

public void setNoofDoors(int noofDoors) {
	this.noofDoors = noofDoors;
}


}
