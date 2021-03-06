/**
 * CronusServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cronus.cali;

public class CronusServiceLocator extends org.apache.axis.client.Service implements cronus.cali.CronusService {

	public CronusServiceLocator() {
	}

	public CronusServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public CronusServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for CronusServiceSoap12
	private java.lang.String CronusServiceSoap12_address = "http://localhost/EventkalenderWS/CronusService.asmx";

	public java.lang.String getCronusServiceSoap12Address() {
		return CronusServiceSoap12_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String CronusServiceSoap12WSDDServiceName = "CronusServiceSoap12";

	public java.lang.String getCronusServiceSoap12WSDDServiceName() {
		return CronusServiceSoap12WSDDServiceName;
	}

	public void setCronusServiceSoap12WSDDServiceName(java.lang.String name) {
		CronusServiceSoap12WSDDServiceName = name;
	}

	public cronus.cali.CronusServiceSoap getCronusServiceSoap12() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(CronusServiceSoap12_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getCronusServiceSoap12(endpoint);
	}

	public cronus.cali.CronusServiceSoap getCronusServiceSoap12(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			cronus.cali.CronusServiceSoap12Stub _stub = new cronus.cali.CronusServiceSoap12Stub(portAddress, this);
			_stub.setPortName(getCronusServiceSoap12WSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setCronusServiceSoap12EndpointAddress(java.lang.String address) {
		CronusServiceSoap12_address = address;
	}

	// Use to get a proxy class for CronusServiceSoap
	private java.lang.String CronusServiceSoap_address = "http://localhost/EventkalenderWS/CronusService.asmx";

	public java.lang.String getCronusServiceSoapAddress() {
		return CronusServiceSoap_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String CronusServiceSoapWSDDServiceName = "CronusServiceSoap";

	public java.lang.String getCronusServiceSoapWSDDServiceName() {
		return CronusServiceSoapWSDDServiceName;
	}

	public void setCronusServiceSoapWSDDServiceName(java.lang.String name) {
		CronusServiceSoapWSDDServiceName = name;
	}

	public cronus.cali.CronusServiceSoap getCronusServiceSoap() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(CronusServiceSoap_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getCronusServiceSoap(endpoint);
	}

	public cronus.cali.CronusServiceSoap getCronusServiceSoap(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			cronus.cali.CronusServiceSoapStub _stub = new cronus.cali.CronusServiceSoapStub(portAddress, this);
			_stub.setPortName(getCronusServiceSoapWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setCronusServiceSoapEndpointAddress(java.lang.String address) {
		CronusServiceSoap_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown. This service
	 * has multiple ports for a given interface; the proxy implementation returned
	 * may be indeterminate.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (cronus.cali.CronusServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
				cronus.cali.CronusServiceSoap12Stub _stub = new cronus.cali.CronusServiceSoap12Stub(
						new java.net.URL(CronusServiceSoap12_address), this);
				_stub.setPortName(getCronusServiceSoap12WSDDServiceName());
				return _stub;
			}
			if (cronus.cali.CronusServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
				cronus.cali.CronusServiceSoapStub _stub = new cronus.cali.CronusServiceSoapStub(
						new java.net.URL(CronusServiceSoap_address), this);
				_stub.setPortName(getCronusServiceSoapWSDDServiceName());
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
		if ("CronusServiceSoap12".equals(inputPortName)) {
			return getCronusServiceSoap12();
		} else if ("CronusServiceSoap".equals(inputPortName)) {
			return getCronusServiceSoap();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://cali.cronus/", "CronusService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://cali.cronus/", "CronusServiceSoap12"));
			ports.add(new javax.xml.namespace.QName("http://cali.cronus/", "CronusServiceSoap"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {

		if ("CronusServiceSoap12".equals(portName)) {
			setCronusServiceSoap12EndpointAddress(address);
		} else if ("CronusServiceSoap".equals(portName)) {
			setCronusServiceSoapEndpointAddress(address);
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
