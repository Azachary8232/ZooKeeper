package com.zookeeper1;

public class Bat extends Mammal{

	
	
	public Bat() {
		energyLevel = 300;	
		}
	
//	Methods
	public void fly() {
		System.out.println("The Sound a bat taking off!");
		setEnergyLevel(-50);
	}
	public void eatHumans() {
		System.out.println("the so- well, nevermind.");
		setEnergyLevel(25);
	
	}
	public void attackTown() {
		System.out.println("the sound of a town on fire");
		setEnergyLevel(-100);
	}
	
	
	
}
