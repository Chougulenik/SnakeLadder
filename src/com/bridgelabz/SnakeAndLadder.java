package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadder {
		
	static Random random = new Random();
	static int getRandomValue(){
			int randomValue = random.nextInt(6) +1;
			return randomValue;
	}
	int startPosition = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Snake And Ladder Game");
	
		System.out.println("Player Roll the die");
		int playRandom = getRandomValue();
		System.out.println("number : " +playRandom);
	}

}
