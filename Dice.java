//Java program to get random number on dice between 1 to 6

package demo;

import java.util.*;

public class Dice {
	
	public static void main(String[] args) {
		
		 Random rand = new Random();

	      
	        int roll = rand.nextInt(6) + 1;

	      
	        System.out.println("The player 1 rolled a " + roll);
	    }
	}
	
	
	 
	       
	
	 


