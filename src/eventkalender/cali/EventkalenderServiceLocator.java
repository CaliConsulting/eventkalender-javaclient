/**
 * EventkalenderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eventkalender.cali;

public class EventkalenderServiceLocator extends org.apache.axis.client.Service
		implements eventkalender.cali.EventkalenderService {

	public EventkalenderServiceLocator() {
	}

	public EventkalenderServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public EventkalenderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for EventkalenderServiceSoap12
	private java.lang.String EventkalenderServiceSoap12_address = "http://localhost/EventkalenderWS/EventkalenderService.asmx";

	public java.lang.String getEventkalenderServiceSoap12Address() {
		return EventkalenderServiceSoap12_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String EventkalenderServiceSoap12WSDDServiceName = "EventkalenderServiceSoap12";

	public java.lang.String getEventkalenderServiceSoap12WSDDServiceName() {
		return EventkalenderServiceSoap12WSDDServiceName;
	}

	public void setEventkalenderServiceSoap12WSDDServiceName(java.lang.String name) {
		EventkalenderServiceSoap12WSDDServiceName = name;
	}

	public eventkalender.cali.EventkalenderServiceSoap getEventkalenderServiceSoap12()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(EventkalenderServiceSoap12_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getEventkalenderServiceSoap12(endpoint);
	}

	public eventkalender.cali.EventkalenderServiceSoap getEventkalenderServiceSoap12(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			eventkalender.cali.EventkalenderServiceSoap12Stub _stub = new eventkalender.cali.EventkalenderServiceSoap12Stub(
					portAddress, this);
			_stub.setPortName(getEventkalenderServiceSoap12WSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setEventkalenderServiceSoap12EndpointAddress(java.lang.String address) {
		EventkalenderServiceSoap12_address = address;
	}

	// Use to get a proxy class for EventkalenderServiceSoap
	private java.lang.String EventkalenderServiceSoap_address = "http://localhost/EventkalenderWS/EventkalenderService.asmx";

	public java.lang.String getEventkalenderServiceSoapAddress() {
		return EventkalenderServiceSoap_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String EventkalenderServiceSoapWSDDServiceName = "EventkalenderServiceSoap";

	public java.lang.String getEventkalenderServiceSoapWSDDServiceName() {
		return EventkalenderServiceSoapWSDDServiceName;
	}

	public void setEventkalenderServiceSoapWSDDServiceName(java.lang.String name) {
		EventkalenderServiceSoapWSDDServiceName = name;
	}

	public eventkalender.cali.EventkalenderServiceSoap getEventkalenderServiceSoap()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(EventkalenderServiceSoap_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getEventkalenderServiceSoap(endpoint);
	}

	public eventkalender.cali.EventkalenderServiceSoap getEventkalenderServiceSoap(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			eventkalender.cali.EventkalenderServiceSoapStub _stub = new eventkalender.cali.EventkalenderServiceSoapStub(
					portAddress, this);
			_stub.setPortName(getEventkalenderServiceSoapWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setEventkalenderServiceSoapEndpointAddress(java.lang.String address) {
		EventkalenderServiceSoap_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown. This service
	 * has multiple ports for a given interface; the proxy implementation returned
	 * may be indeterminate.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (eventkalender.cali.EventkalenderServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
				eventkalender.cali.EventkalenderServiceSoap12Stub _stub = new eventkalender.cali.EventkalenderServiceSoap12Stub(
						new java.net.URL(EventkalenderServiceSoap12_address), this);
				_stub.setPortName(getEventkalenderServiceSoap12WSDDServiceName());
				return _stub;
			}
			if (eventkalender.cali.EventkalenderServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
				eventkalender.cali.EventkalenderServiceSoapStub _stub = new eventkalender.cali.EventkalenderServiceSoapStub(
						new java.net.URL(EventkalenderServiceSoap_address), this);
				_stub.setPortName(getEventkalenderServiceSoapWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("EventkalenderServiceSoap12".equals(inputPortName)) {
			return getEventkalenderServiceSoap12();
		} else if ("EventkalenderServiceSoap".equals(inputPortName)) {
			return getEventkalenderServiceSoap();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://cali.eventkalender/", "EventkalenderService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://cali.eventkalender/", "EventkalenderServiceSoap12"));
			ports.add(new javax.xml.namespace.QName("http://cali.eventkalender/", "EventkalenderServiceSoap"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {

		if ("EventkalenderServiceSoap12".equals(portName)) {
			setEventkalenderServiceSoap12EndpointAddress(address);
		} else if ("EventkalenderServiceSoap".equals(portName)) {
			setEventkalenderServiceSoapEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
