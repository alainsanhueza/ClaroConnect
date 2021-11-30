/**
 * Unsubscribe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class Unsubscribe  implements java.io.Serializable {
    private org.apache.axis.types.URI managerRef;

    private java.lang.String subscriptionId;

    public Unsubscribe() {
    }

    public Unsubscribe(
           org.apache.axis.types.URI managerRef,
           java.lang.String subscriptionId) {
           this.managerRef = managerRef;
           this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the managerRef value for this Unsubscribe.
     * 
     * @return managerRef
     */
    public org.apache.axis.types.URI getManagerRef() {
        return managerRef;
    }


    /**
     * Sets the managerRef value for this Unsubscribe.
     * 
     * @param managerRef
     */
    public void setManagerRef(org.apache.axis.types.URI managerRef) {
        this.managerRef = managerRef;
    }


    /**
     * Gets the subscriptionId value for this Unsubscribe.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this Unsubscribe.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Unsubscribe)) return false;
        Unsubscribe other = (Unsubscribe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.managerRef==null && other.getManagerRef()==null) || 
             (this.managerRef!=null &&
              this.managerRef.equals(other.getManagerRef()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId())));
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
        if (getManagerRef() != null) {
            _hashCode += getManagerRef().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Unsubscribe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Unsubscribe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "managerRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "subscriptionId"));
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
