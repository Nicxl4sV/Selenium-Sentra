# Automatización de plataforma Sentra Tasks
Para este proyecto de automatización de la plataforma "Sentra Task", se siguieron los pasos del documento "Prueba de Selenium", el cual contaba con todos los requisitos para la realización de este proyecto.

# Funcionalidades automatizadas

## Las funcionalidades principales de la plataforma y que son las bases para la creación de los casos dep ruebas y de su automatización fueron:

-Registro de usuario
-Inicio de sesión:
-Modificar información de usuario
-Modificar información de usuario
-Ver lista de tareas
-Crear nueva tarea
-Marcar tarea como realizada
-Ordenar tareas por título
-Ordenar tareas por prioridad
-Ordenar tareas por fecha de término 

# Organización

## La organización del proyecto se presenta a continuación:

src/test/java/pages
src/test/java/runner
src/test/java/steps
src/test/java/utils
src/test/resources/features
target/cucumber-reports
.gitignore
build.gradle

# Ejecución

*Para ejecutar todos los casos de manera secuencial, solo se debe ir a src/test/java/runner y comenzará la ejecución.
*En caso de que se quiera ejecutar algún o algunos escenario de prueba específicos, se debe descomentar la 
 linea N° 10 del archivo TestRunner.java (src/test/java/runner/TestRunner.java) y luego colocar @Test, antes de cada escenario a ejecutar 

Todos los casos de prueba deben salir ejecutados correctamente, en caso que un caso de prueba falle, la certificación será rechazada con su justificación en cada caso de prueba.

# Reportes

Para ver el reporte de pruebas, se debe escribir en la terminal el siguiente comando: " gradle test ", el cual al finalizar la ejecución de todos los casos entregará el siguiente resultado con el link del reporte (con la ubicación del archivo en la carpeta del usuario que ejecuta el programa): 

There were failing tests. See the report at: file:///C:/Users/nicol/OneDrive/Escritorio/Evaluacion%20Nvasquez/build/reports/tests/test/index.html
