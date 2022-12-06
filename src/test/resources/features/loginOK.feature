Feature: Realizar login en app de prueba
  Como usuario no logueado
  Quiero ingresar usuario y contraseña
  Para verficar correcto logueo

  Scenario Outline: Realizar login en app de prueba

    Given usuario es nuevo en app
    When ingreso usuario y contraseña
      |<usuario>|<contrasenia>|
    Then verifico logueo correcto
    #And cierro sesion

    Examples:
      |usuario                          |contrasenia     |
      |christina.aguilera@neoris.com    |GenieInABottle  |