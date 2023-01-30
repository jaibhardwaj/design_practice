package dev.jaib.design.practice.lld.designpatterns.iterator;

import java.util.Iterator;

public class Waitress
{
	private final Menu pancakeHouseMenu;
	private final Menu dinerMenu;

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu)
	{
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu()
	{
		System.out.println("\n Printing MENU ");

		System.out.println("\n Printing BreakFast Menu ");
		printMenu(pancakeHouseMenu.createIterator());

		System.out.println("\n Printing Lunch Menu ");
		printMenu(dinerMenu.createIterator());
	}

	private void printMenu(Iterator<MenuItem> iterator)
	{
		while(iterator.hasNext())
		{
			MenuItem menu = iterator.next();
			System.out.print(menu.getName() + ",  ");
			System.out.print(menu.getPrice() + " -- ");
			System.out.println(menu.getName() + ",  ");
		}
	}
}
