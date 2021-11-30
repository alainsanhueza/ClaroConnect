/**
 * CAI3G12Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class CAI3G12Locator extends org.apache.axis.client.Service implements com.ericsson.schemas.cai3g1_2.CAI3G12 {

    public CAI3G12Locator() {
    }


    public CAI3G12Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CAI3G12Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Cai3gImplPort
    private java.lang.String Cai3gImplPort_address = "http://172.30.39.14:8080/CAI3G1.2/services/CAI3G1.2";

    public java.lang.String getCai3gImplPortAddress() {
        return Cai3gImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Cai3gImplPortWSDDServiceName = "Cai3gImplPort";

    public java.lang.String getCai3gImplPortWSDDServiceName() {
        return Cai3gImplPortWSDDServiceName;
    }

    public void setCai3gImplPortWSDDServiceName(java.lang.String name) {
        Cai3gImplPortWSDDServiceName = name;
    }

    public com.ericsson.schemas.cai3g1_2.Provisioning getCai3gImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Cai3gImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCai3gImplPort(endpoint);
    }

    public com.ericsson.schemas.cai3g1_2.Provisioning getCai3gImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ericsson.schemas.cai3g1_2.Cai3GImplPortBindingStub _stub = new com.ericsson.schemas.cai3g1_2.Cai3GImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCai3gImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCai3gImplPortEndpointAddress(java.lang.String address) {
        Cai3gImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ericsson.schemas.cai3g1_2.Provisioning.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ericsson.schemas.cai3g1_2.Cai3GImplPortBindingStub _stub = new com.ericsson.schemas.cai3g1_2.Cai3GImplPortBindingStub(new java.net.URL(Cai3gImplPort_address), this);
                _stub.setPortName(getCai3gImplPortWSDDServiceName());
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
        if ("Cai3gImplPort".equals(inputPortName)) {
            return getCai3gImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "CAI3G1.2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Cai3gImplPort".equals(portName)) {
            setCai3gImplPortEndpointAddress(address);
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
