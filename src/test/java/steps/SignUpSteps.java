package steps;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class SignUpSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @When("Hago click en el botón de registro")
    public void ToClickSignUp() throws InterruptedException {
        landingPage.clickSignUp();
    }

    @Then("Se despliega modal con el formulario de registro")
    public void SignUpWindow() {
        Assert.assertTrue(landingPage.firstResult(), "No se levanta modal Registrar Usuario");
    }

    @And("Ingreso el nombre {string}, apellido {string} , email {string}, contraseña {string}")
    public void ingreso_el_nombre_prueba_apellido_junior_email_prueba_gmail_com_contraseña(
            String nombre, String apellido, String email, String contraseña) {
        landingPage.fillSignUpForm(nombre, apellido, email, contraseña);
    }

    @And("Hago click en el botón Registrar Usuario")
    public void hago_clic_en_el_botón() {
        landingPage.clickRegister();
    }

    @Then("Se muestra mensaje Usuario creado correctamente")
    public void se_muestra_mensaje() {
        Assert.assertTrue(landingPage.successResult(), "Usuario no queda registrado correctamente");
    }
}