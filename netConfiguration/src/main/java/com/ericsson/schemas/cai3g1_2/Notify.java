/**
 * Notify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class Notify  implements java.io.Serializable {
    private com.ericsson.schemas.cai3g1_2.NotificationHeaderType notificationHeader;

    private java.lang.String[] correlatedNotifications;

    private java.lang.String additionalText;

    private org.apache.axis.types.URI sourceIndicator;

    private com.ericsson.schemas.cai3g1_2.NotifyNotificationData notificationData;

    public Notify() {
    }

    public Notify(
           com.ericsson.schemas.cai3g1_2.NotificationHeaderType notificationHeader,
           java.lang.String[] correlatedNotifications,
           java.lang.String additionalText,
           org.apache.axis.types.URI sourceIndicator,
           com.ericsson.schemas.cai3g1_2.NotifyNotificationData notificationData) {
           this.notificationHeader = notificationHeader;
           this.correlatedNotifications = correlatedNotifications;
           this.additionalText = additionalText;
           this.sourceIndicator = sourceIndicator;
           this.notificationData = notificationData;
    }


    /**
     * Gets the notificationHeader value for this Notify.
     * 
     * @return notificationHeader
     */
    public com.ericsson.schemas.cai3g1_2.NotificationHeaderType getNotificationHeader() {
        return notificationHeader;
    }


    /**
     * Sets the notificationHeader value for this Notify.
     * 
     * @param notificationHeader
     */
    public void setNotificationHeader(com.ericsson.schemas.cai3g1_2.NotificationHeaderType notificationHeader) {
        this.notificationHeader = notificationHeader;
    }


    /**
     * Gets the correlatedNotifications value for this Notify.
     * 
     * @return correlatedNotifications
     */
    public java.lang.String[] getCorrelatedNotifications() {
        return correlatedNotifications;
    }


    /**
     * Sets the correlatedNotifications value for this Notify.
     * 
     * @param correlatedNotifications
     */
    public void setCorrelatedNotifications(java.lang.String[] correlatedNotifications) {
        this.correlatedNotifications = correlatedNotifications;
    }

    public java.lang.String getCorrelatedNotifications(int i) {
        return this.correlatedNotifications[i];
    }

    public void setCorrelatedNotifications(int i, java.lang.String _value) {
        this.correlatedNotifications[i] = _value;
    }


    /**
     * Gets the additionalText value for this Notify.
     * 
     * @return additionalText
     */
    public java.lang.String getAdditionalText() {
        return additionalText;
    }


    /**
     * Sets the additionalText value for this Notify.
     * 
     * @param additionalText
     */
    public void setAdditionalText(java.lang.String additionalText) {
        this.additionalText = additionalText;
    }


    /**
     * Gets the sourceIndicator value for this Notify.
     * 
     * @return sourceIndicator
     */
    public org.apache.axis.types.URI getSourceIndicator() {
        return sourceIndicator;
    }


    /**
     * Sets the sourceIndicator value for this Notify.
     * 
     * @param sourceIndicator
     */
    public void setSourceIndicator(org.apache.axis.types.URI sourceIndicator) {
        this.sourceIndicator = sourceIndicator;
    }


    /**
     * Gets the notificationData value for this Notify.
     * 
     * @return notificationData
     */
    public com.ericsson.schemas.cai3g1_2.NotifyNotificationData getNotificationData() {
        return notificationData;
    }


    /**
     * Sets the notificationData value for this Notify.
     * 
     * @param notificationData
     */
    public void setNotificationData(com.ericsson.schemas.cai3g1_2.NotifyNotificationData notificationData) {
        this.notificationData = notificationData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Notify)) return false;
        Notify other = (Notify) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notificationHeader==null && other.getNotificationHeader()==null) || 
             (this.notificationHeader!=null &&
              this.notificationHeader.equals(other.getNotificationHeader()))) &&
            ((this.correlatedNotifications==null && other.getCorrelatedNotifications()==null) || 
             (this.correlatedNotifications!=null &&
              java.util.Arrays.equals(this.correlatedNotifications, other.getCorrelatedNotifications()))) &&
            ((this.additionalText==null && other.getAdditionalText()==null) || 
             (this.additionalText!=null &&
              this.additionalText.equals(other.getAdditionalText()))) &&
            ((this.sourceIndicator==null && other.getSourceIndicator()==null) || 
             (this.sourceIndicator!=null &&
              this.sourceIndicator.equals(other.getSourceIndicator()))) &&
            ((this.notificationData==null && other.getNotificationData()==null) || 
             (this.notificationData!=null &&
              this.notificationData.equals(other.getNotificationData())));
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
        if (getNotificationHeader() != null) {
            _hashCode += getNotificationHeader().hashCode();
        }
        if (getCorrelatedNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrelatedNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrelatedNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalText() != null) {
            _hashCode += getAdditionalText().hashCode();
        }
        if (getSourceIndicator() != null) {
            _hashCode += getSourceIndicator().hashCode();
        }
        if (getNotificationData() != null) {
            _hashCode += getNotificationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Notify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Notify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "notificationHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlatedNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "correlatedNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "additionalText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "sourceIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "notificationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">>Notify>notificationData"));
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
