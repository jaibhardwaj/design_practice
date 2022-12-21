package dev.jaib.design.practice.lld.designpatterns.observer;

import org.junit.jupiter.api.Test;

public class ObserverPatternTest
{
	@Test
	public void weatherDisplayUpdateTest()
	{
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay display1 = new CurrentConditionDisplay();
		ForecastDisplay display2 = new ForecastDisplay();
		WeatherStatsDisplay display3 = new WeatherStatsDisplay();

		weatherData.registerObserver(display1);
		weatherData.registerObserver(display2);
		weatherData.registerObserver(display3);

		weatherData.setMeasurement(10, 20, 30);
		System.out.println();
		weatherData.setMeasurement(50, 60, 70);

		weatherData.unRegisterObserver(display1);

		System.out.println();
		weatherData.setMeasurement(70, 80, 90);


	}
}
