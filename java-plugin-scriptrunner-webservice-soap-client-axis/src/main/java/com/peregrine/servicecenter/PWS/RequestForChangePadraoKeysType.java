/**
 * RequestForChangePadraoKeysType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoKeysType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.Common.StringType number;

    private java.lang.String query;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public RequestForChangePadraoKeysType() {
    }

    public RequestForChangePadraoKeysType(
           com.peregrine.servicecenter.PWS.Common.StringType number,
           java.lang.String query,
           java.lang.Long updatecounter) {
           this.number = number;
           this.query = query;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the number value for this RequestForChangePadraoKeysType.
     * 
     * @return number
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getNumber() {
        return number;
    }


    /**
     * Sets the number value for this RequestForChangePadraoKeysType.
     * 
     * @param number
     */
    public void setNumber(com.peregrine.servicecenter.PWS.Common.StringType number) {
        this.number = number;
    }


    /**
     * Gets the query value for this RequestForChangePadraoKeysType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this RequestForChangePadraoKeysType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the updatecounter value for this RequestForChangePadraoKeysType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this RequestForChangePadraoKeysType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoKeysType)) return false;
        RequestForChangePadraoKeysType other = (RequestForChangePadraoKeysType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.updatecounter==null && other.getUpdatecounter()==null) || 
             (this.updatecounter!=null &&
              this.updatecounter.equals(other.getUpdatecounter())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getUpdatecounter() != null) {
            _hashCode += getUpdatecounter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoKeysType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RequestForChangePadraoKeysType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("query");
        attrField.setXmlName(new javax.xml.namespace.QName("", "query"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("updatecounter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "updatecounter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
