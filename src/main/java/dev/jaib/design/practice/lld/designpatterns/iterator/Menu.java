package dev.jaib.design.practice.lld.designpatterns.iterator;

import java.util.Iterator;

public interface Menu
{
	Iterator<MenuItem> createIterator();
}
