/**
 * Class Entree
 * @author Yexiu Gao(yeg10)
 * created 10/07/2022
 */

public class Entree {
	//create private variables
	private String name;
	private String description;
	private int calories;

	//create Entree constructor
	public Entree(String name, String desc, int cal) {
		this.name = name;
		description = desc;
		calories = cal;
	}

	//Add getters and setters for all properties
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

}

