### example-groovy-script-in-workflow-transitions-conditions-validators-postfunctions.md

---

* Índice
  * [Pré-Requisitos](#1-pré-requisitos)
    * [Workflow, Statuses and Transitions](#11-workflow-statuses-and-transitions)
  * [Groovy Script Workflow Transitions Condition - Custom Field 1 deve estar preenchido com um CEP numérico de 8 posições numéricas](#2-groovy-script-workflow-transitions-condition---custom-field-1-deve-estar-preenchido-com-um-cep-numérico-de-8-posições-numéricas)

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

2.6. Na página `Adminsration >> Add Condition To Transition` escolha a opção clicando no botão `Script Condition [ScriptRunner]` e em seguida no botão `Add`

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


### Referencias

* Tutorial
  * [Script Runner - Script Conditions Tutorial](https://scriptrunner.adaptavist.com/latest/jira/tutorials/scripted-conditions-tutorial.html)
  * [Script Runner - Script Validators Tutorial](https://scriptrunner.adaptavist.com/latest/jira/tutorials/scripted-validators-tutorial.html)
  * [Script Runner - Script Post Functions Tutorial](https://scriptrunner.adaptavist.com/latest/jira/tutorials/scripted-post-functions-tutorial.html)

* Troubleshooting
