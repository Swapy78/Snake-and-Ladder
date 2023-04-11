//Java program to check number of total dice rolls to win game and position after every roll

package demo;

import java.util.Random;

public class NumberOfDiceRolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int position = 0;
	        int moves = 0;

	    
	        int[] snake = { 12, 46, 57, 78 };
	        int[] ladder = { 13, 47, 58, 79 };

	        Random rand = new Random();

	        while (position < 100) {
	            
	            int roll = rand.nextInt(6) + 1;
	            System.out.println("Player 1 rolls dice and gets "+roll);
	            moves++;

	            int option = rand.nextInt(3);

	            switch (option) {
	                case 0:
	                    // No play
	                	System.out.println("Player 1 chooses nothing");
	                    break;
	                case 1:
	                    // To check Ladder
	                    for (int i = 0; i < 4; i++) {
	                        if (position == ladder[i]) {
	                            position += 10;
	                            System.out.println("Player 1 climbes on ladder and goes to "+position);
	                            break;
	                        }
	                    }
	                    break;
	                case 2:
	                    // To check Snake
	                    for (int i = 0; i < 4; i++) {
	                        if (position == snake[i]) {
	                            position -= 10;
	                            System.out.println("Player 1 gets eaten by snake and goes to "+position);
	                            break;
	                        }
	                    }
	                    break;
	            }

	         
	            position += roll;

	           
	            if (position > 100) {
	                position = 100 - (position - 100);
	            }
	            
	            // If the player's position moves below zero, then restart from zero
	            if (position < 0) {
	                position = 0;
	            }

	         
	            System.out.println("Player 1 is currently at "+position);
	        }

	        System.out.println("Player 1 won the game with these moves "+moves);
	    }
	
	


	}


