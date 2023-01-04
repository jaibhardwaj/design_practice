package dev.jaib.design.practice.lld.designpatterns.singleton;

public class ThreadSafeLazySingleton
{
	private static volatile ThreadSafeLazySingleton INSTANCE;

	private ThreadSafeLazySingleton()
	{}

	public static ThreadSafeLazySingleton getInstance()
	{
		if( INSTANCE == null )
		{
			synchronized( ThreadSafeLazySingleton.class )
			{
				if( INSTANCE == null )
				{
					INSTANCE = new ThreadSafeLazySingleton();
				}
			}
		}

		return INSTANCE;
	}
}
