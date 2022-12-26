package dev.jaib.design.practice.lld.designpatterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorPatternTest
{
	@Test
	public void decoratorPatternTest()
	{
		Beverage beverage1 = new DarkRoast();

		beverage1 = new Macho(beverage1);
		beverage1 = new Macho(beverage1);
		beverage1 = new Soy(beverage1);

		System.out.println(beverage1.getDescription());
		System.out.println(beverage1.cost());

		assertEquals(7.289999999999999, beverage1.cost());
	}
}
