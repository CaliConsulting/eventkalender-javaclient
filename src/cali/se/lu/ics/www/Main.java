package cali.se.lu.ics.www;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		EventkalenderServiceSoapProxy p = new EventkalenderServiceSoapProxy();
		
		System.out.println(p.getNation(1).getName());
		
	}

}
