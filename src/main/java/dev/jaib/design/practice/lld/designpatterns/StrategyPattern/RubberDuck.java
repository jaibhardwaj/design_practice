package dev.jaib.design.practice.lld.designpatterns.StrategyPattern;

public class RubberDuck extends Duck
{
	public RubberDuck()
	{
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}

	@Override
	public void display()
	{
		System.out.println("showing the Rubber Duck!");
	}
}
