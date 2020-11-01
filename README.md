# TP1 Fundamentos do Desenvolvimento JAVA

Trabalho realizado para a Disciplina Regular 1 - Fundamentos do Desenvolvimento JAVA - do Instituto Infnet. O qual consiste na criação de um sistema para cadastro e exibição das notas e médias de alunos de uma turma. <br/>

Configurações usadas:<br/>
Sistema operacional: Windows 10 Pro, 64 bits<br/>
IDE: Apache Netbeans IDE 12.1 e JDK 8.

# JDK
## Instalação

Instale o JDK via site da Oracle selecionando o programaq compatível com seu Sistema Operacional. Após o download, execute o instalador, seguindo o passo a passo sugerido. <br/>

## Configuração

Acesse "Meu Computador", então clique em "Configurações Avançadas de Sistema" e, por fim, "Variáveis de Ambiente".<br/>

Na tela das variáveis, abrir janela com dois espaços separados, o primeiro será as variáveis do usuário e o segundo as variáveis do sistema.<br/>

###### 1. Editar Path
Selecionar as variáveis do sistema;<br/>
Selecionar "PATH" na primeira coluna e clicar em "EDITAR";<br/>
Na tela "EDITAR VARIÁVEIS DO SISTEMA", clicar em "NOVO" e digitar o comando (SEM AS ASPAS): "path=%JAVA_HOME%\bin";<br/>
Clicar em OK;<br/>

###### 2. Criar Variável
Selecionar as variáveis do sistema;<br/>
Clicar em "NOVO";<br/>
Selecionar nome da variável e digitar (SEM AS ASPAS): "JAVA_HOME";<br/>
Em "VALOR DA VARIÁVEL", selecionar o Diretório onde o JDK foi instalado;<br/>
Clicar em OK;<br/>

###### 3. Criar Variável
Clicar em "NOVO";<br/>
Selecionar nome da variável e digitar (SEM AS ASPAS): "CLASSPATH";<br/>
Em "VALOR DA VARIÁVEL" e digitar (SEM AS ASPAS): "%JAVA_HOME%;.";<br/>
Clicar em OK;<br/>

###### 4. Verificaçaõ das Variáveis
Digitar CMD no seu espaço de busca do Windows;<br/>
Abrir o Prompt de Comando;<br/>
Digitar (SEM AS ASPAS): "javac";<br/>
Verificar informações do JAVA que foi instalado;<br/>
Digitar (SEM AS ASPAS): "java -version";<br/>
Verificar a versão do JAVA que foi instalado;<br/>

# Testes
## Cenário 01 - Cadastro de alunos 
###### 1. Acessar o Apache ;
###### 2. Selecionar "Run Project";
###### 3. O menu será exibido;
###### 4. No menu, digitar a opção [ 1 ];
###### 5. Em seguida, informar o nome do aluno, sua nota na AV01 E AV02;
###### 6. Ao final, o MENU será exibido novamente.

###### --> Conformidade esperada: Nenhum retorno de erro. <--

###### 1. Acessar o Apache ;
###### 2. Selecionar "Run Project";
###### 3. O menu será exibido;

![image](https://user-images.githubusercontent.com/37251600/97817408-1099c480-1c7b-11eb-9501-c1ad4beda061.png)

###### 4. No menu, digitar a opção [ 1 ];

![image](https://user-images.githubusercontent.com/37251600/97817426-358e3780-1c7b-11eb-9390-9da155b63c24.png)

###### 5. Em seguida, informar o nome do aluno, sua nota na AV01 E AV02;

![image](https://user-images.githubusercontent.com/37251600/97817522-b77e6080-1c7b-11eb-9b6c-7729bf9d3f05.png)

###### 6. Ao final, o MENU será exibido novamente.

![image](https://user-images.githubusercontent.com/37251600/97817584-0af0ae80-1c7c-11eb-98ab-24dcff6d5ce9.png)


## Cenário 02 - Consultar Boletim de um aluno
###### 1. Acessar o Apache;
###### 2. Selecionar "Run Project";
###### 3. O menu será exibido;
###### 4. No menu, digitar a opção [ 2 ];
###### 5. Em seguida, informar o ID de um aluno;
###### 6. Ao final, será informado o nome do aluno, as notas da AV01, AV02, a média e a situação do aluno.

###### --> Conformidade esperada: Exibição das informações do aluno e nenhum retorno de erro. <--

![image](https://user-images.githubusercontent.com/37251600/97817408-1099c480-1c7b-11eb-9501-c1ad4beda061.png)

###### 4. No menu, digitar a opção [ 2 ];

![image](https://user-images.githubusercontent.com/37251600/97817948-32e11180-1c7e-11eb-9495-62f7ea916b33.png)

###### 5. Em seguida, informar o ID de um aluno;

![image](https://user-images.githubusercontent.com/37251600/97818013-a7b44b80-1c7e-11eb-8b6d-434f6e43b658.png)

###### 6. Ao final, será informado o nome do aluno, as notas da AV01, AV02, a média e a Situação do aluno.

![image](https://user-images.githubusercontent.com/37251600/97817981-6de34500-1c7e-11eb-8c8b-4bfdf0aba2c1.png)

## Cenário 03 - Consultar notas da turma
###### 1. Acessar o Apache;
###### 2. Selecionar "Run Project";
###### 3. O menu será exibido;
###### 4. No menu, digitar a opção [ 3 ];
###### 5. Em seguida, informar o ID de um aluno.

###### --> Conformidade esperada: Exibição das informações de todos os alunos cadastrados e nenhum retorno de erro. <--

###### 1. Acessar o Apache;
###### 2. Selecionar "Run Project";
###### 3. O menu será exibido;
###### 4. No menu, digitar a opção [ 3 ];

![image](https://user-images.githubusercontent.com/37251600/97818368-c7e50a00-1c80-11eb-84f9-2a215e7486e4.png)

###### 5. Em seguida, será informado os nomes dos alunos, as notas da AV01, AV02, a média e a situações dos alunos.

![image](https://user-images.githubusercontent.com/37251600/97818404-01b61080-1c81-11eb-88a0-9c3721bd75f6.png)


## Cenário 04 - Consultar notas da turma
###### 1. Acessar o Apache;
###### 2. Selecionar "Run Project";
###### 3. O menu será exibido;
###### 4. No menu, digitar a opção [ 4 ];
###### 5. Em seguida, o sistema retornará uma mensagem de sucesso;

###### --> Conformidade esperada: Exibição da mensagem "Sistema finalizado com sucesso!" e nenhum retorno de erro. <--

###### 1. Acessar o Apache;
###### 2. Selecionar "Run Project";
###### 3. O menu será exibido;
###### 4. No menu, digitar a opção [ 4 ];

![image](https://user-images.githubusercontent.com/37251600/97818465-56598b80-1c81-11eb-9d27-27b870c8cf75.png)

###### 5. Em seguida, o sistema retornará uma mensagem de sucesso;

![image](https://user-images.githubusercontent.com/37251600/97818520-96b90980-1c81-11eb-850d-ab38b4e96f4e.png)
