package com.rmi;

import java.rmi.Naming;

public class ClientRequest {

	public static void main(String[] args) {

		try {
			if (args.length == 2) {
				Search access = (Search) Naming.lookup("rmi://"+args[0]+":"+1099+"/hello");
				System.out.println(access.query(args[1]));
			}
			else
			{
				System.out.println("Please Provide two arguments Server-ip and message");
				System.out.println("Ex: 0.0.0.0 hello");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
