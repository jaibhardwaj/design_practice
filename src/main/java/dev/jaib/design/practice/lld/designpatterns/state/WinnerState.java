package dev.jaib.design.practice.lld.designpatterns.state;

public class WinnerState implements State
{
	private final GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine)
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
		if( gumballMachine.getCount() == 0 )
		{
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		else
		{
			gumballMachine.releaseBall();
			System.out.println("You are a WINNER!, You got two gumball for your quarter!");

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
}
