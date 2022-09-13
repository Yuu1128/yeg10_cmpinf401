import javax.swing.JOptionPane;

public class Lab2_problem2 {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter a radius:");
		double r = Double.parseDouble(userInput); 
		
		double perimeter = 2 * Math.PI * r;
		perimeter = perimeter * 100;
	    int a = (int) Math.round(perimeter);
	    perimeter = a / 100.0;
		
		double area = Math.PI * Math.pow(r,2);
		area = area * 100;
	    int b = (int) Math.round(area);
	    area = b / 100.0;
	    
		JOptionPane.showMessageDialog(null, "The circle with radius "+ r + 
					      " has an area of " + area + 
					      " and a perimeter of " + perimeter + ".");

	}

}
