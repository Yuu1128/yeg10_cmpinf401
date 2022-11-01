/**
 * yeg10
 * 2022/10/31
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class Arrays {

	public static double max(double [] Arrays) {
		double max = Arrays[0];

		for(int i = 0; i < Arrays.length; i++) {
			if(Arrays[i] > max) {
				max = Arrays[i];
			}
		}
		return max;
	}

	public static double min(double [] Arrays) {
		double min = Arrays[0];

		for(int i = 0; i < Arrays.length; i++) {
			if(Arrays[i] < min) {
				min = Arrays[i];
			}
		}
		return min;
	}

	public static double sum(double [] Arrays) {
		double sum = 0;

		for(int i = 0; i < Arrays.length; i++) {
			sum += Arrays[i];
		}
		return sum;
	}
	public static double ave(double [] Arrays) {
		double sum = 0;

		for(int i = 0; i < Arrays.length; i++) {
			sum += Arrays[i];
		}
		double ave = sum/Arrays.length;
		return ave;
	}

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter the number of items:");
		int userInputInteger = Integer.parseInt(userInput);
		double[] arr = new double [userInputInteger];

		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextDouble(); 
		}
		
		System.out.println("the maximum value is: "+ max(arr));
		System.out.println("the minimum value is: "+ min(arr));
		System.out.println("the sum is: "+ sum(arr));
		System.out.println("the average is: "+ ave(arr));


	}
}
