/**


 * CronusServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cronus.cali;

public interface CronusServiceSoap extends java.rmi.Remote {
	public void updateEmployee(java.lang.String no, java.lang.String firstName, java.lang.String lastName)
			throws java.rmi.RemoteException;

	public cronus.cali.Employee getEmployee(java.lang.String no) throws java.rmi.RemoteException;

	public cronus.cali.Employee[] getEmployees() throws java.rmi.RemoteException;

	public void addEmployee(java.lang.String no, java.lang.String firstName, java.lang.String lastName)
			throws java.rmi.RemoteException;

	public void deleteEmployee(java.lang.String no) throws java.rmi.RemoteException;

	public java.lang.String[] getKeys() throws java.rmi.RemoteException;

	public java.lang.String[] getIndexes() throws java.rmi.RemoteException;

	public java.lang.String[] getTableConstraints() throws java.rmi.RemoteException;

	public java.lang.String[] getTables() throws java.rmi.RemoteException;

	public java.lang.String[] getColumnsForEmployeeTable() throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[] getIllestPerson() throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getIllPersonsByYear(int startYear, int endYear)
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeAndRelatives()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeData() throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceData()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeData()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationData()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupData()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupData()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeMetadata() throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceMetadata()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeMetadata()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationMetadata()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupMetadata()
			throws java.rmi.RemoteException;

	public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupMetadata()
			throws java.rmi.RemoteException;
}
