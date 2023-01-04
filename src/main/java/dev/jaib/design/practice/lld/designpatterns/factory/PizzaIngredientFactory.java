package dev.jaib.design.practice.lld.designpatterns.factory;

public interface PizzaIngredientFactory
{
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPeproni();
	Clams createClam();
}
