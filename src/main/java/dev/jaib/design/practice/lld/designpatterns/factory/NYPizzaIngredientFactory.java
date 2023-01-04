package dev.jaib.design.practice.lld.designpatterns.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{
	@Override
	public Dough createDough()
	{
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce()
	{
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese()
	{
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies()
	{
		return new Veggies[]{new Garlic(), new Mashroom(), new Onion(), new Tomato()};
	}

	@Override
	public Pepperoni createPeproni()
	{
		return new SlicedPeproni();
	}

	@Override
	public Clams createClam()
	{
		return new FreshClams();
	}
}
