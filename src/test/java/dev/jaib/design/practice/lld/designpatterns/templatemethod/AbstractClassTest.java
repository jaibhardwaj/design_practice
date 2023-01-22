package dev.jaib.design.practice.lld.designpatterns.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractClassTest
{

	@Test
	void templateMethodTest()
	{
		AbstractClass ab = new ConcreteClass();
		ab.templateMethod();
	}
}