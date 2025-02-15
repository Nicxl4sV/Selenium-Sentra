Feature: Registro de usuario
  Como nuevo usuario, quiero poder registrarme en el sitio
  proporcionando mi nombre, apellido, correo y contraseña para poder
  acceder a las funcionalidades del sitio.

  Scenario: Desplegar modal de registro
    Given Navego a la página de inicio
    When Hago click en el botón de registro
    Then Se despliega modal con el formulario de registro

   Scenario Outline: Registrar usuario
    Given Navego a la página de inicio
    When Hago click en el botón de registro
    And Ingreso el nombre <name>, apellido <lastname> , email <e-mail>, contraseña <password>
    And Hago click en el botón Registrar Usuario
    Then Se muestra mensaje Usuario creado correctamente

     Examples:
       | name     | lastname | e-mail             | password |
       | "Prueba" | "Junior" | "prueba@gmail.com" | "123456" |
