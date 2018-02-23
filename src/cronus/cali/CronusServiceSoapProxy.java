package cronus.cali;

public class CronusServiceSoapProxy implements cronus.cali.CronusServiceSoap {
  private String _endpoint = null;
  private cronus.cali.CronusServiceSoap cronusServiceSoap = null;
  
  public CronusServiceSoapProxy() {
    _initCronusServiceSoapProxy();
  }
  
  public CronusServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCronusServiceSoapProxy();
  }
  
  private void _initCronusServiceSoapProxy() {
    try {
      cronusServiceSoap = (new cronus.cali.CronusServiceLocator()).getCronusServiceSoap();
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
  
  public cronus.cali.CronusServiceSoap getCronusServiceSoap() {
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap;
  }
  
  public void updateEmployee(java.lang.String no, java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    cronusServiceSoap.updateEmployee(no, firstName, lastName);
  }
  
  public cronus.cali.Employee getEmployee(java.lang.String no) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployee(no);
  }
  
  public cronus.cali.Employee[] getEmployees() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployees();
  }
  
  public void addEmployee(java.lang.String no, java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    cronusServiceSoap.addEmployee(no, firstName, lastName);
  }
  
  public void deleteEmployee(java.lang.String no) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    cronusServiceSoap.deleteEmployee(no);
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
  
  public cronus.cali.SerializableKeyValuePairOfStringString[] getIllestPerson() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getIllestPerson();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getIllPersonsByYear(int startYear, int endYear) throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getIllPersonsByYear(startYear, endYear);
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeAndRelatives() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeAndRelatives();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeData();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeAbsenceData();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeRelativeData();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeQualificationData();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeePortalSetupData();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupData() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeStatisticsGroupData();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeMetadata();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeAbsenceMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeAbsenceMetadata();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeRelativeMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeRelativeMetadata();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeQualificationMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeQualificationMetadata();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeePortalSetupMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeePortalSetupMetadata();
  }
  
  public cronus.cali.SerializableKeyValuePairOfStringString[][] getEmployeeStatisticsGroupMetadata() throws java.rmi.RemoteException{
    if (cronusServiceSoap == null)
      _initCronusServiceSoapProxy();
    return cronusServiceSoap.getEmployeeStatisticsGroupMetadata();
  }
  
  
}