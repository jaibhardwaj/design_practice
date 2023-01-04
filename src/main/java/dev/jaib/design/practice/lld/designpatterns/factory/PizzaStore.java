package dev.jaib.design.practice.lld.designpatterns.factory;

public abstract class PizzaStore
{
	public Pizza orderPizza(String type)
	{
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.bake();

		return pizza;
	}

	protected abstract Pizza createPizza(String type);
}
