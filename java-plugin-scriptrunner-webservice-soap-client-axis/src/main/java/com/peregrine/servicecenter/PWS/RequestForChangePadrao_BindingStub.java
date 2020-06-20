/**
 * RequestForChangePadrao_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadrao_BindingStub extends org.apache.axis.client.Stub implements com.peregrine.servicecenter.PWS.RequestForChangePadrao_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveRequestForChangePadrao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RetrieveRequestForChangePadraoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoRequest"), com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoResponse"));
        oper.setReturnClass(com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RetrieveRequestForChangePadraoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveRequestForChangePadraoKeysList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RetrieveRequestForChangePadraoKeysListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoKeysListRequest"), com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoKeysListResponse"));
        oper.setReturnClass(com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RetrieveRequestForChangePadraoKeysListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RetrieveRequestForChangePadraoList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RetrieveRequestForChangePadraoListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoListRequest"), com.peregrine.servicecenter.PWS.RequestForChangePadraoKeysType[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "keys"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoListResponse"));
        oper.setReturnClass(com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RetrieveRequestForChangePadraoListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateRequestForChangePadrao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "UpdateRequestForChangePadraoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">UpdateRequestForChangePadraoRequest"), com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">UpdateRequestForChangePadraoResponse"));
        oper.setReturnClass(com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "UpdateRequestForChangePadraoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmeterSolicitanteRequestForChangePadrao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "SubmeterSolicitanteRequestForChangePadraoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">SubmeterSolicitanteRequestForChangePadraoRequest"), com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">SubmeterSolicitanteRequestForChangePadraoResponse"));
        oper.setReturnClass(com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "SubmeterSolicitanteRequestForChangePadraoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateRequestForChangePadrao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "CreateRequestForChangePadraoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">CreateRequestForChangePadraoRequest"), com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">CreateRequestForChangePadraoResponse"));
        oper.setReturnClass(com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "CreateRequestForChangePadraoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmeterGmudRequestForChangePadrao");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "SubmeterGmudRequestForChangePadraoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">SubmeterGmudRequestForChangePadraoRequest"), com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">SubmeterGmudRequestForChangePadraoResponse"));
        oper.setReturnClass(com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "SubmeterGmudRequestForChangePadraoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

    }

    public RequestForChangePadrao_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RequestForChangePadrao_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RequestForChangePadrao_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "ArrayType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.ArrayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "AttachmentsType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.AttachmentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "AttachmentType");
            qName2 = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "AttachmentType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.AttachmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.BooleanType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "DateTimeType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.DateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "MessagesType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.MessageType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "MessageType");
            qName2 = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "MessageType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.MessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.StringType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StructureType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.Common.StructureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>description.structure>Descricao");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureDescricao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>description.structure>ImplantacaoPlanoRetornoDuranteImplantacao");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructureImplantacaoPlanoRetornoDuranteImplantacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>BeneficioBanco");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleBeneficioBanco.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>CentroDeCusto");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleCentroDeCusto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>DescricaoCentroCusto");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoPreRequisito");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoRespValComoSeraFeito");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValComoSeraFeito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoRespValMomento");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValMomento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoServicoAfetadoAfetaCliente");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoAfetaCliente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoServicoAfetadoNome");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoNome.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>MotivoRDM");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleMotivoRDM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">CreateRequestForChangePadraoRequest");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">CreateRequestForChangePadraoResponse");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>description.structure");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>header");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>ImplantacaoPlanoRetornoAposImplantacao");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeImplantacaoPlanoRetornoAposImplantacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>middle");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoKeysListRequest");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoKeysListResponse");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoListRequest");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoKeysType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RequestForChangePadraoKeysType");
            qName2 = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "keys");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoListResponse");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoRequest");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RetrieveRequestForChangePadraoResponse");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">SubmeterGmudRequestForChangePadraoRequest");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">SubmeterGmudRequestForChangePadraoResponse");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">SubmeterSolicitanteRequestForChangePadraoRequest");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">SubmeterSolicitanteRequestForChangePadraoResponse");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">UpdateRequestForChangePadraoRequest");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">UpdateRequestForChangePadraoResponse");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RequestForChangePadraoInstanceType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RequestForChangePadraoKeysType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoKeysType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "RequestForChangePadraoModelType");
            cachedSerQNames.add(qName);
            cls = com.peregrine.servicecenter.PWS.RequestForChangePadraoModelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoResponse retrieveRequestForChangePadrao(com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoRequest retrieveRequestForChangePadraoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrieveRequestForChangePadrao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveRequestForChangePadraoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListResponse retrieveRequestForChangePadraoKeysList(com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListRequest retrieveRequestForChangePadraoKeysListRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("RetrieveKeysList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrieveRequestForChangePadraoKeysList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveRequestForChangePadraoKeysListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoKeysListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoListResponse retrieveRequestForChangePadraoList(com.peregrine.servicecenter.PWS.RequestForChangePadraoKeysType[] retrieveRequestForChangePadraoListRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("RetrieveList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RetrieveRequestForChangePadraoList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveRequestForChangePadraoListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoResponse updateRequestForChangePadrao(com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoRequest updateRequestForChangePadraoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateRequestForChangePadrao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {updateRequestForChangePadraoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.peregrine.servicecenter.PWS.UpdateRequestForChangePadraoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoResponse submeterSolicitanteRequestForChangePadrao(com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoRequest submeterSolicitanteRequestForChangePadraoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SubmeterSolicitante");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubmeterSolicitanteRequestForChangePadrao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {submeterSolicitanteRequestForChangePadraoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.peregrine.servicecenter.PWS.SubmeterSolicitanteRequestForChangePadraoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoResponse createRequestForChangePadrao(com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoRequest createRequestForChangePadraoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateRequestForChangePadrao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createRequestForChangePadraoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.peregrine.servicecenter.PWS.CreateRequestForChangePadraoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoResponse submeterGmudRequestForChangePadrao(com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoRequest submeterGmudRequestForChangePadraoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("SubmeterGmud");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubmeterGmudRequestForChangePadrao"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {submeterGmudRequestForChangePadraoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.peregrine.servicecenter.PWS.SubmeterGmudRequestForChangePadraoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
