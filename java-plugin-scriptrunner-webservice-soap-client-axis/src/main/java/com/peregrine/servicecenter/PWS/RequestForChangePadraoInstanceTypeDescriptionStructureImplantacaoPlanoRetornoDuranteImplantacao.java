/**
 * RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao  extends com.peregrine.servicecenter.PWS.Common.ArrayType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPlanoRetornoDuranteImplantacao;

    public RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao() {
    }

    public RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao(
           java.lang.String type,
           com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPlanoRetornoDuranteImplantacao) {
        super(
            type);
        this.implantacaoPlanoRetornoDuranteImplantacao = implantacaoPlanoRetornoDuranteImplantacao;
    }


    /**
     * Gets the implantacaoPlanoRetornoDuranteImplantacao value for this RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao.
     * 
     * @return implantacaoPlanoRetornoDuranteImplantacao
     */
    public com.peregrine.servicecenter.PWS.Common.StringType[] getImplantacaoPlanoRetornoDuranteImplantacao() {
        return implantacaoPlanoRetornoDuranteImplantacao;
    }


    /**
     * Sets the implantacaoPlanoRetornoDuranteImplantacao value for this RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao.
     * 
     * @param implantacaoPlanoRetornoDuranteImplantacao
     */
    public void setImplantacaoPlanoRetornoDuranteImplantacao(com.peregrine.servicecenter.PWS.Common.StringType[] implantacaoPlanoRetornoDuranteImplantacao) {
        this.implantacaoPlanoRetornoDuranteImplantacao = implantacaoPlanoRetornoDuranteImplantacao;
    }

    public com.peregrine.servicecenter.PWS.Common.StringType getImplantacaoPlanoRetornoDuranteImplantacao(int i) {
        return this.implantacaoPlanoRetornoDuranteImplantacao[i];
    }

    public void setImplantacaoPlanoRetornoDuranteImplantacao(int i, com.peregrine.servicecenter.PWS.Common.StringType _value) {
        this.implantacaoPlanoRetornoDuranteImplantacao[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao)) return false;
        RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao other = (RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.implantacaoPlanoRetornoDuranteImplantacao==null && other.getImplantacaoPlanoRetornoDuranteImplantacao()==null) || 
             (this.implantacaoPlanoRetornoDuranteImplantacao!=null &&
              java.util.Arrays.equals(this.implantacaoPlanoRetornoDuranteImplantacao, other.getImplantacaoPlanoRetornoDuranteImplantacao())));
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
        if (getImplantacaoPlanoRetornoDuranteImplantacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImplantacaoPlanoRetornoDuranteImplantacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImplantacaoPlanoRetornoDuranteImplantacao(), i);
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
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>description.structure>ImplantacaoPlanoRetornoDuranteImplantacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoPlanoRetornoDuranteImplantacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoPlanoRetornoDuranteImplantacao"));
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
