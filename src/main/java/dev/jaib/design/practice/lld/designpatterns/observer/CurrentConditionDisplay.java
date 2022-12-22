package dev.jaib.design.practice.lld.designpatterns.observer;

public class CurrentConditionDisplay implements Observer, WeatherDisplay
{
	private final WeatherData weatherData;
	private float temperature;
	private float humidity;

	public CurrentConditionDisplay(WeatherData weatherData)
	{
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	// In Push Mechanism
	@Override
	public void update(float temp, float humidity, float pressure)
	{
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	// In PULL Mechanism
	/*
	@Override
	public void update()
	{
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}*/

	@Override
	public void display()
	{
		System.out.println("Current Condition: " + this.temperature +
				" F degrees and " + humidity + "% humidity");
	}
}
