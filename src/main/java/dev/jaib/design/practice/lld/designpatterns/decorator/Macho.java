package dev.jaib.design.practice.lld.designpatterns.decorator;

public class Macho extends CondimentDecorator
{
	public Macho(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public double cost()
	{
		return beverage.cost() + 2.1;
	}

	@Override
	public String getDescription()
	{
		return beverage.getDescription() + " Macho ";
	}
}
