package dev.jaib.design.practice.lld.designpatterns.observer;

public class ForecastDisplay implements Observer, WeatherDisplay
{
	private float temperature;
	private float humidity;

	@Override
	public void update(float temp, float humidity, float pressure)
	{
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display()
	{
		System.out.println("Forecast Condition: " + this.temperature +
				" F degrees and " + humidity + "% humidity");
	}
}
