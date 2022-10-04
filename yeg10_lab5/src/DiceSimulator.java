import java.util.Random;

import javax.swing.JOptionPane;

import java.util.Random;

public class DiceSimulator{
	public static void RollDice(int times, Random rand) {
		
		int dice_2 = 0;
		int dice_3 = 0;
		int dice_4 = 0;
		int dice_5 = 0;
		int dice_6 = 0;
		int dice_7 = 0;
		int dice_8 = 0;
		int dice_9 = 0;
		int dice_10 = 0;
		int dice_11 = 0;
		int dice_12 = 0;
		
		for (int i = 0; i < times; i++) {
			int d1 = rand.nextInt(6) + 1;
			int d2 = rand.nextInt(6) + 1;
			int twoDiceSum = d1 + d2;
	
			if(twoDiceSum == 2){
				dice_2 ++; 
			}
			if(twoDiceSum == 3){
				dice_3 ++; 
			}
			if(twoDiceSum == 4){
				dice_4 ++; 
			}
			if(twoDiceSum == 5){
				dice_5 ++; 
			}
			if(twoDiceSum == 6){
				dice_6 ++; 
			}
			if(twoDiceSum == 7){
				dice_7 ++; 
			}
			if(twoDiceSum == 8){
				dice_8 ++; 
			}
			if(twoDiceSum == 9){
				dice_9 ++; 
			}
			
			if(twoDiceSum == 10){
				dice_10 ++; 
			}
			if(twoDiceSum == 11){
				dice_11 ++; 
			}
			if(twoDiceSum == 12){
				dice_12 ++; 
			}
		}
		double result_2 = (double) dice_2 / times;
		double result_3 = (double) dice_3 / times;
		double result_4 = (double) dice_4 / times;
		double result_5 = (double) dice_5 / times;
		double result_6 = (double) dice_6 / times;
		double result_7 = (double) dice_7 / times;
		double result_8 = (double) dice_8 / times;
		double result_9 = (double) dice_9 / times;
		double result_10 = (double) dice_10 / times;
		double result_11 = (double) dice_11 / times;
		double result_12 = (double) dice_12 / times;

		System.out.println("2 prob:" + result_2);
		System.out.println("3 prob:" + result_3);
		System.out.println("4 prob:" + result_4);
		System.out.println("5 prob:" + result_5);
		System.out.println("6 prob:" + result_6);
		System.out.println("7 prob:" + result_7);
		System.out.println("8 prob:" + result_8);
		System.out.println("9 prob:" + result_9);
		System.out.println("10 prob:" + result_10);
		System.out.println("11 prob:" + result_11);
		System.out.println("12 prob:" + result_12);

	}
	public static void main(String[] args) {
		Random rand = new Random();	

		String userInput2;
		do {
			String userInput1 = JOptionPane.showInputDialog("Please enter times for rolling dice");	
		    int getTimes = Integer.parseInt(userInput1);
		
		    DiceSimulator.RollDice(getTimes, rand);
		
			userInput2 = JOptionPane.showInputDialog("Please enter continue to play again, or enter exit to end.");	
			
			while (userInput2 == null || !userInput2.equals("continue") && !userInput2.equals("exit")) {	
				System.out.println("Please enter a correct word.");
				userInput2 = JOptionPane.showInputDialog("Please enter a correct word: \"continue\" or \"exit\"");
			}
		} while (userInput2.equals("continue"));
	}

}
