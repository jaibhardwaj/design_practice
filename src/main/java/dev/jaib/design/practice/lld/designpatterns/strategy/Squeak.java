package dev.jaib.design.practice.lld.designpatterns.strategy;

public class Squeak implements QuackBehaviour
{
	@Override
	public void quack()
	{
		System.out.println("I can squeak!");
	}
}
