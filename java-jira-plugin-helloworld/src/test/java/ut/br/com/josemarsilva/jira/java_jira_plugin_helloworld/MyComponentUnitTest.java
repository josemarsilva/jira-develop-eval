package ut.br.com.josemarsilva.jira.java_jira_plugin_helloworld;

import org.junit.Test;
import br.com.josemarsilva.jira.java_jira_plugin_helloworld.api.MyPluginComponent;
import br.com.josemarsilva.jira.java_jira_plugin_helloworld.impl.MyPluginComponentImpl;

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