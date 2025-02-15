package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class TaskCreateSteps {

    HomePage homePage = new HomePage();

    @Given("Hago click en el botón Nueva Tarea")
    public void clickTaskNew() {
        homePage.clickTaskNew();
    }

    @Then("Se despliega modal con el formulario de creación de tareas")
    public void taskCreateWindow() {
        Assert.assertTrue(homePage.taskCreateWindow(), "No se levanta modal de creación de tareas");

    }

    @When("Ingreso el título {string}, descripción {string}, fecha de vencimiento {string} y prioridad {string}")
    public void fillNewTask(String título, String descripción, String fechaDeVencimiento, String prioridad) {
        homePage.fillNewTask(título, descripción, fechaDeVencimiento, prioridad);
    }

    @And ("Hago click en el botón Crear Tarea")
    public void clickTaskCreate() {
        homePage.clickTaskCreate();
}

@Then ("Se muestra mensaje Tarea creada correctamente")
public void taskCreateSuccess() {
    Assert.assertTrue(homePage.taskCreateSuccess(), "Tarea no queda creada correctamente");
}
}