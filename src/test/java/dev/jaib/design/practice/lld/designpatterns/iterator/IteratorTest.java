package dev.jaib.design.practice.lld.designpatterns.iterator;

import org.junit.jupiter.api.Test;

public class IteratorTest
{
	@Test
	public void iteratorTest()
	{
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		pancakeHouseMenu.addItem("pancake 1", "pancake with 1", 10.0);
		pancakeHouseMenu.addItem("pancake 2", "pancake with 2", 20.0);
		pancakeHouseMenu.addItem("pancake 3", "pancake with 3", 30.0);

		DinerMenu dinerMenu = new DinerMenu();
		dinerMenu.addItem("diner 1", "diner with 1", 15.0);
		dinerMenu.addItem("diner 2", "diner with 2", 25.0);
		dinerMenu.addItem("diner 3", "diner with 3", 35.0);

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
	}
}