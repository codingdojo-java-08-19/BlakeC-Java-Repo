package com.codingdojo.java;

public class HumanTest {

	public static void main(String[] args) {
			Human ninja = new Human("Blake");
			Human samurai = new Human("Hector");
			Human wizard = new Human("Jesus");
			
			wizard.attack(ninja);
			samurai.attack(ninja);
			ninja.attack(samurai);
	}
}