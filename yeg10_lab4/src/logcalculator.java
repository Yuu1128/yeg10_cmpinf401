import javax.swing.JOptionPane;

public class logcalculator {

	public static void main(String[] args) {

int log;
do {
	String userInput = JOptionPane.showInputDialog("Please enter a positive integer as log:");
	log = Integer.parseInt(userInput);
} 
	while ( !(log > 0) ); 
	System.out.println(log);

int base;
do {
	String userInput = JOptionPane.showInputDialog("Please enter a positive integer as base:");
	base = Integer.parseInt(userInput);
	} 
	while ( !(base > 1) ); 
	System.out.println(base);
	

int count = 0;
int i = 0;

		while(i <= log) {
		count++;
		i = (int) (Math.pow(base, count+1));	
		}
		System.out.println(count);
		}		
}
	