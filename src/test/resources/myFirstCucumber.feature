Feature: Login
  Scenario: Como usuario, quiero ingresar a la aplicación usando email y password para revisar mis archivos
    Given tengo acceso a todo.ly
    When realizo click en el botón login
    And ingreso mi correo electrónico: "maestria@maestria.com"
    And ingreso mi password: 12345
    And realizo click en el botón login
    Then debería ingresar a la aplicación