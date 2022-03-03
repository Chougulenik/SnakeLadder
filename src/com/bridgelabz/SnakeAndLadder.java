package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadder {
		
	
	static Random random = new Random();
	static int getRandomValue(){
			int randomValue = random.nextInt(6) +1;
			System.out.println("Player Roll the die");
			
			System.out.println("number : " +randomValue);
			return randomValue;
	}
	static int getRandomOption(int startPosition ,int dice) {
			int randomOption = random.nextInt(3);
			
			System.out.println("Choose option");
			System.out.println(randomOption);
			
			switch(randomOption)
			{
			case 0 :
				   System.out.println("no play");
				   break;
			case 1 :
				   startPosition =startPosition + dice;
				   System.out.println("Ladder the Player moves ahead :" + startPosition);
				   break;
			case 2 :
				   startPosition = startPosition - dice;
				   System.out.println("Snake the player moves behind : " + startPosition);
				   break;
			}
			return randomOption;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int startPosition = 0;
			int dice =0;
		System.out.println("Welcome to Snake And Ladder Game");
			
		dice = getRandomValue();
		getRandomOption(startPosition , dice);

	
      }
      
	}


