/**
 * Subscribe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class Subscribe  implements java.io.Serializable {
    private org.apache.axis.types.URI managerRef;

    private com.ericsson.schemas.cai3g1_2.NotificationFilterType[] filters;

    public Subscribe() {
    }

    public Subscribe(
           org.apache.axis.types.URI managerRef,
           com.ericsson.schemas.cai3g1_2.NotificationFilterType[] filters) {
           this.managerRef = managerRef;
           this.filters = filters;
    }


    /**
     * Gets the managerRef value for this Subscribe.
     * 
     * @return managerRef
     */
    public org.apache.axis.types.URI getManagerRef() {
        return managerRef;
    }


    /**
     * Sets the managerRef value for this Subscribe.
     * 
     * @param managerRef
     */
    public void setManagerRef(org.apache.axis.types.URI managerRef) {
        this.managerRef = managerRef;
    }


    /**
     * Gets the filters value for this Subscribe.
     * 
     * @return filters
     */
    public com.ericsson.schemas.cai3g1_2.NotificationFilterType[] getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this Subscribe.
     * 
     * @param filters
     */
    public void setFilters(com.ericsson.schemas.cai3g1_2.NotificationFilterType[] filters) {
        this.filters = filters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscribe)) return false;
        Subscribe other = (Subscribe) obj;
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
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              java.util.Arrays.equals(this.filters, other.getFilters())));
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
        if (getFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subscribe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Subscribe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "managerRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationFilterType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "filter"));
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
