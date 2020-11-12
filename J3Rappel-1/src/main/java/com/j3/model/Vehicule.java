package com.j3.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //jointure de sous table
@DiscriminatorColumn(name = "Type")
public class Vehicule {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long idVehicle;
String manifacturer;
public long getIdVehicle() {
	return idVehicle;
}
public void setIdVehicle(long idVehicle) {
	this.idVehicle = idVehicle;
}
public String getManifacturer() {
	return manifacturer;
}
public void setManifacturer(String manifacturer) {
	this.manifacturer = manifacturer;
}




}
