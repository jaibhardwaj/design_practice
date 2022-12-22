package dev.jaib.design.practice.lld.designpatterns.observer;

public class WeatherStatsDisplay implements Observer, WeatherDisplay
{
	private final WeatherData weatherData;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherStatsDisplay(WeatherData weatherData)
	{
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	@Override
	public void update(float temp, float humidity, float pressure)
	{
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	// In PULL Mechanism
	/*
	@Override
	public void update()
	{
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		this.pressure = weatherData.getPressure();
		display();
	}*/

	@Override
	public void display()
	{
		System.out.println("Weather Stats : " + this.temperature +
				" F degrees and " + humidity + "% humidity " +
				pressure + " atm pressure");
	}
}