package com.zookeeper1;

public class Mammal {

	public int energyLevel = 100;
	
	
//	Methods
	public int displayEnergy() {
		System.out.printf("This animal's energy is currently %s.", energyLevel);
		return getEnergyLevel();
	}


	
//	Getters
	public int getEnergyLevel() {
		return energyLevel;
	}


	
	
	
//	Setters
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel += energyLevel;
	}
}  
