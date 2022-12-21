package dev.jaib.design.practice.lld.designpatterns.strategy;

public abstract class Duck
{
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;

	public void setFlyBehaviour(FlyBehaviour flyBehaviour)
	{
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour)
	{
		this.quackBehaviour = quackBehaviour;
	}

	public void performFly()
	{
		this.flyBehaviour.fly();
	}

	public void performQuack()
	{
		this.quackBehaviour.quack();
	}

	public void swim()
	{
		System.out.println("every duck can swim!");
	}

	public abstract void display();
}
