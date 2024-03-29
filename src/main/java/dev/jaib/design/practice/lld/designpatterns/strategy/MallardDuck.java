package dev.jaib.design.practice.lld.designpatterns.strategy;

public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		flyBehaviour = new FlyWIthWIngs();
		quackBehaviour = new Quack();
	}

	@Override
	public void display()
	{
		System.out.println("showing the Mallard Duck!");
	}
}
