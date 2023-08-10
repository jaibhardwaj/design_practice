package dev.jaib.design.practice.lld.designpatterns.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote
{
	String sayHello() throws RemoteException;
}
