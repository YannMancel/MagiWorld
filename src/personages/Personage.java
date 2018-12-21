package personages;

import java.util.Scanner;

import tools.Tools;

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
		
		boolean goodChoice = false;
		
		while (!goodChoice) {
			// Receives the characteristics of the personage
			creationOfCharacteristics();
			
			if ((this.strength + this.agility + this.intelligence) != this.level) {
				// Displays the terminal messages
				System.out.println("La somme Force + Agilité + Intelligence doit être égale au niveau du personnage !");				
				System.out.println("Recommencez la boucle de saisie");
			}
			else 
				goodChoice = true;
		}	
		
		// Name:
		this.name = name;		

		// Initial vitality:
		this.INITIAL_VITALITY = this.vitality;
		
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
		return this.INITIAL_VITALITY;
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
	

	// ====== DESCRIPTION ======
	
	/**
	 * Performs a description of the personage
	 */
	public void description() {
		System.out.println(this.name         + " niveau "       + this.level + " je possède " +
	                       this.vitality     + " de vitalité, " + 
	                       this.strength     + " de force, "    +
	                       this.agility      + " d'agilité et " + 
	                       this.intelligence + " d'intelligence !");
	}

	
	// ====== GAIN and LOSS ======
	
	/**
	 * Takes a attack by an enemy
	 * @param damages a integer that contains the damage values
	 */
	protected void takeAttack(int damages) {
		// Displays a terminal message		
		System.out.println(this.name + " perd " + damages + " points de vie.");
		
		// Allows to know if the vitality lost is possible
		int vitalityTest = this.vitality - damages;
		
		// Vitality lost
		if (vitalityTest >= 0)
			this.vitality -= damages;
		else
			this.vitality = 0;
		
		// Displays a terminal message
		if (this.vitality == 0)
			System.out.println(this.name + " est mort.");
	}
	
	/**
	 * Takes the received gains
	 * @param gainType a integer that contains one of these values (1: Level, 2: Vitality, 3: Strength, 4: Agility, 5: Intelligence)
	 * @param gains a integer that contains the gain value
	 */
	protected void takeGains(int gainType, int gains) {
		// gainType determines the gain choice
		switch (gainType) {
		case 1:
			this.level += gains;
			break;
		case 2:
			this.vitality += gains;
			break;
		case 3:
			this.strength += gains;
			break;
		case 4:
			this.agility += gains;
			break;
		case 5:
			this.intelligence += gains;
			break;
		}
	}
	
	// ====== ASK ======
	
	/**
	 * Ask to the user to enter an integer with the keyboard
	 * @param scope a String object that contains the scope
	 * @param minValue a integer that contains the minimal bound of validity
	 * @param maxValue a integer that contains the maximal bound of validity
	 * @return the returned value
	 */
	private int askToUser(String scope, int minValue, int maxValue) {
		// Displays a terminal message
		System.out.println(scope + " du personnage ?");
		
		// Gets back the choice
	    int choice = Tools.askToUser(this.scan, minValue, maxValue);

		return choice;
	}
	
	
	// ====== CHARACTERISTICS ======
	
	/**
	 * Allows to initialize the characteristics of the personage
	 */
	private void creationOfCharacteristics() {
		// Level:
		this.level = askToUser("Niveau", 1, 100);	
		
		// Vitality:
		this.vitality = 5 * this.level;	
		
		// Strength:
		this.strength = askToUser("Force", 0, 100);	
		
		// Agility:
		this.agility = askToUser("Agilité", 0, 100);
		
		// Intelligence:
		this.intelligence = askToUser("Intelligence", 0, 100);	
	}
	
	//---------------------------------------------------------------------------------------------
	
	private String name;
	private int level;
	private int vitality;
	private int strength;
	private int agility;
	private int intelligence;
	private final int INITIAL_VITALITY;
	
	private Scanner scan;
}
