import java.util.*;
import Dice.*;
import Yahtzee.*;

public class  playYahtzee {
	
	public static void main (String [] args) {
	
	Yahtzee game = new Yahtzee();
	Scanner inputDevice=new Scanner(System.in);

	char next='a';
	
		
		
		//print menu
		System.out.println("\nLet's play YAHTZEE!");
		
		while(next != 'x') {
				//all menu is in a separate method - described below
				//next = printMenu();
			System.out.println();
			System.out.println("\nYou rolled a ");
			System.out.println("	" + game.toss());
			System.out.println("\nDo you want to toss the dice? (t)");
			System.out.println("\nDo you want to exit the game? (x)");
			System.out.println("\nWhat do you want to do: ");	
				
			next = inputDevice.next().charAt(0);
			inputDevice.nextLine(); // need it right after input taking a char or int - or will occupy the next input	
			// if(next == 't') {
			// Yahtzee game = new Yahtzee();
			}
		}
	//roll
	
	// quit
	}
	
	// static char printMenu (){
	
	// char next='a';
	// Scanner inputDevice=new Scanner(System.in);
		
	// System.out.println();
	// System.out.println("\nDo you want to toss the dice? (t)");
	// System.out.println("\nDo you want to exit the game? (x)");
	// System.out.println("\nWhat do you want to do: ");
			
	// next = inputDevice.next().charAt(0);
	// inputDevice.nextLine(); // need it right after input taking a char or int - or will occupy the next input
		
	// return next;
	// } 	
//}