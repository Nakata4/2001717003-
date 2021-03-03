/**
 * Selenium1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Selenium;

public class Selenium1ServiceLocator extends org.apache.axis.client.Service implements Selenium.Selenium1Service {

    public Selenium1ServiceLocator() {
    }


    public Selenium1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Selenium1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Selenium1
    private java.lang.String Selenium1_address = "http://localhost:8005/A4/services/Selenium1";

    public java.lang.String getSelenium1Address() {
        return Selenium1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Selenium1WSDDServiceName = "Selenium1";

    public java.lang.String getSelenium1WSDDServiceName() {
        return Selenium1WSDDServiceName;
    }

    public void setSelenium1WSDDServiceName(java.lang.String name) {
        Selenium1WSDDServiceName = name;
    }

    public Selenium.Selenium1 getSelenium1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Selenium1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSelenium1(endpoint);
    }

    public Selenium.Selenium1 getSelenium1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Selenium.Selenium1SoapBindingStub _stub = new Selenium.Selenium1SoapBindingStub(portAddress, this);
            _stub.setPortName(getSelenium1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSelenium1EndpointAddress(java.lang.String address) {
        Selenium1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Selenium.Selenium1.class.isAssignableFrom(serviceEndpointInterface)) {
                Selenium.Selenium1SoapBindingStub _stub = new Selenium.Selenium1SoapBindingStub(new java.net.URL(Selenium1_address), this);
                _stub.setPortName(getSelenium1WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Selenium1".equals(inputPortName)) {
            return getSelenium1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Selenium", "Selenium1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Selenium", "Selenium1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Selenium1".equals(portName)) {
            setSelenium1EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
