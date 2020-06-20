/**
 * RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto  extends com.peregrine.servicecenter.PWS.Common.ArrayType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.Common.StringType[] descricaoCentroCusto;

    public RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto() {
    }

    public RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto(
           java.lang.String type,
           com.peregrine.servicecenter.PWS.Common.StringType[] descricaoCentroCusto) {
        super(
            type);
        this.descricaoCentroCusto = descricaoCentroCusto;
    }


    /**
     * Gets the descricaoCentroCusto value for this RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto.
     * 
     * @return descricaoCentroCusto
     */
    public com.peregrine.servicecenter.PWS.Common.StringType[] getDescricaoCentroCusto() {
        return descricaoCentroCusto;
    }


    /**
     * Sets the descricaoCentroCusto value for this RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto.
     * 
     * @param descricaoCentroCusto
     */
    public void setDescricaoCentroCusto(com.peregrine.servicecenter.PWS.Common.StringType[] descricaoCentroCusto) {
        this.descricaoCentroCusto = descricaoCentroCusto;
    }

    public com.peregrine.servicecenter.PWS.Common.StringType getDescricaoCentroCusto(int i) {
        return this.descricaoCentroCusto[i];
    }

    public void setDescricaoCentroCusto(int i, com.peregrine.servicecenter.PWS.Common.StringType _value) {
        this.descricaoCentroCusto[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto)) return false;
        RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto other = (RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descricaoCentroCusto==null && other.getDescricaoCentroCusto()==null) || 
             (this.descricaoCentroCusto!=null &&
              java.util.Arrays.equals(this.descricaoCentroCusto, other.getDescricaoCentroCusto())));
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
        if (getDescricaoCentroCusto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescricaoCentroCusto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescricaoCentroCusto(), i);
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
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>DescricaoCentroCusto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "DescricaoCentroCusto"));
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
