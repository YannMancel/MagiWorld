package personages;

/**
 * @author YannMancel
 */
public class Personage {
	
	/**
	 * Personage constructor with an argument of String type
	 * @param name a String object that contains the personage name
	 */
	public Personage (String name) {
		this.name = name;
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
	public void throwBasicAttack(Personage personage) {}
	
	/**
	 * Throws a special attack on an enemy
	 * @param personage a Personage object that contains the enemy
	 */
	public void throwSpecialAttack(Personage personage) {}
	
	/**
	 * Takes a attack by an enemy
	 * @param damages a integer that contains the damage values
	 */
	public void takeAttack(int damages) {
		// Displays a terminal message		
		System.out.println(this.name + " perd " + damages + " points de vie.");
		
		// Vitality lost
		this.vitality -= damages;
	}
	

	// ====== OTHER ======
	
	/**
	 * Performs a description of the personage
	 */
	public void description() {
		System.out.println(this.name         + " niveau "       + this.level + " je possède " +
	                       this.vitality     + " de vitalité, " + 
	                       this.strength     + " de force, "    +
	                       this.agility      + " d'agilité et " + 
	                       this.intelligence + " d'intelligence!");
	}
	
	//---------------------------------------------------------------------------------------------
	
	private String name;
	private int level;
	private int vitality;
	private int strength;
	private int agility;
	private int intelligence;
}
