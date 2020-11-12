package com.j3.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PassagerVehicle extends Vehicule {
int numberofpassagers;

public int getNumberofpassagers() {
	return numberofpassagers;
}

public void setNumberofpassagers(int numberofpassagers) {
	this.numberofpassagers = numberofpassagers;
}



}
