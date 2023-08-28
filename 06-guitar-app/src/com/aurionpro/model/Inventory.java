package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class Inventory {
private List<Guitar> guitars;

public Inventory() {
	this.guitars = new  ArrayList();
}


public void addGuitar(String serialNumber,double price , Builder builder , String model , Type type ,
		Wood backWood , Wood topWood) {
	Guitar guitar = new Guitar(serialNumber ,price ,  new GuitarSpec(builder , model , type , backWood , topWood));
	guitars.add(guitar);
}

public Guitar getGuitar(String serialNumber) {
	for(Iterator i = guitars.iterator();i.hasNext();) {
		
		Guitar guitar = (Guitar) i.next();
		if(guitar.getSerialNumber().equals(serialNumber)) {
			return guitar;
		}
	}
	return null;
}

public  void search(GuitarSpec searchGuitar) {
	Search s = new Search();
	System.out.println(s.searchGuitar(guitars, searchGuitar));
	
}
		
		
		
	
	
}


