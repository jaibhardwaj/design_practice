package dev.jaib.design.practice.lld.designpatterns.StrategyPattern;

public class FlyNoWay implements FlyBehaviour
{
	@Override
	public void fly()
	{
		System.out.println("I can not fly!");
	}
}
