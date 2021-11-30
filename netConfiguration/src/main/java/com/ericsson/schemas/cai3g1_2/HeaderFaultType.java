/**
 * HeaderFaultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class HeaderFaultType  implements java.io.Serializable {
    private java.lang.String faultactor;

    private java.lang.String description;

    public HeaderFaultType() {
    }

    public HeaderFaultType(
           java.lang.String faultactor,
           java.lang.String description) {
           this.faultactor = faultactor;
           this.description = description;
    }


    /**
     * Gets the faultactor value for this HeaderFaultType.
     * 
     * @return faultactor
     */
    public java.lang.String getFaultactor() {
        return faultactor;
    }


    /**
     * Sets the faultactor value for this HeaderFaultType.
     * 
     * @param faultactor
     */
    public void setFaultactor(java.lang.String faultactor) {
        this.faultactor = faultactor;
    }


    /**
     * Gets the description value for this HeaderFaultType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HeaderFaultType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HeaderFaultType)) return false;
        HeaderFaultType other = (HeaderFaultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultactor==null && other.getFaultactor()==null) || 
             (this.faultactor!=null &&
              this.faultactor.equals(other.getFaultactor()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getFaultactor() != null) {
            _hashCode += getFaultactor().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HeaderFaultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "HeaderFaultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultactor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "faultactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
