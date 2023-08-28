package com.aurionpro.model;

import java.util.List;

public class Search {
	
public Guitar searchGuitar(List<Guitar>guitars , GuitarSpec searchGuitar) {
	for (Guitar guitar:guitars) {
		if(guitar.getGuitarSpec().getBuilder()==searchGuitar.getBuilder() && guitar.getGuitarSpec().getBackWood()==searchGuitar.getBackWood()
				&& guitar.getGuitarSpec().getTopWood()==searchGuitar.getTopWood() && guitar.getGuitarSpec().getType()==searchGuitar.getType()
				&& guitar.getGuitarSpec().getModel().equalsIgnoreCase(searchGuitar.getModel()))
			 {
		
			return guitar;
			
		}
}
	return null;
}
}

