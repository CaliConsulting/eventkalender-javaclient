package cali.controller;

import java.rmi.RemoteException;

import cronus.cali.CronusServiceSoapProxy;
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

}
