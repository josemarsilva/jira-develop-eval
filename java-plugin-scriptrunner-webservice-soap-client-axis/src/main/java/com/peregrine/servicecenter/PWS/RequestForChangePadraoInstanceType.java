/**
 * RequestForChangePadraoInstanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeHeader header;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructure descriptionStructure;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddle middle;

    private com.peregrine.servicecenter.PWS.Common.StringType tituloRDM;

    private com.peregrine.servicecenter.PWS.Common.StringType testeOutrosNome;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao implantacaoPlanoRetornoAposImplantacao;

    private com.peregrine.servicecenter.PWS.Common.AttachmentType[] attachments;

    private java.lang.String query;  // attribute

    private java.lang.String uniquequery;  // attribute

    private java.lang.String recordid;  // attribute

    private java.lang.Long updatecounter;  // attribute

    public RequestForChangePadraoInstanceType() {
    }

    public RequestForChangePadraoInstanceType(
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeHeader header,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructure descriptionStructure,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddle middle,
           com.peregrine.servicecenter.PWS.Common.StringType tituloRDM,
           com.peregrine.servicecenter.PWS.Common.StringType testeOutrosNome,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao implantacaoPlanoRetornoAposImplantacao,
           com.peregrine.servicecenter.PWS.Common.AttachmentType[] attachments,
           java.lang.String query,
           java.lang.String uniquequery,
           java.lang.String recordid,
           java.lang.Long updatecounter) {
           this.header = header;
           this.descriptionStructure = descriptionStructure;
           this.middle = middle;
           this.tituloRDM = tituloRDM;
           this.testeOutrosNome = testeOutrosNome;
           this.implantacaoPlanoRetornoAposImplantacao = implantacaoPlanoRetornoAposImplantacao;
           this.attachments = attachments;
           this.query = query;
           this.uniquequery = uniquequery;
           this.recordid = recordid;
           this.updatecounter = updatecounter;
    }


    /**
     * Gets the header value for this RequestForChangePadraoInstanceType.
     * 
     * @return header
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeHeader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this RequestForChangePadraoInstanceType.
     * 
     * @param header
     */
    public void setHeader(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeHeader header) {
        this.header = header;
    }


    /**
     * Gets the descriptionStructure value for this RequestForChangePadraoInstanceType.
     * 
     * @return descriptionStructure
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructure getDescriptionStructure() {
        return descriptionStructure;
    }


    /**
     * Sets the descriptionStructure value for this RequestForChangePadraoInstanceType.
     * 
     * @param descriptionStructure
     */
    public void setDescriptionStructure(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructure descriptionStructure) {
        this.descriptionStructure = descriptionStructure;
    }


    /**
     * Gets the middle value for this RequestForChangePadraoInstanceType.
     * 
     * @return middle
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddle getMiddle() {
        return middle;
    }


    /**
     * Sets the middle value for this RequestForChangePadraoInstanceType.
     * 
     * @param middle
     */
    public void setMiddle(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddle middle) {
        this.middle = middle;
    }


    /**
     * Gets the tituloRDM value for this RequestForChangePadraoInstanceType.
     * 
     * @return tituloRDM
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getTituloRDM() {
        return tituloRDM;
    }


    /**
     * Sets the tituloRDM value for this RequestForChangePadraoInstanceType.
     * 
     * @param tituloRDM
     */
    public void setTituloRDM(com.peregrine.servicecenter.PWS.Common.StringType tituloRDM) {
        this.tituloRDM = tituloRDM;
    }


    /**
     * Gets the testeOutrosNome value for this RequestForChangePadraoInstanceType.
     * 
     * @return testeOutrosNome
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getTesteOutrosNome() {
        return testeOutrosNome;
    }


    /**
     * Sets the testeOutrosNome value for this RequestForChangePadraoInstanceType.
     * 
     * @param testeOutrosNome
     */
    public void setTesteOutrosNome(com.peregrine.servicecenter.PWS.Common.StringType testeOutrosNome) {
        this.testeOutrosNome = testeOutrosNome;
    }


    /**
     * Gets the implantacaoPlanoRetornoAposImplantacao value for this RequestForChangePadraoInstanceType.
     * 
     * @return implantacaoPlanoRetornoAposImplantacao
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao getImplantacaoPlanoRetornoAposImplantacao() {
        return implantacaoPlanoRetornoAposImplantacao;
    }


    /**
     * Sets the implantacaoPlanoRetornoAposImplantacao value for this RequestForChangePadraoInstanceType.
     * 
     * @param implantacaoPlanoRetornoAposImplantacao
     */
    public void setImplantacaoPlanoRetornoAposImplantacao(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao implantacaoPlanoRetornoAposImplantacao) {
        this.implantacaoPlanoRetornoAposImplantacao = implantacaoPlanoRetornoAposImplantacao;
    }


    /**
     * Gets the attachments value for this RequestForChangePadraoInstanceType.
     * 
     * @return attachments
     */
    public com.peregrine.servicecenter.PWS.Common.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this RequestForChangePadraoInstanceType.
     * 
     * @param attachments
     */
    public void setAttachments(com.peregrine.servicecenter.PWS.Common.AttachmentType[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the query value for this RequestForChangePadraoInstanceType.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this RequestForChangePadraoInstanceType.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the uniquequery value for this RequestForChangePadraoInstanceType.
     * 
     * @return uniquequery
     */
    public java.lang.String getUniquequery() {
        return uniquequery;
    }


    /**
     * Sets the uniquequery value for this RequestForChangePadraoInstanceType.
     * 
     * @param uniquequery
     */
    public void setUniquequery(java.lang.String uniquequery) {
        this.uniquequery = uniquequery;
    }


    /**
     * Gets the recordid value for this RequestForChangePadraoInstanceType.
     * 
     * @return recordid
     */
    public java.lang.String getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this RequestForChangePadraoInstanceType.
     * 
     * @param recordid
     */
    public void setRecordid(java.lang.String recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the updatecounter value for this RequestForChangePadraoInstanceType.
     * 
     * @return updatecounter
     */
    public java.lang.Long getUpdatecounter() {
        return updatecounter;
    }


    /**
     * Sets the updatecounter value for this RequestForChangePadraoInstanceType.
     * 
     * @param updatecounter
     */
    public void setUpdatecounter(java.lang.Long updatecounter) {
        this.updatecounter = updatecounter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceType)) return false;
        RequestForChangePadraoInstanceType other = (RequestForChangePadraoInstanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.descriptionStructure==null && other.getDescriptionStructure()==null) || 
             (this.descriptionStructure!=null &&
              this.descriptionStructure.equals(other.getDescriptionStructure()))) &&
            ((this.middle==null && other.getMiddle()==null) || 
             (this.middle!=null &&
              this.middle.equals(other.getMiddle()))) &&
            ((this.tituloRDM==null && other.getTituloRDM()==null) || 
             (this.tituloRDM!=null &&
              this.tituloRDM.equals(other.getTituloRDM()))) &&
            ((this.testeOutrosNome==null && other.getTesteOutrosNome()==null) || 
             (this.testeOutrosNome!=null &&
              this.testeOutrosNome.equals(other.getTesteOutrosNome()))) &&
            ((this.implantacaoPlanoRetornoAposImplantacao==null && other.getImplantacaoPlanoRetornoAposImplantacao()==null) || 
             (this.implantacaoPlanoRetornoAposImplantacao!=null &&
              this.implantacaoPlanoRetornoAposImplantacao.equals(other.getImplantacaoPlanoRetornoAposImplantacao()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.uniquequery==null && other.getUniquequery()==null) || 
             (this.uniquequery!=null &&
              this.uniquequery.equals(other.getUniquequery()))) &&
            ((this.recordid==null && other.getRecordid()==null) || 
             (this.recordid!=null &&
              this.recordid.equals(other.getRecordid()))) &&
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getDescriptionStructure() != null) {
            _hashCode += getDescriptionStructure().hashCode();
        }
        if (getMiddle() != null) {
            _hashCode += getMiddle().hashCode();
        }
        if (getTituloRDM() != null) {
            _hashCode += getTituloRDM().hashCode();
        }
        if (getTesteOutrosNome() != null) {
            _hashCode += getTesteOutrosNome().hashCode();
        }
        if (getImplantacaoPlanoRetornoAposImplantacao() != null) {
            _hashCode += getImplantacaoPlanoRetornoAposImplantacao().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getUniquequery() != null) {
            _hashCode += getUniquequery().hashCode();
        }
        if (getRecordid() != null) {
            _hashCode += getRecordid().hashCode();
        }
        if (getUpdatecounter() != null) {
            _hashCode += getUpdatecounter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RequestForChangePadraoInstanceType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("query");
        attrField.setXmlName(new javax.xml.namespace.QName("", "query"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("uniquequery");
        attrField.setXmlName(new javax.xml.namespace.QName("", "uniquequery"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recordid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "recordid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("updatecounter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "updatecounter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>header"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionStructure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "description.structure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>description.structure"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "middle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>middle"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tituloRDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TituloRDM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeOutrosNome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TesteOutrosNome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoPlanoRetornoAposImplantacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoPlanoRetornoAposImplantacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>ImplantacaoPlanoRetornoAposImplantacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "AttachmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "attachment"));
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
