package com.naven.testRun;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicles
{
	public void drive()
	{
		System.out.println("Look at me go on my Bike!");
		
	}
}
