//Java program for snake and ladder game for single player

package demo;

import java.util.*;

public class SinglePlayer {
	
	public static void main(String[] args) {
        
        int position = 0;
        int moves = 0;

       
        int[] snake = { 12, 46, 57, 78 };
        int[] ladder = { 13, 47, 58, 79 };

        Random rand = new Random();

        while (position < 100) {
            int roll = rand.nextInt(6) + 1;
            position += roll;

            for (int i = 0; i < 4; i++) {
                if (position == snake[i]) {
                    position -= 10;
                    break;
                } else if (position == ladder[i]) {
                    position += 10;
                    break;
                }
            }

            if (position > 100) {
                position = 100 - (position - 100);
            }
            moves++;
        }

        System.out.println("Player 1 won the game with these moves " + moves);
    }
}
         




    
    
