/**
 * NotificationHeaderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class NotificationHeaderType  implements java.io.Serializable {
    private java.lang.String cai3GUser;

    private java.lang.String MOType;

    private com.ericsson.schemas.cai3g1_2.AnyMOIdType MOId;

    private java.lang.String notificationId;

    private java.util.Calendar eventTime;

    private org.apache.axis.types.URI notificationActor;

    private java.lang.String operation;

    private java.lang.String subscriptionId;

    private java.lang.String context;

    public NotificationHeaderType() {
    }

    public NotificationHeaderType(
           java.lang.String cai3GUser,
           java.lang.String MOType,
           com.ericsson.schemas.cai3g1_2.AnyMOIdType MOId,
           java.lang.String notificationId,
           java.util.Calendar eventTime,
           org.apache.axis.types.URI notificationActor,
           java.lang.String operation,
           java.lang.String subscriptionId,
           java.lang.String context) {
           this.cai3GUser = cai3GUser;
           this.MOType = MOType;
           this.MOId = MOId;
           this.notificationId = notificationId;
           this.eventTime = eventTime;
           this.notificationActor = notificationActor;
           this.operation = operation;
           this.subscriptionId = subscriptionId;
           this.context = context;
    }


    /**
     * Gets the cai3GUser value for this NotificationHeaderType.
     * 
     * @return cai3GUser
     */
    public java.lang.String getCai3GUser() {
        return cai3GUser;
    }


    /**
     * Sets the cai3GUser value for this NotificationHeaderType.
     * 
     * @param cai3GUser
     */
    public void setCai3GUser(java.lang.String cai3GUser) {
        this.cai3GUser = cai3GUser;
    }


    /**
     * Gets the MOType value for this NotificationHeaderType.
     * 
     * @return MOType
     */
    public java.lang.String getMOType() {
        return MOType;
    }


    /**
     * Sets the MOType value for this NotificationHeaderType.
     * 
     * @param MOType
     */
    public void setMOType(java.lang.String MOType) {
        this.MOType = MOType;
    }


    /**
     * Gets the MOId value for this NotificationHeaderType.
     * 
     * @return MOId
     */
    public com.ericsson.schemas.cai3g1_2.AnyMOIdType getMOId() {
        return MOId;
    }


    /**
     * Sets the MOId value for this NotificationHeaderType.
     * 
     * @param MOId
     */
    public void setMOId(com.ericsson.schemas.cai3g1_2.AnyMOIdType MOId) {
        this.MOId = MOId;
    }


    /**
     * Gets the notificationId value for this NotificationHeaderType.
     * 
     * @return notificationId
     */
    public java.lang.String getNotificationId() {
        return notificationId;
    }


    /**
     * Sets the notificationId value for this NotificationHeaderType.
     * 
     * @param notificationId
     */
    public void setNotificationId(java.lang.String notificationId) {
        this.notificationId = notificationId;
    }


    /**
     * Gets the eventTime value for this NotificationHeaderType.
     * 
     * @return eventTime
     */
    public java.util.Calendar getEventTime() {
        return eventTime;
    }


    /**
     * Sets the eventTime value for this NotificationHeaderType.
     * 
     * @param eventTime
     */
    public void setEventTime(java.util.Calendar eventTime) {
        this.eventTime = eventTime;
    }


    /**
     * Gets the notificationActor value for this NotificationHeaderType.
     * 
     * @return notificationActor
     */
    public org.apache.axis.types.URI getNotificationActor() {
        return notificationActor;
    }


    /**
     * Sets the notificationActor value for this NotificationHeaderType.
     * 
     * @param notificationActor
     */
    public void setNotificationActor(org.apache.axis.types.URI notificationActor) {
        this.notificationActor = notificationActor;
    }


    /**
     * Gets the operation value for this NotificationHeaderType.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this NotificationHeaderType.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the subscriptionId value for this NotificationHeaderType.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this NotificationHeaderType.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the context value for this NotificationHeaderType.
     * 
     * @return context
     */
    public java.lang.String getContext() {
        return context;
    }


    /**
     * Sets the context value for this NotificationHeaderType.
     * 
     * @param context
     */
    public void setContext(java.lang.String context) {
        this.context = context;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationHeaderType)) return false;
        NotificationHeaderType other = (NotificationHeaderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cai3GUser==null && other.getCai3GUser()==null) || 
             (this.cai3GUser!=null &&
              this.cai3GUser.equals(other.getCai3GUser()))) &&
            ((this.MOType==null && other.getMOType()==null) || 
             (this.MOType!=null &&
              this.MOType.equals(other.getMOType()))) &&
            ((this.MOId==null && other.getMOId()==null) || 
             (this.MOId!=null &&
              this.MOId.equals(other.getMOId()))) &&
            ((this.notificationId==null && other.getNotificationId()==null) || 
             (this.notificationId!=null &&
              this.notificationId.equals(other.getNotificationId()))) &&
            ((this.eventTime==null && other.getEventTime()==null) || 
             (this.eventTime!=null &&
              this.eventTime.equals(other.getEventTime()))) &&
            ((this.notificationActor==null && other.getNotificationActor()==null) || 
             (this.notificationActor!=null &&
              this.notificationActor.equals(other.getNotificationActor()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.context==null && other.getContext()==null) || 
             (this.context!=null &&
              this.context.equals(other.getContext())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCai3GUser() != null) {
            _hashCode += getCai3GUser().hashCode();
        }
        if (getMOType() != null) {
            _hashCode += getMOType().hashCode();
        }
        if (getMOId() != null) {
            _hashCode += getMOId().hashCode();
        }
        if (getNotificationId() != null) {
            _hashCode += getNotificationId().hashCode();
        }
        if (getEventTime() != null) {
            _hashCode += getEventTime().hashCode();
        }
        if (getNotificationActor() != null) {
            _hashCode += getNotificationActor().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getContext() != null) {
            _hashCode += getContext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationHeaderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationHeaderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cai3GUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "cai3gUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "AnyMOIdType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "notificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "eventTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationActor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "notificationActor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "subscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("context");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "Context"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
