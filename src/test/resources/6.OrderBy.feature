Feature: Ordenar tareas por título
Como usuario, deseo poder ordenar mi lista de tareas por título, ya sea
de manera ascendente o descendente, para encontrar y organizar mis
tareas de manera efectiva.

Background: Se hace Login a la página
    Given Navego a la página de inicio
    When Ingreso el email "nvasque8@sentra.cl" y contraseña "test123"
    And Hago click en el botón Ingresar
    And Navego a la página de inicio
    Then Hago click en el botón Home


# @Test
#   Scenario: Ordenar tareas por título de manera ascendente
#     Given Navego a la página de inicio
#     When Hago click en el botón Home
#     And Hago click en el botón del título, ordenar de manera ascendente
#     Then Las tareas se ordenan por título de manera ascendente
    