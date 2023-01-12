package dev.jaib.design.practice.lld.designpatterns.adapter;

public class OstrichToDuckAdapter implements Duck
{
	private final Ostrich ostrich;

	public OstrichToDuckAdapter(Ostrich ostrich)
	{
		this.ostrich = ostrich;
	}

	@Override
	public void quack()
	{
		this.ostrich.gobble();
	}

	@Override
	public void fly()
	{
		this.ostrich.fly();
	}
}
