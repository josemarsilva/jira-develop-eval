/**
 * RequestForChangePadraoInstanceTypeMiddleCentroDeCusto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceTypeMiddleCentroDeCusto  extends com.peregrine.servicecenter.PWS.Common.ArrayType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.Common.StringType[] centroDeCusto;

    public RequestForChangePadraoInstanceTypeMiddleCentroDeCusto() {
    }

    public RequestForChangePadraoInstanceTypeMiddleCentroDeCusto(
           java.lang.String type,
           com.peregrine.servicecenter.PWS.Common.StringType[] centroDeCusto) {
        super(
            type);
        this.centroDeCusto = centroDeCusto;
    }


    /**
     * Gets the centroDeCusto value for this RequestForChangePadraoInstanceTypeMiddleCentroDeCusto.
     * 
     * @return centroDeCusto
     */
    public com.peregrine.servicecenter.PWS.Common.StringType[] getCentroDeCusto() {
        return centroDeCusto;
    }


    /**
     * Sets the centroDeCusto value for this RequestForChangePadraoInstanceTypeMiddleCentroDeCusto.
     * 
     * @param centroDeCusto
     */
    public void setCentroDeCusto(com.peregrine.servicecenter.PWS.Common.StringType[] centroDeCusto) {
        this.centroDeCusto = centroDeCusto;
    }

    public com.peregrine.servicecenter.PWS.Common.StringType getCentroDeCusto(int i) {
        return this.centroDeCusto[i];
    }

    public void setCentroDeCusto(int i, com.peregrine.servicecenter.PWS.Common.StringType _value) {
        this.centroDeCusto[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceTypeMiddleCentroDeCusto)) return false;
        RequestForChangePadraoInstanceTypeMiddleCentroDeCusto other = (RequestForChangePadraoInstanceTypeMiddleCentroDeCusto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.centroDeCusto==null && other.getCentroDeCusto()==null) || 
             (this.centroDeCusto!=null &&
              java.util.Arrays.equals(this.centroDeCusto, other.getCentroDeCusto())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCentroDeCusto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCentroDeCusto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCentroDeCusto(), i);
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
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceTypeMiddleCentroDeCusto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>CentroDeCusto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "CentroDeCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
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
