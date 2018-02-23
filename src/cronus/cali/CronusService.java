/**
 * CronusService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cronus.cali;

public interface CronusService extends javax.xml.rpc.Service {
    public java.lang.String getCronusServiceSoap12Address();

    public cronus.cali.CronusServiceSoap getCronusServiceSoap12() throws javax.xml.rpc.ServiceException;

    public cronus.cali.CronusServiceSoap getCronusServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getCronusServiceSoapAddress();

    public cronus.cali.CronusServiceSoap getCronusServiceSoap() throws javax.xml.rpc.ServiceException;

    public cronus.cali.CronusServiceSoap getCronusServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
