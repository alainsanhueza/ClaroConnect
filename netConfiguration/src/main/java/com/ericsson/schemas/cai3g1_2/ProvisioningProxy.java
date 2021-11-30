package com.ericsson.schemas.cai3g1_2;

public class ProvisioningProxy implements com.ericsson.schemas.cai3g1_2.Provisioning {
  private String _endpoint = null;
  private com.ericsson.schemas.cai3g1_2.Provisioning provisioning = null;
  
  public ProvisioningProxy() {
    _initProvisioningProxy();
  }
  
  public ProvisioningProxy(String endpoint) {
    _endpoint = endpoint;
    _initProvisioningProxy();
  }
  
  private void _initProvisioningProxy() {
    try {
      provisioning = (new com.ericsson.schemas.cai3g1_2.CAI3G12Locator()).getCai3gImplPort();
      if (provisioning != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)provisioning)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)provisioning)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (provisioning != null)
      ((javax.xml.rpc.Stub)provisioning)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ericsson.schemas.cai3g1_2.Provisioning getProvisioning() {
    if (provisioning == null)
      _initProvisioningProxy();
    return provisioning;
  }
  
  public com.ericsson.schemas.cai3g1_2.SubscribeResponse subscribe(com.ericsson.schemas.cai3g1_2.Subscribe parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    return provisioning.subscribe(parameters, sessionId, transactionId, sequenceId, context);
  }
  
  public com.ericsson.schemas.cai3g1_2.UnsubscribeResponse unsubscribe(com.ericsson.schemas.cai3g1_2.Unsubscribe parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    return provisioning.unsubscribe(parameters, sessionId, transactionId, sequenceId, context);
  }
  
  public void login(java.lang.String userId, java.lang.String pwd, javax.xml.rpc.holders.StringHolder sessionId, org.apache.axis.holders.UnsignedLongHolder baseSequenceId) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    provisioning.login(userId, pwd, sessionId, baseSequenceId);
  }
  
  public void logout(com.ericsson.schemas.cai3g1_2.holders.LogoutResponseHolder parameters, java.lang.String sessionId, javax.xml.rpc.holders.StringHolder sessionId2) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    provisioning.logout(parameters, sessionId, sessionId2);
  }
  
  public com.ericsson.schemas.cai3g1_2.GetResponse get(com.ericsson.schemas.cai3g1_2.Get parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    return provisioning.get(parameters, sessionId, transactionId, sequenceId, context);
  }
  
  public void notify(com.ericsson.schemas.cai3g1_2.NotificationHeaderType notificationHeader, java.lang.String[] correlatedNotifications, java.lang.String additionalText, org.apache.axis.types.URI sourceIndicator, com.ericsson.schemas.cai3g1_2.NotifyNotificationData notificationData) throws java.rmi.RemoteException{
    if (provisioning == null)
      _initProvisioningProxy();
    provisioning.notify(notificationHeader, correlatedNotifications, additionalText, sourceIndicator, notificationData);
  }
  
  public void set(com.ericsson.schemas.cai3g1_2.holders.SetResponseHolder parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context, java.lang.String MOType, com.ericsson.schemas.cai3g1_2.AnyMOIdType MOId, com.ericsson.schemas.cai3g1_2.SetMODefinition MOAttributes, com.ericsson.schemas.cai3g1_2.AnySequenceType extension) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    provisioning.set(parameters, sessionId, transactionId, sequenceId, context, MOType, MOId, MOAttributes, extension);
  }
  
  public com.ericsson.schemas.cai3g1_2.DeleteResponse delete(com.ericsson.schemas.cai3g1_2.Delete parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    return provisioning.delete(parameters, sessionId, transactionId, sequenceId, context);
  }
  
  public com.ericsson.schemas.cai3g1_2.CreateResponse create(com.ericsson.schemas.cai3g1_2.Create parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    return provisioning.create(parameters, sessionId, transactionId, sequenceId, context);
  }
  
  public com.ericsson.schemas.cai3g1_2.SearchResponse search(com.ericsson.schemas.cai3g1_2.Search parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault{
    if (provisioning == null)
      _initProvisioningProxy();
    return provisioning.search(parameters, sessionId, transactionId, sequenceId, context);
  }
  
  
}