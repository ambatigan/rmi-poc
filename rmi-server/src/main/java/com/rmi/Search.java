package com.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Search extends Remote {

	public String query(String input) throws RemoteException;
		
	
}
