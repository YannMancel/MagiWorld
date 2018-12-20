package personages;

/**
 * @author YannMancel
 */
public class Sniper extends Personage {

	/**
	 * Sniper constructor with an argument of String type
	 * @param name a String object that contains the personage name
	 */
	public Sniper(String name) {
		super(name);
	}
	
	//---------------------------------------------------------------------------------------------
	
	@Override
	public void throwBasicAttack(Personage personage) {
		// Contains the damage value
		int damages = this.getAgility();
		
		// Displays a terminal message
		System.out.println(this.getName() + " utilise Tir à l'Arc et inflige " + damages + " dommages.");
		
		// The enemy receives the damages
		personage.takeAttack(damages);
	}
	
	@Override
	public void throwSpecialAttack(Personage personage) {
		// Contains the agility gains
		int gains = this.getLevel() / 2;	
		
		// Displays a terminal message
		System.out.println(this.getName() + " utilise Concentration et gagne " + gains + " d'agilité.");
		
		// Add the gain to the agility
		// TO DO => this.getAgility();
	}
	
	@Override
	public void description() {
		// Displays the specific characteristic
		System.out.print("Chuttt je suis le Rôdeur ");
		
		// From Personage SuperClass
		super.description();
	}
}
