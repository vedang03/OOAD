package com.aurionpro.test;

import com.aurionpro.model.Builder;
import com.aurionpro.model.Guitar;
import com.aurionpro.model.GuitarSpec;
import com.aurionpro.model.Inventory;
import com.aurionpro.model.Type;
import com.aurionpro.model.Wood;

public class GuitarTest {
public static void main(String[] args) {
		GuitarSpec guitarToBeSearched = new GuitarSpec(Builder.FENDER, "Stratccaster", Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER);
	   Inventory i1 = new Inventory();
	   i1.addGuitar("01", 10000, Builder.FENDER, "Stratccaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	   
	 i1.search(guitarToBeSearched);
	 
}
}
