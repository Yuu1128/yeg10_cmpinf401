import javax.swing.JOptionPane;

public class Lab2_problem1 {

	public static void main(String[] args) {
		String userInput1 = JOptionPane.showInputDialog("Please enter a number:");
		String userInput2 = JOptionPane.showInputDialog("Please enter a number again:");
		
	    int userInput1Int = Integer.parseInt(userInput1);
	    int userInput2Int = Integer.parseInt(userInput2);

	    double side_square1 = Math.pow(userInput1Int,2);
	    double side_square2 = Math.pow(userInput2Int, 2);
	    double hypotenuse = Math.sqrt(side_square1 + side_square2); 
	    
	    hypotenuse = hypotenuse * 100;
	    int r = (int) Math.round(hypotenuse);
	    hypotenuse = r / 100.0;
	    
	    JOptionPane.showMessageDialog(null, "The hypotenuse is "+ hypotenuse +".");
	    
	}
}
