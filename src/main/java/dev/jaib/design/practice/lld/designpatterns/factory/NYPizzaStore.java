package dev.jaib.design.practice.lld.designpatterns.factory;

public class NYPizzaStore extends PizzaStore
{
	@Override
	protected Pizza createPizza(String type)
	{
		Pizza pizza = null;

		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		if("cheese".equals(type))
		{
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
		else if("clam".equals(type))
		{
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		else if("pepperoni".equals(type))
		{
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		else if("veggie".equals(type))
		{
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		}
		return pizza;
	}
}
