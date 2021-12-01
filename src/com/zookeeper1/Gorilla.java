package com.zookeeper1;

public class Gorilla extends Mammal{

	
	
	
//	Methods
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		setEnergyLevel(-5);
	}
	public void eatBananas() {
		System.out.println("This animal is full.");
		setEnergyLevel(10);
	}
	public void climb() {
		System.out.println("The gorilla has climbed a tree.");
		setEnergyLevel(-10);
	}

	
	
	
	
	
	
	
	
}
