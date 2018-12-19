package main;

import personages.*;

/**
 * @author YannMancel
 */
public class Main {

	/**
	 * 
	 * @param args a String array object that contains the command line arguments
	 */
	public static void main(String[] args) {
		
		Personage perso1 = new Warrior("Joueur 1");
		perso1.description();
		
		Personage perso2 = new Mage("Joueur 2");
		perso2.description();
		
		Personage perso3 = new Sniper("Joueur 3");
		perso3.description();
	}
}
