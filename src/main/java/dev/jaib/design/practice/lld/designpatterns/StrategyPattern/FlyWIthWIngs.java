package dev.jaib.design.practice.lld.designpatterns.StrategyPattern;

public class FlyWIthWIngs implements FlyBehaviour
{
	@Override
	public void fly()
	{
		System.out.println("I can fly with Wings!");
	}
}
