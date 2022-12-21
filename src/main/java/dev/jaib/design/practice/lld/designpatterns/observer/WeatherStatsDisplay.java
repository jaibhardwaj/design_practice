package dev.jaib.design.practice.lld.designpatterns.observer;

public class WeatherStatsDisplay implements Observer, WeatherDisplay
{
	private float temperature;
	private float humidity;
	private float pressure;

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display()
	{
		System.out.println("Weather Stats : " + this.temperature +
				" F degrees and " + humidity + "% humidity " +
				pressure + " atm pressure");
	}
}