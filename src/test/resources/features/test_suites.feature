@PruebaBanistmo
Feature: Prueba para banistmo

  Scenario: Escenario 1 para la prueba de Banitsmo
    Given Se ejecuta el explorador
    And Se selecciona la opcion acerca de nosotros
    And Se selecciona proveedores en la informacion coorporativa
    When Se descarga el documento de Politicas de tratamiento y de proteccion de datos personales de proveedores
    Then Se valida que el documento abierto sea el correcto

  Scenario Outline: Escenario 2 para la prueba de Banitsmo
    Given Se ejecuta el explorador
    And Se seleciona la opcion negocios
    When Yo necesito "<necesito>" para "<para>"
    Then Aparece la opcion "<opcion>"
    Examples:
      | necesito | para | opcion |
      | Ahorrar o Invertir | Obtener una rentabilidad estable y segura | Cuenta de Ahorros |
      | Ahorrar o Invertir | Obtener una mayor rentabilidad a un mayor riesgo | InvesBot |