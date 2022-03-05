package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadder {
	static Random random = new Random();
	static int getRandomValue(){
			int randomValue = random.nextInt(6);
			System.out.println("Player Roll the die");
			randomValue = randomValue + 1;
			System.out.println("dice : " +randomValue);
			return randomValue;
	}
	
	static int getRandomOption(int startPosition, int dice) {
			int randomOption = random.nextInt(3);
			randomOption = randomOption + 1;
			System.out.println("Choose option : " +randomOption);
			
			switch(randomOption) {
			case 0 :
				   System.out.println("no play");
				   break;
			case 1 :
				   startPosition =startPosition + dice;
				   System.out.println("Ladder the Player moves ahead :" + startPosition);
				   break;
			case 2 :
					if(startPosition >= 0)
						startPosition = startPosition - dice;
						System.out.println("Snake the player moves behind : " + startPosition);
						break;
			default :
			}
			System.out.println();
			return startPosition;
	}
	
		public static void main(String[] args) {
		
			int startPosition = 0;
			int dice =0;
			System.out.println("Welcome to Snake And Ladder Game \n");
			System.out.println("Singal Player at start position " +startPosition);
			while (startPosition <= 100)	{
				dice = getRandomValue();
				startPosition=getRandomOption(startPosition , dice);
			}
			if (startPosition > 100) {
				int temp = startPosition - 100;
				startPosition = startPosition - temp;
				System.out.println("win the game position : "+startPosition);
			}
			else
				System.out.println("Win the game postion : " +startPosition);

      }
      
	}


