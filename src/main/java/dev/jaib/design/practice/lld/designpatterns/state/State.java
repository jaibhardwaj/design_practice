package dev.jaib.design.practice.lld.designpatterns.state;

public interface State
{
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
