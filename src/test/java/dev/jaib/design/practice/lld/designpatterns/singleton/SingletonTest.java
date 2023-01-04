package dev.jaib.design.practice.lld.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest
{
	@Test
	void singletonTest()
	{
		ThreadSafeEagerInitializationSingleton singleton1 = ThreadSafeEagerInitializationSingleton.getInstance();
		ThreadSafeEagerInitializationSingleton singleton2 = ThreadSafeEagerInitializationSingleton.getInstance();
		assertEquals(singleton1.hashCode(), singleton2.hashCode());

		ThreadSafeLazySingleton threadSafeLazySingleton1 = ThreadSafeLazySingleton.getInstance();
		ThreadSafeLazySingleton threadSafeLazySingleton2 = ThreadSafeLazySingleton.getInstance();
		assertEquals(threadSafeLazySingleton1.hashCode(), threadSafeLazySingleton2.hashCode());

		EnumSingleton enumSingleton1 = EnumSingleton.UNIQUE_INSTANCE;
		EnumSingleton enumSingleton2 = EnumSingleton.UNIQUE_INSTANCE;
		assertEquals(enumSingleton1.hashCode(), enumSingleton2.hashCode());

	}
}