import java.util.ArrayList;

/**
 * Class MenuTester
 * @author Yexiu Gao(yeg10)
 * @created: 11/19/2022
 */

public class MenuTester{
	public static ArrayList<Menu> menus;
	public static void main(String[] args){
		FileManager.readItems("data/dishes");
	//	FileManager.writeMenu("data/dishfiles", menus);
		MenuManager randomize = new MenuManager("data/dishes");
		Menu myMenu = randomize.randomMenu("menutester");
		myMenu.description();
		myMenu.totalCalories();
		myMenu.totalPrice();
	}
}