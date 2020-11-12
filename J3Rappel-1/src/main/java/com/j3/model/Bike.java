package com.j3.model;

import javax.persistence.Entity;

@Entity
public class Bike extends PassagerVehicle {
int saddleheight;

public int getSaddleheight() {
	return saddleheight;
}

public void setSaddleheight(int saddleheight) {
	this.saddleheight = saddleheight;
}



}
