### setting-up-environment-and-create-basic-app-using-atlassian-connect.md

* Step-01: Create NodeJs

```cmd
C:\..\jira-develop-eval> md nodejs-jira-basic-app
C:\..\jira-develop-eval> cd nodejs-jira-basic-app
C:\..\nodejs-jira-basic-app> npm install -g ngrok 
```

* Step-02: Define App Descriptor

```cmd
C:\..\nodejs-jira-basic-app> notepad atlassian-connect.json
  {
     "name": "Hello World",
     "description": "Atlassian Connect app",
     "key": "com.example.myapp",
     "baseUrl": "https://<placeholder-url>",
     "vendor": {
         "name": "Example, Inc.",
         "url": "http://example.com"
     },
     "authentication": {
         "type": "none"
     },
     "apiVersion": 1,
     "modules": {
         "generalPages": [
             {
                 "url": "/helloworld.html",
                 "key": "hello-world",
                 "location": "system.top.navigation.bar",
                 "name": {
                     "value": "Greeting"
                 }
             }
         ]
     }
}
```

* Step-03: Create the user interface

```cmd
C:\..\nodejs-jira-basic-app> notepad helloworld.html
<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="https://unpkg.com/@atlaskit/css-reset@2.0.0/dist/bundle.css" media="all">
        <script src="https://connect-cdn.atl-paas.net/all.js" async></script>
    </head>
    <body>
        <section id="content" class="ac-content">
            <h1>Hello World</h1>
        </section>
    </body>
</html>
```

* Step-04: Deploy and install your http server

```cmd
C:\..\nodejs-jira-basic-app> npm install http-server -g
C:\..\nodejs-jira-basic-app> http-server -p 8000
```

* Step-05: Test your HTTP Server connection
  * http://localhost:8000/helloworld.html
  * http://localhost:8000/atlassian-connect.json

```browser
+------+------------------------------------------------------------------------+
| url: | http://localhost:8000/atlassian-connect.json                           |
+------+------------------------------------------------------------------------+
| Hello World                                                                   |
+-------------------------------------------------------------------------------+
```

* Step-06: Make the app files available to the internet

```cmd
C:\..\nodejs-jira-basic-app> ngrok http 8000
```

* Step-07: Extract public IP address for your application
  * In this example the public IP address is http://04ed18420cde.ngrok.io

```cmd
ngrok by @inconshreveable

Session Status                online
Session Expires               7 hours, 54 minutes
Version                       2.3.35
Region                        United States (us)
Web Interface                 http://127.0.0.1:4040
Forwarding                    http://04ed18420cde.ngrok.io -> http://localhost:8000
Forwarding                    https://04ed18420cde.ngrok.io -> http://localhost:8000

Connections                   ttl     opn     rt1     rt5     p50     p90
                              0       0       0.00    0.00    0.00    0.00
```

* Step-08: Install and test your app

  1. Navegue pelo Jira até a página de Gerenciar Aplicações: `Jira Cloud :: (menu) App >> Gerencie seus apps ...`
  2. Clique no botão `Carregar app`
  3. Na caixa de diálogo `Upload app` preencha o campo `from this URL` com a informação do IP address obtido no passo anterior `http://654ad0d030e3.ngrok.io/atlassian-connect.json`
  4. Clique no botão `Upload` e aguarde o Jira apresentar a mensagem `Installed and ready to go message when the installation is complete` e clique no botão `Close` para fechar.
  5. Observe o novo link `Hello World Josemar` abaixo do menu `App`
