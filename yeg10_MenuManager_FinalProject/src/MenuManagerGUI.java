import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.border.Border;

public class MenuManagerGUI {

	private JFrame mainMenuManagerWindow;
	private JLabel lblEntrees, lblSides, lblSalads, lblDesserts, lblCreatedMenus, lblReport;
	private JComboBox cboEntrees, cboSides, cboSalads, cboDesserts;
	private JTextField detailTxtAmountFld, detailEntreeFld, detailSaladFld;
//	private JTextArea menuInfoTextFld;
	ArrayList<Menu> menus;
	JList<Menu> menuJList;
	private JButton btnCreateMenu, btnGenerateRandom, btnGenerateMinimum, btnGenerateMaximum, btnDetails, btnDelete, btnSave;
	private MenuManager menuManager;

	public MenuManagerGUI(String dishFlie) {
		// constructor 
		menuManager = new MenuManager("data/dishes");
		menus = new ArrayList<Menu>();
		menuJList = new JList<Menu>();
	}
	

	private void buildMainMenuManagerGUIWindow(JFrame mainMenuManagerWindow) {
		// Add main window
		mainMenuManagerWindow.setBounds(20, 20, 800, 800);
		mainMenuManagerWindow.setLayout(null);
				
		// Add four labels
		lblEntrees = new JLabel("Entree ");
		lblEntrees.setBounds(40, 20, 80, 30);
		mainMenuManagerWindow.getContentPane().add(lblEntrees);

		lblSides = new JLabel("Side ");
		lblSides.setBounds(40, 50, 80, 30);
		mainMenuManagerWindow.getContentPane().add(lblSides);

		lblSalads = new JLabel("Salad ");
		lblSalads.setBounds(40, 80, 80, 30);
		mainMenuManagerWindow.getContentPane().add(lblSalads);

		lblDesserts = new JLabel("Dessert ");
		lblDesserts.setBounds(40, 110, 80, 30);
		mainMenuManagerWindow.getContentPane().add(lblDesserts);

		lblCreatedMenus = new JLabel("Created Menus: ");
		lblCreatedMenus.setBounds(380, 23, 120, 30);
		mainMenuManagerWindow.getContentPane().add(lblCreatedMenus);


		// Add four combo box with entree, sides, salads, desserts list
		cboEntrees = new JComboBox(menuManager.getEntrees().toArray());
		cboEntrees.setBounds(lblEntrees.getX() + lblEntrees.getWidth(), lblEntrees.getY() + lblEntrees.getHeight(), 180, 30);
		mainMenuManagerWindow.getContentPane().add(cboEntrees);

		cboSides = new JComboBox(menuManager.getSides().toArray());
		cboSides.setBounds(lblSides.getX() + lblSides.getWidth(), lblSides.getY() + lblSides.getHeight(), 180, 30);
		mainMenuManagerWindow.getContentPane().add(cboSides);

		cboSalads = new JComboBox(menuManager.getSalads().toArray());
		cboSalads.setBounds(lblSalads.getX() + lblSalads.getWidth(), lblSalads.getY() + lblSalads.getHeight(), 180, 30);
		mainMenuManagerWindow.getContentPane().add(cboSalads);

		cboDesserts = new JComboBox(menuManager.getDesserts().toArray());
		cboDesserts.setBounds(lblDesserts.getX() + lblDesserts.getWidth(), lblDesserts.getY() + lblDesserts.getHeight(), 180, 30);
		mainMenuManagerWindow.getContentPane().add(cboDesserts);


		// Add a textbox for withdrawal and deposit amounts
		//	JTextField txtFirstName = new JTextField("");
		//	txtFirstName.setBounds(100, 10, 300, 30);
		//	mainMenuManagerWindow.getContentPane().add(txtFirstName);


		// Add seven buttons of main window
		JButton btnCreateMenu = new JButton("Create Menu with these dishes");
		btnCreateMenu.setBounds(40, 160, 260, 30);
		mainMenuManagerWindow.getContentPane().add(btnCreateMenu);

		JButton btnGenerateRandom = new JButton("Generate a Random Menu");
		btnGenerateRandom.setBounds(36, 40, 260, 30);
		mainMenuManagerWindow.getContentPane().add(btnGenerateRandom);

		JButton btnGenerateMinimum = new JButton("Generate a Minimum Calories Menu");
		btnGenerateMinimum.setBounds(36, 90, 260, 30);
		mainMenuManagerWindow.getContentPane().add(btnGenerateMinimum);

		JButton btnGenerateMaximum = new JButton("Generate a Maximum Calories Menu");
		btnGenerateMaximum.setBounds(36, 140, 260, 30);
		mainMenuManagerWindow.getContentPane().add(btnGenerateMaximum);

		JButton btnDetails = new JButton("Details");
		btnDetails.setBounds(360, 420, 80, 30);
		mainMenuManagerWindow.getContentPane().add(btnDetails);
		
		JButton btnDelete = new JButton("Delete all");
		btnDelete.setBounds(430, 420, 90, 30);
		mainMenuManagerWindow.getContentPane().add(btnDelete);
		
		JButton btnSave = new JButton("Save to file");
		btnSave.setBounds(510, 420, 95, 30);
		mainMenuManagerWindow.getContentPane().add(btnSave);
		

		// Show window
		mainMenuManagerWindow.setVisible(true);


		// Add left first panel
		JPanel panelLeftUp = new JPanel();
		panelLeftUp.setBounds(20, 30, 320, 210);
		String titleUp = "Build your own Menu";
		Border borderUp = BorderFactory.createTitledBorder(titleUp);
		panelLeftUp.setBorder(borderUp);
		panelLeftUp.setLayout(new BoxLayout(panelLeftUp, BoxLayout.PAGE_AXIS));
		mainMenuManagerWindow.add(panelLeftUp);
		panelLeftUp.add(lblEntrees);
		panelLeftUp.add(lblSides);
		panelLeftUp.add(lblSalads);
		panelLeftUp.add(lblDesserts);
		panelLeftUp.add(btnCreateMenu);


		// Add left second panel
		JPanel panelLeftDown = new JPanel();
		panelLeftDown.setBounds(20, 250, 320, 200);
		String titleDown = "Or generate a Menu";
		Border borderDown = BorderFactory.createTitledBorder(titleDown);
		panelLeftDown.setBorder(borderDown);
		panelLeftDown.setLayout(new BoxLayout(panelLeftDown, BoxLayout.PAGE_AXIS));
		mainMenuManagerWindow.add(panelLeftDown);
		panelLeftDown.add(btnGenerateRandom);
		panelLeftDown.add(btnGenerateMinimum);
		panelLeftDown.add(btnGenerateMaximum);

		// Add right panel
		JPanel panelRight = new JPanel();
		panelRight.setBounds(375, 50, 220, 360);
		String title = "Menu";
		Border border = BorderFactory.createTitledBorder(title);
		panelRight.setBorder(border);
		panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.PAGE_AXIS));
