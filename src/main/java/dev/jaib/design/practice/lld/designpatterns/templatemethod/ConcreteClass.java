package dev.jaib.design.practice.lld.designpatterns.templatemethod;

public class ConcreteClass extends AbstractClass
{
	@Override
	void primitiveOperation1()
	{
		System.out.println("Primitive Operation 1 by Concrete Class");
	}

	@Override
	void primitiveOperation2()
	{
		System.out.println("Primitive Operation 2 by Concrete Class");
	}

	@Override
	public void hook()
	{
		System.out.println("Hook implementation by Concrete class");
	}
}
