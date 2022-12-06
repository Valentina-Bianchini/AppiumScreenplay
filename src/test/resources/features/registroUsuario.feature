Feature: Realizar registro en app de clarin
  Como usuario anonimo
  Quiero realizar registracion ingresando usuario y contraseña
  Para verficar correcta creacion de cuenta

  @si
  Scenario Outline: Realizar registro en app de clarin

    Given usuario es visitante en app
    When ingreso datos de registro
      |<usuario>|<contrasenia>|
    Then verifico logueo correcto

    Examples:
      |usuario                  |contrasenia|
      |n_sync_boyband@gmail.com |ByeByeBye  |