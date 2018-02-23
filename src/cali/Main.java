package cali;

import java.rmi.RemoteException;

import javax.swing.table.TableModel;

import cali.utility.Utility;
import cronus.cali.CronusServiceSoapProxy;
import cronus.cali.SerializableKeyValuePairOfStringString;
import eventkalender.cali.EventkalenderServiceSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		EventkalenderServiceSoapProxy eventProxy = new EventkalenderServiceSoapProxy();
		CronusServiceSoapProxy cronusProxy = new CronusServiceSoapProxy();

		SerializableKeyValuePairOfStringString[][] s1 = cronusProxy.getEmployeeQualificationData();

		TableModel t = Utility.getData(s1);

	}

}
