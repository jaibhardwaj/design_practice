package dev.jaib.design.practice.lld.designpatterns.templatemethod;

import org.junit.jupiter.api.Test;

class AbstractClassTest
{

	@Test
	void templateMethodTest()
	{
		AbstractClass ab = new ConcreteClass();
		ab.templateMethod();
	}
}