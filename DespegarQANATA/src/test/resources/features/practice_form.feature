# new feature
# Tags: optional

Feature: vuelos despegar
  as
    cliente de despegar
  i want to
    adquirir la buscar y reservar vuelo para una persona
  so that
    puede viajar

  Scenario: busqueda y reserva de vuelo para una persona
    Given el cliente desea buscar y reservar un vuelo
    When el cliente realiza la seleccion de los datos del vuelo
    Then despegar realiza la respectiva reserva del vuelo para una persona




