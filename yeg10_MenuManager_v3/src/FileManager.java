/**
 * Class FileManager
 * @author Yexiu Gao(yeg10)
 * @created: 11/19/2022
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	public static ArrayList<MenuItem> readItems(String fileName){
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {

				String[] temp = line.split("@@");
				if(temp.length == 5) {
					String name = temp[0];
					String dishType = temp[1];
					String desc = temp[2];
					int calories = Integer.parseInt(temp[3]);
					double price = Double.parseDouble(temp[4]);


					if (dishType.equals("entree")) {
						Entree entree = new Entree(name, desc, calories, price);
						menuItemList.add(entree);
					}


					else if (dishType.equals("side")) {
						Side side = new Side(name, desc, calories, price);
						menuItemList.add(side);
					}

					else if (dishType.equals("salad")) {
						Salad salad = new Salad(name, desc, calories, price);
						menuItemList.add(salad);
					}

					else if (dishType.equals("dessert")) {
						Dessert dessert = new Dessert(name, desc, calories, price);
						menuItemList.add(dessert);
					}
				}
				else {
					System.out.println("Some rows in your dataset is missing values");
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return menuItemList;

	}

	public static void writeMenu(String fileName, ArrayList <Menu> menus) {		

		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Menu menu : menus) {
				bw.write(menu.getEntree().toString());
				bw.write(menu.getName().toString());
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}




}