/**
 * RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao  extends com.peregrine.servicecenter.PWS.Common.ArrayType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPlanoRetornoAposImplantacao;

    public RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao() {
    }

    public RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao(
           java.lang.String type,
           com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPlanoRetornoAposImplantacao) {
        super(
            type);
        this.implantacaoPlanoRetornoAposImplantacao = implantacaoPlanoRetornoAposImplantacao;
    }


    /**
     * Gets the implantacaoPlanoRetornoAposImplantacao value for this RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao.
     * 
     * @return implantacaoPlanoRetornoAposImplantacao
     */
    public com.peregrine.servicecenter.PWS.Common.StringType[] getImplantacaoPlanoRetornoAposImplantacao() {
        return implantacaoPlanoRetornoAposImplantacao;
    }


    /**
     * Sets the implantacaoPlanoRetornoAposImplantacao value for this RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao.
     * 
     * @param implantacaoPlanoRetornoAposImplantacao
     */
    public void setImplantacaoPlanoRetornoAposImplantacao(com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPlanoRetornoAposImplantacao) {
        this.implantacaoPlanoRetornoAposImplantacao = implantacaoPlanoRetornoAposImplantacao;
    }

    public com.peregrine.servicecenter.PWS.Common.StringType getImplantacaoPlanoRetornoAposImplantacao(int i) {
        return this.implantacaoPlanoRetornoAposImplantacao[i];
    }

    public void setImplantacaoPlanoRetornoAposImplantacao(int i, com.peregrine.servicecenter.PWS.Common.StringType _value) {
        this.implantacaoPlanoRetornoAposImplantacao[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao)) return false;
        RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao other = (RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.implantacaoPlanoRetornoAposImplantacao==null && other.getImplantacaoPlanoRetornoAposImplantacao()==null) || 
             (this.implantacaoPlanoRetornoAposImplantacao!=null &&
              java.util.Arrays.equals(this.implantacaoPlanoRetornoAposImplantacao, other.getImplantacaoPlanoRetornoAposImplantacao())));
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
        if (getImplantacaoPlanoRetornoAposImplantacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImplantacaoPlanoRetornoAposImplantacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImplantacaoPlanoRetornoAposImplantacao(), i);
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
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>ImplantacaoPlanoRetornoAposImplantacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoPlanoRetornoAposImplantacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoPlanoRetornoAposImplantacao"));
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
