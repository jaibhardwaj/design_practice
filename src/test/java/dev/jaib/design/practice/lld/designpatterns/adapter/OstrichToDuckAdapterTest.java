package dev.jaib.design.practice.lld.designpatterns.adapter;

import org.junit.jupiter.api.Test;

class OstrichToDuckAdapterTest
{
	@Test
	public void DuckToOstrichAdapterTest()
	{
		Duck duck = new MallardDuck();
		Ostrich ostrich = new WildOstrich();

		testDuck(duck);
		testOstrich(ostrich);

		Duck duck1 = new OstrichToDuckAdapter(ostrich);
		testDuck(duck1);

	}

	public void testDuck(Duck duck)
	{
		duck.quack();
		duck.fly();
	}

	public void testOstrich(Ostrich ostrich)
	{
		ostrich.gobble();
		ostrich.fly();
	}
}