package br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis.api;

import java.util.HashMap;

public interface MyPluginComponent
{
    public String getName();
    public HashMap<String,String> consultaCep(String cep);
}