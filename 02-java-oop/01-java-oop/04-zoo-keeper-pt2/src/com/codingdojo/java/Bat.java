package com.codingdojo.java;

public class Bat extends Mammal {
	
	public Bat() {
	this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("I'm Flying!");
		displayEnergy();
	}
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Nom Nom Nom!");
		displayEnergy();
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("FIREEEE");
		displayEnergy();
	}
}