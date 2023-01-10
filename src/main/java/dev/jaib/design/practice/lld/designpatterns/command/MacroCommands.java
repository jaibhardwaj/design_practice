package dev.jaib.design.practice.lld.designpatterns.command;

public class MacroCommands implements Command
{
	private Command[] commands;

	public MacroCommands(Command[] commands)
	{
		this.commands = commands;
	}

	@Override
	public void execute()
	{
		for( Command command : commands )
		{
			command.execute();
		}
	}

	@Override
	public void undo()
	{
		for( Command command : commands )
		{
			command.undo();
		}
	}
}
