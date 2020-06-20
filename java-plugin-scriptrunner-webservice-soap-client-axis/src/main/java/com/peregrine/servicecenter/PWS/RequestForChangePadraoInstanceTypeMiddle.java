/**
 * RequestForChangePadraoInstanceTypeMiddle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.peregrine.servicecenter.PWS;

public class RequestForChangePadraoInstanceTypeMiddle  extends com.peregrine.servicecenter.PWS.Common.StructureType  implements java.io.Serializable {
    private com.peregrine.servicecenter.PWS.Common.StringType prioridadeTipo;

    private com.peregrine.servicecenter.PWS.Common.BooleanType submeterGmud;

    private com.peregrine.servicecenter.PWS.Common.StringType prioridadeImpacto;

    private com.peregrine.servicecenter.PWS.Common.StringType prioridadeAbrangencia;

    private com.peregrine.servicecenter.PWS.Common.StringType estrategiaImplantacao;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValComoSeraFeito implantacaoRespValComoSeraFeito;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleMotivoRDM motivoRDM;

    private com.peregrine.servicecenter.PWS.Common.StringType deptoResponsavel;

    private com.peregrine.servicecenter.PWS.Common.StringType deptoNome;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito implantacaoPreRequisito;

    private com.peregrine.servicecenter.PWS.Common.StringType gestor;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleCentroDeCusto centroDeCusto;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto descricaoCentroCusto;

    private com.peregrine.servicecenter.PWS.Common.StringType implantacaoValPlataforma;

    private com.peregrine.servicecenter.PWS.Common.StringType prioridadeSubTipo;

    private com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoValInicioIndisponibilidade;

    private com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoTmpRetornoDuranteImplantacao;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleBeneficioBanco beneficioBanco;

    private com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoValidacaoFimIndisponibilidade;

    private com.peregrine.servicecenter.PWS.Common.BooleanType submeteSolicitante;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoNome implantacaoServicoAfetadoNome;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoAfetaCliente implantacaoServicoAfetadoAfetaCliente;

    private com.peregrine.servicecenter.PWS.Common.StringType fatorAgrupamento;

    private com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoTmpRetornoAposImplantacao;

    private com.peregrine.servicecenter.PWS.Common.StringType implantacaoInstReinstHdwSfw;

    private com.peregrine.servicecenter.PWS.Common.BooleanType testeIntegrado;

    private com.peregrine.servicecenter.PWS.Common.BooleanType testeHomologacao;

    private com.peregrine.servicecenter.PWS.Common.BooleanType testeOutros;

    private com.peregrine.servicecenter.PWS.Common.BooleanType testeUnitario;

    private com.peregrine.servicecenter.PWS.Common.BooleanType testedeStress;

    private com.peregrine.servicecenter.PWS.Common.BooleanType testePreProducao;

    private com.peregrine.servicecenter.PWS.Common.StringType testeHomologacaoTVP;

    private com.peregrine.servicecenter.PWS.Common.BooleanType atividadeExecutadaFornecedor;

    private com.peregrine.servicecenter.PWS.Common.StringType fornecedor;

    private com.peregrine.servicecenter.PWS.Common.BooleanType implantacaoAplicacaoTesteVulnerabilidade;

    private com.peregrine.servicecenter.PWS.Common.BooleanType utilizamProtocoloComunicacao;

    private com.peregrine.servicecenter.PWS.Common.BooleanType implantacaoValAlteracaoSitePagina;

    private com.peregrine.servicecenter.PWS.Common.StringType localdaMudanca;

    private com.peregrine.servicecenter.PWS.Common.StringType implantacaoRespValNome;

    private com.peregrine.servicecenter.PWS.Common.StringType implantacaoRespValTelefone;

    private com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValMomento implantacaoRespValMomento;

    private com.peregrine.servicecenter.PWS.Common.BooleanType testeRealizado;

    public RequestForChangePadraoInstanceTypeMiddle() {
    }

    public RequestForChangePadraoInstanceTypeMiddle(
           java.lang.String type,
           com.peregrine.servicecenter.PWS.Common.StringType prioridadeTipo,
           com.peregrine.servicecenter.PWS.Common.BooleanType submeterGmud,
           com.peregrine.servicecenter.PWS.Common.StringType prioridadeImpacto,
           com.peregrine.servicecenter.PWS.Common.StringType prioridadeAbrangencia,
           com.peregrine.servicecenter.PWS.Common.StringType estrategiaImplantacao,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValComoSeraFeito implantacaoRespValComoSeraFeito,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleMotivoRDM motivoRDM,
           com.peregrine.servicecenter.PWS.Common.StringType deptoResponsavel,
           com.peregrine.servicecenter.PWS.Common.StringType deptoNome,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito implantacaoPreRequisito,
           com.peregrine.servicecenter.PWS.Common.StringType gestor,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleCentroDeCusto centroDeCusto,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto descricaoCentroCusto,
           com.peregrine.servicecenter.PWS.Common.StringType implantacaoValPlataforma,
           com.peregrine.servicecenter.PWS.Common.StringType prioridadeSubTipo,
           com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoValInicioIndisponibilidade,
           com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoTmpRetornoDuranteImplantacao,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleBeneficioBanco beneficioBanco,
           com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoValidacaoFimIndisponibilidade,
           com.peregrine.servicecenter.PWS.Common.BooleanType submeteSolicitante,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoNome implantacaoServicoAfetadoNome,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoAfetaCliente implantacaoServicoAfetadoAfetaCliente,
           com.peregrine.servicecenter.PWS.Common.StringType fatorAgrupamento,
           com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoTmpRetornoAposImplantacao,
           com.peregrine.servicecenter.PWS.Common.StringType implantacaoInstReinstHdwSfw,
           com.peregrine.servicecenter.PWS.Common.BooleanType testeIntegrado,
           com.peregrine.servicecenter.PWS.Common.BooleanType testeHomologacao,
           com.peregrine.servicecenter.PWS.Common.BooleanType testeOutros,
           com.peregrine.servicecenter.PWS.Common.BooleanType testeUnitario,
           com.peregrine.servicecenter.PWS.Common.BooleanType testedeStress,
           com.peregrine.servicecenter.PWS.Common.BooleanType testePreProducao,
           com.peregrine.servicecenter.PWS.Common.StringType testeHomologacaoTVP,
           com.peregrine.servicecenter.PWS.Common.BooleanType atividadeExecutadaFornecedor,
           com.peregrine.servicecenter.PWS.Common.StringType fornecedor,
           com.peregrine.servicecenter.PWS.Common.BooleanType implantacaoAplicacaoTesteVulnerabilidade,
           com.peregrine.servicecenter.PWS.Common.BooleanType utilizamProtocoloComunicacao,
           com.peregrine.servicecenter.PWS.Common.BooleanType implantacaoValAlteracaoSitePagina,
           com.peregrine.servicecenter.PWS.Common.StringType localdaMudanca,
           com.peregrine.servicecenter.PWS.Common.StringType implantacaoRespValNome,
           com.peregrine.servicecenter.PWS.Common.StringType implantacaoRespValTelefone,
           com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValMomento implantacaoRespValMomento,
           com.peregrine.servicecenter.PWS.Common.BooleanType testeRealizado) {
        super(
            type);
        this.prioridadeTipo = prioridadeTipo;
        this.submeterGmud = submeterGmud;
        this.prioridadeImpacto = prioridadeImpacto;
        this.prioridadeAbrangencia = prioridadeAbrangencia;
        this.estrategiaImplantacao = estrategiaImplantacao;
        this.implantacaoRespValComoSeraFeito = implantacaoRespValComoSeraFeito;
        this.motivoRDM = motivoRDM;
        this.deptoResponsavel = deptoResponsavel;
        this.deptoNome = deptoNome;
        this.implantacaoPreRequisito = implantacaoPreRequisito;
        this.gestor = gestor;
        this.centroDeCusto = centroDeCusto;
        this.descricaoCentroCusto = descricaoCentroCusto;
        this.implantacaoValPlataforma = implantacaoValPlataforma;
        this.prioridadeSubTipo = prioridadeSubTipo;
        this.implantacaoValInicioIndisponibilidade = implantacaoValInicioIndisponibilidade;
        this.implantacaoTmpRetornoDuranteImplantacao = implantacaoTmpRetornoDuranteImplantacao;
        this.beneficioBanco = beneficioBanco;
        this.implantacaoValidacaoFimIndisponibilidade = implantacaoValidacaoFimIndisponibilidade;
        this.submeteSolicitante = submeteSolicitante;
        this.implantacaoServicoAfetadoNome = implantacaoServicoAfetadoNome;
        this.implantacaoServicoAfetadoAfetaCliente = implantacaoServicoAfetadoAfetaCliente;
        this.fatorAgrupamento = fatorAgrupamento;
        this.implantacaoTmpRetornoAposImplantacao = implantacaoTmpRetornoAposImplantacao;
        this.implantacaoInstReinstHdwSfw = implantacaoInstReinstHdwSfw;
        this.testeIntegrado = testeIntegrado;
        this.testeHomologacao = testeHomologacao;
        this.testeOutros = testeOutros;
        this.testeUnitario = testeUnitario;
        this.testedeStress = testedeStress;
        this.testePreProducao = testePreProducao;
        this.testeHomologacaoTVP = testeHomologacaoTVP;
        this.atividadeExecutadaFornecedor = atividadeExecutadaFornecedor;
        this.fornecedor = fornecedor;
        this.implantacaoAplicacaoTesteVulnerabilidade = implantacaoAplicacaoTesteVulnerabilidade;
        this.utilizamProtocoloComunicacao = utilizamProtocoloComunicacao;
        this.implantacaoValAlteracaoSitePagina = implantacaoValAlteracaoSitePagina;
        this.localdaMudanca = localdaMudanca;
        this.implantacaoRespValNome = implantacaoRespValNome;
        this.implantacaoRespValTelefone = implantacaoRespValTelefone;
        this.implantacaoRespValMomento = implantacaoRespValMomento;
        this.testeRealizado = testeRealizado;
    }


    /**
     * Gets the prioridadeTipo value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return prioridadeTipo
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getPrioridadeTipo() {
        return prioridadeTipo;
    }


    /**
     * Sets the prioridadeTipo value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param prioridadeTipo
     */
    public void setPrioridadeTipo(com.peregrine.servicecenter.PWS.Common.StringType prioridadeTipo) {
        this.prioridadeTipo = prioridadeTipo;
    }


    /**
     * Gets the submeterGmud value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return submeterGmud
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getSubmeterGmud() {
        return submeterGmud;
    }


    /**
     * Sets the submeterGmud value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param submeterGmud
     */
    public void setSubmeterGmud(com.peregrine.servicecenter.PWS.Common.BooleanType submeterGmud) {
        this.submeterGmud = submeterGmud;
    }


    /**
     * Gets the prioridadeImpacto value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return prioridadeImpacto
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getPrioridadeImpacto() {
        return prioridadeImpacto;
    }


    /**
     * Sets the prioridadeImpacto value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param prioridadeImpacto
     */
    public void setPrioridadeImpacto(com.peregrine.servicecenter.PWS.Common.StringType prioridadeImpacto) {
        this.prioridadeImpacto = prioridadeImpacto;
    }


    /**
     * Gets the prioridadeAbrangencia value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return prioridadeAbrangencia
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getPrioridadeAbrangencia() {
        return prioridadeAbrangencia;
    }


    /**
     * Sets the prioridadeAbrangencia value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param prioridadeAbrangencia
     */
    public void setPrioridadeAbrangencia(com.peregrine.servicecenter.PWS.Common.StringType prioridadeAbrangencia) {
        this.prioridadeAbrangencia = prioridadeAbrangencia;
    }


    /**
     * Gets the estrategiaImplantacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return estrategiaImplantacao
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getEstrategiaImplantacao() {
        return estrategiaImplantacao;
    }


    /**
     * Sets the estrategiaImplantacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param estrategiaImplantacao
     */
    public void setEstrategiaImplantacao(com.peregrine.servicecenter.PWS.Common.StringType estrategiaImplantacao) {
        this.estrategiaImplantacao = estrategiaImplantacao;
    }


    /**
     * Gets the implantacaoRespValComoSeraFeito value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoRespValComoSeraFeito
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValComoSeraFeito getImplantacaoRespValComoSeraFeito() {
        return implantacaoRespValComoSeraFeito;
    }


    /**
     * Sets the implantacaoRespValComoSeraFeito value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoRespValComoSeraFeito
     */
    public void setImplantacaoRespValComoSeraFeito(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValComoSeraFeito implantacaoRespValComoSeraFeito) {
        this.implantacaoRespValComoSeraFeito = implantacaoRespValComoSeraFeito;
    }


    /**
     * Gets the motivoRDM value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return motivoRDM
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleMotivoRDM getMotivoRDM() {
        return motivoRDM;
    }


    /**
     * Sets the motivoRDM value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param motivoRDM
     */
    public void setMotivoRDM(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleMotivoRDM motivoRDM) {
        this.motivoRDM = motivoRDM;
    }


    /**
     * Gets the deptoResponsavel value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return deptoResponsavel
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getDeptoResponsavel() {
        return deptoResponsavel;
    }


    /**
     * Sets the deptoResponsavel value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param deptoResponsavel
     */
    public void setDeptoResponsavel(com.peregrine.servicecenter.PWS.Common.StringType deptoResponsavel) {
        this.deptoResponsavel = deptoResponsavel;
    }


    /**
     * Gets the deptoNome value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return deptoNome
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getDeptoNome() {
        return deptoNome;
    }


    /**
     * Sets the deptoNome value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param deptoNome
     */
    public void setDeptoNome(com.peregrine.servicecenter.PWS.Common.StringType deptoNome) {
        this.deptoNome = deptoNome;
    }


    /**
     * Gets the implantacaoPreRequisito value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoPreRequisito
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito getImplantacaoPreRequisito() {
        return implantacaoPreRequisito;
    }


    /**
     * Sets the implantacaoPreRequisito value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoPreRequisito
     */
    public void setImplantacaoPreRequisito(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoPreRequisito implantacaoPreRequisito) {
        this.implantacaoPreRequisito = implantacaoPreRequisito;
    }


    /**
     * Gets the gestor value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return gestor
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getGestor() {
        return gestor;
    }


    /**
     * Sets the gestor value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param gestor
     */
    public void setGestor(com.peregrine.servicecenter.PWS.Common.StringType gestor) {
        this.gestor = gestor;
    }


    /**
     * Gets the centroDeCusto value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return centroDeCusto
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleCentroDeCusto getCentroDeCusto() {
        return centroDeCusto;
    }


    /**
     * Sets the centroDeCusto value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param centroDeCusto
     */
    public void setCentroDeCusto(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleCentroDeCusto centroDeCusto) {
        this.centroDeCusto = centroDeCusto;
    }


    /**
     * Gets the descricaoCentroCusto value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return descricaoCentroCusto
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto getDescricaoCentroCusto() {
        return descricaoCentroCusto;
    }


    /**
     * Sets the descricaoCentroCusto value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param descricaoCentroCusto
     */
    public void setDescricaoCentroCusto(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleDescricaoCentroCusto descricaoCentroCusto) {
        this.descricaoCentroCusto = descricaoCentroCusto;
    }


    /**
     * Gets the implantacaoValPlataforma value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoValPlataforma
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getImplantacaoValPlataforma() {
        return implantacaoValPlataforma;
    }


    /**
     * Sets the implantacaoValPlataforma value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoValPlataforma
     */
    public void setImplantacaoValPlataforma(com.peregrine.servicecenter.PWS.Common.StringType implantacaoValPlataforma) {
        this.implantacaoValPlataforma = implantacaoValPlataforma;
    }


    /**
     * Gets the prioridadeSubTipo value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return prioridadeSubTipo
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getPrioridadeSubTipo() {
        return prioridadeSubTipo;
    }


    /**
     * Sets the prioridadeSubTipo value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param prioridadeSubTipo
     */
    public void setPrioridadeSubTipo(com.peregrine.servicecenter.PWS.Common.StringType prioridadeSubTipo) {
        this.prioridadeSubTipo = prioridadeSubTipo;
    }


    /**
     * Gets the implantacaoValInicioIndisponibilidade value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoValInicioIndisponibilidade
     */
    public com.peregrine.servicecenter.PWS.Common.DateTimeType getImplantacaoValInicioIndisponibilidade() {
        return implantacaoValInicioIndisponibilidade;
    }


    /**
     * Sets the implantacaoValInicioIndisponibilidade value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoValInicioIndisponibilidade
     */
    public void setImplantacaoValInicioIndisponibilidade(com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoValInicioIndisponibilidade) {
        this.implantacaoValInicioIndisponibilidade = implantacaoValInicioIndisponibilidade;
    }


    /**
     * Gets the implantacaoTmpRetornoDuranteImplantacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoTmpRetornoDuranteImplantacao
     */
    public com.peregrine.servicecenter.PWS.Common.DateTimeType getImplantacaoTmpRetornoDuranteImplantacao() {
        return implantacaoTmpRetornoDuranteImplantacao;
    }


    /**
     * Sets the implantacaoTmpRetornoDuranteImplantacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoTmpRetornoDuranteImplantacao
     */
    public void setImplantacaoTmpRetornoDuranteImplantacao(com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoTmpRetornoDuranteImplantacao) {
        this.implantacaoTmpRetornoDuranteImplantacao = implantacaoTmpRetornoDuranteImplantacao;
    }


    /**
     * Gets the beneficioBanco value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return beneficioBanco
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleBeneficioBanco getBeneficioBanco() {
        return beneficioBanco;
    }


    /**
     * Sets the beneficioBanco value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param beneficioBanco
     */
    public void setBeneficioBanco(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleBeneficioBanco beneficioBanco) {
        this.beneficioBanco = beneficioBanco;
    }


    /**
     * Gets the implantacaoValidacaoFimIndisponibilidade value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoValidacaoFimIndisponibilidade
     */
    public com.peregrine.servicecenter.PWS.Common.DateTimeType getImplantacaoValidacaoFimIndisponibilidade() {
        return implantacaoValidacaoFimIndisponibilidade;
    }


    /**
     * Sets the implantacaoValidacaoFimIndisponibilidade value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoValidacaoFimIndisponibilidade
     */
    public void setImplantacaoValidacaoFimIndisponibilidade(com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoValidacaoFimIndisponibilidade) {
        this.implantacaoValidacaoFimIndisponibilidade = implantacaoValidacaoFimIndisponibilidade;
    }


    /**
     * Gets the submeteSolicitante value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return submeteSolicitante
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getSubmeteSolicitante() {
        return submeteSolicitante;
    }


    /**
     * Sets the submeteSolicitante value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param submeteSolicitante
     */
    public void setSubmeteSolicitante(com.peregrine.servicecenter.PWS.Common.BooleanType submeteSolicitante) {
        this.submeteSolicitante = submeteSolicitante;
    }


    /**
     * Gets the implantacaoServicoAfetadoNome value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoServicoAfetadoNome
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoNome getImplantacaoServicoAfetadoNome() {
        return implantacaoServicoAfetadoNome;
    }


    /**
     * Sets the implantacaoServicoAfetadoNome value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoServicoAfetadoNome
     */
    public void setImplantacaoServicoAfetadoNome(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoNome implantacaoServicoAfetadoNome) {
        this.implantacaoServicoAfetadoNome = implantacaoServicoAfetadoNome;
    }


    /**
     * Gets the implantacaoServicoAfetadoAfetaCliente value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoServicoAfetadoAfetaCliente
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoAfetaCliente getImplantacaoServicoAfetadoAfetaCliente() {
        return implantacaoServicoAfetadoAfetaCliente;
    }


    /**
     * Sets the implantacaoServicoAfetadoAfetaCliente value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoServicoAfetadoAfetaCliente
     */
    public void setImplantacaoServicoAfetadoAfetaCliente(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoServicoAfetadoAfetaCliente implantacaoServicoAfetadoAfetaCliente) {
        this.implantacaoServicoAfetadoAfetaCliente = implantacaoServicoAfetadoAfetaCliente;
    }


    /**
     * Gets the fatorAgrupamento value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return fatorAgrupamento
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getFatorAgrupamento() {
        return fatorAgrupamento;
    }


    /**
     * Sets the fatorAgrupamento value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param fatorAgrupamento
     */
    public void setFatorAgrupamento(com.peregrine.servicecenter.PWS.Common.StringType fatorAgrupamento) {
        this.fatorAgrupamento = fatorAgrupamento;
    }


    /**
     * Gets the implantacaoTmpRetornoAposImplantacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoTmpRetornoAposImplantacao
     */
    public com.peregrine.servicecenter.PWS.Common.DateTimeType getImplantacaoTmpRetornoAposImplantacao() {
        return implantacaoTmpRetornoAposImplantacao;
    }


    /**
     * Sets the implantacaoTmpRetornoAposImplantacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoTmpRetornoAposImplantacao
     */
    public void setImplantacaoTmpRetornoAposImplantacao(com.peregrine.servicecenter.PWS.Common.DateTimeType implantacaoTmpRetornoAposImplantacao) {
        this.implantacaoTmpRetornoAposImplantacao = implantacaoTmpRetornoAposImplantacao;
    }


    /**
     * Gets the implantacaoInstReinstHdwSfw value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoInstReinstHdwSfw
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getImplantacaoInstReinstHdwSfw() {
        return implantacaoInstReinstHdwSfw;
    }


    /**
     * Sets the implantacaoInstReinstHdwSfw value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoInstReinstHdwSfw
     */
    public void setImplantacaoInstReinstHdwSfw(com.peregrine.servicecenter.PWS.Common.StringType implantacaoInstReinstHdwSfw) {
        this.implantacaoInstReinstHdwSfw = implantacaoInstReinstHdwSfw;
    }


    /**
     * Gets the testeIntegrado value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return testeIntegrado
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getTesteIntegrado() {
        return testeIntegrado;
    }


    /**
     * Sets the testeIntegrado value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param testeIntegrado
     */
    public void setTesteIntegrado(com.peregrine.servicecenter.PWS.Common.BooleanType testeIntegrado) {
        this.testeIntegrado = testeIntegrado;
    }


    /**
     * Gets the testeHomologacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return testeHomologacao
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getTesteHomologacao() {
        return testeHomologacao;
    }


    /**
     * Sets the testeHomologacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param testeHomologacao
     */
    public void setTesteHomologacao(com.peregrine.servicecenter.PWS.Common.BooleanType testeHomologacao) {
        this.testeHomologacao = testeHomologacao;
    }


    /**
     * Gets the testeOutros value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return testeOutros
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getTesteOutros() {
        return testeOutros;
    }


    /**
     * Sets the testeOutros value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param testeOutros
     */
    public void setTesteOutros(com.peregrine.servicecenter.PWS.Common.BooleanType testeOutros) {
        this.testeOutros = testeOutros;
    }


    /**
     * Gets the testeUnitario value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return testeUnitario
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getTesteUnitario() {
        return testeUnitario;
    }


    /**
     * Sets the testeUnitario value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param testeUnitario
     */
    public void setTesteUnitario(com.peregrine.servicecenter.PWS.Common.BooleanType testeUnitario) {
        this.testeUnitario = testeUnitario;
    }


    /**
     * Gets the testedeStress value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return testedeStress
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getTestedeStress() {
        return testedeStress;
    }


    /**
     * Sets the testedeStress value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param testedeStress
     */
    public void setTestedeStress(com.peregrine.servicecenter.PWS.Common.BooleanType testedeStress) {
        this.testedeStress = testedeStress;
    }


    /**
     * Gets the testePreProducao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return testePreProducao
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getTestePreProducao() {
        return testePreProducao;
    }


    /**
     * Sets the testePreProducao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param testePreProducao
     */
    public void setTestePreProducao(com.peregrine.servicecenter.PWS.Common.BooleanType testePreProducao) {
        this.testePreProducao = testePreProducao;
    }


    /**
     * Gets the testeHomologacaoTVP value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return testeHomologacaoTVP
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getTesteHomologacaoTVP() {
        return testeHomologacaoTVP;
    }


    /**
     * Sets the testeHomologacaoTVP value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param testeHomologacaoTVP
     */
    public void setTesteHomologacaoTVP(com.peregrine.servicecenter.PWS.Common.StringType testeHomologacaoTVP) {
        this.testeHomologacaoTVP = testeHomologacaoTVP;
    }


    /**
     * Gets the atividadeExecutadaFornecedor value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return atividadeExecutadaFornecedor
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getAtividadeExecutadaFornecedor() {
        return atividadeExecutadaFornecedor;
    }


    /**
     * Sets the atividadeExecutadaFornecedor value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param atividadeExecutadaFornecedor
     */
    public void setAtividadeExecutadaFornecedor(com.peregrine.servicecenter.PWS.Common.BooleanType atividadeExecutadaFornecedor) {
        this.atividadeExecutadaFornecedor = atividadeExecutadaFornecedor;
    }


    /**
     * Gets the fornecedor value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return fornecedor
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getFornecedor() {
        return fornecedor;
    }


    /**
     * Sets the fornecedor value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param fornecedor
     */
    public void setFornecedor(com.peregrine.servicecenter.PWS.Common.StringType fornecedor) {
        this.fornecedor = fornecedor;
    }


    /**
     * Gets the implantacaoAplicacaoTesteVulnerabilidade value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoAplicacaoTesteVulnerabilidade
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getImplantacaoAplicacaoTesteVulnerabilidade() {
        return implantacaoAplicacaoTesteVulnerabilidade;
    }


    /**
     * Sets the implantacaoAplicacaoTesteVulnerabilidade value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoAplicacaoTesteVulnerabilidade
     */
    public void setImplantacaoAplicacaoTesteVulnerabilidade(com.peregrine.servicecenter.PWS.Common.BooleanType implantacaoAplicacaoTesteVulnerabilidade) {
        this.implantacaoAplicacaoTesteVulnerabilidade = implantacaoAplicacaoTesteVulnerabilidade;
    }


    /**
     * Gets the utilizamProtocoloComunicacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return utilizamProtocoloComunicacao
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getUtilizamProtocoloComunicacao() {
        return utilizamProtocoloComunicacao;
    }


    /**
     * Sets the utilizamProtocoloComunicacao value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param utilizamProtocoloComunicacao
     */
    public void setUtilizamProtocoloComunicacao(com.peregrine.servicecenter.PWS.Common.BooleanType utilizamProtocoloComunicacao) {
        this.utilizamProtocoloComunicacao = utilizamProtocoloComunicacao;
    }


    /**
     * Gets the implantacaoValAlteracaoSitePagina value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoValAlteracaoSitePagina
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getImplantacaoValAlteracaoSitePagina() {
        return implantacaoValAlteracaoSitePagina;
    }


    /**
     * Sets the implantacaoValAlteracaoSitePagina value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoValAlteracaoSitePagina
     */
    public void setImplantacaoValAlteracaoSitePagina(com.peregrine.servicecenter.PWS.Common.BooleanType implantacaoValAlteracaoSitePagina) {
        this.implantacaoValAlteracaoSitePagina = implantacaoValAlteracaoSitePagina;
    }


    /**
     * Gets the localdaMudanca value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return localdaMudanca
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getLocaldaMudanca() {
        return localdaMudanca;
    }


    /**
     * Sets the localdaMudanca value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param localdaMudanca
     */
    public void setLocaldaMudanca(com.peregrine.servicecenter.PWS.Common.StringType localdaMudanca) {
        this.localdaMudanca = localdaMudanca;
    }


    /**
     * Gets the implantacaoRespValNome value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoRespValNome
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getImplantacaoRespValNome() {
        return implantacaoRespValNome;
    }


    /**
     * Sets the implantacaoRespValNome value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoRespValNome
     */
    public void setImplantacaoRespValNome(com.peregrine.servicecenter.PWS.Common.StringType implantacaoRespValNome) {
        this.implantacaoRespValNome = implantacaoRespValNome;
    }


    /**
     * Gets the implantacaoRespValTelefone value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoRespValTelefone
     */
    public com.peregrine.servicecenter.PWS.Common.StringType getImplantacaoRespValTelefone() {
        return implantacaoRespValTelefone;
    }


    /**
     * Sets the implantacaoRespValTelefone value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoRespValTelefone
     */
    public void setImplantacaoRespValTelefone(com.peregrine.servicecenter.PWS.Common.StringType implantacaoRespValTelefone) {
        this.implantacaoRespValTelefone = implantacaoRespValTelefone;
    }


    /**
     * Gets the implantacaoRespValMomento value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return implantacaoRespValMomento
     */
    public com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValMomento getImplantacaoRespValMomento() {
        return implantacaoRespValMomento;
    }


    /**
     * Sets the implantacaoRespValMomento value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param implantacaoRespValMomento
     */
    public void setImplantacaoRespValMomento(com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddleImplantacaoRespValMomento implantacaoRespValMomento) {
        this.implantacaoRespValMomento = implantacaoRespValMomento;
    }


    /**
     * Gets the testeRealizado value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @return testeRealizado
     */
    public com.peregrine.servicecenter.PWS.Common.BooleanType getTesteRealizado() {
        return testeRealizado;
    }


    /**
     * Sets the testeRealizado value for this RequestForChangePadraoInstanceTypeMiddle.
     * 
     * @param testeRealizado
     */
    public void setTesteRealizado(com.peregrine.servicecenter.PWS.Common.BooleanType testeRealizado) {
        this.testeRealizado = testeRealizado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestForChangePadraoInstanceTypeMiddle)) return false;
        RequestForChangePadraoInstanceTypeMiddle other = (RequestForChangePadraoInstanceTypeMiddle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prioridadeTipo==null && other.getPrioridadeTipo()==null) || 
             (this.prioridadeTipo!=null &&
              this.prioridadeTipo.equals(other.getPrioridadeTipo()))) &&
            ((this.submeterGmud==null && other.getSubmeterGmud()==null) || 
             (this.submeterGmud!=null &&
              this.submeterGmud.equals(other.getSubmeterGmud()))) &&
            ((this.prioridadeImpacto==null && other.getPrioridadeImpacto()==null) || 
             (this.prioridadeImpacto!=null &&
              this.prioridadeImpacto.equals(other.getPrioridadeImpacto()))) &&
            ((this.prioridadeAbrangencia==null && other.getPrioridadeAbrangencia()==null) || 
             (this.prioridadeAbrangencia!=null &&
              this.prioridadeAbrangencia.equals(other.getPrioridadeAbrangencia()))) &&
            ((this.estrategiaImplantacao==null && other.getEstrategiaImplantacao()==null) || 
             (this.estrategiaImplantacao!=null &&
              this.estrategiaImplantacao.equals(other.getEstrategiaImplantacao()))) &&
            ((this.implantacaoRespValComoSeraFeito==null && other.getImplantacaoRespValComoSeraFeito()==null) || 
             (this.implantacaoRespValComoSeraFeito!=null &&
              this.implantacaoRespValComoSeraFeito.equals(other.getImplantacaoRespValComoSeraFeito()))) &&
            ((this.motivoRDM==null && other.getMotivoRDM()==null) || 
             (this.motivoRDM!=null &&
              this.motivoRDM.equals(other.getMotivoRDM()))) &&
            ((this.deptoResponsavel==null && other.getDeptoResponsavel()==null) || 
             (this.deptoResponsavel!=null &&
              this.deptoResponsavel.equals(other.getDeptoResponsavel()))) &&
            ((this.deptoNome==null && other.getDeptoNome()==null) || 
             (this.deptoNome!=null &&
              this.deptoNome.equals(other.getDeptoNome()))) &&
            ((this.implantacaoPreRequisito==null && other.getImplantacaoPreRequisito()==null) || 
             (this.implantacaoPreRequisito!=null &&
              this.implantacaoPreRequisito.equals(other.getImplantacaoPreRequisito()))) &&
            ((this.gestor==null && other.getGestor()==null) || 
             (this.gestor!=null &&
              this.gestor.equals(other.getGestor()))) &&
            ((this.centroDeCusto==null && other.getCentroDeCusto()==null) || 
             (this.centroDeCusto!=null &&
              this.centroDeCusto.equals(other.getCentroDeCusto()))) &&
            ((this.descricaoCentroCusto==null && other.getDescricaoCentroCusto()==null) || 
             (this.descricaoCentroCusto!=null &&
              this.descricaoCentroCusto.equals(other.getDescricaoCentroCusto()))) &&
            ((this.implantacaoValPlataforma==null && other.getImplantacaoValPlataforma()==null) || 
             (this.implantacaoValPlataforma!=null &&
              this.implantacaoValPlataforma.equals(other.getImplantacaoValPlataforma()))) &&
            ((this.prioridadeSubTipo==null && other.getPrioridadeSubTipo()==null) || 
             (this.prioridadeSubTipo!=null &&
              this.prioridadeSubTipo.equals(other.getPrioridadeSubTipo()))) &&
            ((this.implantacaoValInicioIndisponibilidade==null && other.getImplantacaoValInicioIndisponibilidade()==null) || 
             (this.implantacaoValInicioIndisponibilidade!=null &&
              this.implantacaoValInicioIndisponibilidade.equals(other.getImplantacaoValInicioIndisponibilidade()))) &&
            ((this.implantacaoTmpRetornoDuranteImplantacao==null && other.getImplantacaoTmpRetornoDuranteImplantacao()==null) || 
             (this.implantacaoTmpRetornoDuranteImplantacao!=null &&
              this.implantacaoTmpRetornoDuranteImplantacao.equals(other.getImplantacaoTmpRetornoDuranteImplantacao()))) &&
            ((this.beneficioBanco==null && other.getBeneficioBanco()==null) || 
             (this.beneficioBanco!=null &&
              this.beneficioBanco.equals(other.getBeneficioBanco()))) &&
            ((this.implantacaoValidacaoFimIndisponibilidade==null && other.getImplantacaoValidacaoFimIndisponibilidade()==null) || 
             (this.implantacaoValidacaoFimIndisponibilidade!=null &&
              this.implantacaoValidacaoFimIndisponibilidade.equals(other.getImplantacaoValidacaoFimIndisponibilidade()))) &&
            ((this.submeteSolicitante==null && other.getSubmeteSolicitante()==null) || 
             (this.submeteSolicitante!=null &&
              this.submeteSolicitante.equals(other.getSubmeteSolicitante()))) &&
            ((this.implantacaoServicoAfetadoNome==null && other.getImplantacaoServicoAfetadoNome()==null) || 
             (this.implantacaoServicoAfetadoNome!=null &&
              this.implantacaoServicoAfetadoNome.equals(other.getImplantacaoServicoAfetadoNome()))) &&
            ((this.implantacaoServicoAfetadoAfetaCliente==null && other.getImplantacaoServicoAfetadoAfetaCliente()==null) || 
             (this.implantacaoServicoAfetadoAfetaCliente!=null &&
              this.implantacaoServicoAfetadoAfetaCliente.equals(other.getImplantacaoServicoAfetadoAfetaCliente()))) &&
            ((this.fatorAgrupamento==null && other.getFatorAgrupamento()==null) || 
             (this.fatorAgrupamento!=null &&
              this.fatorAgrupamento.equals(other.getFatorAgrupamento()))) &&
            ((this.implantacaoTmpRetornoAposImplantacao==null && other.getImplantacaoTmpRetornoAposImplantacao()==null) || 
             (this.implantacaoTmpRetornoAposImplantacao!=null &&
              this.implantacaoTmpRetornoAposImplantacao.equals(other.getImplantacaoTmpRetornoAposImplantacao()))) &&
            ((this.implantacaoInstReinstHdwSfw==null && other.getImplantacaoInstReinstHdwSfw()==null) || 
             (this.implantacaoInstReinstHdwSfw!=null &&
              this.implantacaoInstReinstHdwSfw.equals(other.getImplantacaoInstReinstHdwSfw()))) &&
            ((this.testeIntegrado==null && other.getTesteIntegrado()==null) || 
             (this.testeIntegrado!=null &&
              this.testeIntegrado.equals(other.getTesteIntegrado()))) &&
            ((this.testeHomologacao==null && other.getTesteHomologacao()==null) || 
             (this.testeHomologacao!=null &&
              this.testeHomologacao.equals(other.getTesteHomologacao()))) &&
            ((this.testeOutros==null && other.getTesteOutros()==null) || 
             (this.testeOutros!=null &&
              this.testeOutros.equals(other.getTesteOutros()))) &&
            ((this.testeUnitario==null && other.getTesteUnitario()==null) || 
             (this.testeUnitario!=null &&
              this.testeUnitario.equals(other.getTesteUnitario()))) &&
            ((this.testedeStress==null && other.getTestedeStress()==null) || 
             (this.testedeStress!=null &&
              this.testedeStress.equals(other.getTestedeStress()))) &&
            ((this.testePreProducao==null && other.getTestePreProducao()==null) || 
             (this.testePreProducao!=null &&
              this.testePreProducao.equals(other.getTestePreProducao()))) &&
            ((this.testeHomologacaoTVP==null && other.getTesteHomologacaoTVP()==null) || 
             (this.testeHomologacaoTVP!=null &&
              this.testeHomologacaoTVP.equals(other.getTesteHomologacaoTVP()))) &&
            ((this.atividadeExecutadaFornecedor==null && other.getAtividadeExecutadaFornecedor()==null) || 
             (this.atividadeExecutadaFornecedor!=null &&
              this.atividadeExecutadaFornecedor.equals(other.getAtividadeExecutadaFornecedor()))) &&
            ((this.fornecedor==null && other.getFornecedor()==null) || 
             (this.fornecedor!=null &&
              this.fornecedor.equals(other.getFornecedor()))) &&
            ((this.implantacaoAplicacaoTesteVulnerabilidade==null && other.getImplantacaoAplicacaoTesteVulnerabilidade()==null) || 
             (this.implantacaoAplicacaoTesteVulnerabilidade!=null &&
              this.implantacaoAplicacaoTesteVulnerabilidade.equals(other.getImplantacaoAplicacaoTesteVulnerabilidade()))) &&
            ((this.utilizamProtocoloComunicacao==null && other.getUtilizamProtocoloComunicacao()==null) || 
             (this.utilizamProtocoloComunicacao!=null &&
              this.utilizamProtocoloComunicacao.equals(other.getUtilizamProtocoloComunicacao()))) &&
            ((this.implantacaoValAlteracaoSitePagina==null && other.getImplantacaoValAlteracaoSitePagina()==null) || 
             (this.implantacaoValAlteracaoSitePagina!=null &&
              this.implantacaoValAlteracaoSitePagina.equals(other.getImplantacaoValAlteracaoSitePagina()))) &&
            ((this.localdaMudanca==null && other.getLocaldaMudanca()==null) || 
             (this.localdaMudanca!=null &&
              this.localdaMudanca.equals(other.getLocaldaMudanca()))) &&
            ((this.implantacaoRespValNome==null && other.getImplantacaoRespValNome()==null) || 
             (this.implantacaoRespValNome!=null &&
              this.implantacaoRespValNome.equals(other.getImplantacaoRespValNome()))) &&
            ((this.implantacaoRespValTelefone==null && other.getImplantacaoRespValTelefone()==null) || 
             (this.implantacaoRespValTelefone!=null &&
              this.implantacaoRespValTelefone.equals(other.getImplantacaoRespValTelefone()))) &&
            ((this.implantacaoRespValMomento==null && other.getImplantacaoRespValMomento()==null) || 
             (this.implantacaoRespValMomento!=null &&
              this.implantacaoRespValMomento.equals(other.getImplantacaoRespValMomento()))) &&
            ((this.testeRealizado==null && other.getTesteRealizado()==null) || 
             (this.testeRealizado!=null &&
              this.testeRealizado.equals(other.getTesteRealizado())));
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
        if (getPrioridadeTipo() != null) {
            _hashCode += getPrioridadeTipo().hashCode();
        }
        if (getSubmeterGmud() != null) {
            _hashCode += getSubmeterGmud().hashCode();
        }
        if (getPrioridadeImpacto() != null) {
            _hashCode += getPrioridadeImpacto().hashCode();
        }
        if (getPrioridadeAbrangencia() != null) {
            _hashCode += getPrioridadeAbrangencia().hashCode();
        }
        if (getEstrategiaImplantacao() != null) {
            _hashCode += getEstrategiaImplantacao().hashCode();
        }
        if (getImplantacaoRespValComoSeraFeito() != null) {
            _hashCode += getImplantacaoRespValComoSeraFeito().hashCode();
        }
        if (getMotivoRDM() != null) {
            _hashCode += getMotivoRDM().hashCode();
        }
        if (getDeptoResponsavel() != null) {
            _hashCode += getDeptoResponsavel().hashCode();
        }
        if (getDeptoNome() != null) {
            _hashCode += getDeptoNome().hashCode();
        }
        if (getImplantacaoPreRequisito() != null) {
            _hashCode += getImplantacaoPreRequisito().hashCode();
        }
        if (getGestor() != null) {
            _hashCode += getGestor().hashCode();
        }
        if (getCentroDeCusto() != null) {
            _hashCode += getCentroDeCusto().hashCode();
        }
        if (getDescricaoCentroCusto() != null) {
            _hashCode += getDescricaoCentroCusto().hashCode();
        }
        if (getImplantacaoValPlataforma() != null) {
            _hashCode += getImplantacaoValPlataforma().hashCode();
        }
        if (getPrioridadeSubTipo() != null) {
            _hashCode += getPrioridadeSubTipo().hashCode();
        }
        if (getImplantacaoValInicioIndisponibilidade() != null) {
            _hashCode += getImplantacaoValInicioIndisponibilidade().hashCode();
        }
        if (getImplantacaoTmpRetornoDuranteImplantacao() != null) {
            _hashCode += getImplantacaoTmpRetornoDuranteImplantacao().hashCode();
        }
        if (getBeneficioBanco() != null) {
            _hashCode += getBeneficioBanco().hashCode();
        }
        if (getImplantacaoValidacaoFimIndisponibilidade() != null) {
            _hashCode += getImplantacaoValidacaoFimIndisponibilidade().hashCode();
        }
        if (getSubmeteSolicitante() != null) {
            _hashCode += getSubmeteSolicitante().hashCode();
        }
        if (getImplantacaoServicoAfetadoNome() != null) {
            _hashCode += getImplantacaoServicoAfetadoNome().hashCode();
        }
        if (getImplantacaoServicoAfetadoAfetaCliente() != null) {
            _hashCode += getImplantacaoServicoAfetadoAfetaCliente().hashCode();
        }
        if (getFatorAgrupamento() != null) {
            _hashCode += getFatorAgrupamento().hashCode();
        }
        if (getImplantacaoTmpRetornoAposImplantacao() != null) {
            _hashCode += getImplantacaoTmpRetornoAposImplantacao().hashCode();
        }
        if (getImplantacaoInstReinstHdwSfw() != null) {
            _hashCode += getImplantacaoInstReinstHdwSfw().hashCode();
        }
        if (getTesteIntegrado() != null) {
            _hashCode += getTesteIntegrado().hashCode();
        }
        if (getTesteHomologacao() != null) {
            _hashCode += getTesteHomologacao().hashCode();
        }
        if (getTesteOutros() != null) {
            _hashCode += getTesteOutros().hashCode();
        }
        if (getTesteUnitario() != null) {
            _hashCode += getTesteUnitario().hashCode();
        }
        if (getTestedeStress() != null) {
            _hashCode += getTestedeStress().hashCode();
        }
        if (getTestePreProducao() != null) {
            _hashCode += getTestePreProducao().hashCode();
        }
        if (getTesteHomologacaoTVP() != null) {
            _hashCode += getTesteHomologacaoTVP().hashCode();
        }
        if (getAtividadeExecutadaFornecedor() != null) {
            _hashCode += getAtividadeExecutadaFornecedor().hashCode();
        }
        if (getFornecedor() != null) {
            _hashCode += getFornecedor().hashCode();
        }
        if (getImplantacaoAplicacaoTesteVulnerabilidade() != null) {
            _hashCode += getImplantacaoAplicacaoTesteVulnerabilidade().hashCode();
        }
        if (getUtilizamProtocoloComunicacao() != null) {
            _hashCode += getUtilizamProtocoloComunicacao().hashCode();
        }
        if (getImplantacaoValAlteracaoSitePagina() != null) {
            _hashCode += getImplantacaoValAlteracaoSitePagina().hashCode();
        }
        if (getLocaldaMudanca() != null) {
            _hashCode += getLocaldaMudanca().hashCode();
        }
        if (getImplantacaoRespValNome() != null) {
            _hashCode += getImplantacaoRespValNome().hashCode();
        }
        if (getImplantacaoRespValTelefone() != null) {
            _hashCode += getImplantacaoRespValTelefone().hashCode();
        }
        if (getImplantacaoRespValMomento() != null) {
            _hashCode += getImplantacaoRespValMomento().hashCode();
        }
        if (getTesteRealizado() != null) {
            _hashCode += getTesteRealizado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestForChangePadraoInstanceTypeMiddle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">RequestForChangePadraoInstanceType>middle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridadeTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "PrioridadeTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submeterGmud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "SubmeterGmud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridadeImpacto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "PrioridadeImpacto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridadeAbrangencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "PrioridadeAbrangencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estrategiaImplantacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "EstrategiaImplantacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoRespValComoSeraFeito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoRespValComoSeraFeito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoRespValComoSeraFeito"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoRDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "MotivoRDM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>MotivoRDM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptoResponsavel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "DeptoResponsavel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptoNome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "DeptoNome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoPreRequisito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoPreRequisito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoPreRequisito"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gestor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "Gestor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroDeCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "CentroDeCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>CentroDeCusto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "DescricaoCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>DescricaoCentroCusto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoValPlataforma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoValPlataforma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioridadeSubTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "PrioridadeSubTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoValInicioIndisponibilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoValInicioIndisponibilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoTmpRetornoDuranteImplantacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoTmpRetornoDuranteImplantacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beneficioBanco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "BeneficioBanco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>BeneficioBanco"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoValidacaoFimIndisponibilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoValidacaoFimIndisponibilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submeteSolicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "SubmeteSolicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoServicoAfetadoNome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoServicoAfetadoNome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoServicoAfetadoNome"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoServicoAfetadoAfetaCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoServicoAfetadoAfetaCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoServicoAfetadoAfetaCliente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatorAgrupamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "FatorAgrupamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoTmpRetornoAposImplantacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoTmpRetornoAposImplantacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "DateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoInstReinstHdwSfw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoInstReinstHdwSfw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeIntegrado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TesteIntegrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeHomologacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TesteHomologacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TesteOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeUnitario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TesteUnitario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testedeStress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TestedeStress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testePreProducao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TestePreProducao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeHomologacaoTVP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TesteHomologacaoTVP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atividadeExecutadaFornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "AtividadeExecutadaFornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "Fornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoAplicacaoTesteVulnerabilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoAplicacaoTesteVulnerabilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilizamProtocoloComunicacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "UtilizamProtocoloComunicacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoValAlteracaoSitePagina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoValAlteracaoSitePagina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localdaMudanca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "LocaldaMudanca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoRespValNome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoRespValNome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoRespValTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoRespValTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("implantacaoRespValMomento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "ImplantacaoRespValMomento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", ">>RequestForChangePadraoInstanceType>middle>ImplantacaoRespValMomento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testeRealizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS", "TesteRealizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servicecenter.peregrine.com/PWS/Common", "BooleanType"));
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
