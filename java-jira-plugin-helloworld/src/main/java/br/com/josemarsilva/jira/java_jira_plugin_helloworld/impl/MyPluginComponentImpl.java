package br.com.josemarsilva.jira.java_jira_plugin_helloworld.impl;

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.ApplicationProperties;
import br.com.josemarsilva.jira.java_jira_plugin_helloworld.api.MyPluginComponent;

import javax.inject.Inject;
import javax.inject.Named;

import java.util.HashMap;

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

    public HashMap<String,String> getHashMap() {
    	HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("um", "one");
    	hashMap.put("dois", "two");
    	hashMap.put("tres", "three");
    	hashMap.put("quatro", "four");
    	hashMap.put("cinco", "five");
    	return hashMap;
    }

}