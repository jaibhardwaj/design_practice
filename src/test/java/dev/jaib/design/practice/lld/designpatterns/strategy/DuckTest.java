package dev.jaib.design.practice.lld.designpatterns.strategy;

import org.junit.jupiter.api.Test;

class DuckTest
{
	@Test
	void duckFlyBehaviourTest()
	{
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();

		duck.setFlyBehaviour(new FlyNoWay());
		duck.performFly();
		duck.swim();
	}

	@Test
	void duckQuackBehaviourTest()
	{
		Duck duck = new RubberDuck();
		duck.display();
		duck.performQuack();

		duck.setQuackBehaviour(new Quack());
		duck.performQuack();
		duck.swim();
	}
}