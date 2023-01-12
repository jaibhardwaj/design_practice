package dev.jaib.design.practice.lld.designpatterns.adapter;

public class WildOstrich implements Ostrich
{
	@Override
	public void gobble()
	{
		System.out.println("WildOstrich Duck doing Gobble!");
	}

	@Override
	public void fly()
	{
		System.out.println("Wild Ostrich is short Flying!");
	}
}
