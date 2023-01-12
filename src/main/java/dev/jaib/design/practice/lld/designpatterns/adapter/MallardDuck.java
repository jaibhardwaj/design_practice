package dev.jaib.design.practice.lld.designpatterns.adapter;

public class MallardDuck implements Duck
{
	@Override
	public void quack()
	{
		System.out.println("Mallard Duck doing Quack!");
	}

	@Override
	public void fly()
	{
		System.out.println("Mallard Duck is Flying!");
	}
}
