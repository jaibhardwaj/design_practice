package dev.jaib.design.practice.lld.designpatterns.factory;

public class CheesePizza extends Pizza
{
	private final PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory)
	{
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	protected void prepare()
	{
		System.out.println("preparing " + getName());
		dough = this.pizzaIngredientFactory.createDough();
		sauce = this.pizzaIngredientFactory.createSauce();
		cheese = this.pizzaIngredientFactory.createCheese();
		clam = this.pizzaIngredientFactory.createClam();
		pepperoni = this.pizzaIngredientFactory.createPeproni();

	}
}
