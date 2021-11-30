/**
 * Search.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class Search  implements java.io.Serializable {
    private java.lang.String MOType;

    private java.lang.String[][] filters;

    private com.ericsson.schemas.cai3g1_2.AnySequenceType extension;

    public Search() {
    }

    public Search(
           java.lang.String MOType,
           java.lang.String[][] filters,
           com.ericsson.schemas.cai3g1_2.AnySequenceType extension) {
           this.MOType = MOType;
           this.filters = filters;
           this.extension = extension;
    }


    /**
     * Gets the MOType value for this Search.
     * 
     * @return MOType
     */
    public java.lang.String getMOType() {
        return MOType;
    }


    /**
     * Sets the MOType value for this Search.
     * 
     * @param MOType
     */
    public void setMOType(java.lang.String MOType) {
        this.MOType = MOType;
    }


    /**
     * Gets the filters value for this Search.
     * 
     * @return filters
     */
    public java.lang.String[][] getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this Search.
     * 
     * @param filters
     */
    public void setFilters(java.lang.String[][] filters) {
        this.filters = filters;
    }


    /**
     * Gets the extension value for this Search.
     * 
     * @return extension
     */
    public com.ericsson.schemas.cai3g1_2.AnySequenceType getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this Search.
     * 
     * @param extension
     */
    public void setExtension(com.ericsson.schemas.cai3g1_2.AnySequenceType extension) {
        this.extension = extension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Search)) return false;
        Search other = (Search) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MOType==null && other.getMOType()==null) || 
             (this.MOType!=null &&
              this.MOType.equals(other.getMOType()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              java.util.Arrays.equals(this.filters, other.getFilters()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension())));
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
        if (getMOType() != null) {
            _hashCode += getMOType().hashCode();
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
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Search.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Search"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "SearchFilterType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "filter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "AnySequenceType"));
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
