package dev.jaib.design.practice.lld.designpatterns.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ProxyClient
{
	public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException
	{
		final MyRemote remote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
		System.out.println(remote.sayHello());
	}
}
