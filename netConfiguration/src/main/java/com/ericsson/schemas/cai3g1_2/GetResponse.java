/**
 * GetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class GetResponse  implements java.io.Serializable {
    private com.ericsson.schemas.cai3g1_2.AnyMOIdType[] MOId;

    private com.ericsson.schemas.cai3g1_2.GetResponseMOAttributesType MOAttributes;

    private com.ericsson.schemas.cai3g1_2.AnySequenceType extension;

    public GetResponse() {
    }

    public GetResponse(
           com.ericsson.schemas.cai3g1_2.AnyMOIdType[] MOId,
           com.ericsson.schemas.cai3g1_2.GetResponseMOAttributesType MOAttributes,
           com.ericsson.schemas.cai3g1_2.AnySequenceType extension) {
           this.MOId = MOId;
           this.MOAttributes = MOAttributes;
           this.extension = extension;
    }


    /**
     * Gets the MOId value for this GetResponse.
     * 
     * @return MOId
     */
    public com.ericsson.schemas.cai3g1_2.AnyMOIdType[] getMOId() {
        return MOId;
    }


    /**
     * Sets the MOId value for this GetResponse.
     * 
     * @param MOId
     */
    public void setMOId(com.ericsson.schemas.cai3g1_2.AnyMOIdType[] MOId) {
        this.MOId = MOId;
    }

    public com.ericsson.schemas.cai3g1_2.AnyMOIdType getMOId(int i) {
        return this.MOId[i];
    }

    public void setMOId(int i, com.ericsson.schemas.cai3g1_2.AnyMOIdType _value) {
        this.MOId[i] = _value;
    }


    /**
     * Gets the MOAttributes value for this GetResponse.
     * 
     * @return MOAttributes
     */
    public com.ericsson.schemas.cai3g1_2.GetResponseMOAttributesType getMOAttributes() {
        return MOAttributes;
    }


    /**
     * Sets the MOAttributes value for this GetResponse.
     * 
     * @param MOAttributes
     */
    public void setMOAttributes(com.ericsson.schemas.cai3g1_2.GetResponseMOAttributesType MOAttributes) {
        this.MOAttributes = MOAttributes;
    }


    /**
     * Gets the extension value for this GetResponse.
     * 
     * @return extension
     */
    public com.ericsson.schemas.cai3g1_2.AnySequenceType getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this GetResponse.
     * 
     * @param extension
     */
    public void setExtension(com.ericsson.schemas.cai3g1_2.AnySequenceType extension) {
        this.extension = extension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResponse)) return false;
        GetResponse other = (GetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MOId==null && other.getMOId()==null) || 
             (this.MOId!=null &&
              java.util.Arrays.equals(this.MOId, other.getMOId()))) &&
            ((this.MOAttributes==null && other.getMOAttributes()==null) || 
             (this.MOAttributes!=null &&
              this.MOAttributes.equals(other.getMOAttributes()))) &&
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
        if (getMOId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMOId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMOId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMOAttributes() != null) {
            _hashCode += getMOAttributes().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", ">GetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "AnyMOIdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "GetResponseMOAttributesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
