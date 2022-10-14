/**
 * Class MenuTest
 * @author Yexiu Gao(yeg10)
 * created 10/07/2022
 */
class MenuTest {

	public static void main(String[] args) {

		//create 2 Entree objects
		Entree entree1 = new Entree("Entree", "Sirloin Steak. A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked.", 244);
		Entree entree2 = new Entree("Entree", "Butter Chicken. Marinated chicken that's first grilled and then served in a rich gravy made with tomato, butter, and a special spice blend as a base.", 248);

		//create 1 Side object
		Side side1 = new Side("Side", "Rice and Avocado. Premium quality indian rice mixed with avocado.", 240);

		//create 2 Salad objects
		Salad salad1 = new Salad("Salad", "Mango Salad. A fresh, fruity summertime salad loaded with nutrient-dense foods, topped with a light oil-free lime peanut dressing.", 633);
		Salad salad2 = new Salad(null, null, 0);

		//create 1 Dessert object
		Dessert dessert1 = new Dessert("Dessert", "Roasted Strawberry Crumble. A quick & easy dessert of juicy, syrupy strawberries topped with a buttery crumble.", 373);

		//create 2 menu objects
		Menu menutest1 = new Menu("Menu1",entree1, null, salad1, null);
		Menu menutest2 = new Menu("Menu2",entree2, side1, salad2, dessert1);

		//test the Menu class
		menutest1.menuname();
		menutest1.totalCalories();
		menutest1.description();

		menutest2.menuname();
		menutest2.totalCalories();
		menutest2.description();
	}
}

/* 
		ArrayList<Entree> entre = new ArrayList<Entree>();    	    
		entre.add(entree1);
	    entre.add(entree2);

	    int sum = 0;
	    for(Entree e:entre) {
	    	sum += e.getCalories();
	    }

		ArrayList<Side> sid=new ArrayList<Side>();
	    sid.add(side1);

	    for(Side i:sid) {
	    	sum += i.getCalories();
	    }

		ArrayList<Salad> sala=new ArrayList<Salad>();
		sala.add(salad1);
		sala.add(salad2);

	    for(Salad s:sala) {
	    	System.out.println(s.getCalories());
	    }

		ArrayList<Dessert> desser=new ArrayList<Dessert>();
		desser.add(dessert1)	    

    	for(Dessert d:desser) {
	    	System.out.println(d.getCalories());
	    }    

array:
		Entree[] entree;
		entree = new Entree[2];
		entree[0] = new Entree("Sirloin Steak", "A delicious piece", 244);
		entree[1] = new Entree("Butter Chicken", "Marinated chicken", 248);	

		Side[] side;
		side = new Side[1];
		side[0] = new Side("Rice and Avocado.", "Premium quality indian", 240);

		Salad[] salad;
		salad = new Salad[2];
		salad[0] = new Salad("Mango Salad.", "A fresh, fruity summertime", 633);
		salad[1] = new Salad(null, null, 0);

		Dessert[] dessert;
		dessert = new Dessert[1];
		dessert[0] = new Dessert("Roasted Strawberry Crumble.", "A quick & easy dessert of juicy", 373);
 */

