import java.util.Random;

import javax.swing.JOptionPane;

public class RollDice {

	public static void Roll(int times, Random rand) {
		int dice_2 = 0;
		int dice_3 = 0;
		int dice_4 = 0;

		for (int i = 1; i <= times; i++) {
			int d1 = rand.nextInt(6) + 1;
			int d2 = rand.nextInt(6) + 1;
			int sum = d1 + d2; 


			if(sum == 2){
				dice_2 ++; 
			}
			if(sum == 3){
				dice_3 ++; 
			}
			if(sum == 4){
				dice_4 ++; 
			} 
		}	
		
		double result_2 = (double)dice_2 / times;
		double result_3 = (double)dice_3 / times;
		double result_4 = (double)dice_4 / times;

		System.out.println(result_2);
		System.out.println(result_3);
		System.out.println(result_4);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		String userInput;
		do {

			String userInputnumber = JOptionPane.showInputDialog("Please enter a number for the dice game");
			int getTimes = Integer.parseInt(userInputnumber);
			RollDice.Roll(getTimes, rand);

			userInput = JOptionPane.showInputDialog("Please enter continue to replay or exit to end.");

			while(!userInput.equals("continue") && !userInput.equals("exit")) {

				userInput = JOptionPane.showInputDialog("Please enter a correct word.");

			}

		}while(userInput.equals("continue"));

	}
}