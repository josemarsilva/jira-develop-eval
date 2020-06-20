/**
 * RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito  extends com.peregrine.servicecenter.PWS.Common.ArrayType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPreRequisito;

    public RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito() {
    }

    public RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito(
           java.lang.String type,
           com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPreRequisito) {
        super(
            type);
        this.implantacaoPreRequisito = implantacaoPreRequisito;
    }


    /**
     * Gets the implantacaoPreRequisito value for this RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito.
     * 
     * @return implantacaoPreRequisito
     */
    public com.peregrine.servicecenter.PWS.Common.StringType[] getImplantacaoPreRequisito() {
        return implantacaoPreRequisito;
    }


    /**
     * Sets the implantacaoPreRequisito value for this RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito.
     * 
     * @param implantacaoPreRequisito
     */
    public void setImplantacaoPreRequisito(com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPreRequisito) {
        this.implantacaoPreRequisito = implantacaoPreRequisito;
    }

    public com.peregrine.servicecenter.PWS.Common.StringType getImplantacaoPreRequisito(int i) {
        return this.implantacaoPreRequisito[i];
    }

    public void setImplantacaoPreRequisito(int i, com.peregrine.servicecenter.PWS.Common.StringType _value) {
        this.implantacaoPreRequisito[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito)) return false;
        RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito other = (RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.implantacaoPreRequisito==null && other.getImplantacaoPreRequisito()==null) || 
             (this.implantacaoPreRequisito!=null &&
              java.util.Arrays.equals(this.implantacaoPreRequisito, other.getImplantacaoPreRequisito())));
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
        if (getImplantacaoPreRequisito() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImplantacaoPreRequisito());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImplantacaoPreRequisito(), i);
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
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoPreRequisito"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoPreRequisito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoPreRequisito"));
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
