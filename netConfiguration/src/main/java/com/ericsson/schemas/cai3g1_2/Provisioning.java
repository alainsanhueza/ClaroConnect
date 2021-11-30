/**
 * Provisioning.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public interface Provisioning extends java.rmi.Remote {
    public com.ericsson.schemas.cai3g1_2.SubscribeResponse subscribe(com.ericsson.schemas.cai3g1_2.Subscribe parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
    public com.ericsson.schemas.cai3g1_2.UnsubscribeResponse unsubscribe(com.ericsson.schemas.cai3g1_2.Unsubscribe parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
    public void login(java.lang.String userId, java.lang.String pwd, javax.xml.rpc.holders.StringHolder sessionId, org.apache.axis.holders.UnsignedLongHolder baseSequenceId) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
    public void logout(com.ericsson.schemas.cai3g1_2.holders.LogoutResponseHolder parameters, java.lang.String sessionId, javax.xml.rpc.holders.StringHolder sessionId2) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
    public com.ericsson.schemas.cai3g1_2.GetResponse get(com.ericsson.schemas.cai3g1_2.Get parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
    public void notify(com.ericsson.schemas.cai3g1_2.NotificationHeaderType notificationHeader, java.lang.String[] correlatedNotifications, java.lang.String additionalText, org.apache.axis.types.URI sourceIndicator, com.ericsson.schemas.cai3g1_2.NotifyNotificationData notificationData) throws java.rmi.RemoteException;
    public void set(com.ericsson.schemas.cai3g1_2.holders.SetResponseHolder parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context, java.lang.String MOType, com.ericsson.schemas.cai3g1_2.AnyMOIdType MOId, com.ericsson.schemas.cai3g1_2.SetMODefinition MOAttributes, com.ericsson.schemas.cai3g1_2.AnySequenceType extension) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
    public com.ericsson.schemas.cai3g1_2.DeleteResponse delete(com.ericsson.schemas.cai3g1_2.Delete parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
    public com.ericsson.schemas.cai3g1_2.CreateResponse create(com.ericsson.schemas.cai3g1_2.Create parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
    public com.ericsson.schemas.cai3g1_2.SearchResponse search(com.ericsson.schemas.cai3g1_2.Search parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault;
}
