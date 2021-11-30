/**
 * Cai3GFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class Cai3GFault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.math.BigInteger faultcode;

    private java.lang.String[] faultreason;

    private java.lang.String faultrole;

    private com.ericsson.schemas.cai3g1_2.Cai3GFaultDetails details;

    public Cai3GFault() {
    }

    public Cai3GFault(
           java.math.BigInteger faultcode,
           java.lang.String[] faultreason,
           java.lang.String faultrole,
           com.ericsson.schemas.cai3g1_2.Cai3GFaultDetails details) {
        this.faultcode = faultcode;
        this.faultreason = faultreason;
        this.faultrole = faultrole;
        this.details = details;
    }


    /**
     * Gets the faultcode value for this Cai3GFault.
     * 
     * @return faultcode
     */
    public java.math.BigInteger getFaultcode() {
        return faultcode;
    }


    /**
     * Sets the faultcode value for this Cai3GFault.
     * 
     * @param faultcode
     */
    public void setFaultcode(java.math.BigInteger faultcode) {
        this.faultcode = faultcode;
    }


    /**
     * Gets the faultreason value for this Cai3GFault.
     * 
     * @return faultreason
     */
    public java.lang.String[] getFaultreason() {
        return faultreason;
    }


    /**
     * Sets the faultreason value for this Cai3GFault.
     * 
     * @param faultreason
     */
    public void setFaultreason(java.lang.String[] faultreason) {
        this.faultreason = faultreason;
    }


    /**
     * Gets the faultrole value for this Cai3GFault.
     * 
     * @return faultrole
     */
    public java.lang.String getFaultrole() {
        return faultrole;
    }


    /**
     * Sets the faultrole value for this Cai3GFault.
     * 
     * @param faultrole
     */
    public void setFaultrole(java.lang.String faultrole) {
        this.faultrole = faultrole;
    }


    /**
     * Gets the details value for this Cai3GFault.
     * 
     * @return details
     */
    public com.ericsson.schemas.cai3g1_2.Cai3GFaultDetails getDetails() {
        return details;
    }


    /**
     * Sets the details value for this Cai3GFault.
     * 
     * @param details
     */
    public void setDetails(com.ericsson.schemas.cai3g1_2.Cai3GFaultDetails details) {
        this.details = details;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cai3GFault)) return false;
        Cai3GFault other = (Cai3GFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultcode==null && other.getFaultcode()==null) || 
             (this.faultcode!=null &&
              this.faultcode.equals(other.getFaultcode()))) &&
            ((this.faultreason==null && other.getFaultreason()==null) || 
             (this.faultreason!=null &&
              java.util.Arrays.equals(this.faultreason, other.getFaultreason()))) &&
            ((this.faultrole==null && other.getFaultrole()==null) || 
             (this.faultrole!=null &&
              this.faultrole.equals(other.getFaultrole()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails())));
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
        if (getFaultcode() != null) {
            _hashCode += getFaultcode().hashCode();
        }
        if (getFaultreason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultreason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultreason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaultrole() != null) {
            _hashCode += getFaultrole().hashCode();
        }
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cai3GFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">Cai3gFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "faultcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultreason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "faultreason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "reasonText"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultrole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "faultrole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">>Cai3gFault>details"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
