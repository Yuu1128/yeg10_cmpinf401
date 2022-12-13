import java.util.ArrayList;

/**
 * Class Menu
 * @author Yexiu Gao(yeg10)
 * @created 11/19/2022
 */

public class Menu {
	private String name;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;

	
	public Menu(String name) {
		this.name = name;
		entree = null; 
		side = null; 
		salad = null; 
		dessert = null;	
	}

	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		salad = null; 
		dessert = null;
	}

	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		side = null;
		dessert = null;
	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}	

	/**
	 * Method menuname
	 * @return the name of the menu
	 */
	public String menuname() {
		System.out.println("The name of the menu is: " + this.name + "\n");
		return this.name;

	}

	/**
	 * Method totalCalories
	 * @return the sum of the calories
	 */
	public int totalCalories() {
		int SumCalories = 0;

		if(entree != null){
			SumCalories += entree.getCalories();
		}else {
			SumCalories += 0;
		}

		if(side != null){
			SumCalories += side.getCalories();
		}else {
			SumCalories += 0;
		}

		if(salad != null) {
			SumCalories += salad.getCalories();
		}else {
			SumCalories += 0;
		}

		if(dessert != null){
			SumCalories += dessert.getCalories();
		}else {
			SumCalories += 0;
		}

		System.out.println("\nThe total calories of " + this.name + " is: "+ SumCalories + " calories.");
		return SumCalories;

	}

	/**
	 * Method totalCalories
	 * @return the sum of the calories
	 */
	public double totalPrice() {
		double SumPrice = 0;

		if(entree != null){
			SumPrice += entree.getPrice();
		}else {
			SumPrice += 0;
		}

		if(side != null){
			SumPrice += side.getPrice();
		}else {
			SumPrice += 0;
		}

		if(salad != null) {
			SumPrice += salad.getPrice();
		}else {
			SumPrice += 0;
		}

		if(dessert != null){
			SumPrice += dessert.getPrice();
		}else {
			SumPrice += 0;
		}

		System.out.println("\nThe total price of " + this.name + " is: $"+ String.format("%.2f", SumPrice) + ".");
		return SumPrice;

	}
	/**
	 * Method description
	 * @return the description of the menu
	 */
	public String description() {
		String description = "";
		System.out.println("The description of the menu:");

		if(entree == null || entree.getDescription() == null){
			System.out.println("Entree: nothing here!");

		}else {
			System.out.println("Entree: "+ entree.getName() + ". " + entree.getDescription() + ".");
		}

		if(side == null || side.getDescription() == null){
			System.out.println("Side: nothing here!");

		}else {
			System.out.println("Side: "+ side.getName() + ". " + side.getDescription() + ".");
		}

		if(salad == null || salad.getDescription() == null){
			System.out.println("Salad: nothing here!");

		}else {
			System.out.println("Salad: "+ salad.getName() + ". " + salad.getDescription() + ".");
		}

		if(dessert == null || dessert.getDescription() == null){
			System.out.println("Dessert: nothing here!\n");

		}else {
			System.out.println("Dessert: "+ dessert.getName() + ". " + dessert.getDescription() + ".");
		}
		return description;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		return name;
	}

}