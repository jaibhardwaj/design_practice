package dev.jaib.design.practice.lld.designpatterns.singleton;

public class ThreadSafeEagerInitializationSingleton
{
	private static final ThreadSafeEagerInitializationSingleton INSTANCE = new ThreadSafeEagerInitializationSingleton();

	private ThreadSafeEagerInitializationSingleton()
	{}

	public static ThreadSafeEagerInitializationSingleton getInstance()
	{
		return INSTANCE;
	}
}
