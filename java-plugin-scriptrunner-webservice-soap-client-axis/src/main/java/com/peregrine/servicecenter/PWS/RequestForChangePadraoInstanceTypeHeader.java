/**
 * RequestForChangePadraoInstanceTypeHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceTypeHeader  extends com.peregrine.servicecenter.PWS.Common.StructureType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.Common.StringType categoria;

    private com.peregrine.servicecenter.PWS.Common.StringType status;

    private com.peregrine.servicecenter.PWS.Common.StringType requisitante;

    private com.peregrine.servicecenter.PWS.Common.StringType solicitante;

    private com.peregrine.servicecenter.PWS.Common.DateTimeType inicioPlanejado;

    private com.peregrine.servicecenter.PWS.Common.DateTimeType terminoPlanejado;

    private com.peregrine.servicecenter.PWS.Common.StringType prioridadeProbabilidadeRisco;

    private com.peregrine.servicecenter.PWS.Common.StringType implantacaoContemIPL;

    private com.peregrine.servicecenter.PWS.Common.StringType prioridade;

    public RequestForChangePadraoInstanceTypeHeader() {
    }

    public RequestForChangePadraoInstanceTypeHeader(
           java.lang.String type,
           com.peregrine.servicecenter.PWS.Common.StringType categoria,
           com.peregrine.servicecenter.PWS.Common.StringType status,
           com.peregrine.servicecenter.PWS.Common.StringType requisitante,
           com.peregrine.servicecenter.PWS.Common.StringType solicitante,
           com.peregrine.servicecenter.PWS.Common.DateTimeType inicioPlanejado,
           com.peregrine.servicecenter.PWS.Common.DateTimeType terminoPlanejado,
           com.peregrine.servicecenter.PWS.Common.StringType prioridadeProbabilidadeRisco,
           com.peregrine.servicecenter.PWS.Common.StringType implantacaoContemIPL,
           com.peregrine.servicecenter.PWS.Common.StringType prioridade) {
        super(
            type);
        this.categoria = categoria;
        this.status = status;
        this.requisitante = requisitante;
        this.solicitante = solicitante;
        this.inicioPlanejado = inicioPlanejado;
        this.terminoPlanejado = terminoPlanejado;
        this.prioridadeProbabilidadeRisco = prioridadeProbabilidadeRisco;
        this.implantacaoContemIPL = implantacaoContemIPL;
        this.prioridade = prioridade;
    }


    /**
     * Gets the categoria value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return categoria
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param categoria
     */
    public void setCategoria(com.peregrine.servicecenter.PWS.Common.StringType categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the status value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return status
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param status
     */
    public void setStatus(com.peregrine.servicecenter.PWS.Common.StringType status) {
        this.status = status;
    }


    /**
     * Gets the requisitante value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return requisitante
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getRequisitante() {
        return requisitante;
    }


    /**
     * Sets the requisitante value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param requisitante
     */
    public void setRequisitante(com.peregrine.servicecenter.PWS.Common.StringType requisitante) {
        this.requisitante = requisitante;
    }


    /**
     * Gets the solicitante value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return solicitante
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getSolicitante() {
        return solicitante;
    }


    /**
     * Sets the solicitante value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param solicitante
     */
    public void setSolicitante(com.peregrine.servicecenter.PWS.Common.StringType solicitante) {
        this.solicitante = solicitante;
    }


    /**
     * Gets the inicioPlanejado value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return inicioPlanejado
     */
    public com.peregrine.servicecenter.PWS.Common.DateTimeType getInicioPlanejado() {
        return inicioPlanejado;
    }


    /**
     * Sets the inicioPlanejado value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param inicioPlanejado
     */
    public void setInicioPlanejado(com.peregrine.servicecenter.PWS.Common.DateTimeType inicioPlanejado) {
        this.inicioPlanejado = inicioPlanejado;
    }


    /**
     * Gets the terminoPlanejado value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return terminoPlanejado
     */
    public com.peregrine.servicecenter.PWS.Common.DateTimeType getTerminoPlanejado() {
        return terminoPlanejado;
    }


    /**
     * Sets the terminoPlanejado value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param terminoPlanejado
     */
    public void setTerminoPlanejado(com.peregrine.servicecenter.PWS.Common.DateTimeType terminoPlanejado) {
        this.terminoPlanejado = terminoPlanejado;
    }


    /**
     * Gets the prioridadeProbabilidadeRisco value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return prioridadeProbabilidadeRisco
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getPrioridadeProbabilidadeRisco() {
        return prioridadeProbabilidadeRisco;
    }


    /**
     * Sets the prioridadeProbabilidadeRisco value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param prioridadeProbabilidadeRisco
     */
    public void setPrioridadeProbabilidadeRisco(com.peregrine.servicecenter.PWS.Common.StringType prioridadeProbabilidadeRisco) {
        this.prioridadeProbabilidadeRisco = prioridadeProbabilidadeRisco;
    }


    /**
     * Gets the implantacaoContemIPL value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return implantacaoContemIPL
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getImplantacaoContemIPL() {
        return implantacaoContemIPL;
    }


    /**
     * Sets the implantacaoContemIPL value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param implantacaoContemIPL
     */
    public void setImplantacaoContemIPL(com.peregrine.servicecenter.PWS.Common.StringType implantacaoContemIPL) {
        this.implantacaoContemIPL = implantacaoContemIPL;
    }


    /**
     * Gets the prioridade value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @return prioridade
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getPrioridade() {
        return prioridade;
    }


    /**
     * Sets the prioridade value for this RequestForChangePadraoInstanceTypeHeader.
     * 
     * @param prioridade
     */
    public void setPrioridade(com.peregrine.servicecenter.PWS.Common.StringType prioridade) {
        this.prioridade = prioridade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceTypeHeader)) return false;
        RequestForChangePadraoInstanceTypeHeader other = (RequestForChangePadraoInstanceTypeHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.requisitante==null && other.getRequisitante()==null) || 
             (this.requisitante!=null &&
              this.requisitante.equals(other.getRequisitante()))) &&
            ((this.solicitante==null && other.getSolicitante()==null) || 
             (this.solicitante!=null &&
              this.solicitante.equals(other.getSolicitante()))) &&
            ((this.inicioPlanejado==null && other.getInicioPlanejado()==null) || 
             (this.inicioPlanejado!=null &&
              this.inicioPlanejado.equals(other.getInicioPlanejado()))) &&
            ((this.terminoPlanejado==null && other.getTerminoPlanejado()==null) || 
             (this.terminoPlanejado!=null &&
              this.terminoPlanejado.equals(other.getTerminoPlanejado()))) &&
            ((this.prioridadeProbabilidadeRisco==null && other.getPrioridadeProbabilidadeRisco()==null) || 
             (this.prioridadeProbabilidadeRisco!=null &&
              this.prioridadeProbabilidadeRisco.equals(other.getPrioridadeProbabilidadeRisco()))) &&
            ((this.implantacaoContemIPL==null && other.getImplantacaoContemIPL()==null) || 
             (this.implantacaoContemIPL!=null &&
              this.implantacaoContemIPL.equals(other.getImplantacaoContemIPL()))) &&
            ((this.prioridade==null && other.getPrioridade()==null) || 
             (this.prioridade!=null &&
              this.prioridade.equals(other.getPrioridade())));
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
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRequisitante() != null) {
            _hashCode += getRequisitante().hashCode();
        }
        if (getSolicitante() != null) {
            _hashCode += getSolicitante().hashCode();
        }
        if (getInicioPlanejado() != null) {
            _hashCode += getInicioPlanejado().hashCode();
        }
        if (getTerminoPlanejado() != null) {
            _hashCode += getTerminoPlanejado().hashCode();
        }
        if (getPrioridadeProbabilidadeRisco() != null) {
            _hashCode += getPrioridadeProbabilidadeRisco().hashCode();
        }
        if (getImplantacaoContemIPL() != null) {
            _hashCode += getImplantacaoContemIPL().hashCode();
        }
        if (getPrioridade() != null) {
            _hashCode += getPrioridade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceTypeHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>header"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "Categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requisitante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "Requisitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "Solicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inicioPlanejado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "InicioPlanejado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminoPlanejado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TerminoPlanejado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridadeProbabilidadeRisco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "PrioridadeProbabilidadeRisco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoContemIPL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoContemIPL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "Prioridade"));
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
