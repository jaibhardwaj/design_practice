package dev.jaib.design.practice.lld.designpatterns.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaitressTest
{
	@Test
	void printMenu()
	{
		MenuComponent pencakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

		pencakeHouseMenu.add(new MenuItem("pancake 1", "pancake with 1", 10.0, true));
		pencakeHouseMenu.add(new MenuItem("pancake 2", "pancake with 2", 20.0, true));
		pencakeHouseMenu.add(new MenuItem("pancake 3", "pancake with 3", 30.0, true));

		dinerMenu.add(new MenuItem("diner 1", "diner with 1", 15.0, true));
		dinerMenu.add(new MenuItem("diner 2", "diner with 2", 25.0, true));
		dinerMenu.add(new MenuItem("diner 3", "diner with 3", 35.0, true));

		MenuComponent allMenu = new Menu("ALL MENUS", "all menus combined");

		allMenu.add(pencakeHouseMenu);
		allMenu.add(dinerMenu);
		allMenu.add(cafeMenu);

		dinerMenu.add(new MenuItem("Diner 1", "Lunch Item 1", 10, true));

		cafeMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie 1", 10, true));

		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
	}
}