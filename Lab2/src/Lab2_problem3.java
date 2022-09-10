import javax.swing.JOptionPane;

public class Lab2_problem3 {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter a number between 1 and 9999:");
	    int dollar = Integer.parseInt(userInput);
	    
	    int grands = dollar / 1000;
	    int Benjamins = (dollar % 1000) / 100;
	    int sawbucks = ((dollar % 1000) % 100) /10;
	    int bucks = (((dollar % 1000) % 100) % 10 )/ 1;
	    
	    JOptionPane.showMessageDialog(null, "You can buy:\n" + grands + " grands\n" + Benjamins + " Benjamins\n" + sawbucks + " sawbucks\n"+ bucks + " bucks");

	}

}
