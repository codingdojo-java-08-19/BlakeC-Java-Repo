package com.codingdojo.java;

public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("Blake");
		Human testHuman2 = new Human("Jesus");
		Human testHuman3 = new Human("Hector");
		Wizard testWizard1 = new Wizard("Bill");
		Wizard testWizard2 = new Wizard("Joe");
		Wizard testWizard3 = new Wizard("Todd");
		Ninja testNinja1 = new Ninja("Raymond");
		Ninja testNinja2 = new Ninja("DAphne");
		Ninja testNinja3 = new Ninja("Eloise");
		Samurai testSamurai1 = new Samurai("Jon");
		Samurai testSamurai2 = new Samurai("Jill");
		Samurai testSamurai3 = new Samurai("Jack");		
		
		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();		
	}
}