### create-atlassian-sdk-plugin-helloworld.md

* Step-01: Verifique se o ambiente do Atlas está instalado corretamente

```cmd
C:\..\jira-develop-eval> atlas-version
ATLAS Version:    8.0.16
ATLAS Home:       C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16
ATLAS Scripts:    C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\bin
ATLAS Maven Home: C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4
AMPS Version:     8.0.2
      :
      :
C:\..\jira-develop-eval> 
```

* Step-02: Use o Alassian SDK (atlas) para construir o esqueleto de sua aplicação e em seguida confirme as configurações

```cmd
C:\..\java-jira-plugin-helloworld> atlas-create-jira-plugin
Define value for groupId: : br.com.josemarsilva
Define value for artifactId: : jirapluginhelloworld
Define value for version: 1.0.0-SNAPSHOT: : 1.0.0-SNAPSHOT
Define value for package: br.com.josemarsilva: : br.com.josemarsilva.jiraplugin.jirapluginhelloworld
  :
```

* Step-03: Execute o seu plugin Jira instalado neste ambiente virtual do Jira

```cmd
C:\..\jira-develop-eval> cd jirapluginhelloworld
C:\..\jirapluginhelloworld> atlas-run
           :
[INFO] [talledLocalContainer] INFORMAÇÕES: Server startup in 126251 ms
[INFO] [talledLocalContainer] Tomcat 8.x started on port [2990]
[INFO] jira started successfully in 509s at http://localhost:2990/jira
[INFO] Type Ctrl-C to shutdown gracefully
```

* Step-04: Use o browser para acessar o endereço [http://localhost:2990] do seu plugin helloworld instalado neste ambiente virtual do Jira
  * Faça o login com as credenciais:
    * Username: `admin`
    * Password: `admin`

```browser
+------+-----------------------------------------------------------------------+
| url: | http://localhost:2990                                                 |
+------+-----------------------------------------------------------------------+
|                                                   +- Login ---------------+  |
|                                                   |  Username: [ admin ]  |  |
|                                                   |  Password: [ admin ]  |  |
|                                                   +-----------------------+  |
+------------------------------------------------------------------------------+
```

* Step-05: Interromper a execução de seu plugin helloworld instalado neste ambiente virtual do Jira
  * Digite `Ctrl-Z` ou `Ctrl-C` na console
  
* Step-06: Modifique as informações de configurações do plugin presentes no `pom.xml`

```cmd
C:\..\jirapluginhelloworld> cd jirapluginhelloworld
C:\..\jirapluginhelloworld> notepad pom.xml
   :
<?xml version="1.0" encoding="UTF-8"?>
   :
    <organization>
        <name>Josemar F. A. Silva</name>
        <url>https://github.com/josemarsilva/jira-develop-eval</url>
    </organization>
   :
    <name>Jira Plugin Hello World</name>
    <description>Este e o exemplo de plugin br.com.josemarsilva:jirapluginhelloworld plugin for Atlassian JIRA.</description>
    <packaging>atlassian-plugin</packaging>
   :
```

* Step-07: Execute o seu plugin Jira instalado neste ambiente virtual do Jira
  * Execute o comando `atlas-run`
  * Acessar pelo browser [http://localhost:2990/jira] o ambiente virtual do Jira com a nova versão do plugin instalada
  * Efetue o login com as credenciais (username e password): `admin` e `admin`
  * Navegue para menu do Jira `Configurações >> Aplicações` e em seguida, clique na aba `Extras` e no botão de menu lateral esquerdo `Gerenciar apps`
    * Localize a linha correspondente ao plugin `jirapluginhelloworld` e clique para expandir
     * Observe as informações: `Descrição`, `Fornecedor`
      * clique no link `1 de 1 módulos` para analisar os módulos`
        * Observe que há um `resource` do tipo Web Resources

C:\..\jirapluginhelloworld> atlas-run
           :
[INFO] [talledLocalContainer] INFORMAÇÕES: Server startup in 126251 ms
[INFO] [talledLocalContainer] Tomcat 8.x started on port [2990]
[INFO] jira started successfully in 509s at http://localhost:2990/jira
[INFO] Type Ctrl-C to shutdown gracefully
```

* Step-08: Interromper a execução de seu plugin helloworld instalado neste ambiente virtual do Jira
  * Digite `Ctrl-Z` ou `Ctrl-C` na console
  
* Step-09: Criar módulo de plugin 

```cmd
C:\..\jirapluginhelloworld> cd jirapluginhelloworld
C:\..\jirapluginhelloworld> atlas-create-jira-plugin-module
Choose a number: 30
Enter Plugin Module Name My Web Section: : jirapluginhelloworld
Enter Location (e.g. system.admin/mynewsection): my-item-link-helloworld
Add Another Plugin Module? (Y/y/N/n) N: : Y/y/N/n
Choose a number: 25
Enter Plugin Module Name My Web Item: : myItem
Enter Location (e.g. system.admin/mynewsection): system.top.navigation.bar
Enter Link URL (e.g. /secure/CreateIssue!default.jspa): deleteMe
Show Advanced Setup? (Y/y/N/n) N: : N
   :
```

* Step-10: Adicionar uma entrada de menu Customizada no Jira
  * Na seção `web-section`:
    * Remover a linha `<label key="my-section.label"/>`
	* Remover o texto `deleteMe` de <link linkId="my-item-link">.

```cmd
C:\..\jirapluginhelloworld> cd jirapluginhelloworld
C:\..\jirapluginhelloworld> notepad src\main\resources\atlassian-plugin.xml
<atlassian-plugin key="${atlassian.plugin.key}" name="${project.name}" plugins-version="2">
   :
  <web-section name="jirapluginhelloworld" i18n-name-key="jirapluginhelloworld.name" key="jirapluginhelloworld" location="my-item-link-helloworld" weight="1000"> 
    <description key="jirapluginhelloworld.description">The jirapluginhelloworld Plugin</description>  
--> 1 line(s) removed
  </web-section>  
  <web-item name="myItem" i18n-name-key="my-item.name" key="my-item" section="system.top.navigation.bar" weight="1000"> 
    <description key="my-item.description">The myItem Plugin</description>  
    <label key="my-item.label"></label>
--> 1 line(s) changed	
    <link linkId="my-item-link"></link>
  </web-item>

   :
```



---

### I - References
  * https://developer.atlassian.com/server/framework/atlassian-sdk/create-a-helloworld-plugin-project/
  * https://developer.atlassian.com/server/framework/atlassian-sdk/working-with-the-pom/