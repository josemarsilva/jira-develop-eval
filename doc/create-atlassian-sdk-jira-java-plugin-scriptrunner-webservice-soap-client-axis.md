### create-atlassian-sdk-jira-java-plugin-scriptrunner-webservice-soap-client-axis.md


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

* [Configurar `pom.xml` do projeto para incluir as dependências do ScriptRunner](setup-scriptrunner-dev-environment-for-eclipse-step-by-step.md#3-configurar-pomxml-do-projeto-para-incluir-as-dependências-do-scriptrunner)

```cmd
C:\> notepad C:\..\jira-develop-eval\pom.xml
```

### 4. Executar o Maven/Atlassian `clean` e `package` 

4.1. Executar Maven/Atlassian CLEAN
4.2. Executar Maven/Atlassian PACKAGE
4.3. Conferir o Pacote Gerado




### Referencias

* 