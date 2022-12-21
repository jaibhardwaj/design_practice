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
		observers.forEach(observer -> observer.update(getTemperature(), getHumidity(), getPressure()));
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
