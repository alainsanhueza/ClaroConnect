
package com.ericsson.schemas.cai3g1;

import java.math.BigInteger;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Provisioning", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Provisioning {


    /**
     * 
     * @param parameters0
     * @param context
     * @param sessionId
     * @param parameters
     * @param sequenceId
     * @param transactionId
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Subscribe", action = "CAI3G#Subscribe")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CAI3G#Subscribe", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/SubscribeResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Subscribe/Fault/Cai3GFault_Exception")
    })
    public void subscribe(
        @WebParam(name = "Subscribe", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", partName = "parameters")
        Subscribe parameters,
        @WebParam(name = "SessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sessionId")
        Holder<String> sessionId,
        @WebParam(name = "TransactionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "transactionId")
        Holder<BigInteger> transactionId,
        @WebParam(name = "SequenceId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sequenceId")
        Holder<BigInteger> sequenceId,
        @WebParam(name = "Context", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "context")
        Holder<String> context,
        @WebParam(name = "SubscribeResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<SubscribeResponse> parameters0)
        throws Cai3GFaultException
    ;

    /**
     * 
     * @param parameters0
     * @param context
     * @param sessionId
     * @param parameters
     * @param sequenceId
     * @param transactionId
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Unsubscribe", action = "CAI3G#Unsubscribe")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CAI3G#Unsubscribe", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/UnsubscribeResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Unsubscribe/Fault/Cai3GFault_Exception")
    })
    public void unsubscribe(
        @WebParam(name = "Unsubscribe", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", partName = "parameters")
        Unsubscribe parameters,
        @WebParam(name = "SessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sessionId")
        Holder<String> sessionId,
        @WebParam(name = "TransactionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "transactionId")
        Holder<BigInteger> transactionId,
        @WebParam(name = "SequenceId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sequenceId")
        Holder<BigInteger> sequenceId,
        @WebParam(name = "Context", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "context")
        Holder<String> context,
        @WebParam(name = "UnsubscribeResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<UnsubscribeResponse> parameters0)
        throws Cai3GFaultException
    ;

    /**
     * 
     * @param baseSequenceId
     * @param sessionId
     * @param pwd
     * @param userId
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Login", action = "CAI3G#Login")
    @RequestWrapper(localName = "Login", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", className = "com.ericsson.schemas.cai3g1.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", className = "com.ericsson.schemas.cai3g1.LoginResponse")
    @Action(input = "CAI3G#Login", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/LoginResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Login/Fault/Cai3GFault_Exception")
    })
    public void login(
        @WebParam(name = "userId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/")
        String userId,
        @WebParam(name = "pwd", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/")
        String pwd,
        @WebParam(name = "sessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT)
        Holder<String> sessionId,
        @WebParam(name = "baseSequenceId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT)
        Holder<BigInteger> baseSequenceId)
        throws Cai3GFaultException
    ;

    /**
     * 
     * @param parameters0
     * @param sessionId
     * @param parameters
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Logout", action = "CAI3G#Logout")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CAI3G#Logout", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/LogoutResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Logout/Fault/Cai3GFault_Exception")
    })
    public void logout(
        @WebParam(name = "Logout", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", partName = "parameters")
        Logout parameters,
        @WebParam(name = "SessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sessionId")
        Holder<String> sessionId,
        @WebParam(name = "LogoutResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<LogoutResponse> parameters0)
        throws Cai3GFaultException
    ;

    /**
     * 
     * @param parameters0
     * @param context
     * @param sessionId
     * @param parameters
     * @param sequenceId
     * @param transactionId
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Get", action = "CAI3G#Get")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CAI3G#Get", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/GetResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Get/Fault/Cai3GFault_Exception")
    })
    public void get(
        @WebParam(name = "Get", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", partName = "parameters")
        Get parameters,
        @WebParam(name = "SessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sessionId")
        Holder<String> sessionId,
        @WebParam(name = "TransactionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "transactionId")
        Holder<BigInteger> transactionId,
        @WebParam(name = "SequenceId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sequenceId")
        Holder<BigInteger> sequenceId,
        @WebParam(name = "Context", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "context")
        Holder<String> context,
        @WebParam(name = "GetResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<GetResponse> parameters0)
        throws Cai3GFaultException
    ;

    /**
     * 
     * @param sourceIndicator
     * @param notificationData
     * @param additionalText
     * @param notificationHeader
     * @param correlatedNotifications
     */
    @WebMethod(operationName = "Notify", action = "CAI3G#Notify")
    @RequestWrapper(localName = "Notify", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", className = "com.ericsson.schemas.cai3g1.Notify")
    @ResponseWrapper(localName = "NotifyResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", className = "com.ericsson.schemas.cai3g1.NotifyResponse")
    @Action(input = "CAI3G#Notify", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/NotifyResponse")
    public void notify(
        @WebParam(name = "notificationHeader", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/")
        NotificationHeaderType notificationHeader,
        @WebParam(name = "correlatedNotifications", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/")
        List<String> correlatedNotifications,
        @WebParam(name = "additionalText", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/")
        String additionalText,
        @WebParam(name = "sourceIndicator", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/")
        String sourceIndicator,
        @WebParam(name = "notificationData", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/")
        com.ericsson.schemas.cai3g1.Notify.NotificationData notificationData);

    /**
     * 
     * @param parameters0
     * @param context
     * @param sessionId
     * @param parameters
     * @param sequenceId
     * @param transactionId
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Set", action = "CAI3G#Set")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CAI3G#Set", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/SetResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Set/Fault/Cai3GFault_Exception")
    })
    public void set(
        @WebParam(name = "Set", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", partName = "parameters")
        Set parameters,
        @WebParam(name = "SessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sessionId")
        Holder<String> sessionId,
        @WebParam(name = "TransactionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "transactionId")
        Holder<BigInteger> transactionId,
        @WebParam(name = "SequenceId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sequenceId")
        Holder<BigInteger> sequenceId,
        @WebParam(name = "Context", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "context")
        Holder<String> context,
        @WebParam(name = "SetResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<SetResponse> parameters0)
        throws Cai3GFaultException
    ;

    /**
     * 
     * @param parameters0
     * @param context
     * @param sessionId
     * @param parameters
     * @param sequenceId
     * @param transactionId
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Delete", action = "CAI3G#Delete")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CAI3G#Delete", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/DeleteResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Delete/Fault/Cai3GFault_Exception")
    })
    public void delete(
        @WebParam(name = "Delete", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", partName = "parameters")
        Delete parameters,
        @WebParam(name = "SessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sessionId")
        Holder<String> sessionId,
        @WebParam(name = "TransactionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "transactionId")
        Holder<BigInteger> transactionId,
        @WebParam(name = "SequenceId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sequenceId")
        Holder<BigInteger> sequenceId,
        @WebParam(name = "Context", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "context")
        Holder<String> context,
        @WebParam(name = "DeleteResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<DeleteResponse> parameters0)
        throws Cai3GFaultException
    ;

    /**
     * 
     * @param parameters0
     * @param context
     * @param sessionId
     * @param parameters
     * @param sequenceId
     * @param transactionId
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Create", action = "CAI3G#Create")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CAI3G#Create", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/CreateResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Create/Fault/Cai3GFault_Exception")
    })
    public void create(
        @WebParam(name = "Create", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", partName = "parameters")
        Create parameters,
        @WebParam(name = "SessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sessionId")
        Holder<String> sessionId,
        @WebParam(name = "TransactionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "transactionId")
        Holder<BigInteger> transactionId,
        @WebParam(name = "SequenceId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sequenceId")
        Holder<BigInteger> sequenceId,
        @WebParam(name = "Context", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "context")
        Holder<String> context,
        @WebParam(name = "CreateResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<CreateResponse> parameters0)
        throws Cai3GFaultException
    ;

    /**
     * 
     * @param parameters0
     * @param context
     * @param sessionId
     * @param parameters
     * @param sequenceId
     * @param transactionId
     * @throws Cai3GFaultException
     */
    @WebMethod(operationName = "Search", action = "CAI3G#Search")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CAI3G#Search", output = "http://schemas.ericsson.com/cai3g1.2/Provisioning/SearchResponse", fault = {
        @FaultAction(className = Cai3GFaultException.class, value = "http://schemas.ericsson.com/cai3g1.2/Provisioning/Search/Fault/Cai3GFault_Exception")
    })
    public void search(
        @WebParam(name = "Search", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", partName = "parameters")
        Search parameters,
        @WebParam(name = "SessionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sessionId")
        Holder<String> sessionId,
        @WebParam(name = "TransactionId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "transactionId")
        Holder<BigInteger> transactionId,
        @WebParam(name = "SequenceId", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "sequenceId")
        Holder<BigInteger> sequenceId,
        @WebParam(name = "Context", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", header = true, mode = WebParam.Mode.INOUT, partName = "context")
        Holder<String> context,
        @WebParam(name = "SearchResponse", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<SearchResponse> parameters0)
        throws Cai3GFaultException
    ;

}