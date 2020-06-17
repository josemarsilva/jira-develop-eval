## jira-develop-eval
Jira Development Evaluation

## 1. Introduction

Project **jira-develop-eval** is an evaluation of Jira Software as development platform.

* [Introduction](#1-introduction)
* [Diagrams](#2-Diagrams)
  * [Use Case Diagram](#21-Use-Case-Diagram)
  * [Deploy Diagram](#22-Deploy-Diagram)
* [Technologies Used](#3-Technologies-Used)
* [Project](#4-Project)
  * [Guide for Users, Developers and Administrators](#41-Guide-for-Users---Developers-and-Administrators)
    * [Installing Script Runner for Jira](#411-Installing-Script-Runner-for-Jira)
    * [Installing Jira Workflow Toolbox JWT](#412-installing-jira-workflow-toolbox-jwt)
    * [Setting up your NodeJS environment and Creating a Basic App with Atlassian Connect](#414-setting-up-your-nodejs-environment-and-creating-a-basic-app-with-atlassian-connect)
    * [Set up the Atlassian Plugin SDK](#415-set-up-the-atlassian-plugin-sdk)
    * [Build an Atlassian Plugin SDK Project](#416-build-an-atlassian-plugin-sdk-project)
  * [Guide for Configuration](#43-Guide-for-Configuration)
  * [Guide for Test](#44-Guide-for-Test)
  * [Guide for Demonstration](#45-Guide-for-Demonstration)
*   [Patterns Standard Conventions and Best Practices](#46-Patterns-Standard-Conventions-and-Best-Practices)
* [References](#i---references)

## 2. Diagrams

### 2.1. Use Case Diagram

```cmd
![UseCaseDiagram-Context.png](./doc/UseCaseDiagram-Context.png) 
```

### 2.2. Deploy Diagram

```cmd
![DeployDiagram-Context.png](./doc/DeployDiagram-Context.png) 
```


## 3. Technologies Used
* Jira Software (Cloud)
* Jira Software (Server)
* [Script Runner for Jira](https://marketplace.atlassian.com/apps/6820/scriptrunner-for-jira)
* [Jira Workflow Toolbox](https://marketplace.atlassian.com/apps/29496/jira-workflow-toolbox)
* [Jira Cloud Platform](https://developer.atlassian.com/cloud/jira/platform/getting-started/)
* [Jira Atlassian Connect](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/)
* NodeJs
* [Atlassian Plugin SDK](https://developer.atlassian.com/server/framework/atlassian-sdk/tutorials-and-guides/)
* Java JDK 1.8

## 4. Project

### 4.1. Guide for Users, Developers and Administrators

#### 4.1.1. Installing Script Runner for Jira

* *Overview* : Transform your Jira with the complete Automation, Customisation and Extension solution
* *Features* : 
  * Create powerful workflows
  * Define custom automations
  * Extend your Jira with Enhanced Search and JQL Functions
  * Run on a schedule
  * Run after an event
  * Execution History
  * Audit Log
  * Script Console
  * Integrations
  * Library
* *Step-by-step*: [Instaling Script Runner for Jira](./doc/install-script-runner-for-jira-server.md)

#### 4.1.2. Installing Jira Workflow Toolbox (JWT)

* *Overview*: The top rated & complete automation solution for Jira: Limitless customization of workflows without the need to code
* *Features*: 
  * Workflow functions: Jira expressions for Conditions and Validators
  * Automation rules: add comment to target issue, create issue or sub-task, transition issue, update fields
  * Calculated fields
  * JWT Expression parser
  * Schedules
  * General configuration
* *Step-by-step*: [Instaling Jira Workflow Toolbox (JWT)](./doc/install-jira-workflow-toolbox-server-step-by-step)

#### 4.1.3. Setting Up your Jira Cloud Platform Environment

* *Overview*: Enable Development Mode from your Jira Cloud Platform
* *Features*: Enable Development Mode from your Jira Cloud Platform
* *Step-by-step*: [Enable Development Mode from your Jira Cloud Platform](https://developer.atlassian.com/cloud/jira/platform/getting-started/)

#### 4.1.4. Setting up your NodeJS environment and Creating a Basic App with Atlassian Connect

* *Overview*: Setting up your NodeJS environment and create a Basic App
* *Features*: Setting up your NodeJS environment and create a Basic App to be accessed from Jira Cloud
* *Step-by-step*: [Setting-up environment and create basic-app using Atlassian Connect](./doc/setting-up-environment-and-create-basic-app-using-atlassian-connect.md)


#### 4.1.5. Install the Atlassian SDK on a Windows system

* *Overview*: Setting up Atlassian Plugin SDK
* *Features*: Setting up Atlassian Plugin SDK
* *Step-by-step*: [Install Atlassian SDK on Windows - Step by Step](https://developer.atlassian.com/server/framework/atlassian-sdk/install-the-atlassian-sdk-on-a-windows-system/)

#### 4.1.6. Create a HelloWorld plugin project with Atlassian SDK

* *Overview*: Create a HelloWorld plugin project with Atlassian SDK
* *Features*: Create a HelloWorld plugin project with Atlassian SDK
* *Step-by-step*: [Create a HelloWorld plugin project with Atlassian SDK](./doc/create-atlassian-sdk-plugin-helloworld.md)

#### 4.1.7. Create a HelloWorld module plugin project with Atlassian SDK

* *Overview*: Create a HelloWorld module plugin project with Atlassian SDK
* *Features*: Create a HelloWorld module plugin project with Atlassian SDK
* *Step-by-step*: [Create a HelloWorld module plugin project with Atlassian SDK](./doc/create-atlassian-sdk-module-plugin-helloworld.md)


### 4.3. Guide for Configuration

* n/a

### 4.4. Guide for Test

* n/a

### 4.5. Guide for Demonstration

* n/a

### 4.6. Patterns, Standard, Conventions and Best Practices

* n/a


## I - References

* Script Runner for Jira Plugin
  * [Script Runner for Jira Plugin](https://marketplace.atlassian.com/apps/6820/scriptrunner-for-jira)
  * [ScriptRunner - Tutorial Write Hello World Program in Jira](https://www.youtube.com/watch?v=Nf4UX86o2n8&list=PL_E9T0Z4ua164VpnStW9mUTnXXJptcQlO)
* Atlassian Plugin SDK
  * https://developer.atlassian.com/display/DOCS/Introduction+to+the+Atlassian+Plugin+SDK
  * [JIRA Plugin development Totorial 1](https://www.youtube.com/watch?v=oDvY4RWqxMg)
  * [JIRA Plugin development Totorial 2](https://www.youtube.com/watch?v=Aos2ExZcOB0)
  * [JIRA Plugin development Totorial 3](https://www.youtube.com/watch?v=k6J0oIvrvk4)
  * [JIRA Plugin development Totorial 4](https://www.youtube.com/watch?v=-s-5-M9O-Ao) 
  * [Create a Hello World Plugin Project](https://developer.atlassian.com/server/framework/atlassian-sdk/create-a-helloworld-plugin-project/)
