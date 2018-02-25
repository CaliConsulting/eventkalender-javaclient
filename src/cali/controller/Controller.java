package cali.controller;

import java.rmi.RemoteException;

import cronus.cali.CronusServiceSoapProxy;
import cronus.cali.SerializableKeyValuePairOfStringString;
import eventkalender.cali.Event;
import eventkalender.cali.EventkalenderServiceSoapProxy;
import eventkalender.cali.Nation;
import eventkalender.cali.Person;

public class Controller {

	private CronusServiceSoapProxy cronusProxy;
	private EventkalenderServiceSoapProxy eventProxy;

	public Controller() {
		cronusProxy = new CronusServiceSoapProxy();
		eventProxy = new EventkalenderServiceSoapProxy();
	}

	public Event getEvent(int id) throws RemoteException {
		return eventProxy.getEvent(id);
	}

	public Event[] getEvents() throws RemoteException {
		return eventProxy.getEvents();
	}

	public Nation getNation(int id) throws RemoteException {
		return eventProxy.getNation(id);
	}

	public Nation[] getNations() throws RemoteException {
		return eventProxy.getNations();
	}

	public Person getPerson(int id) throws RemoteException {
		return eventProxy.getPerson(id);
	}

	public Person[] getPersons() throws RemoteException {
		return eventProxy.getPersons();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeData() throws RemoteException {
		return cronusProxy.getEmployeeData();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupData() throws RemoteException {
		return cronusProxy.getEmployeeStatisticsGroupData();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeRelativeData() throws RemoteException {
		return cronusProxy.getEmployeeRelativeData();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeQualificationData() throws RemoteException {
		return cronusProxy.getEmployeeQualificationData();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceData() throws RemoteException {
		return cronusProxy.getEmployeeAbsenceData();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupData() throws RemoteException {
		return cronusProxy.getEmployeePortalSetupData();
	}

	public SerializableKeyValuePairOfStringString[][] getIllPersonsByYear(int startYear, int endYear)
			throws RemoteException {
		return cronusProxy.getIllPersonsByYear(startYear, endYear);
	}

	public SerializableKeyValuePairOfStringString[] getIllestPerson() throws RemoteException {
		return cronusProxy.getIllestPerson();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeMetadata() throws RemoteException {
		return cronusProxy.getEmployeeMetadata();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupMetadata() throws RemoteException {
		return cronusProxy.getEmployeeStatisticsGroupMetadata();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeRelativeMetadata() throws RemoteException {
		return cronusProxy.getEmployeeRelativeMetadata();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeQualificationMetadata() throws RemoteException {
		return cronusProxy.getEmployeeQualificationMetadata();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceMetadata() throws RemoteException {
		return cronusProxy.getEmployeeAbsenceMetadata();
	}

	public SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupMetadata() throws RemoteException {
		return cronusProxy.getEmployeePortalSetupMetadata();
	}

	public String[] getTables() throws RemoteException {
		return cronusProxy.getTables();
	}

	public String[] getTableConstraints() throws RemoteException {
		return cronusProxy.getTables();
	}

	public String[] getColumnsForEmployeeTable() throws RemoteException {
		return cronusProxy.getTables();
	}

	public String[] getIndexes() throws RemoteException {
		return cronusProxy.getTables();
	}

	public String[] getKeys() throws RemoteException {
		return cronusProxy.getTables();
	}

}
