/**
 * Class MenuTester
 * @author Yexiu Gao(yeg10)
 * @created: 11/19/2022
 */

public class MenuTester{
	public static void main(String[] args){
		FileManager.readItems("data/dishes.txt");
		MenuManager randomize = new MenuManager("data/dishes.txt");
		Menu myMenu = randomize.randomMenu("menutester");
		System.out.println(myMenu.description() + "\nTotal calories: " + myMenu.totalCalories());
	}
}
