
Feature: Como usuário cadastro do SauceDemo
         Eu quero realizar login na plataforma
         Para que eu possa acessar minha conta

  Scenario: Realizar login com sucesso
    Given que estou acessando a aplicação
    When informo um Username existente
    And a senha correta
    And clico no botão de login
    Then verifico que o login é realizado com sucesso

 Scenario: Erro ao tentar realizar login com dados incorretos
  Given que estou acessando a aplicação
  When informo um Usarname incorreto 
  And a senha correta
  And clico no botão de login
  Then verifico que é apresentado uma mensagem de erro informando que um dos dados está incorreto
  
 Scenario: Erro ao deixar campo de senha em branco
  Given que estou acessando a aplicação
  When informo um Usarname existente
  And deixo o campo de senha em branco
  And clico no botão de login
  Then verifico que é apresentado uma mensagem de erro informando que o campo de senha é obrigatório
  
 Scenario: Erro ao deixar campo de nome de usuário em branco
  Given que estou acessando a aplicação
  When informo uma senha
  And deixo o campo de nome de usuário em branco
  And clico no botão de login
  Then verifico que é apresentado uma mensagem de erro informando que o campo de nome de usuário é obrigatório
  