package dev.jaib.design.practice.lld.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu
{
	private final MenuItem[] menuItems = new MenuItem[10];
	private int position = 0;
	public void addItem(String name, String description, Double price)
	{
		if(position < menuItems.length)
		{
			menuItems[position] = new MenuItem(name, description, price);
			position ++;
		}
	}

	@Override
	public Iterator<MenuItem> createIterator()
	{
		return new DinerMenuIterator(menuItems);
	}
}
