package dev.jaib.design.practice.lld.designpatterns.strategy;

public class FlyNoWay implements FlyBehaviour
{
	@Override
	public void fly()
	{
		System.out.println("I can not fly!");
	}
}
