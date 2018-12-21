package game;

import java.util.Scanner;

import personages.*;

import tools.Tools;

/**
 * @author YannMancel
 */
public class MagiWorld {

	/**
	 * MagiWorld constructor with none of argument
	 */
	public MagiWorld() {
		// For receive the values with the keyboard
		this.scan = new Scanner(System.in);
		
		// Initialization of 2 personages
		this.players = new Personage[2];
		
		// Choices the Personage type
		for (int i=0 ; i<this.players.length ; i++)
			this.players[i] = choiceOfPersonage("Joueur " + (i+1));
	}
	
	/**
	 * Performs the choice of Personage type
	 * @param name a String object that contains the Personage name
	 * @return a Personage object that contains the chosen Personage
	 */
	private Personage choiceOfPersonage(String name) {
		// Displays the terminal messages
		System.out.println("Création du personnage du " + name);
		System.out.println("Veuillez choisir la classe de votre peronnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
		
		// Gets back the choice. It must be in the range [1 ; 3]
		int choice = Tools.askToUser(this.scan, 1, 3);
		
		Personage personage = null;
		
		switch (choice) {
			case 1: 
				personage = new Warrior(name);
				break;
			case 2: 
				personage = new Sniper(name);
				break;
			case 3: 
				personage = new Mage(name);
				break;
		}
		
		return personage;
	}
	
	/**
	 * Starts the MagiWorld Game
	 */
	public void run() {
		// Useful variable
		int choice = -1;
		
		// Infinite loop with a condition to exit		
		while (true) {
			for (int i=0 ; i<this.players.length ; i++) {
				// Displays the terminal messages
				System.out.println(this.players[i].getName() + " (" + this.players[i].getVitality() + ") " + 
		                           "veuillez choisir une action (1 : Attaque Basique, 2 : Attaque Spéciale)");
				
				// Gets back the choice. It must be in the range [1 ; 2]
				choice = Tools.askToUser(this.scan, 1, 2);
				
				if (choice == 1)
					this.players[i].throwBasicAttack(this.players[i==0 ? 1 : 0]);
				else 
					this.players[i].throwSpecialAttack(this.players[i==0 ? 1 : 0]);
				
				// Displays a terminal message that says the name of the looser
				if (this.players[i==0 ? 1 : 0].getVitality() == 0) {
					System.out.println(this.players[i==0 ? 1 : 0].getName() + " a perdu !");
					return;
				}
			}
		}
	}
	
	//---------------------------------------------------------------------------------------------
		
	private Scanner scan;
	private Personage[] players;
}
