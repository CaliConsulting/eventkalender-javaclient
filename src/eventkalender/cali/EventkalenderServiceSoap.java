/**
 * EventkalenderServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eventkalender.cali;

public interface EventkalenderServiceSoap extends java.rmi.Remote {
	public java.lang.String getFile(java.lang.String path) throws java.rmi.RemoteException;

	public void addFile(java.lang.String path, java.lang.String content) throws java.rmi.RemoteException;

	public eventkalender.cali.Nation getNation(int id) throws java.rmi.RemoteException;

	public eventkalender.cali.Nation[] getNations() throws java.rmi.RemoteException;

	public void addNation(java.lang.String name) throws java.rmi.RemoteException;

	public void addEvent(java.lang.String name, java.lang.String summary, java.util.Calendar startTime,
			java.util.Calendar endTime, int nationId) throws java.rmi.RemoteException;

	public eventkalender.cali.Event getEvent(int id) throws java.rmi.RemoteException;

	public eventkalender.cali.Event[] getEvents() throws java.rmi.RemoteException;

	public void addPerson(java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException;

	public eventkalender.cali.Person getPerson(int id) throws java.rmi.RemoteException;

	public eventkalender.cali.Person[] getPersons() throws java.rmi.RemoteException;
}
