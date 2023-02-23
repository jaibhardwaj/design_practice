package dev.jaib.design.practice.lld.designpatterns.state;

public class SoldState implements State
{
	private final GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine)
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("Please Wait, we are already giving you a Gumball!");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("Sorry, You already turned the crank!");
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Turning twice does not get you another gumball!");
	}

	@Override
	public void dispense()
	{
		gumballMachine.releaseBall();
		if( gumballMachine.getCount() > 0 )
		{
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else
		{
			System.out.println("Oops, out of gumball!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
