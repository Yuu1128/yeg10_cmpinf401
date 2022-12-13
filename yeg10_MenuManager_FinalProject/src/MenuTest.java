/**
 * Class MenuTest
 * @author Yexiu Gao(yeg10)
 * @created 10/07/2022


class MenuTest {

	public static void main(String[] args) {
		Entree entree1 = new Entree("Entree", "Sirloin Steak. A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked.", 244);
		Entree entree2 = new Entree("Entree", "Butter Chicken. Marinated chicken that's first grilled and then served in a rich gravy made with tomato, butter, and a special spice blend as a base.", 248);

		Side side1 = new Side("Side", "Rice and Avocado. Premium quality indian rice mixed with avocado.", 240);

		Salad salad1 = new Salad("Salad", "Mango Salad. A fresh, fruity summertime salad loaded with nutrient-dense foods, topped with a light oil-free lime peanut dressing.", 633);
		Salad salad2 = new Salad(null, null, 0);

		Dessert dessert1 = new Dessert("Dessert", "Roasted Strawberry Crumble. A quick & easy dessert of juicy, syrupy strawberries topped with a buttery crumble.", 373);

		Menu menutest1 = new Menu("Menu1",entree1, null, salad1, null);
		Menu menutest2 = new Menu("Menu2",entree2, side1, salad2, dessert1);

		menutest1.menuname();
		menutest1.totalCalories();
		menutest1.description();

		menutest2.menuname();
		menutest2.totalCalories();
		menutest2.description();
	}
}
 */