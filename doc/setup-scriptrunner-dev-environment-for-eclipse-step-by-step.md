### setup-scriptrunner-dev-environment-for-eclipse-step-by-step.md


1. Navegar para o menu do Eclipse `Windows >> Preference`
1.1. Na caixa de diálogo `Preference` clicar no list-box menu lateral esquerdo `Maven` e expandir a árvore
1.2. No list-box menu com a árvore de `Maven` expandida clicar no sub-menu `User settings`
1.3. Na caixa de diálogo `User Settings` da hierarquia de menu `Prefrences >> Maven >> User Settings`
  * Alterar o campo `User Settings` para a configuração que está no diretório do **Atlas**
  * `C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4\conf\settings.xml`
2. Incluir os repositorios customizados do **ScriptRunner Jira**
2.1. Editar o arquivo `C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4\conf\settings.xml`
2.2. Localizar o trecho `<repositories>`
2.3. Incluir o trecho abaixo com os repositorios customizados

```cmd
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

2.4. Configurar `pom.xml` e incluir os trechos de dependências `<dependencies> .. </dependencies>` e propriedades `<properties> .. </properties>`:

```cmd
C:\> notepad C:\..\jira-develop-eval\pom.xml
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
        <!--
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-all</artifactId>
            <version>1.8.5</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.1.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.6.6</version>
            <scope>provided</scope>
        </dependency>
        -->

		:
		<properties>
				:
			<groovy.version>2.2.1</groovy.version>
			<scriptrunner.version>4.1.3.26</scriptrunner.version>
				:
		</properties>
		:

2.5. Fazer clean do project

```cmd
C:\..\java-jira-plugin-helloworld> atlas-clean
```

```console
[INFO] Project POM found
Executing: "C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4\bin\mvn.cmd" clean -gs C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4/conf/settings.xml
[INFO] Scanning for projects...
[INFO]
[INFO] --------< br.com.josemarsilva.jira:java-jira-plugin-helloworld >--------
[INFO] Building java-jira-plugin-helloworld 1.0.0
[INFO] --------------------------[ atlassian-plugin ]--------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ java-jira-plugin-helloworld ---
[INFO] Deleting C:\GitHome\ws-github-09\jira-develop-eval\java-jira-plugin-helloworld\target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 14.676 s
[INFO] Finished at: 2020-06-19T11:19:20-03:00
[INFO] ------------------------------------------------------------------------
```

2.5. Empacotar o projeto e conferir

```cmd
C:\..\java-jira-plugin-helloworld> atlas-package
```

```console
[INFO] Project POM found
Executing: "C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4\bin\mvn.cmd" package -gs C:\Apps\Atlassian\atlassian-plugin-sdk-8.0.16\apache-maven-3.5.4/conf/settings.xml
[INFO] Scanning for projects...
[INFO]
[INFO] --------< br.com.josemarsilva.jira:java-jira-plugin-helloworld >--------
[INFO] Building java-jira-plugin-helloworld 1.0.0
[INFO] --------------------------[ atlassian-plugin ]--------------------------
		:
[INFO] Starting Atlassian Spring Byte Code Scanner...
[INFO]
		:
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ut.br.com.josemarsilva.jira.java_jira_plugin_helloworld.MyComponentUnitTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.037 s - in ut.br.com.josemarsilva.jira.java_jira_plugin_helloworld.MyComponentUnitTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
		:
[INFO] Building jar: C:\GitHome\ws-github-09\jira-develop-eval\java-jira-plugin-helloworld\target\java-jira-plugin-helloworld-1.0.0.jar
[INFO]
[INFO] --- jira-maven-plugin:8.0.2:generate-obr-artifact (default-generate-obr-artifact) @ java-jira-plugin-helloworld ---
[INFO] the file name is  : java-jira-plugin-helloworld-1.0.0
[INFO] using maven-bundle-plugin v3.5.0
[INFO] Installing java-jira-plugin-helloworld-1.0.0.jar
[INFO] Writing OBR metadata
[INFO] Building jar: C:\GitHome\ws-github-09\jira-develop-eval\java-jira-plugin-helloworld\target\java-jira-plugin-helloworld-1.0.0.obr
[INFO]
[INFO] --- jira-maven-plugin:8.0.2:validate-test-manifest (default-validate-test-manifest) @ java-jira-plugin-helloworld ---
[INFO] Manifest found, validating...
[INFO] Manifest validated
[INFO]
[INFO] --- jira-maven-plugin:8.0.2:test-jar (default-test-jar) @ java-jira-plugin-helloworld ---
[INFO] found Test: it.br.com.josemarsilva.jira.java_jira_plugin_helloworld.MyComponentWiredTest, adding to plugin.xml...
[INFO] Building jar: C:\GitHome\ws-github-09\jira-develop-eval\java-jira-plugin-helloworld\target\java-jira-plugin-helloworld-1.0.0-tests.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 9.795 s
[INFO] Finished at: 2020-06-19T12:02:13-03:00
[INFO] ------------------------------------------------------------------------
```

2.6. Conferir o pacote gerado

```cmd
C:\..\java-jira-plugin-helloworld> dir .\target\java-jira-plugin-helloworld*
```

```console
	:
19/06/2020  12:02         1.739.984 java-jira-plugin-helloworld-1.0.0-tests.jar
19/06/2020  12:02           272.246 java-jira-plugin-helloworld-1.0.0.jar
19/06/2020  12:02           238.478 java-jira-plugin-helloworld-1.0.0.obr
	:
```

---

I. References
* https://scriptrunner.adaptavist.com/5.0.3/jira/DevEnvironment.html
