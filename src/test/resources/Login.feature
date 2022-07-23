Feature: Login

  Scenario: Verify the login is successfully
    Given la pagina "http://todo.ly" este abierta
    When yo quiero realizar el login
      | email    | maestria@maestria.com |
      | password | 12345                 |
    Then yo deberia ingresar a la app web
