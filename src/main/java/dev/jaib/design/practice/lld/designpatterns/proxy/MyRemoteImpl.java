package dev.jaib.design.practice.lld.designpatterns.proxy;

import java.io.Serial;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote
{
	@Serial
	private static final long serialVersionUID = 1L;
	protected MyRemoteImpl() throws RemoteException
	{
	}

	@Override
	public String sayHello() throws RemoteException
	{
		return "Hello from RMI !";
	}

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException
	{
		MyRemoteImpl remote = new MyRemoteImpl();
		Naming.bind("RemoteHello", remote);
	}
}
