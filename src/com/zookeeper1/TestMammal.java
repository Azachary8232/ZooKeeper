package com.zookeeper1;

public class TestMammal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mammal mammal1 = new Mammal();
		mammal1.displayEnergy();
		
		Gorilla gorilla1 = new Gorilla();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.displayEnergy();
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		gorilla1.displayEnergy();
		gorilla1.climb();
		gorilla1.displayEnergy();
	}

}