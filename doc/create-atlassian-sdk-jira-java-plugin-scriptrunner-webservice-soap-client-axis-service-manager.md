### create-atlassian-sdk-jira-java-plugin-scriptrunner-webservice-soap-client-axis-service-manager.md

---

* Índice
  * [1. Configure o ambiente de desenvolvimento: Atlassian SDK, ScriptRunner, Eclipse e Maven/Atlassian SDK](#1-configure-o-ambiente-de-desenvolvimento-atlassian-sdk-scriptrunner-eclipse-e-mavenatlassian-sdk)
  * [2. Criar o projeto do Jira plugin com o Atlassian SDK](#2-criar-o-projeto-do-jira-plugin-com-o-atlassian-sdk)
  * [3. Configurar arquivo pom.xml do projeto criado para integrar com ScriptRunner](#3-configurar-arquivo-pomxml-do-projeto-criado-para-integrar-com-scriptrunner)
  * [4. Gerar o pacote executável (.obr) do Plugin](#4-gerar-o-pacote-executável-obr-do-plugin)
  * [5. Usar o Eclipse para gerar as classes do WebService SOAP de acesso a consulta a RDM do Service Manager](#5-usar-o-eclipse-para-gerar-as-classes-do-webservice-soap-de-acesso-a-consulta-a-rdm-do-service-manager)
  * [6. Construir um novo método no Jira Plugin ScriptRunner para retornar a consulta a RDM do Service Manager](#6-construir-um-novo-método-no-jira-plugin-scriptrunner-para-retornar-a-consulta-a-rdm-do-service-manager)
  * [7. Adicionar as dependências implicitas da geração do Web Service Client pelo Eclipse no arquivo pom.xml para o Atlassian SDK](#7-adicionar-as-dependências-implicitas-da-geração-do-web-service-client-pelo-eclipse-no-arquivo-pomxml-para-o-atlassian-sdk)
  * [8. Gerar o pacote executável (.obr) do Plugin](#8-gerar-o-pacote-executável-obr-do-plugin)
  * [9. Instalar o pacote (.obr) do Plugin no Jira](#9-instalar-o-pacote-obr-do-plugin-no-jira)
  * [10. Execute o plugin no Console do ScriptRunner](#10-execute-o-plugin-no-console-do-scriptrunner)
  * [Referencias](#referencias)

---

### 1. Configure o ambiente de desenvolvimento: Atlassian SDK, ScriptRunner, Eclipse e Maven/Atlassian SDK

* [1.1. Configurar o Maven do Eclipse apontando para a instalação customizada pelo Atlassian SDK]
  * __dica__: Recomendo que você separe um Workspace do Eclipse para esta configuração

1.1.1. Navegar para o menu do Eclipse Windows >> Preference 

1.1.2. Na caixa de diálogo Preference clicar no list-box menu lateral esquerdo Maven e expandir a árvore 

1.1.3. No list-box menu com a árvore de Maven expandida clicar no sub-menu User settings 

1.1.4. Na caixa de diálogo User Settings da hierarquia de menu Prefrences >> Maven >> User Settings

Alterar o campo User Settings para a configuração que está no diretório do Atlas

```eclipse
C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4\conf\settings.xml
```

1.1.5. Na caixa de diálogo User Settings da hierarquia clicar no botão `reindex`

* [1.2. Configurar o Maven customizado pela Atlassian SDK para incluir as bibliotecas do ScriptRunner](setup-scriptrunner-dev-environment-for-eclipse-step-by-step.md#2-configurar-o-maven-customizado-pela-atlassian-sdk-para-incluir-as-bibliotecas-do-scriptrunner)

```cmd
C:\> notepad C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4\conf\settings.xml

C:\> notepad C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4\conf\settings.xml
        :
    <repositories>
        :
    <!-- Atlassian repositories will be listed above this line -->
    <!-- Adaptavist repositories are below -->
    <repository>
      <id>adaptavist-external</id>
      <url>https://nexus.adaptavist.com/content/repositories/external</url>
      <snapshots>
        <enabled>true</enabled>
        <updatePolicy>never</updatePolicy>
        <checksumPolicy>warn</checksumPolicy>
      </snapshots>
      <releases>
        <enabled>true</enabled>
        <checksumPolicy>warn</checksumPolicy>
      </releases>
    </repository>

    <repository>
      <id>adaptavist-external-snapshots</id>
      <url>https://nexus.adaptavist.com/content/repositories/external-snapshots</url>
      <snapshots>
        <enabled>true</enabled>
        <updatePolicy>never</updatePolicy>
        <checksumPolicy>warn</checksumPolicy>
      </snapshots>
      <releases>
        <enabled>true</enabled>
        <checksumPolicy>warn</checksumPolicy>
      </releases>
    </repository>
    <!-- End of Adaptavist maven repositories -->

    :
    </repositories>
```

### 2. Criar o projeto do Jira plugin com o Atlassian SDK

* 2.1. Criar o esqueleto do projeto com o Atlassian SDK

```cmd
C:\..\ws-github-10> atlas-create-jira-plugin
Define value for groupId: : br.com.inmetrics.jira
Define value for artifactId: : service-manager-plugin
Define value for version: 1.0.0-SNAPSHOT: : 2020.06.23.1020
Define value for package: br.com.josemarsilva.jira: : br.com.inmetrics.jira.servicemanagerplugin
Y : : Y
  :
```

### 3. Configurar arquivo `pom.xml` do projeto criado para integrar com ScriptRunner

3.1. Configurar `pom.xml` do projeto para incluir as dependências do ScriptRunner. Você deverá incluir trechos nos seguintes pontos:
* `<dependencies> .. </dependencies>`
* `<properties> .. </properties>`

```cmd
C:\> notepad C:\..\service-manager-plugin\pom.xml
```

```xml
        :
    <version>2020.06.23.0950</version>
        :
    <organization>
        <name>Inmetrics</name>
        <url>http://wwww.inmetrics.com.br/</url>
    </organization>
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
C:\..\service-manager-plugin> atlas-clean
```

4.2. Executar o Maven/Atlassian-SDK PACKAGE do projeto

```cmd
C:\..\service-manager-plugin> atlas-package
```

4.3. Conferir o pacote gerado

```cmd
C:\..\service-manager-plugin> dir .\target\service-manager-plugin-*
```

```console
  :
23/06/2020  10:29         3.342.136 service-manager-plugin-2020.06.23.0950-tests.jar
23/06/2020  10:29         2.295.749 service-manager-plugin-2020.06.23.0950.jar
23/06/2020  10:29         2.117.927 service-manager-plugin-2020.06.23.0950.obr
  :
```



### 4. Importar o projeto Atlassian-SDK no Eclipse

4.1. No Eclipse, navegar para opção de menu: `Eclipse :: File >> Import ...`

4.2. Na caixa de diálogo `Import`, escolher o seguinte item da lista de opções hierárquica `Maven >> Existing Maven Project`

4.3. Na caixa de diálogo `Import Maven Projects`, informar no campo `Root Directory` o caminho do projeto `C:\..\service-manager-plugin`. Em seguida marcar a seleção do `pom.xml` e clicar no botão `Finish`

4.4. Aguardar a importação do projeto no Eclipse

4.5. Pode ignorar eventuais erros com a mensagem `Setup Maven Plugins Connector` e `Resolv Later`

4.6. Pode ignorar eventuais erros no arquivo `pom.xml` na tag `<plugin>` e `<execution>`


### 5. Usar o Eclipse para gerar as classes do WebService SOAP de acesso a consulta a RDM do Service Manager

5.1. Primeiramente o End-Point do WSDL do serviço SOAP de homologação da ferramenta Service Manager do Bradesco:
* URL PROD: [url-wsdl-prod](http://192.168.84.23:13095/sc62server/PWS/RequestForChangePadrao.wsdl)
  * username: `**********`
  * password: `**********`
* URL HML: [url-wsdl-hml](http://192.168.248.59:13095/sc62server/PWS/RequestForChangePadrao.wsdl)
  * username: `**********`
  * password: `**********`

5.2. No Eclipse, clique com o botão invertido do mouse sobre o projeto para e navegar para opção de menu: `New >> Others ...`

5.3. Na caixa de diálogo `New :: Select a Wizard`, escolher o seguinte item da lista de opções hierárquica `Web Services >> Web Service Client` e clicar no botão de `Next`

5.4. Na caixa de diálogo `Web Service Client :: Web Services`, informar no campo `Service Definition` a seguinte informação: `http://192.168.84.23:13095/sc62server/PWS/RequestForChangePadrao.wsdl` e em seguida clicar o botão `Finish`

5.5. Neste ponto, o plugin de geração de WebService do Eclipse deverá ter gerado um pacote chamado `com.peregrine.servicecenter.PWS` abaixo da pasta `src/main/java` de seu projeto
* Localize:
  * Classe: `RequestForChangePadrao_ServiceLocator.java`
  * Classe: `RequestForChangePadrao_BindingStub.java`
  * Classe: `RetrieveRequestForChangePadraoRequest.java`
  * Classe: `RetrieveRequestForChangePadraoResponse.java`

### 6. Construir um novo método no Jira Plugin ScriptRunner para retornar a consulta a RDM do Service Manager

6.1. Primeiramente, tenha em mente que você deve construir uma interface onde serão passados como parâmetros o Wsdl, Username, Password e RdmNumber. Este método deverá retornar todos os atributos e status da RDM.

6.2. Construir o novo método de interface ( __interface__ ) no Plugin Components no arquivo `.\src\main\java\br\com\inmetrics\jira\servicemanagerplugin\api\MyPluginComponent.java`

```java
package br.com.inmetrics.jira.servicemanagerplugin.api;

import java.util.HashMap;

public interface MyPluginComponent
{
    public String getName();
    public HashMap<String,String> getRetrieveRequestForChangePadrao(String wsdlLocation, String username, String password, String rdmNumber);
}
```

6.3. Construir o novo método de implementação ( __implementation__ ) no Plugin Components no arquivo `.\src\main\java\br\com\inmetrics\jira\servicemanagerplugin\impl\MyPluginComponentImpl.java`

```java
  :
import java.net.URL;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.commons.logging.LogFactory;
import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.sal.api.ApplicationProperties;
import com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceType;
import com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeDescriptionStructure;
import com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeHeader;
import com.peregrine.servicecenter.PWS.RequestForChangePadraoInstanceTypeMiddle;
import com.peregrine.servicecenter.PWS.RequestForChangePadraoKeysType;
import com.peregrine.servicecenter.PWS.RequestForChangePadraoModelType;
import com.peregrine.servicecenter.PWS.RequestForChangePadrao_BindingStub;
import com.peregrine.servicecenter.PWS.RequestForChangePadrao_ServiceLocator;
import com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoRequest;
import com.peregrine.servicecenter.PWS.RetrieveRequestForChangePadraoResponse;
import com.peregrine.servicecenter.PWS.Common.StringType;
import br.com.inmetrics.jira.servicemanagerplugin.api.MyPluginComponent;
  :
    public HashMap<String,String> getRetrieveRequestForChangePadrao(String wsdlLocation, String username, String password, String rdmNumber) {
        
        // Prepare parameters for call webservice
        HashMap<String,String> resultHashMap = new HashMap<String,String>();
        resultHashMap.put("wsdl-location", wsdlLocation);
        resultHashMap.put("username", username);
        resultHashMap.put("password", password);
        resultHashMap.put("rdm-number", rdmNumber);
        try {
            
            System.setProperty(LogFactory.FACTORY_PROPERTY, LogFactory.FACTORY_DEFAULT);
            URL url = new URL(wsdlLocation);
            StringType stringType = new StringType(rdmNumber);
            stringType.set_value(rdmNumber);
            String query_model = "number=\"" + rdmNumber +"\"";
            
            RequestForChangePadrao_ServiceLocator rfcpServiceLocator = new RequestForChangePadrao_ServiceLocator();
            RetrieveRequestForChangePadraoRequest retrieveRfcpRequest = new RetrieveRequestForChangePadraoRequest();
            
            RequestForChangePadrao_BindingStub rfcpBindingStub = new  RequestForChangePadrao_BindingStub(url, rfcpServiceLocator);
            rfcpBindingStub.setMaintainSession(true);
            rfcpBindingStub.setUsername(username);
            rfcpBindingStub.setPassword(password);
            rfcpBindingStub.setPortName(rfcpServiceLocator.getServiceName());
            
            // Instance
            RequestForChangePadraoInstanceType rfcpInstanceType = new RequestForChangePadraoInstanceType();
            RequestForChangePadraoInstanceTypeDescriptionStructure rfcpInstanceTypeDescriptionStructure = new RequestForChangePadraoInstanceTypeDescriptionStructure();
            RequestForChangePadraoInstanceTypeMiddle rfcpInstanceTypeMiddle = new RequestForChangePadraoInstanceTypeMiddle();
            RequestForChangePadraoInstanceTypeHeader rfcpInstanceTypeHeader = new RequestForChangePadraoInstanceTypeHeader();
            
            rfcpInstanceTypeMiddle.setType("Structure");            
            rfcpInstanceType.setQuery("");
            rfcpInstanceType.setUniquequery("");
            rfcpInstanceType.setRecordid("");
            rfcpInstanceType.setMiddle(rfcpInstanceTypeMiddle);
            rfcpInstanceType.setHeader(rfcpInstanceTypeHeader);
            rfcpInstanceType.setDescriptionStructure(rfcpInstanceTypeDescriptionStructure);
            
            // KeysType
            RequestForChangePadraoKeysType rfcpKeysType = new RequestForChangePadraoKeysType();
            rfcpKeysType.setQuery(query_model);
            rfcpKeysType.setNumber(stringType);
            rfcpKeysType.getNumber().setType("String");
    
            // ModelType
            RequestForChangePadraoModelType rfcpModelType = new RequestForChangePadraoModelType();
            rfcpModelType.setQuery("");
            rfcpModelType.setKeys(rfcpKeysType);
            rfcpModelType.setInstance(rfcpInstanceType);
        
            // Request
            
            retrieveRfcpRequest.setAttachmentData(true);
            retrieveRfcpRequest.setAttachmentInfo(true);
            retrieveRfcpRequest.setCount(Long.MIN_VALUE);
            retrieveRfcpRequest.setIgnoreEmptyElements(true);
            retrieveRfcpRequest.setStart(Long.MIN_VALUE);    
            retrieveRfcpRequest.setModel(rfcpModelType);
            
            // Response
            RetrieveRequestForChangePadraoResponse retrieveRfcpResponse = new RetrieveRequestForChangePadraoResponse();
                        
            retrieveRfcpResponse = rfcpBindingStub.retrieveRequestForChangePadrao(retrieveRfcpRequest);
            
            RequestForChangePadraoInstanceType rfcpInstanceTypeResponse = retrieveRfcpResponse.getModel().getInstance();
            RequestForChangePadraoInstanceTypeHeader rfcpInstanceTypeHeaderResponse = retrieveRfcpResponse.getModel().getInstance().getHeader();
    
            // Prepare return attributes ...
            resultHashMap.put("response-status", retrieveRfcpResponse.getStatus().toString());
            resultHashMap.put("record-id", rfcpInstanceTypeResponse.getRecordid().toString());
            resultHashMap.put("titulo-rdm", rfcpInstanceTypeResponse.getTituloRDM().toString());
            resultHashMap.put("categoria", rfcpInstanceTypeHeaderResponse.getCategoria().toString());
            resultHashMap.put("status", rfcpInstanceTypeHeaderResponse.getStatus().toString());
            resultHashMap.put("inicio-planejado", rfcpInstanceTypeHeaderResponse.getInicioPlanejado().toString());
            resultHashMap.put("termino-planejado", rfcpInstanceTypeHeaderResponse.getTerminoPlanejado().toString());
            
            resultHashMap.put("api-status", "success");
    
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        // Return result
        return resultHashMap;
        
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
<!--         <dependency> -->
<!--             <groupId>org.apache.axis</groupId> -->
<!--             <artifactId>axis</artifactId> -->
<!--             <version>1.4</version> -->
<!--         </dependency> -->
        <!-- https://mvnrepository.com/artifact/axis/axis -->
        <dependency>
            <groupId>axis</groupId>
            <artifactId>axis</artifactId>
            <version>1.3-atlassian-1</version>
<!--             <scope>provided</scope> -->
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
                        <Import-Package>org.springframework.osgi.*;resolution:="optional", org.eclipse.gemini.blueprint.*;resolution:="optional", sun.awt.image.codec.*;resolution:="optional", org.apache.commons.net.pop3.*;resolution:="optional", com.ibm.wsdl.extensions.soap.*;resolution:="optional", com.sun.jimi.core.*;resolution:="optional", org.apache.bsf.*;resolution:="optional", javax.jms.*;resolution:="optional", org.apache.avalon.framework.logger.*;resolution:="optional", sun.awt.image.codec.*;resolution:="optional", org.apache.commons.net.smtp.*;resolution:="optional", org.apache.log.*;resolution:="optional", com.sun.net.ssl.internal.ssl.*;resolution:="optional", sun.security.provider.*;resolution:="optional", com.sun.net.ssl.*;resolution:="optional", org.exolab.castor.xml.*;resolution:="optional", org.apache.axis.encoding.ser.*;resolution:="optional", org.apache.axis.soap.*;resolution:="optional", org.apache.axis.constants.*;resolution:="optional", org.apache.axis.*;resolution:="optional", org.apache.axis.description.*;resolution:="optional", org.apache.axis.utils.*;resolution:="optional", org.apache.axis.client.*;resolution:="optional", org.apache.axis.encoding.*;resolution:="optional", * </Import-Package>
                            :
                    </instructions>


```

### 8. Gerar o pacote executável (.obr) do Plugin

8.1. Executar o Maven/Atlassian-SDK CLEAN do projeto

```cmd
C:\..\service-manager-plugin> atlas-clean
```

8.2. Executar o Maven/Atlassian-SDK PACKAGE do projeto

```cmd
C:\..\service-manager-plugin> atlas-package
```

8.3. Conferir o pacote gerado

```cmd
C:\..\service-manager-plugin> dir .\target\service-manager-plugin*
```

```console
  :
23/06/2020  10:56         3.342.136 service-manager-plugin-2020.06.23.0950-tests.jar
23/06/2020  10:56         2.295.750 service-manager-plugin-2020.06.23.0950.jar
23/06/2020  10:56         2.118.203 service-manager-plugin-2020.06.23.0950.obr
  :
```

### 9. Instalar o pacote (.obr) do Plugin no Jira

9.1. Faça o login no Jira com credenciais de administrador

9.2. Navegue para a opção do menu principal superior do Jira `Configurações >> Jira Administration >> Manage apps`

9.3. Na página de `Administration` clique na aba de menu superior `Manage Apps`, em seguida no botão lateral esquerdo `Manage App` e em seguida link `Upload app`

9.4. Na caixa de diálogo `Upload app` clique no botão `Choose file` e informe a localização do arquivo (.obr) com o binário de seu plugin `C:\..\service-manager-plugin\target\service-manager-plugin-2020.06.23.0950.obr` e em seguida clique no botão `Upload`

9.5. Aguarde a instalação do Plugin pelo Jira

9.6. Clique no botão `Close` na caixa de diálogo e aguarde a mensagem `Installed and ready to go!`

9.7. Clique no link para expandir a visualização do plugin e observe os atributos: `Version` e `App Key`



### 10. Execute o plugin no Console do ScriptRunner

10.1. Faça o login no Jira com credenciais de administrador

10.2. Navegue para a opção do menu principal superior do Jira `Configurações >> Jira Administration >> Manage apps`

10.3. Na página de `Administration` clique na aba de menu superior `Script Runner >> Console`

10.4. Na página de `Script Console` localize o campo `Enter the script to Execute` e o botão `Run`. Nos próximos passos você deverá colocar trechos de scripts no campo do script e clicar no botão `Run` para executar os scripts. Como resultado irá aparecer uma região de resultados identificada por `Result`, uma região de `Logs` onde são registrados os debug's da aplicação e uma região de métricas de execução `Timing`

10.5. Na página de Script Console entre com o seguinte script para executar

* Lembre-se dos atributos registrados de seu plugin e `Configuração >> Jira Administration >> Manage Apps`
  * `Versão`: `2020.06.23.0950`
  * `App Key`: `br.com.inmetrics.jira.service-manager-plugin`
  * Lembre-se do código fonte da interface e da _ implementação_ no Atlassian SDK: 
    * Class: `MyPluginComponent.java`
    * Method: `public HashMap<String,String> getRetrieveRequestForChangePadrao(String wsdlLocation, String username, String password, String rdmNumber);`

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
log.info("@WithPlugin('br.com.inmetrics.jira.service-manager-plugin')");
@WithPlugin("br.com.inmetrics.jira.service-manager-plugin")
import br.com.inmetrics.jira.servicemanagerplugin.api.MyPluginComponent

// Inject plugin module
log.info("@PluginModule");
@PluginModule
MyPluginComponent myPluginComponent

// Invoke method getName() from component
log.info("myPluginComponent.getName()");
def name = myPluginComponent.getName()
log.info("name: " + name);

// Invoke getRetrieveRequestForChangePadrao() from component
log.info("getRetrieveRequestForChangePadrao()");
def hashMap1 = myPluginComponent.getRetrieveRequestForChangePadrao("http://192.168.84.23:13095/sc62server/PWS/RequestForChangePadrao.wsdl", "**********", "**********", "RDM564414" )
def hashMap2 = myPluginComponent.getRetrieveRequestForChangePadrao("http://192.168.84.23:13095/sc62server/PWS/RequestForChangePadrao.wsdl", "**********", "**********", "RDM569050" )
def hashMap3 = myPluginComponent.getRetrieveRequestForChangePadrao("http://192.168.84.23:13095/sc62server/PWS/RequestForChangePadrao.wsdl", "**********", "**********", "RDM568009" )
def hashMap4 = myPluginComponent.getRetrieveRequestForChangePadrao("http://192.168.84.23:13095/sc62server/PWS/RequestForChangePadrao.wsdl", "**********", "**********", "RDM567863" )
def hashMap5 = myPluginComponent.getRetrieveRequestForChangePadrao("http://192.168.84.23:13095/sc62server/PWS/RequestForChangePadrao.wsdl", "**********", "**********", "RDM532802" )
log.info("hashMap1: " + hashMap1);
log.info("hashMap2: " + hashMap2);
log.info("hashMap3: " + hashMap3);
log.info("hashMap4: " + hashMap4);
log.info("hashMap5: " + hashMap5);
```

### Referencias

* Tutorial
   * [Create a simple web service client with WSDL in Eclipse](https://www.youtube.com/watch?v=11iGyrvBhzc)

* Troubleshooting
  * https://stackoverflow.com/questions/9460864/common-logging-jar-conflict-with-apache-axis-soap-client
  * https://stackoverflow.com/questions/11727768/apache-axis-logging-classcastexception-while-using-it-inside-a-jira-plugin
  * https://stackoverflow.com/questions/52146553/addlinkentry-class-is-a-raw-type-references-to-generic-type-addlinkentry-class
  * https://stackoverflow.com/questions/46148381/caused-by-java-lang-noclassdeffounderror-org-osgi-framework-bundleactivator-w
  * [`@WithPlugin( ... )` unable to resolve class groovy jira](https://community.atlassian.com/t5/Jira-Questions/Scriptrunner-quot-Unable-to-resolve-class-quot-despite/qaq-p/598803)