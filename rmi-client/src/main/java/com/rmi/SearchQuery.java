package com.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SearchQuery extends UnicastRemoteObject implements Search {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SearchQuery() throws RemoteException {
		super(8000);
		// TODO Auto-generated constructor stub
	}

	public String query(String input) throws RemoteException {
		// TODO Auto-generated method stub
		return input+"! This is from server";
	}

}
