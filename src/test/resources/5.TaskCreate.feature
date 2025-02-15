Feature: Crear nueva tarea
Como usuario, quiero poder crear una nueva tarea proporcionando un
título, una descripción, una prioridad y una fecha de término para
organizar y gestionar mis actividades diarias.

  Background: Se hace Login a la página
    Given Navego a la página de inicio
    When Ingreso el email "nvasque8@sentra.cl" y contraseña "test123"
    And Hago click en el botón Ingresar
    Then Hago click en el botón Home


  Scenario: Desplegar modal de creación de tareas
    Given Hago click en el botón Nueva Tarea
    Then Se despliega modal con el formulario de creación de tareas

 
  Scenario Outline: Crear una nueva tarea
    Given Hago click en el botón Nueva Tarea
    When Ingreso el título <título>, descripción <descripción>, fecha de vencimiento <fecha y hora> y prioridad <prioridad>
    And Hago click en el botón Crear Tarea
    Then Se muestra mensaje Tarea creada correctamente

    Examples:
      | título               | descripción                   | fecha y hora          | prioridad |
      | "Primera Tarea Test" | "Esta es una tarea de prueba" | "15/02/2025 16:00:00" | "1"       |
