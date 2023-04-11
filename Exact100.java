//Java program to ensure the player gets to exact winning position 100

package demo;

import java.util.*;

public class Exact100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        
	        int position = 0;
	        int moves = 0;

	    
	        int[] snake = { 12, 46, 57, 78 };
	        int[] ladder = { 13, 47, 58, 79 };

	        Random rand = new Random();

	        while (position < 100) {
	            
	            int roll = rand.nextInt(6) + 1;

	            int option = rand.nextInt(3);

	            switch (option) {
	                case 0:
	                    // No play
	                    break;
	                case 1:
	                    // To check Ladder
	                    for (int i = 0; i < 4; i++) {
	                        if (position == ladder[i]) {
	                            position += 10;
	                            break;
	                        }
	                    }
	                    break;
	                case 2:
	                    // To check Snake
	                    for (int i = 0; i < 4; i++) {
	                        if (position == snake[i]) {
	                            position -= 10;
	                            break;
	                        }
	                    }
	                    break;
	            }

	         
	            position += roll;

	           //For exact 100 position
	            if (position > 100) {
	                position = 100 - (position - 100);
	            }

	         
	            moves++;
	        }

	        System.out.println("Player 1 won the game with these moves "+moves);
	    }
	
	}



