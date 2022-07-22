Feature: Object

  Scenario: Object
    Given tengo acceso a todo.ly
    And me registro a la pagina
      | name   | phone  | address | ci     |
      | Freddy | 545454 | Cbba    | 124545 |
    Then deberia ingresar a la aplicacion