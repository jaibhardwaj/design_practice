package dev.jaib.design.practice.lld.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent
{
	private final List<MenuComponent> menuItems = new ArrayList<>();
	private final String name;
	private final String description;

	public Menu(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent)
	{
		menuItems.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent)
	{
		menuItems.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i)
	{
		return menuItems.get(i);
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getDescription()
	{
		return description;
	}

	@Override
	public void print()
	{
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("--------------");

		for( MenuComponent menuComponent: menuItems )
		{
			menuComponent.print();
		}
	}
}