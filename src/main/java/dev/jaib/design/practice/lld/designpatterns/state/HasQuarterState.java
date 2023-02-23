package dev.jaib.design.practice.lld.designpatterns.state;

import java.util.Random;

public class HasQuarterState implements State
{
	private final GumballMachine gumballMachine;

	Random randomWinner = new Random(System.currentTimeMillis());
	public HasQuarterState(GumballMachine gumballMachine1)
	{

		this.gumballMachine = gumballMachine1;
	}

	@Override
	public void insertQuarter()
	{
		System.out.println("You can not insert another Quarter!");
	}

	@Override
	public void ejectQuarter()
	{
		System.out.println("Quarter Returned!");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank()
	{
		System.out.println("You turn the crank!");
		int winner = randomWinner.nextInt(10);

		if( (winner == 0 ) && (gumballMachine.getCount() > 1 ))
		{
			gumballMachine.setState(gumballMachine.getWinnerState());
		}
		else
		{
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense()
	{
		System.out.println("No gumball Dispense!");
	}
}
