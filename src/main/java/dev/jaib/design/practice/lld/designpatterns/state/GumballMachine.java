package dev.jaib.design.practice.lld.designpatterns.state;

public class GumballMachine implements State
{
	private final State soldOutState;
	private final State noQuarterState;
	private final State hasQuarterState;
	private final State soldState;
	private final State winnerState;
	private State state;
	private int count;

	public GumballMachine(int numberGumballs)
	{
		this.count = numberGumballs;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		if( numberGumballs > 0 )
		{
			state = noQuarterState;
		}
		else
		{
			state = soldOutState;
		}
	}

	@Override
	public void insertQuarter()
	{
		state.insertQuarter();
	}

	@Override
	public void ejectQuarter()
	{
		state.ejectQuarter();
	}

	@Override
	public void turnCrank()
	{
		state.turnCrank();
	}

	@Override
	public void dispense()
	{
		state.dispense();
	}

	public void setState(State state)
	{
		this.state = state;
	}

	public State getSoldOutState()
	{
		return soldOutState;
	}

	public State getNoQuarterState()
	{
		return noQuarterState;
	}

	public State getHasQuarterState()
	{
		return hasQuarterState;
	}

	public State getSoldState()
	{
		return soldState;
	}

	public State getWinnerState()
	{
		return winnerState;
	}

	public int getCount()
	{
		return count;
	}

	public void releaseBall()
	{
		System.out.println("A gumball comes rolling out the slot ...");
		if( count > 0 )
		{
			count--;
		}
	}

	@Override
	public String toString()
	{
		return "GumballMachine{" +
				"count=" + count +
				'}';
	}
}
