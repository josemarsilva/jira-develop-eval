### modify-user-custom-plugin-using-atlassian-sdk-with-multiples-methods.md


#### 1. Localizar os códigos fontes que ddeverão ser alterados

1.1. Na pasta do projeto consultar os projetos do tipo Java Atlassian SDK existentes

```cmd
C:\..\jira-develop-eval>dir java*
	:
19/06/2020  12:01    <DIR>          java-jira-plugin-helloworld
	:
```

1.2. Localizar os programas que devem ser alterados

```cmd
C:\..\jira-develop-eval>cd java-jira-plugin-helloworld
C:\..\java-jira-plugin-helloworld> dir src\main\*.java /s
	:
Pasta de C:\GitHome\ws-github-09\jira-develop-eval\java-jira-plugin-helloworld\src\main\java\br\com\josemarsilva\jira\java_jira_plugin_helloworld\api
19/06/2020  10:34               132 MyPluginComponent.java
	:
Pasta de C:\GitHome\ws-github-09\jira-develop-eval\java-jira-plugin-helloworld\src\main\java\br\com\josemarsilva\jira\java_jira_plugin_helloworld\impl
19/06/2020  10:34             1.061 MyPluginComponentImpl.java
	:
```

#### 2. Criar a nova Interface HashMap<String,String> com sua respectiva implementação

2.1. Editar o programa `MyPluginComponent.java`

```cmd
C:\..\java-jira-plugin-helloworld> notepad .\src\main\java\br\com\josemarsilva\jira\java_jira_plugin_helloworld\api\MyPluginComponent.java
```

2.2. Adicionar o interface do método `getHashMap()` e o import `import java.util.HashMap;`

```cmd
package br.com.josemarsilva.jira.java_jira_plugin_helloworld.api;

import java.util.HashMap;

public interface MyPluginComponent
{
    public String getName();
    public HashMap<String,String> getHashMap();
}
```

2.3. Editar o programa `MyPluginComponentImpl.java`

```cmd
C:\..\java-jira-plugin-helloworld> notepad .\src\main\java\br\com\josemarsilva\jira\java_jira_plugin_helloworld\impl\MyPluginComponentImpl.java
```

2.4. Adicionar a implementação do método `getHashMap()` e o import `import java.util.HashMap;`

```cmd
	:
import java.util.HashMap;
	:
    public HashMap<String,String> getHashMap() {
    	HashMap<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("um", "one");
    	hashMap.put("dois", "two");
    	hashMap.put("tres", "three");
    	hashMap.put("quatro", "four");
    	hashMap.put("cinco", "five");
    	return hashMap;
    }
	:
```

#### 3. Editar as configurações de pacotes para a alteração da versão

3.1. Editar o arquivo `pom.xml`

```cmd
C:\..\java-jira-plugin-helloworld> notepad pom.xml
```

3.2. Modificar a versão do pacote que será gerado

```cmd
	:
    <version>2020.06.19.1825</version>
	:
```

#### 4. Gerar uma nova versão do pacote

4.1. **atlas-clean**: Chamar o equivalente a _Maven Clean_ no Atlassian SDK

```cmd
C:\..\java-jira-plugin-helloworld> atlas-clean
```

4.1. **atlas-package**: Chamar o equivalente a _Maven Build_ no Atlassian SDK

```cmd
C:\..\java-jira-plugin-helloworld> atlas-package
```

#### 5. Carregar no Jira a nova versão do pacote com o plugin

5.1. Localizar o arquivo (.obr)

```cmd
C:\..\java-jira-plugin-helloworld> dir target\java-jira*
```

```console
	:
19/06/2020  18:28         1.740.020 java-jira-plugin-helloworld-2020.06.19.1825-tests.jar
19/06/2020  18:28           272.588 java-jira-plugin-helloworld-2020.06.19.1825.jar
19/06/2020  18:28           238.869 java-jira-plugin-helloworld-2020.06.19.1825.obr
	:
```

5.2. Carregar a nova versão do Plugin no Jira

* Navege para `Configuração >> Jira Administração >> Manage App`
* Na página de administração clique no botão lateral esquerdo `Manage apps` e em seguida no botão `Upload file`
* Na caixa de diálogo `Upload app` informe o caminho do arquivo (.obr) 
  * `C:\GitHome\ws-github-09\jira-develop-eval\java-jira-plugin-helloworld\target\java-jira-plugin-helloworld-2020.06.19.1825.obr`
* Aguarde a instalação até que seja apresentada uma caixa de diálogo informando `Installed and ready to go!` `java-jira-plugin-helloworld v. 2020.06.19.1825`
* Clique no botão `Close`

#### 6. Execute a chamada do plugin pela ScriptRunner Console

6.1. Entre no Console de execução do ScriptRunner

* Navege para `Configuração >> Jira Administração >> Manage App`
* Na página de administração clique no botão lateral esquerdo `ScriptRunner >> Console`

6.2. Edite o Script que deve ser executado com o seguinte conteúdo

```groovy
// Import commons libraries
import com.atlassian.jira.component.ComponentAccessor
import com.atlassian.jira.issue.Issue
import com.onresolve.scriptrunner.runner.customisers.PluginModule
import com.onresolve.scriptrunner.runner.customisers.WithPlugin

// Import log libraries
import org.slf4j.LoggerFactory;
import org.apache.log4j.Logger
import org.apache.log4j.Level
log.setLevel(Level.DEBUG)

// Specify that classes from this plugin should be available to this script
log.info("@WithPlugin('br.com.josemarsilva.jira.java-jira-plugin-helloworld')");
@WithPlugin("br.com.josemarsilva.jira.java-jira-plugin-helloworld")
import br.com.josemarsilva.jira.java_jira_plugin_helloworld.api.MyPluginComponent

// Inject plugin module
log.info("@PluginModule");
@PluginModule
MyPluginComponent myPluginComponent

// Invoke method getName() from component
log.info("myPluginComponent.getName()");
def name = myPluginComponent.getName()
log.info("name: " + name);

// Invoke methodgetHashMap() from component
log.info("myPluginComponent.getHashMap()");
def hashMap = myPluginComponent.getHashMap()
log.info("hashMap: " + hashMap);

return "name: " + name  + " - hashMap: " + hashMap 
```

* Observe o resultado na aba `Result`

```result
name: myComponent:JIRA - hashMap: [cinco:five, quatro:four, um:one, dois:two, tres:three]
```

* Observe o resultado na aba `Log`

```log
2020-06-19 18:49:31,891 INFO [runner.ScriptBindingsManager]: @WithPlugin('br.com.josemarsilva.jira.java-jira-plugin-helloworld')
2020-06-19 18:49:31,891 INFO [runner.ScriptBindingsManager]: @PluginModule
2020-06-19 18:49:31,893 INFO [runner.ScriptBindingsManager]: myPluginComponent.getName()
2020-06-19 18:49:31,894 INFO [runner.ScriptBindingsManager]: name: myComponent:JIRA
2020-06-19 18:49:31,894 INFO [runner.ScriptBindingsManager]: myPluginComponent.getHashMap()
2020-06-19 18:49:31,894 INFO [runner.ScriptBindingsManager]: hashMap: [cinco:five, quatro:four, um:one, dois:two, tres:three]
```



