package br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis.impl;

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.ApplicationProperties;
import br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis.api.MyPluginComponent;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.logging.LogFactory;

import java.rmi.RemoteException;
import java.util.HashMap;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;

@ExportAsService ({MyPluginComponent.class})
@Named ("myPluginComponent")
public class MyPluginComponentImpl implements MyPluginComponent
{
    @ComponentImport
    private final ApplicationProperties applicationProperties;

    @Inject
    public MyPluginComponentImpl(final ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "myComponent:" + applicationProperties.getDisplayName();
        }
        
        return "myComponent";
    }
    
    public HashMap<String,String> consultaCep(String cep) {
    	System.setProperty(LogFactory.FACTORY_PROPERTY, LogFactory.FACTORY_DEFAULT);
    	HashMap<String, String> returnHashMap = new HashMap<String,String>();
		AtendeClienteProxy atendeClienteProxy = new AtendeClienteProxy();
		EnderecoERP enderecoERP = new EnderecoERP();
		try {
			enderecoERP  = atendeClienteProxy.consultaCEP(cep);
			returnHashMap.put("status", "Success");
			returnHashMap.put("bairro", enderecoERP.getBairro() );
			returnHashMap.put("cep", enderecoERP.getCep() );
			returnHashMap.put("cidade", enderecoERP.getCidade() );
			returnHashMap.put("complemento2", enderecoERP.getComplemento2() );
			returnHashMap.put("end", enderecoERP.getEnd() );
			returnHashMap.put("uf", enderecoERP.getUf() );
		} catch (SQLException e) {
			returnHashMap.put("status", "SQLException");
		} catch (SigepClienteException e) {
			returnHashMap.put("status", "SigepClienteException");
		} catch (RemoteException e) {
			returnHashMap.put("status", "RemoteException");
		}
    	// return
		return returnHashMap;
    }

}