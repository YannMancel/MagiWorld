package tools;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {

	/**
	 * Ask to the user to enter an integer with the keyboard
	 * @param scan a Scanner object that receives the values from keyboard
	 * @param minValue a integer that contains the minimal bound of validity
	 * @param maxValue a integer that contains the maximal bound of validity
	 * @return the returned value
	 */
	public static int askToUser(Scanner scan, int minValue, int maxValue) {	
		// Gets back the choice
	    int choice = -1;
	    
	    // The choice must be in the range [minValue ; maxValue]
	    do {
	    	try {
	    		choice = scan.nextInt();
	    		
	    		if (choice < minValue || choice > maxValue) 
	    			System.out.println("L'intervalle de validité est [" + minValue + " ; " + maxValue + "].");
	    	}
	    	catch (InputMismatchException e) {
	    		scan.next();				
	    		System.out.println("Veuilliez saisir un entier, s'il vous plaît !");
	    	}	    	
	    } while (choice < minValue || choice > maxValue);
	    
		return choice;
	}
}