//		panelRight.add(this.menuInfoTextFld);
		panelRight.add(this.menuJList);
		mainMenuManagerWindow.add(panelRight);

		// Add event handlers
		btnCreateMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String menuNameInput = javax.swing.JOptionPane.showInputDialog("Please customize your menu name.");
				Menu newMenu = new Menu(menuNameInput);
				
				Entree selectedEntree = (Entree) cboEntrees.getSelectedItem();
				newMenu.setEntree(selectedEntree);
				menus.add(newMenu);
				Menu[] tmpMenu = new Menu[menus.size()];
				menuJList.setListData(menus.toArray(tmpMenu));
			}
		});
		btnDetails.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedIdx = menuJList.getSelectedIndex();
				if (selectedIdx == -1) {
					System.out.println("no jlist item selected");
					return;
				}
				Menu selectedMenu = menus.get(selectedIdx);
				JFrame detailFrame= new JFrame("Menu Detail");
				detailFrame.setBounds(20, 20, 800, 800);
				detailFrame.setLayout(null);
				// Show window
				detailFrame.setVisible(true);
				
				// set entree
				JTextArea detailEntreeFld = new JTextArea(selectedMenu.getEntree().toString());
				detailEntreeFld.setBounds(200, 40, 500, 100);
				detailEntreeFld.setEditable(false);
				JLabel entreeLabel = new JLabel("Entree:");
				entreeLabel.setBounds(20, 40, 100, 30);
				detailFrame.getContentPane().add(entreeLabel);
				detailFrame.getContentPane().add(detailEntreeFld);
			}
		});
	}
	private String getAllMenuNamesStr() {
		String res = "";
		for (Menu menu: this.menus) {
			res += menu.getName();
		}
		return res;
	}

	public static void main(String[] args) {
		MenuManagerGUI newMenu = new MenuManagerGUI("data/dishes");
		JFrame mainMenuManagerWindow = new JFrame("Menu Manager");
		newMenu.buildMainMenuManagerGUIWindow(mainMenuManagerWindow);
	}

}
