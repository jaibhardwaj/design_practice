package dev.jaib.design.practice.lld.designpatterns.composite;

public class Waitress
{
	private final MenuComponent menuComponent;


	public Waitress(MenuComponent menuComponent)
	{
		this.menuComponent = menuComponent;
	}

	public void printMenu()
	{
		menuComponent.print();
	}
}
