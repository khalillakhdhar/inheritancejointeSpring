package com.j3.model;

import javax.persistence.Entity;

@Entity
public class Truck extends TransportationVehicle {
int noofcontainers;

public int getNoofcontainers() {
	return noofcontainers;
}

public void setNoofcontainers(int noofcontainers) {
	this.noofcontainers = noofcontainers;
}




}
