package dev.jaib.design.practice.lld.designpatterns.factory;

import java.util.Arrays;

public abstract class Pizza
{
	private String name;
	protected Dough dough;
	protected Cheese cheese;
	protected Sauce sauce;
	protected Veggies[] veggies;
	protected Pepperoni pepperoni;
	protected Clams clam;

	protected abstract void prepare();

	protected void bake()
	{
		System.out.println("Bake for 25 minutes at 350");
	}

	protected void cut()
	{
		System.out.println("Cutting the pizza into diagonal slices");
	}

	protected void box()
	{
		System.out.println("Place pizza in official PizzaStore Box");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Pizza{" +
				"name='" + name + '\'' +
				", dough=" + dough +
				", cheese=" + cheese +
				", sauce=" + sauce +
				", veggies=" + Arrays.toString(veggies) +
				", pepperoni=" + pepperoni +
				", clam=" + clam +
				'}';
	}
}
