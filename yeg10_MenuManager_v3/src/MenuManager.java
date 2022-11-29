/**
 * Class MenuManager
 * @author Yexiu Gao(yeg10)
 * @created: 11/19/2022
 */
import java.util.ArrayList;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	public MenuManager(String dishsFile) {
		ArrayList<MenuItem> dishList = FileManager.readItems(dishsFile);
		//	this.splitArrayList(dishList);
		this.entrees = this.splitEntreeList(dishList);
		this.sides = this.splitSideList(dishList);
		this.salads = this.splitSaladList(dishList);
		this.desserts = this.splitDessertList(dishList);

	}

	public ArrayList<Entree> splitEntreeList(ArrayList<MenuItem> dishList){
		ArrayList<Entree> entrees = new ArrayList<Entree>();

		for (MenuItem menuItem : dishList) {
			if(menuItem instanceof Entree) {
				entrees.add((Entree)menuItem);
			}
			else {
			}
		}
		return entrees;
	}

	public ArrayList<Side> splitSideList(ArrayList<MenuItem> dishList){
		ArrayList<Side> sides = new ArrayList<Side>();

		for (MenuItem menuItem : dishList) {
			if(menuItem instanceof Side) {
				sides.add((Side)menuItem);
			}
			else {
			}
		}
		return sides;
	}

	public ArrayList<Salad> splitSaladList(ArrayList<MenuItem> dishList){
		ArrayList<Salad> salads = new ArrayList<Salad>();

		for (MenuItem menuItem : dishList) {
			if(menuItem instanceof Salad) {
				salads.add((Salad)menuItem);
			}
			else {
			}
		}
		return salads;
	}

	public ArrayList<Dessert> splitDessertList(ArrayList<MenuItem> dishList){
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();

		for (MenuItem menuItem : dishList) {
			if(menuItem instanceof Dessert) {
				desserts.add((Dessert)menuItem);
			}
			else {
			}
		}
		return desserts;
	}

	public ArrayList<MenuItem> splitArrayList(ArrayList<MenuItem> dishList){
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		ArrayList<Side> sides = new ArrayList<Side>();
		ArrayList<Salad> salads = new ArrayList<Salad>();
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();


		//	for(int i = 0; i <= dishList.size(); i++) {
		//		MenuItem menuItem = dishList.get(i);
		//	}

		for (MenuItem menuItem : dishList) {
			if(menuItem instanceof Entree) {
				entrees.add((Entree)menuItem);
			}
			else if(menuItem instanceof Side) {
				sides.add((Side)menuItem);
			}
			else if(menuItem instanceof Salad) {
				salads.add((Salad)menuItem);
			}
			else if(menuItem instanceof Dessert) {
				desserts.add((Dessert)menuItem);
			}
		}

		return dishList;

	}

	public Menu randomMenu(String name) {
		int indexEntree = (int) (Math.random() * entrees.size());
		//System.out.println(indexEntree);
		Entree randomEntree = entrees.get(indexEntree);

		int indexSide = (int) (Math.random() * sides.size());
		//System.out.println(indexSide);
		Side randomSide = sides.get(indexSide);

		int indexSalad = (int) (Math.random() * salads.size());
		//System.out.println(indexSalad);
		Salad randomSalad = salads.get(indexSalad);

		int indexDessert = (int) (Math.random() * desserts.size());
		//System.out.println(indexDessert);
		Dessert randomDessert = desserts.get(indexDessert);

		Menu menu = new Menu("randomMenu",randomEntree, randomSide, randomSalad, randomDessert);
		return menu;

	}

	public Menu minCaloriesMenu(String name) {
		return null;

	}

	public Menu maxCaloriesMenu(String name) {
		return null;

	}


}