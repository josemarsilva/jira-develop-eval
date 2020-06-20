package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoProxy implements com.peregrine.servicecenter.PWS.RequestForChangePadrao_PortType {
  private String _endpoint = null;
  private com.peregrine.servicecenter.PWS.RequestForChangePadrao_PortType requestForChangePadrao_PortType = null;
  
  public RequestForChangePadraoProxy() {
    _initRequestForChangePadraoProxy();
  }
  
  public RequestForChangePadraoProxy(String endpoint) {
    _endpoint = endpoint;
    _initRequestForChangePadraoProxy();
  }
  
  private void _initRequestForChangePadraoProxy() {
    try {
      requestForChangePadrao_PortType = (new com.peregrine.servicecenter.PWS.RequestForChangePadrao_ServiceLocator()).getRequestForChangePadrao();
      if (requestForChangePadrao_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)requestForChangePadrao_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)requestForChangePadrao_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (requestForChangePadrao_PortType != null)
      ((javax.xml.rpc.Stub)requestForChangePadrao_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.peregrine.servicecenter.PWS.RequestForChangePadrao_PortType getRequestForChangePadrao_PortType() {
    if (requestForChangePadrao_PortType == null)
      _initRequestForChangePadraoProxy();
    return requestForChangePadrao_PortType;
  }
  
  public com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoResponse retrieveRequestForChangePadrao(com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoRequest retrieveRequestForChangePadraoRequest) throws java.rmi.RemoteException{
    if (requestForChangePadrao_PortType == null)
      _initRequestForChangePadraoProxy();
    return requestForChangePadrao_PortType.retrieveRequestForChangePadrao(retrieveRequestForChangePadraoRequest);
  }
  
  public com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListResponse retrieveRequestForChangePadraoKeysList(com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListRequest retrieveRequestForChangePadraoKeysListRequest) throws java.rmi.RemoteException{
    if (requestForChangePadrao_PortType == null)
      _initRequestForChangePadraoProxy();
    return requestForChangePadrao_PortType.retrieveRequestForChangePadraoKeysList(retrieveRequestForChangePadraoKeysListRequest);
  }
  
  public com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoListResponse retrieveRequestForChangePadraoList(com.peregrine.servicecenter.PWS.RequestForChangePadraoKeysType[] retrieveRequestForChangePadraoListRequest) throws java.rmi.RemoteException{
    if (requestForChangePadrao_PortType == null)
      _initRequestForChangePadraoProxy();
    return requestForChangePadrao_PortType.retrieveRequestForChangePadraoList(retrieveRequestForChangePadraoListRequest);
  }
  
  public com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoResponse updateRequestForChangePadrao(com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoRequest updateRequestForChangePadraoRequest) throws java.rmi.RemoteException{
    if (requestForChangePadrao_PortType == null)
      _initRequestForChangePadraoProxy();
    return requestForChangePadrao_PortType.updateRequestForChangePadrao(updateRequestForChangePadraoRequest);
  }
  
  public com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoResponse submeterSolicitanteRequestForChangePadrao(com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoRequest submeterSolicitanteRequestForChangePadraoRequest) throws java.rmi.RemoteException{
    if (requestForChangePadrao_PortType == null)
      _initRequestForChangePadraoProxy();
    return requestForChangePadrao_PortType.submeterSolicitanteRequestForChangePadrao(submeterSolicitanteRequestForChangePadraoRequest);
  }
  
  public com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoResponse createRequestForChangePadrao(com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoRequest createRequestForChangePadraoRequest) throws java.rmi.RemoteException{
    if (requestForChangePadrao_PortType == null)
      _initRequestForChangePadraoProxy();
    return requestForChangePadrao_PortType.createRequestForChangePadrao(createRequestForChangePadraoRequest);
  }
  
  public com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoResponse submeterGmudRequestForChangePadrao(com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoRequest submeterGmudRequestForChangePadraoRequest) throws java.rmi.RemoteException{
    if (requestForChangePadrao_PortType == null)
      _initRequestForChangePadraoProxy();
    return requestForChangePadrao_PortType.submeterGmudRequestForChangePadrao(submeterGmudRequestForChangePadraoRequest);
  }
  
  
}