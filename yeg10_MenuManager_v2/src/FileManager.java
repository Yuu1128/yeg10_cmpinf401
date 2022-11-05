/**
 * Class FileManager
 * @author Yexiu Gao(yeg10)
 * @created: 11/03/2022
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	/**
	 * Method readEntrees
	 * @param fileName the location of the entrees file
	 * @return entreeList
	 */
	public static ArrayList<Entree> readEntrees(String fileName){
		ArrayList<Entree> entreesList = new ArrayList<Entree>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {

				String[] temp = line.split("@@");
				if(temp.length == 3) {
					String name = temp[0];
					String description = temp[1];
					int calories = Integer.parseInt(temp[2]);

					Entree entree = new Entree(name, description, calories);
					entreesList.add(entree);
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entreesList;

	}

	/**
	 * Method readSides
	 * @param fileName the location of the sides file
	 * @return sidesList
	 */
	public static ArrayList<Side> readSides(String fileName){
		ArrayList<Side> sidesList = new ArrayList<Side>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {

				String[] temp = line.split("@@");
				if(temp.length == 3) {
					String name = temp[0];
					String description = temp[1];
					int calories = Integer.parseInt(temp[2]);

					Side side = new Side(name, description, calories);
					sidesList.add(side);
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sidesList;
		
	}

	/**
	 * Method readSalads
	 * @param fileName the location of the salads file
	 * @return saladsList
	 */
	public static ArrayList<Salad> readSalads(String fileName){
		ArrayList<Salad> saladsList = new ArrayList<Salad>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {

				String[] temp = line.split("@@");
				if(temp.length == 3) {
					String name = temp[0];
					String description = temp[1];
					int calories = Integer.parseInt(temp[2]);

					Salad salad = new Salad(name, description, calories);
					saladsList.add(salad);
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saladsList;
		
	}

	/**
	 * Method readDesserts
	 * @param fileName the location of the desserts file
	 * @return dessertsList
	 */
	public static ArrayList<Dessert> readDesserts(String fileName){
		ArrayList<Dessert>dessertsList = new ArrayList<Dessert>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {

				String[] temp = line.split("@@");
				if(temp.length == 3) {
					String name = temp[0];
					String description = temp[1];
					int calories = Integer.parseInt(temp[2]);

					Dessert dessert = new Dessert(name, description, calories);
					dessertsList.add(dessert);
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dessertsList; 
		
	}

}