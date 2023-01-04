package dev.jaib.design.practice.lld.designpatterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaStoreTest
{

	@Test
	void createPizza()
	{
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza);

		assertEquals("New York Style Cheese Pizza", pizza.getName());
	}
}