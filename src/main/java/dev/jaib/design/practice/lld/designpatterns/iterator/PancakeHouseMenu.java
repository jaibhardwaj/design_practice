package dev.jaib.design.practice.lld.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu
{
	private final List<MenuItem> itemList = new ArrayList<>();
	public void addItem(String name, String description, Double price)
	{
		itemList.add(new MenuItem(name, description, price));
	}

	@Override
	public Iterator<MenuItem> createIterator()
	{
		return itemList.iterator();
	}
}
