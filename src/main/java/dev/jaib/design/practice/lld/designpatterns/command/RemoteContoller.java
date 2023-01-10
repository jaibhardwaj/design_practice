package dev.jaib.design.practice.lld.designpatterns.command;

public class RemoteContoller
{
	private final Command[] onCommands = new Command[5];
	private final Command[] offCommands = new Command[5];

	private Command unDoCommand;

	public RemoteContoller()
	{
		Command noCommand = new NoCommand();
		for( int i = 0; i < 5; i++ )
		{
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}

		unDoCommand = noCommand;
	}

	public void setCommand(Command onCommand, Command offCommand, int slot)
	{
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot)
	{
		onCommands[slot].execute();
		unDoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot)
	{
		offCommands[slot].execute();
		unDoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed()
	{
		unDoCommand.undo();
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();

		builder.append("\n----------- Remote Control -----------\n");

		for( int i = 0; i < onCommands.length; i++ )
		{
			builder.append("[slot ").append(i)
					.append("] ")
					.append(onCommands[i].getClass().getName())
					.append("      ")
					.append(offCommands[i].getClass().getName())
					.append("      ")
					.append(unDoCommand.getClass().getName())
					.append("\n");
		}

		return builder.toString();
	}
}
