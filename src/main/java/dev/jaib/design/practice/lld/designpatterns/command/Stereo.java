package dev.jaib.design.practice.lld.designpatterns.command;

public class Stereo
{
	public void on()
	{
		System.out.println("Stereo is on!");
	}

	public void off()
	{
		System.out.println("Stereo is off!");
	}

	public void setCD()
	{
		System.out.println("CD is set");
	}

	public void setVolume(int vol)
	{
		System.out.println("Volume is set to " + vol);
	}
}
