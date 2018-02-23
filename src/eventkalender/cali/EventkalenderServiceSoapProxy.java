package eventkalender.cali;

public class EventkalenderServiceSoapProxy implements eventkalender.cali.EventkalenderServiceSoap {
	private String _endpoint = null;
	private eventkalender.cali.EventkalenderServiceSoap eventkalenderServiceSoap = null;

	public EventkalenderServiceSoapProxy() {
		_initEventkalenderServiceSoapProxy();
	}

	public EventkalenderServiceSoapProxy(String endpoint) {
		_endpoint = endpoint;
		_initEventkalenderServiceSoapProxy();
	}

	private void _initEventkalenderServiceSoapProxy() {
		try {
			eventkalenderServiceSoap = (new eventkalender.cali.EventkalenderServiceLocator())
					.getEventkalenderServiceSoap();
			if (eventkalenderServiceSoap != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) eventkalenderServiceSoap)
							._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) eventkalenderServiceSoap)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (eventkalenderServiceSoap != null)
			((javax.xml.rpc.Stub) eventkalenderServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address",
					_endpoint);

	}

	public eventkalender.cali.EventkalenderServiceSoap getEventkalenderServiceSoap() {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		return eventkalenderServiceSoap;
	}

	public java.lang.String getFile(java.lang.String path) throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		return eventkalenderServiceSoap.getFile(path);
	}

	public void addFile(java.lang.String path, java.lang.String content) throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		eventkalenderServiceSoap.addFile(path, content);
	}

	public eventkalender.cali.Nation getNation(int id) throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		return eventkalenderServiceSoap.getNation(id);
	}

	public eventkalender.cali.Nation[] getNations() throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		return eventkalenderServiceSoap.getNations();
	}

	public void addNation(java.lang.String name) throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		eventkalenderServiceSoap.addNation(name);
	}

	public void addEvent(java.lang.String name, java.lang.String summary, java.util.Calendar startTime,
			java.util.Calendar endTime, int nationId) throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		eventkalenderServiceSoap.addEvent(name, summary, startTime, endTime, nationId);
	}

	public eventkalender.cali.Event getEvent(int id) throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		return eventkalenderServiceSoap.getEvent(id);
	}

	public eventkalender.cali.Event[] getEvents() throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		return eventkalenderServiceSoap.getEvents();
	}

	public void addPerson(java.lang.String firstName, java.lang.String lastName) throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		eventkalenderServiceSoap.addPerson(firstName, lastName);
	}

	public eventkalender.cali.Person getPerson(int id) throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		return eventkalenderServiceSoap.getPerson(id);
	}

	public eventkalender.cali.Person[] getPersons() throws java.rmi.RemoteException {
		if (eventkalenderServiceSoap == null)
			_initEventkalenderServiceSoapProxy();
		return eventkalenderServiceSoap.getPersons();
	}

}