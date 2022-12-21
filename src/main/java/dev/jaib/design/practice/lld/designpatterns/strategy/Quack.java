package dev.jaib.design.practice.lld.designpatterns.strategy;

public class Quack implements QuackBehaviour
{

	@Override
	public void quack()
	{
		System.out.println("I can Quack!");
	}
}
