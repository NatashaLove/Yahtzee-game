package Dice;
import java.util.*;


public class Dice {
	
	private Random random;
	private int number;
	
	public Dice () {
		random = new Random();// creates memory for it
		
	}// default constructor
	
	
	public int roll (){
		//Random random = new Random();
	number = random.nextInt(6)-1;
		return number;
	}

}