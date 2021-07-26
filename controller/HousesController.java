package controller;

import models.HouseProperties;

public class HousesController {
	
	HouseProperties h1 = new HouseProperties();
	
	public void setHouseProperties(String address, Double price, Float size, String houseName) {
		
		h1.setAddress(address);
		h1.setHouseName(houseName);
		h1.setSize(size);
		h1.setPrice(price);
				
	}

}
