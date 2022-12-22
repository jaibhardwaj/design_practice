package dev.jaib.design.practice.lld.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject
{
	private float temperature;
	private float humidity;
	private float pressure;
	List<Observer> observers;
	public WeatherData()
	{
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer)
	{
		observers.add(observer);
	}

	@Override
	public void unRegisterObserver(Observer observer)
	{
		observers.remove(observer);
	}

	@Override
	public void notifyObserver()
	{
		// This is PUSH mechanism of notify observer where we are pushing all the data to all the observers,
		// even they required these all the data or not.
		observers.forEach(observer -> observer.update(getTemperature(), getHumidity(), getPressure()));

		// In PULL Mechanism, we just notify observer about the change , and as they have subject object, then they can
		// pull the those data which they required using the getter
		// observers.forEach(observer -> observer.update());
	}

	public float getTemperature()
	{
		return temperature;
	}

	public float getHumidity()
	{
		return humidity;
	}

	public float getPressure()
	{
		return pressure;
	}

	public void measurementChanged()
	{
		notifyObserver();
	}

	public void setMeasurement(float temp, float humidity, float pressure)
	{
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}
