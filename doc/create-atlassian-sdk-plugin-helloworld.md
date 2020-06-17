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

* Step-03: Execute o seu plugin Jira instalado neste ambiente virtual

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

* Step-05: 

