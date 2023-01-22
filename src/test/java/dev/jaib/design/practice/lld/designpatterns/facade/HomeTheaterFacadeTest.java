package dev.jaib.design.practice.lld.designpatterns.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTheaterFacadeTest
{
	@Test
	void homeTheaterFacadeTest()
	{
		Projector projector = new Projector();
		Player player = new Player();
		Screen screen = new Screen();

		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(player, projector, screen);

		homeTheaterFacade.watchMovie("Black Adam");

		System.out.println();
		homeTheaterFacade.stopMovie("Black Adam");
	}
}