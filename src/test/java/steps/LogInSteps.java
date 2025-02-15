package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;

public class LogInSteps {
    PaginaPrincipal landingPage = new PaginaPrincipal();

    @When("Ingreso el email {string} y contraseña {string}")
    public void fillLoginForm(String email, String contraseña) {
        landingPage.fillLoginForm(email, contraseña);
    }

    @And("Hago click en el botón Ingresar")
    public void hago_click_en_el_botón_ingresar() {
        landingPage.clickLogin();
    }

    @Then("Ingresa logueado a la plataforma  exitosamente")
    public void se_muestra_mensaje() {
        Assert.assertTrue(landingPage.LogInsuccessResult(), "Usuario no logueado correctamente");
    }
}