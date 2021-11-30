/**
 * Cai3GImplPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class Cai3GImplPortBindingStub extends org.apache.axis.client.Stub implements com.ericsson.schemas.cai3g1_2.Provisioning {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Subscribe");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Subscribe"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Subscribe"), com.ericsson.schemas.cai3g1_2.Subscribe.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">SubscribeResponse"));
        oper.setReturnClass(com.ericsson.schemas.cai3g1_2.SubscribeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SubscribeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Unsubscribe");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Unsubscribe"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Unsubscribe"), com.ericsson.schemas.cai3g1_2.Unsubscribe.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">UnsubscribeResponse"));
        oper.setReturnClass(com.ericsson.schemas.cai3g1_2.UnsubscribeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "UnsubscribeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "pwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "sessionId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "baseSequenceId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"), org.apache.axis.types.UnsignedLong.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "LogoutResponse"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">LogoutResponse"), com.ericsson.schemas.cai3g1_2.LogoutResponse.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Get"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Get"), com.ericsson.schemas.cai3g1_2.Get.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">GetResponse"));
        oper.setReturnClass(com.ericsson.schemas.cai3g1_2.GetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "GetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Notify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "notificationHeader"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationHeaderType"), com.ericsson.schemas.cai3g1_2.NotificationHeaderType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "correlatedNotifications"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "additionalText"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "sourceIndicator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"), org.apache.axis.types.URI.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "notificationData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">>Notify>notificationData"), com.ericsson.schemas.cai3g1_2.NotifyNotificationData.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Set");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SetResponse"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">SetResponse"), com.ericsson.schemas.cai3g1_2.SetResponse.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "AnyMOIdType"), com.ericsson.schemas.cai3g1_2.AnyMOIdType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SetMODefinition"), com.ericsson.schemas.cai3g1_2.SetMODefinition.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "extension"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "AnySequenceType"), com.ericsson.schemas.cai3g1_2.AnySequenceType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Delete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Delete"), com.ericsson.schemas.cai3g1_2.Delete.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">DeleteResponse"));
        oper.setReturnClass(com.ericsson.schemas.cai3g1_2.DeleteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "DeleteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Create"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Create"), com.ericsson.schemas.cai3g1_2.Create.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">CreateResponse"));
        oper.setReturnClass(com.ericsson.schemas.cai3g1_2.CreateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "CreateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Search"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Search"), com.ericsson.schemas.cai3g1_2.Search.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"), java.math.BigInteger.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, true, true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">SearchResponse"));
        oper.setReturnClass(com.ericsson.schemas.cai3g1_2.SearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gFault"),
                      "com.ericsson.schemas.cai3g1_2.Cai3GFault",
                      new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    public Cai3GImplPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Cai3GImplPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Cai3GImplPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">>Cai3gFault>details");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Cai3GFaultDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">>Cai3gFault>faultreason");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "reasonText");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">>Notify>notificationData");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.NotifyNotificationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Cai3GFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Create");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Create.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">CreateResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.CreateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Delete");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Delete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">DeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.DeleteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Get");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Get.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">GetResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.GetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Login");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">LoginResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Logout");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Logout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">LogoutResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Notify");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Notify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">NotifyResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.NotifyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Search");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Search.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">SearchResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.SearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Set");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Set.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">SetResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.SetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Subscribe");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Subscribe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">SubscribeResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.SubscribeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Unsubscribe");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.Unsubscribe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">UnsubscribeResponse");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.UnsubscribeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "AnyMOIdType");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.AnyMOIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "AnySequenceType");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.AnySequenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "ContextFault");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.ContextFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "CreateMODefinition");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.CreateMODefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "DeleteRequestMODefinition");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.DeleteRequestMODefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "GetMODefinition");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.GetMODefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "GetRequestMODefinition");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.GetRequestMODefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "GetResponseMOAttributesType");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.GetResponseMOAttributesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "HeaderFaultType");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.HeaderFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationFiltersType");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.NotificationFilterType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationFilterType");
            qName2 = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "filter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationFilterType");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.NotificationFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationHeaderType");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.NotificationHeaderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationOperationType");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.NotificationOperationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SearchFiltersType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SearchFilterType");
            qName2 = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "filter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SearchFilterType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOAttributes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceIdFault");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.SequenceIdFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionIdFault");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.SessionIdFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SetMODefinition");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.SetMODefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionIdFault");
            cachedSerQNames.add(qName);
            cls = com.ericsson.schemas.cai3g1_2.TransactionIdFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.ericsson.schemas.cai3g1_2.SubscribeResponse subscribe(com.ericsson.schemas.cai3g1_2.Subscribe parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Subscribe");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Subscribe"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, sessionId.value, transactionId.value, sequenceId.value, context.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId")), java.math.BigInteger.class);
            }
            try {
                sequenceId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"));
            } catch (java.lang.Exception _exception) {
                sequenceId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId")), java.math.BigInteger.class);
            }
            try {
                context.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"));
            } catch (java.lang.Exception _exception) {
                context.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context")), java.lang.String.class);
            }
            try {
                return (com.ericsson.schemas.cai3g1_2.SubscribeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ericsson.schemas.cai3g1_2.SubscribeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ericsson.schemas.cai3g1_2.SubscribeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ericsson.schemas.cai3g1_2.UnsubscribeResponse unsubscribe(com.ericsson.schemas.cai3g1_2.Unsubscribe parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Unsubscribe");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Unsubscribe"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, sessionId.value, transactionId.value, sequenceId.value, context.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId")), java.math.BigInteger.class);
            }
            try {
                sequenceId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"));
            } catch (java.lang.Exception _exception) {
                sequenceId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId")), java.math.BigInteger.class);
            }
            try {
                context.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"));
            } catch (java.lang.Exception _exception) {
                context.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context")), java.lang.String.class);
            }
            try {
                return (com.ericsson.schemas.cai3g1_2.UnsubscribeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ericsson.schemas.cai3g1_2.UnsubscribeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ericsson.schemas.cai3g1_2.UnsubscribeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void login(java.lang.String userId, java.lang.String pwd, javax.xml.rpc.holders.StringHolder sessionId, org.apache.axis.holders.UnsignedLongHolder baseSequenceId) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, pwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "sessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "sessionId")), java.lang.String.class);
            }
            try {
                baseSequenceId.value = (org.apache.axis.types.UnsignedLong) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "baseSequenceId"));
            } catch (java.lang.Exception _exception) {
                baseSequenceId.value = (org.apache.axis.types.UnsignedLong) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "baseSequenceId")), org.apache.axis.types.UnsignedLong.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void logout(com.ericsson.schemas.cai3g1_2.holders.LogoutResponseHolder parameters, java.lang.String sessionId, javax.xml.rpc.holders.StringHolder sessionId2) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Logout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, sessionId2.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                parameters.value = (com.ericsson.schemas.cai3g1_2.LogoutResponse) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "LogoutResponse"));
            } catch (java.lang.Exception _exception) {
                parameters.value = (com.ericsson.schemas.cai3g1_2.LogoutResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "LogoutResponse")), com.ericsson.schemas.cai3g1_2.LogoutResponse.class);
            }
            try {
                sessionId2.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId2.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ericsson.schemas.cai3g1_2.GetResponse get(com.ericsson.schemas.cai3g1_2.Get parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Get");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, sessionId.value, transactionId.value, sequenceId.value, context.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId")), java.math.BigInteger.class);
            }
            try {
                sequenceId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"));
            } catch (java.lang.Exception _exception) {
                sequenceId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId")), java.math.BigInteger.class);
            }
            try {
                context.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"));
            } catch (java.lang.Exception _exception) {
                context.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context")), java.lang.String.class);
            }
            try {
                return (com.ericsson.schemas.cai3g1_2.GetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ericsson.schemas.cai3g1_2.GetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ericsson.schemas.cai3g1_2.GetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void notify(com.ericsson.schemas.cai3g1_2.NotificationHeaderType notificationHeader, java.lang.String[] correlatedNotifications, java.lang.String additionalText, org.apache.axis.types.URI sourceIndicator, com.ericsson.schemas.cai3g1_2.NotifyNotificationData notificationData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Notify");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Notify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {notificationHeader, correlatedNotifications, additionalText, sourceIndicator, notificationData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void set(com.ericsson.schemas.cai3g1_2.holders.SetResponseHolder parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context, java.lang.String MOType, com.ericsson.schemas.cai3g1_2.AnyMOIdType MOId, com.ericsson.schemas.cai3g1_2.SetMODefinition MOAttributes, com.ericsson.schemas.cai3g1_2.AnySequenceType extension) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Set");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Set"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId.value, transactionId.value, sequenceId.value, context.value, MOType, MOId, MOAttributes, extension});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                parameters.value = (com.ericsson.schemas.cai3g1_2.SetResponse) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SetResponse"));
            } catch (java.lang.Exception _exception) {
                parameters.value = (com.ericsson.schemas.cai3g1_2.SetResponse) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SetResponse")), com.ericsson.schemas.cai3g1_2.SetResponse.class);
            }
            try {
                sessionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId")), java.math.BigInteger.class);
            }
            try {
                sequenceId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"));
            } catch (java.lang.Exception _exception) {
                sequenceId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId")), java.math.BigInteger.class);
            }
            try {
                context.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"));
            } catch (java.lang.Exception _exception) {
                context.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ericsson.schemas.cai3g1_2.DeleteResponse delete(com.ericsson.schemas.cai3g1_2.Delete parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, sessionId.value, transactionId.value, sequenceId.value, context.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId")), java.math.BigInteger.class);
            }
            try {
                sequenceId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"));
            } catch (java.lang.Exception _exception) {
                sequenceId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId")), java.math.BigInteger.class);
            }
            try {
                context.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"));
            } catch (java.lang.Exception _exception) {
                context.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context")), java.lang.String.class);
            }
            try {
                return (com.ericsson.schemas.cai3g1_2.DeleteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ericsson.schemas.cai3g1_2.DeleteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ericsson.schemas.cai3g1_2.DeleteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ericsson.schemas.cai3g1_2.CreateResponse create(com.ericsson.schemas.cai3g1_2.Create parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, sessionId.value, transactionId.value, sequenceId.value, context.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId")), java.math.BigInteger.class);
            }
            try {
                sequenceId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"));
            } catch (java.lang.Exception _exception) {
                sequenceId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId")), java.math.BigInteger.class);
            }
            try {
                context.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"));
            } catch (java.lang.Exception _exception) {
                context.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context")), java.lang.String.class);
            }
            try {
                return (com.ericsson.schemas.cai3g1_2.CreateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ericsson.schemas.cai3g1_2.CreateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ericsson.schemas.cai3g1_2.CreateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ericsson.schemas.cai3g1_2.SearchResponse search(com.ericsson.schemas.cai3g1_2.Search parameters, javax.xml.rpc.holders.StringHolder sessionId, javax.xml.rpc.holders.BigIntegerHolder transactionId, javax.xml.rpc.holders.BigIntegerHolder sequenceId, javax.xml.rpc.holders.StringHolder context) throws java.rmi.RemoteException, com.ericsson.schemas.cai3g1_2.Cai3GFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("CAI3G#Search");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters, sessionId.value, transactionId.value, sequenceId.value, context.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                sessionId.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId"));
            } catch (java.lang.Exception _exception) {
                sessionId.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SessionId")), java.lang.String.class);
            }
            try {
                transactionId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId"));
            } catch (java.lang.Exception _exception) {
                transactionId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "TransactionId")), java.math.BigInteger.class);
            }
            try {
                sequenceId.value = (java.math.BigInteger) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId"));
            } catch (java.lang.Exception _exception) {
                sequenceId.value = (java.math.BigInteger) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SequenceId")), java.math.BigInteger.class);
            }
            try {
                context.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"));
            } catch (java.lang.Exception _exception) {
                context.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context")), java.lang.String.class);
            }
            try {
                return (com.ericsson.schemas.cai3g1_2.SearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ericsson.schemas.cai3g1_2.SearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.ericsson.schemas.cai3g1_2.SearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ericsson.schemas.cai3g1_2.Cai3GFault) {
              throw (com.ericsson.schemas.cai3g1_2.Cai3GFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
