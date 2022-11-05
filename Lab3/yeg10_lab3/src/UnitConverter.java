import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String userInput= JOptionPane.showInputDialog("Please enter a distance or a weight amount:");
	
		String classifynum = classifynumber(userInput);
		double result_number = Double.parseDouble(classifynum); 
		String classifyuni = classifyunit(userInput);

		String result_unit = null;
		
		String cm_to_inches = "cm";
		String result_cm_to_inches = "in";
		String yards_to_meter = "yd";
		String result_yards_to_meter = "m";
		String ounces_to_gram = "oz";
		String result_ounces_to_gram = "gm";
		String pounds_to_kilograms = "lb";
		String result_pounds_to_kilograms = "kg";
		double result1 = result_number / 2.54;
		double result2 = result_number * 2.54;
		double result3 = result_number * 0.9144;
		double result4 = result_number /0.9144;
		double result5 = result_number * 28.34952;
		double result6 = result_number / 28.34952;
		double result7  = result_number * 0.45359;
		double result8 = result_number / 0.45359;
		
		if (classifyuni.equalsIgnoreCase(cm_to_inches)){
			result_unit = result_cm_to_inches;
			result_number = result1;
		}
		else if (classifyuni.equalsIgnoreCase(result_cm_to_inches)){
			result_unit = cm_to_inches;
			result_number = result2;
		}
		else if (classifyuni.equalsIgnoreCase(yards_to_meter)){
			result_unit = result_yards_to_meter;
			result_number = result3;
		}
		else if (classifyuni.equalsIgnoreCase(result_yards_to_meter)){
			result_unit = yards_to_meter;
			result_number = result4;
		}
		else if (classifyuni.equalsIgnoreCase(ounces_to_gram)) {
			result_unit = result_ounces_to_gram;
			result_number = result5;
		}
		else if (classifyuni.equalsIgnoreCase(result_ounces_to_gram)){
			result_unit = ounces_to_gram;
			result_number = result6;
	}	
		else if (classifyuni.equalsIgnoreCase(pounds_to_kilograms)){
			result_unit = result_pounds_to_kilograms;
			result_number = result7;
	}	
		else if (classifyuni.equalsIgnoreCase(result_pounds_to_kilograms)){
			result_unit = pounds_to_kilograms;
			result_number = result8;
	}	
		
	System.out.println(userInput + " = " + result_number + " " + result_unit);
	}
		
	
	
	public static String classifynumber(String userInput) {
		String classifynum = "";
		for(int i = 0 ; i < userInput.length() ; i++) {
			char number = userInput.charAt(i);
			double asciiLetter = (double) number;

			if(asciiLetter >= (int) '0' && asciiLetter <= (int) '9' || asciiLetter == '.') {
				classifynum = classifynum + number;
				}
		}
		return classifynum;
	}
	

	public static String classifyunit(String userInput) {
		String classifyuni = "";
		
		for(int i = 0 ; i < userInput.length(); i++) {
			char unit = userInput.charAt(i);
			double asciiLetter = (double) unit;

			if(asciiLetter >= (int) 'a' && asciiLetter <= (int) 'z') {
				classifyuni = classifyuni + unit;
			}
		}				
		return classifyuni;
	}
	
		



		}

	
	



