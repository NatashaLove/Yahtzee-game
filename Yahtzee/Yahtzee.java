package Yahtzee;
import Dice.*;
import java.util.*;

public class Yahtzee {
	private Dice d1; // = new Dice();
	private Dice d2; // = new Dice();
	
	
	// public int getDice1 () {
		// return d1;
	// }
	// public int getDice2 () {
		// return d2;
	// }
	
	public Yahtzee() {
		d1 = new Dice();
		d2 = new Dice();
	}
		
	public String toss() {
		int dice1 = d1.roll();
		int dice2 = d2.roll();
		
		if (dice1==6 && dice2==6){
			return "YAHTZEE!\n";
		} else {
		String one = String.valueOf(dice1);
		String two = String.valueOf(dice2);
		return one + " " + two;
		}
		
	}	
		
	// d1.roll();
	// d2.roll();
	
	// System.out.println("\nThe dice values are " + d1.roll() +" and " + d2.roll());
	// if (d1.roll()==6 && d2.roll()==6){
		// System.out.println("\nYAHTZEE!!!");
	// }
	//}
	
}