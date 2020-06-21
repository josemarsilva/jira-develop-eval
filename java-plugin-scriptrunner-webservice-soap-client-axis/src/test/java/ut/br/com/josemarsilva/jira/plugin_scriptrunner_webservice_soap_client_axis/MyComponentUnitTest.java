package ut.br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis;

import org.junit.Test;
import br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis.api.MyPluginComponent;
import br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}