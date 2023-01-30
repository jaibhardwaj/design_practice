package dev.jaib.design.practice.lld.designpatterns.composite;

public class MenuItem extends MenuComponent
{
	private final String name;
	private final String description;
	private final double price;
	private final boolean isVegetarian;

	public MenuItem(String name, String description, double price, boolean isVagetarian)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		this.isVegetarian = isVagetarian;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	public double getPrice()
	{
		return price;
	}

	public boolean isVegetarian()
	{
		return isVegetarian;
	}

	@Override
	public void print()
	{
		System.out.print(" " + getName());
		if( isVegetarian())
		{
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("  --- " + getDescription());
	}
}
