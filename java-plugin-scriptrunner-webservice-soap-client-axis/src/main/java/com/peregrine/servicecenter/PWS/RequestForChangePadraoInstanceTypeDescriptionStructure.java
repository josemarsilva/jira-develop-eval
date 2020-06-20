/**
 * RequestForChangePadraoInstanceTypeDescriptionStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceTypeDescriptionStructure  extends com.peregrine.servicecenter.PWS.Common.StructureType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureDescricao descricao;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao implantacaoPlanoRetornoDuranteImplantacao;

    public RequestForChangePadraoInstanceTypeDescriptionStructure() {
    }

    public RequestForChangePadraoInstanceTypeDescriptionStructure(
           java.lang.String type,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureDescricao descricao,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao implantacaoPlanoRetornoDuranteImplantacao) {
        super(
            type);
        this.descricao = descricao;
        this.implantacaoPlanoRetornoDuranteImplantacao = implantacaoPlanoRetornoDuranteImplantacao;
    }


    /**
     * Gets the descricao value for this RequestForChangePadraoInstanceTypeDescriptionStructure.
     * 
     * @return descricao
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureDescricao getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this RequestForChangePadraoInstanceTypeDescriptionStructure.
     * 
     * @param descricao
     */
    public void setDescricao(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureDescricao descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the implantacaoPlanoRetornoDuranteImplantacao value for this RequestForChangePadraoInstanceTypeDescriptionStructure.
     * 
     * @return implantacaoPlanoRetornoDuranteImplantacao
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao getImplantacaoPlanoRetornoDuranteImplantacao() {
        return implantacaoPlanoRetornoDuranteImplantacao;
    }


    /**
     * Sets the implantacaoPlanoRetornoDuranteImplantacao value for this RequestForChangePadraoInstanceTypeDescriptionStructure.
     * 
     * @param implantacaoPlanoRetornoDuranteImplantacao
     */
    public void setImplantacaoPlanoRetornoDuranteImplantacao(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao implantacaoPlanoRetornoDuranteImplantacao) {
        this.implantacaoPlanoRetornoDuranteImplantacao = implantacaoPlanoRetornoDuranteImplantacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceTypeDescriptionStructure)) return false;
        RequestForChangePadraoInstanceTypeDescriptionStructure other = (RequestForChangePadraoInstanceTypeDescriptionStructure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.implantacaoPlanoRetornoDuranteImplantacao==null && other.getImplantacaoPlanoRetornoDuranteImplantacao()==null) || 
             (this.implantacaoPlanoRetornoDuranteImplantacao!=null &&
              this.implantacaoPlanoRetornoDuranteImplantacao.equals(other.getImplantacaoPlanoRetornoDuranteImplantacao())));
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
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getImplantacaoPlanoRetornoDuranteImplantacao() != null) {
            _hashCode += getImplantacaoPlanoRetornoDuranteImplantacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceTypeDescriptionStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>description.structure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>description.structure>Descricao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoPlanoRetornoDuranteImplantacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoPlanoRetornoDuranteImplantacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>description.structure>ImplantacaoPlanoRetornoDuranteImplantacao"));
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
