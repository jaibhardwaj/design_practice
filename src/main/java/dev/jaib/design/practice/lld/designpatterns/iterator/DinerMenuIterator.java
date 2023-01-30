package dev.jaib.design.practice.lld.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>
{
	private final MenuItem[] menuItems;
	private int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems)
	{
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext()
	{
		return position < menuItems.length && menuItems[position] != null;
	}

	@Override
	public MenuItem next()
	{
		final MenuItem menuItem = menuItems[position];
		position++;
		return menuItem;
	}

	@Override
	public void remove()
	{
		throw new UnsupportedOperationException(" can not remove items from Diner Menu ");
	}
}
