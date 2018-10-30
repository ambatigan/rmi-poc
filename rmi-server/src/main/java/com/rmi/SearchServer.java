package com.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RMISocketFactory;

public class SearchServer {

	public static void main(String[] args) {
		try {
			if (args.length == 1) {
				Search obj = new SearchQuery();
				LocateRegistry.createRegistry(1099);
				//rmi.createServerSocket(0);
				RMISocketFactory.setSocketFactory(new MyRMISocketFactory());	
				//Naming.rebind(serverObjectName, obj);
				Naming.rebind("rmi://" + args[0] + ":" + 1099 + "/hello", obj);
				//MyRMISocketFactory rmi = new MyRMISocketFactory();
				//rmi.createServerSocket(0);
				System.out.println("Server has been Started....");
			} else {
				System.out.println("Please Provide severip as 1st argument  EX: 0.0.0.0");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
