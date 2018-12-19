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
		
		Personage perso2 = new Mage("Joueur 2");
		
		Personage perso3 = new Sniper("Joueur 3");
	}
}
