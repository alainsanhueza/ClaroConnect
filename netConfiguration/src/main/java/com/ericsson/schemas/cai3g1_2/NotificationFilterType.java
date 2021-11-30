/**
 * NotificationFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ericsson.schemas.cai3g1_2;

public class NotificationFilterType  implements java.io.Serializable {
    private java.lang.String[] cai3GUser;

    private java.lang.String[] MOType;

    private java.lang.String[] operation;

    private java.lang.String[] MOId;

    private java.lang.String[] MOAttributes;

    public NotificationFilterType() {
    }

    public NotificationFilterType(
           java.lang.String[] cai3GUser,
           java.lang.String[] MOType,
           java.lang.String[] operation,
           java.lang.String[] MOId,
           java.lang.String[] MOAttributes) {
           this.cai3GUser = cai3GUser;
           this.MOType = MOType;
           this.operation = operation;
           this.MOId = MOId;
           this.MOAttributes = MOAttributes;
    }


    /**
     * Gets the cai3GUser value for this NotificationFilterType.
     * 
     * @return cai3GUser
     */
    public java.lang.String[] getCai3GUser() {
        return cai3GUser;
    }


    /**
     * Sets the cai3GUser value for this NotificationFilterType.
     * 
     * @param cai3GUser
     */
    public void setCai3GUser(java.lang.String[] cai3GUser) {
        this.cai3GUser = cai3GUser;
    }

    public java.lang.String getCai3GUser(int i) {
        return this.cai3GUser[i];
    }

    public void setCai3GUser(int i, java.lang.String _value) {
        this.cai3GUser[i] = _value;
    }


    /**
     * Gets the MOType value for this NotificationFilterType.
     * 
     * @return MOType
     */
    public java.lang.String[] getMOType() {
        return MOType;
    }


    /**
     * Sets the MOType value for this NotificationFilterType.
     * 
     * @param MOType
     */
    public void setMOType(java.lang.String[] MOType) {
        this.MOType = MOType;
    }

    public java.lang.String getMOType(int i) {
        return this.MOType[i];
    }

    public void setMOType(int i, java.lang.String _value) {
        this.MOType[i] = _value;
    }


    /**
     * Gets the operation value for this NotificationFilterType.
     * 
     * @return operation
     */
    public java.lang.String[] getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this NotificationFilterType.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String[] operation) {
        this.operation = operation;
    }

    public java.lang.String getOperation(int i) {
        return this.operation[i];
    }

    public void setOperation(int i, java.lang.String _value) {
        this.operation[i] = _value;
    }


    /**
     * Gets the MOId value for this NotificationFilterType.
     * 
     * @return MOId
     */
    public java.lang.String[] getMOId() {
        return MOId;
    }


    /**
     * Sets the MOId value for this NotificationFilterType.
     * 
     * @param MOId
     */
    public void setMOId(java.lang.String[] MOId) {
        this.MOId = MOId;
    }

    public java.lang.String getMOId(int i) {
        return this.MOId[i];
    }

    public void setMOId(int i, java.lang.String _value) {
        this.MOId[i] = _value;
    }


    /**
     * Gets the MOAttributes value for this NotificationFilterType.
     * 
     * @return MOAttributes
     */
    public java.lang.String[] getMOAttributes() {
        return MOAttributes;
    }


    /**
     * Sets the MOAttributes value for this NotificationFilterType.
     * 
     * @param MOAttributes
     */
    public void setMOAttributes(java.lang.String[] MOAttributes) {
        this.MOAttributes = MOAttributes;
    }

    public java.lang.String getMOAttributes(int i) {
        return this.MOAttributes[i];
    }

    public void setMOAttributes(int i, java.lang.String _value) {
        this.MOAttributes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificationFilterType)) return false;
        NotificationFilterType other = (NotificationFilterType) obj;
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
              java.util.Arrays.equals(this.cai3GUser, other.getCai3GUser()))) &&
            ((this.MOType==null && other.getMOType()==null) || 
             (this.MOType!=null &&
              java.util.Arrays.equals(this.MOType, other.getMOType()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              java.util.Arrays.equals(this.operation, other.getOperation()))) &&
            ((this.MOId==null && other.getMOId()==null) || 
             (this.MOId!=null &&
              java.util.Arrays.equals(this.MOId, other.getMOId()))) &&
            ((this.MOAttributes==null && other.getMOAttributes()==null) || 
             (this.MOAttributes!=null &&
              java.util.Arrays.equals(this.MOAttributes, other.getMOAttributes())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCai3GUser());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCai3GUser(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMOType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMOType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMOType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMOAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMOAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(NotificationFilterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "NotificationFilterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cai3GUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "cai3gUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ericsson.com/cai3g1.2/", "MOAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
