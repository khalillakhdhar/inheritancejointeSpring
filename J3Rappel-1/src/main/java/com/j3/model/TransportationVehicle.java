package com.j3.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class TransportationVehicle extends Vehicule {
	int loadcapacity;

	public int getLoadcapacity() {
		return loadcapacity;
	}

	public void setLoadcapacity(int loadcapacity) {
		this.loadcapacity = loadcapacity;
	}
	
	

}
