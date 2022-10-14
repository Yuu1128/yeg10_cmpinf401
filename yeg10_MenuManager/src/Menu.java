/**
 * Class Menu
 * @author Yexiu Gao(yeg10)
 * created 10/07/2022
 */

public class Menu {
	//create private variables
	private String name;
	private Entree entree;
	private Side side;
	private Salad salad;
	private Dessert dessert;	
	/*	
	 * private Arraylist;
	private ArrayList <Entree> entre;
	private ArrayList <Side> sid;
	private ArrayList <Salad> sala;
	private ArrayList <Dessert> desser;
	 */

	//create 3 (4?) Menu constructors
	public Menu(String name) {
		this.name = name;
		entree = null; 
		side = null; 
		salad = null; 
		dessert = null;	
	}
	/*	
	 *	Arraylist;
	 	this.entre = new ArrayList<Entree>(); 
		this.sid = new ArrayList<Side>(); 
		this.sala = new ArrayList<Salad>(); 
		this.desser = new ArrayList<Dessert>(); 
	 */

	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		salad = null; 
		dessert = null;
	}
	/*	
	 * 	Arraylist;
	  	this.entre = new ArrayList<Entree>();
		this.sid = new ArrayList<Side>(); 
		this.sala = new ArrayList<Salad>(); 
		this.desser = new ArrayList<Dessert>(); 
	 */

	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		side = null;
		dessert = null;
	}
	/*		
	 *  Arraylist;
		this.entre = new ArrayList<Entree>(); 
		this.sid = new ArrayList<Side>(); 
		this.sala = new ArrayList<Salad>(); 
		this.desser = new ArrayList<Dessert>(); 
	 */


	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}	
	/*	
	 *  Arraylist;
	  	this.entre = new ArrayList<Entree>(); 
		this.sid = new ArrayList<Side>(); 
		this.sala = new ArrayList<Salad>(); 
		this.desser = new ArrayList<Dessert>(); 
	 */


	//create 3 methods
	//print out the name of the menu
	public void menuname() {
		System.out.println("The name of the menu is: " + this.name + "\n");

	}

	//print out the sums of the calories on the menu
	public void totalCalories() {
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
		
		System.out.println("The total calories of " + this.name + " is: "+ SumCalories + " calories\n");
	}

	/*	
	 * Arraylist;
		for(Entree e:entre) {
			SumCalories += e.getCalories();
		}for(Side i:sid) {
				SumCalories += i.getCalories();

		}for(Salad s:sala) {
					SumCalories += s.getCalories();

		}for(Dessert d:desser) {
							SumCalories += d.getCalories();
		}
	 */

	
	//print out the description of the menu
	public void description() {

		System.out.println("The description of the menu:");

		if(entree == null || entree.getDescription() == null){
			System.out.println("Entree: nothing here!");
			
		}else {
			System.out.println(entree.getName() + ": " + entree.getDescription());
		}

		if(side == null || side.getDescription() == null){
			System.out.println("Side: nothing here!");

		}else {
			System.out.println(side.getName() + ": " + side.getDescription());
		}

		if(salad == null || salad.getDescription() == null){
			System.out.println("Salad: nothing here!");

		}else {
			System.out.println(salad.getName() + ": " + salad.getDescription());
		}

		if(dessert == null || dessert.getDescription() == null){
			System.out.println("Dessert: nothing here!\n");

		}else {
			System.out.println(dessert.getName() + ": " + dessert.getDescription() + "\n");
		}
	}

	//Add getters and setters for all properties
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
}