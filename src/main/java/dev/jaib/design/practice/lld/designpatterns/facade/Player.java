package dev.jaib.design.practice.lld.designpatterns.facade;

public class Player
{
	void on()
	{
		System.out.println("Player is on");
	}

	void off()
	{
		System.out.println("Player is off");
	}

	void stop(String movie)
	{
		System.out.println("Stop the movie " + movie);
	}

	void play(String movie)
	{
		System.out.println("Play moovie " + movie);
	}
}
