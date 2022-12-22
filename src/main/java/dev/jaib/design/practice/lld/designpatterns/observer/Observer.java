package dev.jaib.design.practice.lld.designpatterns.observer;

public interface Observer
{
	// This is done using the PUSH Mechanism
	void update(float temp, float humidity, float pressure);

	// This is done using the PULL Mechanism
	//void update();
}
