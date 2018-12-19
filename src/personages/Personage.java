package personages;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author YannMancel
 */
public class Personage {
	
	/**
	 * Personage constructor with an argument of String type
	 * @param name a String object that contains the personage name
	 */
	public Personage (String name) {
		// For receive the values with the keyboard
		this.scan = new Scanner(System.in);
		
		// Name:
		this.name = name;		
		// Level:
		this.level = askToUser("Niveau", 1, 100);		
		// Vitality:
		this.vitality = 5 * this.level;
		this.initialVitality = this.vitality;		
		// Strength:
		this.strength = askToUser("Force", 0, 100);		
		// Agility:
		this.agility = askToUser("Agilit�", 0, 100);		
		// Intelligence:
		this.intelligence = askToUser("Intelligence", 0, 100);	
		
		// Displays the description
		this.description();
	}
	
	//---------------------------------------------------------------------------------------------

	
	// ====== GETTER ======
	
	/**
	 * Returns the name
	 * @return a String object that contains the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the level
	 * @return an integer that contains the level
	 */
	public int getLevel() {
		return this.level;
	}
	
	/**
	 * Returns the vitality
	 * @return an integer that contains the vitality
	 */
	public int getVitality() {
		return this.vitality;
	}
	
	/**
	 * Returns the initial vitality
	 * @return an integer that contains the initial vitality
	 */
	public int getInitialVitality() {
		return this.initialVitality;
	}
	
	/**
	 * Returns the strength
	 * @return an integer that contains the strength
	 */
	public int getStrength() {
		return this.strength;
	}
	
	/**
	 * Returns the agility
	 * @return an integer that contains the agility
	 */
	public int getAgility() {
		return this.agility;
	}
	
	/**
	 * Returns the intelligence
	 * @return an integer that contains the intelligence
	 */
	public int getIntelligence() {
		return this.intelligence;
	}	
	
	
	// ====== SETTER ======
	
	/**
	 * Modifies the level and the vitality
	 * @param level an integer that contains the new level
	 */
	/*
	public void setLevel(int level) {
		this.level = level;
		this.vitality = 5 * level;
	}
	*/
	
	
	// ====== ATTACK ======
	
	/**
	 * Throws a basic attack on an enemy
	 * @param personage a Personage object that contains the enemy
	 */
	public void throwBasicAttack(Personage personage) {
		// Displays a terminal message
		System.out.println(this.getName() + " est un simple personnage. Il n'attaque pas.");
	}
	
	/**
	 * Throws a special attack on an enemy
	 * @param personage a Personage object that contains the enemy
	 */
	public void throwSpecialAttack(Personage personage) {
		// Displays a terminal message
		System.out.println(this.getName() + " est un simple personnage. Il n'attaque pas.");
	}
	
	/**
	 * Takes a attack by an enemy
	 * @param damages a integer that contains the damage values
	 */
	public void takeAttack(int damages) {
		// Displays a terminal message		
		System.out.println(this.name + " perd " + damages + " points de vie.");
		
		// Allows to know if the vitality lost is possible
		int vitalityTest = this.vitality - damages;
		
		// Vitality lost
		if (vitalityTest >= 0)
			this.vitality -= damages;
		else
			this.vitality = 0; 
	}
	

	// ====== DESCRIPTION ======
	
	/**
	 * Performs a description of the personage
	 */
	public void description() {
		System.out.println(this.name         + " niveau "       + this.level + " je poss�de " +
	                       this.vitality     + " de vitalit�, " + 
	                       this.strength     + " de force, "    +
	                       this.agility      + " d'agilit� et " + 
	                       this.intelligence + " d'intelligence!");
	}
	
	
	// ====== ASK ======
	
	/**
	 * Ask to the user to enter an integer with the keyboard
	 * @param scope a String object that contains the scope
	 * @param minValue a integer that contains the minimal bound of validity
	 * @param maxValue a integer that contains the maximal bound of validity
	 * @return the returned value
	 */
	public int askToUser(String scope, int minValue, int maxValue) {
		// Displays a terminal message
		System.out.println(scope + " du personnage ?");
		
		// Gets back the choice
	    int choice = -1;
	    
	    // The choice must be in the range [minValue ; maxValue]
	    do {
	    	try {
	    		choice = this.scan.nextInt();
	    	}
	    	catch (InputMismatchException e) {
	    		this.scan.next();				
	    		System.out.print("Veuilliez saisir un entier, s'il vous pla�t!");
	    	}	    	
	    } while (choice < minValue || choice > maxValue);
	    
		return choice;
	}
	
	//---------------------------------------------------------------------------------------------
	
	private String name;
	private int level;
	private int vitality;
	private int strength;
	private int agility;
	private int intelligence;
	private final int initialVitality;
	
	private Scanner scan;
}
