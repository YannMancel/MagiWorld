package personages;

/**
 * @author YannMancel
 */
public class Mage extends Personage {

	/**
	 * Mage constructor with an argument of String type
	 * @param name a String object that contains the personage name
	 */
	public Mage(String name) {
		super(name);
	}
	
	//---------------------------------------------------------------------------------------------

	@Override
	public void throwBasicAttack(Personage personage) {
		// Contains the damage value
		int damages = this.getIntelligence();
		
		// Displays a terminal message
		System.out.println(this.getName() + " utilise Boule de Feu et inflige " + damages + " dommages.");
		
		// The enemy receives the damages
		personage.takeAttack(damages);	
	}
	
	@Override
	public void throwSpecialAttack(Personage personage) {
		// Contains the vitality gains
		int gains = 2 * this.getIntelligence();
		
		// Displays a terminal message
		System.out.println(this.getName() + " utilise Soin et gagne " + gains + " en vitalité.");

		// Add the gain to the vitality
		// TO DO => this.getVitality();
	}

	@Override
	public void description() {
		// Displays the specific characteristic
		System.out.print("Abracadabra je suis le Mage ");	
		
		// From Personage SuperClass
		super.description();
	}
}
