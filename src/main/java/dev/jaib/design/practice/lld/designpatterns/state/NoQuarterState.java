package dev.jaib.design.practice.lld.designpatterns.state;

public class NoQuarterState implements State
{

	private final GumballMachine gumballMachine;
	public NoQuarterState(GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("You have inserted a Quarter!");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("You have not inserted any Quarter, so nothing to eject!");
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Firstly, you will have to insert a quarter!");
	}

	@Override
	public void dispense()
	{
		System.out.println("No Gumball to dispense!");
	}
}
