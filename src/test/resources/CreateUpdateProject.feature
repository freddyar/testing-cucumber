Feature: Project

  @Regression
  Scenario: Verify the create/update project
    Given la pagina "http://todo.ly" este abierta
    And yo quiero realizar el login
      | email    | maestria@maestria.com |
      | password | 12345                 |
    When yo creo un proyecto con el nombre "Cucumber"
    Then el proyecto "Cucumber" deberia ser mostrado
    When yo atualizo el proyeto "Cucumber" con el nombre "Cucumber-Selenium"
    Then el proyecto "Cucumber-Selenium" deberia ser mostrado
