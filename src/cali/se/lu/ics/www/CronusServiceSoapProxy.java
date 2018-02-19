package cali.se.lu.ics.www;

public class CronusServiceSoapProxy implements cali.se.lu.ics.www.CronusServiceSoap {
  private String _endpoint = null;
  private cali.se.lu.ics.www.CronusServiceSoap cronusServiceSoap = null;
  
  public CronusServiceSoapProxy() {
    _initCronusServiceSoapProxy();
  }
  
  public CronusServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCronusServiceSoapProxy();
  }
  
  private void _initCronusServiceSoapProxy() {
    try {
      cronusServiceSoap = (new cali.se.lu.ics.www.CronusServiceLocator()).getCronusServiceSoap();
      if (cronusServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cronusServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cronusServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cronusServiceSoap != null)
      ((javax.xml.rpc.Stub)cronusServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cali.se.lu.ics.www.CronusServiceSoap getCronusServiceSoap() {
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap;
  }
  
  public java.lang.String[] getKeys() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getKeys();
  }
  
  public java.lang.String[] getIndexes() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getIndexes();
  }
  
  public java.lang.String[] getTableConstraints() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getTableConstraints();
  }
  
  public java.lang.String[] getTables() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getTables();
  }
  
  public java.lang.String[] getColumnsForEmployeeTable() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getColumnsForEmployeeTable();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[] getIllestPerson() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getIllestPerson();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getIllPersonsByYear(int startYear, int endYear) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getIllPersonsByYear(startYear, endYear);
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAndRelatives() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeAndRelatives();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeData();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeAbsenceData();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeRelativeData();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeQualificationData();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeePortalSetupData();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeStatisticsGroupData();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeMetadata();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeAbsenceMetadata();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeRelativeMetadata();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeQualificationMetadata();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeePortalSetupMetadata();
  }
  
  public cali.se.lu.ics.www.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeStatisticsGroupMetadata();
  }
  
  
}