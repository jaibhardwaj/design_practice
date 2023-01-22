package dev.jaib.design.practice.lld.designpatterns.templatemethod;

public abstract class AbstractClass
{

	final void templateMethod()
	{
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}

	abstract void primitiveOperation1();

	abstract void primitiveOperation2();

	private void concreteOperation()
	{
		System.out.println("Concrete Operation");
	}
	public void hook()
	{
		System.out.println("This is default Hook");
	}

}
