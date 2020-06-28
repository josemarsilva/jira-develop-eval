### example-groovy-script-in-workflow-transitions-conditions-validators-postfunctions.md

---

* Índice
  * [Pré-Requisitos]()
    * [Workflow, Statuses and Transitions]()
  * [Pré-Requisitos]()

---

### 1. Pré-Requisitos

#### 1.1. Workflow, Statuses and Transitions

![workflow-transtions-diagram-01.png](./workflow-transtions-diagram-01.png)

### 2. Groovy Script Workflow Transitions Condition - Custom Field 1 deve estar preenchido com um CEP numérico de 8 posições numéricas

#### 2.1. Navegue até a configuração do Script Groovy

2.1. Navegue para a opção do menu principal superior do Jira `Configurações >> Jira Administration >> Issues`

2.2. Na página de `Administration` clique na aba de menu superior `Issues`, em seguida no menu lateral esquerdo `Workflow` e em seguida link `Actions :: Edit` na linha correspondente à configuração do workflow desejado

2.3. Na página `Adminsration >> Issues >> Workflows` clique no botão `Diagram` e no checkbox `Show transition labels` para visualizar o __Workflow Statuses Chart Transition Diagram__

2.4. Na página `Adminsration >> Issues >> Workflows` com o diagrama visível, clique na linha da transição `Start Progress` para acionar o menu suspenso de **Edição da transição**, em seguida clique no link `Conditions` para acessar a página de edição

2.5. Na página `Adminsration >> Issues >> Workflows >> [nome-do-workflow] (Draft)` clique no link `Conditions` e em seguida no botão `Add condition`

2.6. Na página `Adminsration >> Add Condition To Transition` escolha a opção `Script Condition [ScriptRunner]` e em seguida no botão `Add`

2.7. Na página `Adminsration >> Add Parameters To Condition` escolha a opção `Custom Script Condition`

#### 2.2. Construa o Script Groovy com o comportamento desejado

* **Objetivo**: Custom Field 1 deve estar preenchido com um CEP numérico de 8 posições numéricas
* **Como fazer**: 
  * Editar o campo `Script` com o código desejado, lembrando que o resultado esperado do script é um __boolean__ onde `true` é sucesso e `false` é fracasso
  * Clicar no botão `Update` para salvar o conteúdo de seu script
  * Clicar no botão `Publicar` para publicar a nova versão de seu workflow

* Exemplo-01: Condition sempre `false`, isto é nunca será possível fazer esta transição

```groovy
return false
```

* Exemplo-01: Condition sempre `false`, isto é nunca será possível fazer esta transição



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

* Troubleshooting
