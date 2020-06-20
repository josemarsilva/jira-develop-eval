/**
 * RequestForChangePadrao_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadrao_ServiceLocator extends org.apache.axis.client.Service implements com.peregrine.servicecenter.PWS.RequestForChangePadrao_Service {

    public RequestForChangePadrao_ServiceLocator() {
    }


    public RequestForChangePadrao_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RequestForChangePadrao_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RequestForChangePadrao
    private java.lang.String RequestForChangePadrao_address = "http://MZ-CW-AP-563.corp.bradesco.com.br:13095/sc62server/ws";

    public java.lang.String getRequestForChangePadraoAddress() {
        return RequestForChangePadrao_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RequestForChangePadraoWSDDServiceName = "RequestForChangePadrao";

    public java.lang.String getRequestForChangePadraoWSDDServiceName() {
        return RequestForChangePadraoWSDDServiceName;
    }

    public void setRequestForChangePadraoWSDDServiceName(java.lang.String name) {
        RequestForChangePadraoWSDDServiceName = name;
    }

    public com.peregrine.servicecenter.PWS.RequestForChangePadrao_PortType getRequestForChangePadrao() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RequestForChangePadrao_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRequestForChangePadrao(endpoint);
    }

    public com.peregrine.servicecenter.PWS.RequestForChangePadrao_PortType getRequestForChangePadrao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.peregrine.servicecenter.PWS.RequestForChangePadrao_BindingStub _stub = new com.peregrine.servicecenter.PWS.RequestForChangePadrao_BindingStub(portAddress, this);
            _stub.setPortName(getRequestForChangePadraoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRequestForChangePadraoEndpointAddress(java.lang.String address) {
        RequestForChangePadrao_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.peregrine.servicecenter.PWS.RequestForChangePadrao_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.peregrine.servicecenter.PWS.RequestForChangePadrao_BindingStub _stub = new com.peregrine.servicecenter.PWS.RequestForChangePadrao_BindingStub(new java.net.URL(RequestForChangePadrao_address), this);
                _stub.setPortName(getRequestForChangePadraoWSDDServiceName());
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
        if ("RequestForChangePadrao".equals(inputPortName)) {
            return getRequestForChangePadrao();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RequestForChangePadrao");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RequestForChangePadrao"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RequestForChangePadrao".equals(portName)) {
            setRequestForChangePadraoEndpointAddress(address);
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
