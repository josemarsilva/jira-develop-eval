### example-groovy-script-console-with-apache-log4j.md

1. Na página de `Administration` clique na aba de menu superior `Manage Apps`, em seguida no botão lateral esquerdo `Console`

1.1. Edit o seguinte script

```groovy
import org.apache.log4j.Logger
import org.apache.log4j.Level
log.setLevel(Level.DEBUG)
log.info("Log4J write info in level debug - see Logs ")
return "example-groovy-script-console-with-apache-log4j"
```

1.2. Clique no botão `Run`

1.3. Observe os resultados

* Na aba `Result` aparece o texto do `return`, isto é `example-groovy-script-console-with-apache-log4j`
* Na aba `Logs` aparece o texto do `log.info` na formatação do Log4J, isto é `2020-06-19 14:39:27,215 INFO [runner.ScriptBindingsManager]: Log4J write info in level debug - see Logs `

