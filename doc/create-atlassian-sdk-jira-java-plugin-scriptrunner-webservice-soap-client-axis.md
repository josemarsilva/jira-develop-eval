### create-atlassian-sdk-jira-java-plugin-scriptrunner-webservice-soap-client-axis.md

---

* Indice
  * [1. Configure o ambiente de desenvolvimento: Atlassian SDK, ScriptRunner, Eclipse e Maven/Atlassian SDK](#1-configure-o-ambiente-de-desenvolvimento-atlassian-sdk-scriptrunner-eclipse-e-mavenatlassian-sdk)
  * [2. Criar o projeto do Jira plugin com o Atlassian SDK](#2-criar-o-projeto-do-jira-plugin-com-o-atlassian-sdk)
  * [3. Configurar arquivo pom.xml do projeto criado para integrar com ScriptRunner](#3-configurar-arquivo-pomxml-do-projeto-criado-para-integrar-com-scriptrunner)
  * [4. Gerar o pacote executável (.obr) do Plugin](#4-gerar-o-pacote-executável-obr-do-plugin)
  * [5. Usar o Eclipse para gerar as classes do WebService SOAP de acesso a consulta de CEP dos Correios](#5-usar-o-eclipse-para-gerar-as-classes-do-webservice-soap-de-acesso-a-consulta-de-cep-dos-correios)
  * [6. Construir um novo método no Jira Plugin ScriptRunner para retornar a consulta de CEP dos Correios](#6-construir-um-novo-método-no-jira-plugin-scriptrunner-para-retornar-a-consulta-de-cep-dos-correios)
  * [7. Adicionar as dependências implicitas da geração do Web Service Client pelo Eclipse no arquivo pom.xml para o Atlassian SDK](#7-adicionar-as-dependências-implicitas-da-geração-do-web-service-client-pelo-eclipse-no-arquivo-pomxml-para-o-atlassian-sdk)
  * [8. Gerar o pacote executável (.obr) do Plugin](#8-gerar-o-pacote-executável-obr-do-plugin)
  * [9. Instalar o pacote (.obr) do Plugin no Jira](#9-instalar-o-pacote-obr-do-plugin-no-jira)
  * [10. Execute o plugin no Console do ScriptRunner](#10-execute-o-plugin-no-console-do-scriptrunner)
  * [Referencias](#referencias)

---

### 1. Configure o ambiente de desenvolvimento: Atlassian SDK, ScriptRunner, Eclipse e Maven/Atlassian SDK

* [1.1. Configurar o Maven do Eclipse apontando para a instalação customizada pelo Atlassian SDK](setup-scriptrunner-dev-environment-for-eclipse-step-by-step.md#1-configurar-o-maven-do-eclipse-apontando-para-a-instalação-customizada-pelo-atlassian-sdk)
  * __dica__: Recomendo que você separe um Workspace do Eclipse para esta configuração

* [1.2. Configurar o Maven customizado pela Atlassian SDK para incluir as bibliotecas do ScriptRunner](setup-scriptrunner-dev-environment-for-eclipse-step-by-step.md#2-configurar-o-maven-customizado-pela-atlassian-sdk-para-incluir-as-bibliotecas-do-scriptrunner)

```cmd
C:\> notepad C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4\conf\settings.xml
```

### 2. Criar o projeto do Jira plugin com o Atlassian SDK

* 2.1. Criar o esqueleto do projeto com o Atlassian SDK

```cmd
C:\..\java-jira-plugin-helloworld> atlas-create-jira-plugin
Define value for groupId: : br.com.josemarsilva.jira
Define value for artifactId: : java-plugin-scriptrunner-webservice-soap-client-axis
Define value for version: 1.0.0-SNAPSHOT: : 2020.06.20.1515
Define value for package: br.com.josemarsilva.jira: : br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis
Y : : Y
  :
```

### 3. Configurar arquivo `pom.xml` do projeto criado para integrar com ScriptRunner

3.1. Configurar `pom.xml` do projeto para incluir as dependências do ScriptRunner. Você deverá incluir trechos nos seguintes pontos:
* `<dependencies> .. </dependencies>`
* `<properties> .. </properties>`

```cmd
C:\> notepad C:\..\jira-develop-eval\pom.xml
```

```xml
        :
    <dependencies>
        :
        <!-- Add dependency on ScriptRunner Adaptavist -->
        <dependency>
          <groupId>com.onresolve.jira.groovy</groupId>
          <artifactId>groovyrunner</artifactId>
          <version>4.1.3.26</version>
          <scope>provided</scope>
        </dependency>

        <dependency>
          <groupId>org.codehaus.groovy</groupId>
          <artifactId>groovy-all</artifactId>
          <version>${groovy.version}</version>
          <scope>provided</scope>
        </dependency>
        :
    <dependencies>
        :
    <properties>
            :
        <groovy.version>2.2.1</groovy.version>
        <scriptrunner.version>4.1.3.26</scriptrunner.version>
            :
    </properties>
        :
```


### 4. Gerar o pacote executável (.obr) do Plugin

4.1. Executar o Maven/Atlassian-SDK CLEAN do projeto

```cmd
C:\..\jira-develop-eval> cd java-plugin-scriptrunner-webservice-soap-client-axis
C:\..\java-plugin-scriptrunner-webservice-soap-client-axis> atlas-clean
```

4.2. Executar o Maven/Atlassian-SDK PACKAGE do projeto

```cmd
C:\..\java-plugin-scriptrunner-webservice-soap-client-axis> atlas-package
```

4.3. Conferir o pacote gerado](setup-scriptrunner-dev-environment-for-eclipse-step-by-step.md#6-conferir-o-pacote-gerado)

```cmd
C:\..\java-plugin-scriptrunner-webservice-soap-client-axis> dir .\target\java-plugin-scriptrunner-webservice-soap-client-axis*
```

```console
  :
20/06/2020  19:27         3.259.344 java-plugin-scriptrunner-webservice-soap-client-axis-2020.06.20.1913-tests.jar
20/06/2020  19:27         2.071.776 java-plugin-scriptrunner-webservice-soap-client-axis-2020.06.20.1913.jar
20/06/2020  19:27         1.924.894 java-plugin-scriptrunner-webservice-soap-client-axis-2020.06.20.1913.obr
  :
```



### 4. Importar o projeto Atlassian-SDK no Eclipse

4.1. No Eclipse, navegar para opção de menu: `Eclipse :: File >> Import ...`

4.2. Na caixa de diálogo `Import`, escolher o seguinte item da lista de opções hierárquica `Maven >> Existing Maven Project`

4.3. Na caixa de diálogo `Import Maven Projects`, informar no campo `Root Directory` o caminho do projeto `C:\..\java-jira-plugin-helloworld\java-plugin-scriptrunner-webservice-soap-client-axis`. Em seguida marcar a seleção do `pom.xml` e clicar no botão `Finish`

4.4. Aguardar a importação do projeto no Eclipse

4.5. Pode ignorar eventuais erros com a mensagem `Setup Maven Plugins Connector` e `Resolv Later`

4.6. Pode ignorar eventuais erros no arquivo `pom.xml` na tag `<plugin>` e `<execution>`

### 5. Usar o Eclipse para gerar as classes do WebService SOAP de acesso a consulta de CEP dos Correios

5.1. Primeiramente o End-Point do WSDL do serviço SOAP de homologação dos correios que oferece um método de consulta de CEP que não precisa e autenticação
* URL: [https://apphom.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl]

5.2. No Eclipse, navegar para opção de menu: `Eclipse :: File >> New >> Others ...`

5.3. Na caixa de diálogo `New :: Select a Wizard`, escolher o seguinte item da lista de opções hierárquica `Web Services >> Web Service Client` e clicar no botão de `Next`

5.4. Na caixa de diálogo `Web Service Client :: Web Services`, informar no campo `Service Definition` a seguinte informação: `https://apphom.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl` e em seguida clicar o botão `Finish`

5.5. Neste ponto, o plugin de geração de WebService do Eclipse deverá ter gerado um pacote chamado `br.com.correios.bsb.sigep.master.bean.cliente` abaixo da pasta `src/main/java` de seu projeto
* Localize:
  * Classe: `br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy`
    * método: `public EnderecoERP consultaCEP(String CEP)`
  * Classe: `br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP`
    * método: `getBairro()`, `getCep()`, `getCidade()`, `getComplemento2()`, `getEnd()`, `getUf()`


### 6. Construir um novo método no Jira Plugin ScriptRunner para retornar a consulta de CEP dos Correios

6.1. Primeiramente, tenha em mente que o método receberá como entrada um String com o CEP e retornará os atributos deste CEP consultado em uma estrutura HashMap<String,String> ( `Bairro`, `Cep`, `Cidade`, `Complemento2`, `End`, `Uf` ) após acessar o WebService dos Correios.
6.2. Construir o novo método de interface ( __interface__ ) no Plugin Components no arquivo `.src\main\java\br\com\josemarsilva\jira\plugin_scriptrunner_webservice_soap_client_axis\api\MyPluginComponent.java`

```java
package br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis.api;

import java.util.HashMap;

public interface MyPluginComponent
{
    public String getName();
    public HashMap<String,String> consultaCep(String cep);
}
```

6.3. Construir o novo método de implementação ( __implementation__ ) no Plugin Components no arquivo `.\src\main\java\br\com\josemarsilva\jira\plugin_scriptrunner_webservice_soap_client_axis\impl\MyPluginComponentImpl.java`

```java
package br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis.impl;
  :
import java.util.HashMap;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
  :
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
  :
```


### 7. Adicionar as dependências implicitas da geração do Web Service Client pelo Eclipse no arquivo `pom.xml` para o Atlassian SDK

7.1. Adicionar as dependências abaixo no arquivo `pom.xml` do projeto

```xml
        :
    <dependencies>
        :
        <!-- Add dependency on Webservice Axis I SOAP - service manager -->
        <dependency>
            <groupId>javax.xml</groupId>
            <artifactId>jaxrpc-api</artifactId>
            <version>1.1</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.apache.axis/axis -->
        <dependency>
            <groupId>org.apache.axis</groupId>
            <artifactId>axis</artifactId>
            <version>1.4</version>
        </dependency>
		<!-- https://mvnrepository.com/artifact/commons-logging/commons-logging -->
		<dependency>
			<groupId>commons-logging</groupId>
			<artifactId>commons-logging</artifactId>
			<version>1.2</version>
		</dependency>
        :
    <dependencies>
        :
                    <instructions>
							:
                        <!-- Add package import here -->
                        <Import-Package>
                            org.springframework.osgi.*;resolution:="optional", 
                            org.eclipse.gemini.blueprint.*;resolution:="optional", 
                            sun.awt.image.codec.*;resolution:="optional", 
                            org.apache.commons.net.pop3.*;resolution:="optional", 
                            com.ibm.wsdl.extensions.soap.*;resolution:="optional", 
                            org.apache.commons.net.smtp.*;resolution:="optional", 
                            com.sun.jimi.core.*;resolution:="optional", 
                            com.sun.net.ssl.internal.ssl.*;resolution:="optional", 
                            sun.security.provider.*;resolution:="optional", 
                            org.apache.bsf.*;resolution:="optional", 
                            com.sun.net.ssl.*;resolution:="optional", 
                            javax.jms.*;resolution:="optional", 
                            org.exolab.castor.xml.*;resolution:="optional", 
                            org.apache.log.*;resolution:="optional", 
                            org.apache.avalon.framework.logger.*;resolution:="optional", 
                            *
                        </Import-Package>
							:
                    </instructions>


```

### 8. Gerar o pacote executável (.obr) do Plugin

8.1. Executar o Maven/Atlassian-SDK CLEAN do projeto

```cmd
C:\..\java-plugin-scriptrunner-webservice-soap-client-axis> atlas-clean
```

8.2. Executar o Maven/Atlassian-SDK PACKAGE do projeto

```cmd
C:\..\java-plugin-scriptrunner-webservice-soap-client-axis> atlas-package
```

8.3. Conferir o pacote gerado](setup-scriptrunner-dev-environment-for-eclipse-step-by-step.md#6-conferir-o-pacote-gerado)

```cmd
C:\..\java-plugin-scriptrunner-webservice-soap-client-axis> dir .\target\java-plugin-scriptrunner-webservice-soap-client-axis*
```

```console
  :
20/06/2020  19:27         3.259.344 java-plugin-scriptrunner-webservice-soap-client-axis-2020.06.20.1913-tests.jar
20/06/2020  19:27         2.071.776 java-plugin-scriptrunner-webservice-soap-client-axis-2020.06.20.1913.jar
20/06/2020  19:27         1.924.894 java-plugin-scriptrunner-webservice-soap-client-axis-2020.06.20.1913.obr
  :
```

### 9. Instalar o pacote (.obr) do Plugin no Jira

9.1. Faça o login no Jira com credenciais de administrador
9.2. Navegue para a opção do menu principal superior do Jira `Configurações >> Jira Administration >> Manage apps`
9.3. Na página de `Administration` clique na aba de menu superior `Manage Apps`, em seguida no botão lateral esquerdo `Manage App` e em seguida link `Upload app`
9.4. Na caixa de diálogo `Upload app` clique no botão `Choose file` e informe a localização do arquivo (.obr) com o binário de seu plugin `C:\..\java-plugin-scriptrunner-webservice-soap-client-axis\target\java-plugin-scriptrunner-webservice-soap-client-axis-2020.06.20.1913.obr` e em seguida clique no botão `Upload`
9.5. Aguarde a instalação do Plugin pelo Jira
9.6. Clique no botão `Close` na caixa de diálogo da mensagem `Installed and ready to go!`
9.7. Clique no link para expandir a visualização do plugin e observe os atributos: `Version` e `App Key`


### 10. Execute o plugin no Console do ScriptRunner

10.1. Faça o login no Jira com credenciais de administrador
10.2. Navegue para a opção do menu principal superior do Jira `Configurações >> Jira Administration >> Manage apps`
10.3. Na página de `Administration` clique na aba de menu superior `Script Runner >> Console`
10.4. Na página de `Script Console` localize o campo `Enter the script to Execute` e o botão `Run`. Nos próximos passos você deverá colocar trechos de scripts no campo do script e clicar no botão `Run` para executar os scripts. Como resultado irá aparecer uma região de resultados identificada por `Result`, uma região de `Logs` onde são registrados os debug's da aplicação e uma região de métricas de execução `Timing`
10.5. Na página de Script Console entre com o seguinte script para executar
* Lembre-se dos atributos registrados de seu plugin e `Configuração >> Jira Administration >> Manage Apps`
  * `Versão`: `2020.06.20.1515`
  * `App Key`: `br.com.josemarsilva.jira.java-plugin-scriptrunner-webservice-soap-client-axis`
  * Lembre-se do código fonte da interface e da _ implementação_ no Atlassian SDK: 
    * Class: `MyPluginComponent.java`
	* Method: `public HashMap<String,String> consultaCep(String cep);`

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
log.info("@WithPlugin('br.com.josemarsilva.jira.java-plugin-scriptrunner-webservice-soap-client-axis')");
@WithPlugin("br.com.josemarsilva.jira.java-plugin-scriptrunner-webservice-soap-client-axis")
import br.com.josemarsilva.jira.plugin_scriptrunner_webservice_soap_client_axis.api.MyPluginComponent

// Inject plugin module
log.info("@PluginModule");
@PluginModule
MyPluginComponent myPluginComponent

// Invoke method getName() from component
log.info("myPluginComponent.getName()");
def name = myPluginComponent.getName()
log.info("name: " + name);

// Invoke methodgetHashMap() from component
log.info("myPluginComponent.consultaCep('13050410')");
def hashMap = myPluginComponent.consultaCep("13050410")
log.info("hashMap: " + hashMap);
```

* Log's

```log
2020-06-20 20:33:20,235 INFO [runner.ScriptBindingsManager]: @WithPlugin('br.com.josemarsilva.jira.java-plugin-scriptrunner-webservice-soap-client-axis')
2020-06-20 20:33:20,237 INFO [runner.ScriptBindingsManager]: @PluginModule
2020-06-20 20:33:20,239 INFO [runner.ScriptBindingsManager]: myPluginComponent.getName()
2020-06-20 20:33:20,239 INFO [runner.ScriptBindingsManager]: name: myComponent:JIRA
2020-06-20 20:33:20,239 INFO [runner.ScriptBindingsManager]: myPluginComponent.consultaCep('13050410')
2020-06-20 20:33:20,533 INFO [runner.ScriptBindingsManager]: hashMap: [complemento2:, uf:SP, cidade:Campinas, bairro:Cidade Jardim, end:Rua Itapecirica da Serra, status:Success, cep:13050410]

```

### Referencias

* [Create a simple web service client with WSDL in Eclipse](https://www.youtube.com/watch?v=11iGyrvBhzc)
* [Youtube - Integrando WebService SOAP - Consulta CEP Correios](https://www.youtube.com/watch?v=FqDenKN5y1s)
* [https://stackoverflow.com/questions/9460864/common-logging-jar-conflict-with-apache-axis-soap-client]
* [https://stackoverflow.com/questions/11727768/apache-axis-logging-classcastexception-while-using-it-inside-a-jira-plugin]