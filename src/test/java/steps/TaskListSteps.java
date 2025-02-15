package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class TaskListSteps {

    HomePage homePage = new HomePage();

    @When("Hago click en el botón Home")
    public void ClickHome() {
        homePage.clickHome();
    }

    @And("Estoy en la pantalla Home")
    public void NavigateHome() {
        Assert.assertTrue(homePage.NavigateHome(), "No se levanta modal Modificar Datos Usuario");
    }

    @Then("Se Visualizan las tareas asignadas a mi cuenta")
    public void TaskList() {
        Assert.assertTrue(homePage.TaskList(), "No se visualizan las tareas");

    }

}
