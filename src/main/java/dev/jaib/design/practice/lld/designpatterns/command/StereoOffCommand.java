package dev.jaib.design.practice.lld.designpatterns.command;

public class StereoOffCommand implements Command
{
	private final Stereo stereo;

	public StereoOffCommand(Stereo stereo)
	{
		this.stereo = stereo;
	}

	@Override
	public void execute()
	{
		stereo.off();
	}

	@Override
	public void undo()
	{
		stereo.on();
	}
}