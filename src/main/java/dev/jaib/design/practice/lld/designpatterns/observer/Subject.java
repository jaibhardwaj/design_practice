package dev.jaib.design.practice.lld.designpatterns.observer;

public interface Subject
{
	void registerObserver(Observer observer);
	void unRegisterObserver(Observer observer);
	void notifyObserver();
}
