//Java program for two player game and to show who won the game

package demo;

import java.util.*;

public class TwoPlayerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] positions = {0, 0}; 
	        int[] snake = {12, 46, 57, 78};
	        int[] ladder = {13, 47, 58, 79};
	        Random rand = new Random();
	        boolean gameOver = false;
	        int currentPlayer = 0;

	        while (!gameOver) {
	            int roll = rand.nextInt(6) + 1;
	            System.out.println("Player " + (currentPlayer + 1) + " rolls the dice and gets: " + roll);

	            int option = rand.nextInt(3);

	            switch (option) {
	                case 0:
	                    // No play
	                    System.out.println("Player " + (currentPlayer + 1) + " chooses nothing.");
	                    break;
	                case 1:
	                    // To check Ladder
	                    for (int i = 0; i < 4; i++) {
	                        if (positions[currentPlayer] == ladder[i]) {
	                            System.out.println("Player " + (currentPlayer + 1) + " climbes on a ladder and goes to " + (positions[currentPlayer] + 10));
	                            positions[currentPlayer] += 10;
	                            break;
	                        }
	                    }
	                    break;
	                case 2:
	                    // To check Snake
	                    for (int i = 0; i < 4; i++) {
	                        if (positions[currentPlayer] == snake[i]) {
	                            System.out.println("Player " + (currentPlayer + 1) + " gets caught by snake and goes to " + (positions[currentPlayer] - 10));
	                            positions[currentPlayer] -= 10;
	                            break;
	                        }
	                    }
	                    break;
	            }

	            positions[currentPlayer] += roll;

	            if (positions[currentPlayer] > 100) {
	                positions[currentPlayer] = 100 - (positions[currentPlayer] - 100);
	            }

	            // If the player's position moves below zero, then restart from zero
	            if (positions[currentPlayer] < 0) {
	                positions[currentPlayer] = 0;
	            }

	            System.out.println("Player " + (currentPlayer + 1) + "'s current position is: " + positions[currentPlayer]);

	            // check if the player won the game
	            if (positions[currentPlayer] == 100) {
	                System.out.println("Player " + (currentPlayer + 1) + " wins the game!");
	                gameOver = true;
	                break;
	            }

	            // check if the player climbed on a ladder and got to play again
	            for (int i = 0; i < 4; i++) {
	                if (positions[currentPlayer] == ladder[i]) {
	                    System.out.println("Player " + (currentPlayer + 1) + " climbed on a ladder and got to play again.");
	                    break;
	                }
	            }

	            // switch to the next player
	            if (!gameOver) {
	                currentPlayer = (currentPlayer + 1) % 2;
	            }
	        }
	    }
	
	}


