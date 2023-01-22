package dev.jaib.design.practice.lld.designpatterns.facade;

public class HomeTheaterFacade
{
	private final Player player;
	private final Projector projector;
	private final Screen screen;

	public HomeTheaterFacade(Player player, Projector projector, Screen screen)
	{
		this.player = player;
		this.projector = projector;
		this.screen = screen;
	}

	public void watchMovie(String movie)
	{
		screen.up();
		projector.on();
		projector.wideScreenMode();
		player.on();
		player.play(movie);
	}

	public void stopMovie(String movie)
	{
		player.stop(movie);
		player.off();

		projector.off();
		screen.down();
	}
}
