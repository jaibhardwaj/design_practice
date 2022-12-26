package dev.jaib.design.practice.lld.designpatterns.decorator;

public class Soy extends CondimentDecorator
{
	public Soy(Beverage beverage)
	{
		this.beverage = beverage;
	}

	@Override
	public double cost()
	{
		return beverage.cost() + 1.1;
	}

	@Override
	public String getDescription()
	{
		return beverage.getDescription() + " Soy ";
	}
}
