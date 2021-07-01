package com.naven.testRun;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String brand;
//	private String material;
	
	/*
	 * public Tyre(String brand, String material) { super(); this.brand = brand;
	 * this.material = material; }
	 */

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		/* return "Tyre [brand=" + brand + ", material= " + material +"]"; */
		return "It's working :)";
	}
	
	
	
}
