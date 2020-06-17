package ut.br.com.josemarsilva.jiraplugin.jirapluginhelloworld;

import org.junit.Test;
import br.com.josemarsilva.jiraplugin.jirapluginhelloworld.api.MyPluginComponent;
import br.com.josemarsilva.jiraplugin.jirapluginhelloworld.impl.MyPluginComponentImpl;

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