/**
 * CronusServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cali.se.lu.ics.www;

public interface CronusServiceSoap extends java.rmi.Remote {
    public java.lang.String[] getKeys() throws java.rmi.RemoteException;
    public java.lang.String[] getIndexes() throws java.rmi.RemoteException;
    public java.lang.String[] getTableConstraints() throws java.rmi.RemoteException;
    public java.lang.String[] getTables() throws java.rmi.RemoteException;
    public java.lang.String[] getColumnsForEmployeeTable() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[] getIllestPerson() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getIllPersonsByYear(int startYear, int endYear) throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAndRelatives() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeData() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceData() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeData() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationData() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupData() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupData() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeMetadata() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceMetadata() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeMetadata() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationMetadata() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupMetadata() throws java.rmi.RemoteException;
    public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupMetadata() throws java.rmi.RemoteException;
}
