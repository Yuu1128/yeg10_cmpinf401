/**
 * Class Recursion
 * @author Yexiu Gao
 * @created 12/05/2022
 */
public class Recursion {

	public static void main(String[] args) {
		int result = sumOfDigits(234);
		System.out.println(result);

		int[] a1 = {2, 3, 4};
		printArrayElements(a1,2);
	}


	static int sumOfDigits(int x) {
		if(x < 0) {
			x = x * (-1);
		}
		if (x <= 0 && x <= 9) {
			return x;
		}	
		return sumOfDigits(x / 10) + x % 10;
	}


	static void printArrayElements(int a[], int index) {
		if (index < 0 || index > a.length) {
			System.out.print("\nYou should type in the length of the array, \nor all the elements have been printed!");
		}
		else {
			System.out.print(a[index] + " ");
			printArrayElements(a, index-1);
		}
	}

}