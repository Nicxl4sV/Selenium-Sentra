Feature: Modificar información de usuario
Como usuario, quiero poder modificar mi información personal,
incluyendo nombre, apellido, correo y contraseña, para mantener mi
perfil actualizado.

  Background: Se hace Login a la página
    Given Navego a la página de inicio
    When Ingreso el email "nvasque8@sentra.cl" y contraseña "test123"
    And Hago click en el botón Ingresar

  Scenario: Validar que esoy en la página del Perfil
    Given Hago click en el botón Perfil
    Then Navego a la página del perfil

  Scenario: Modificar datos del perfil de usuario
    Given Hago click en el botón Perfil
    When Navego a la página del perfil
    And Hago click en el botón editar datos usuario
    And Se abre modal de modificación datos del usuario
    And Ingreso nuevo nombre "Nicolás", nuevo apellido "Vásquez" y nuevo email "nvasque8@sentra.cl"
    And Hago click en el botón modificar usuario
    Then Los datos del usuario nombre "Nicolás", apellido "Vásquez" y el email "nvasque8@sentra.cl" se modifican correctamente

  Scenario: Cambiar contraseña de usuario
    Given Hago click en el botón Perfil
    When Navego a la página del perfil
    And Hago click en el botón cambiar contraseña
    And Se abre modal de modificación de la contraseña
    And Ingreso nueva contraseña "test123" y repito la nueva contraseña "test123"
    And Hago click en el botón Cambiar contraseña
    Then La contraseña del usuario se cambia correctamente

    