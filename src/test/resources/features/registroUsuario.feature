Feature: Realizar registro en app de prueba
  Como usuario anonimo
  Quiero realizar registracion ingresando usuario y contraseña
  Para verficar correcta creacion de cuenta

  @si
  Scenario Outline: Realizar registro en app

    Given usuario es nuevo en app
    When ingreso datos de registro
      |<usuario>|<contrasenia>|
    Then verifico registro correcto

    Examples:
      |usuario                  |contrasenia   |
      |n_sync_boyband@gmail.com |ByeByeBye     |
      |backstreetlove@gmail.com |IWantItThatWay|
