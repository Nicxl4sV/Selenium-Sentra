package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class LogInSteps {
    MainPage landingPage = new MainPage();

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

    @Then("No logro ingresar a la plataforma")
    public void se_muestra_mensaje_error() {
        Assert.assertTrue(landingPage.LogInFailResult(), "Usuario logueado correctamente");
    }
}