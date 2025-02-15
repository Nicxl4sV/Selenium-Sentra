package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class SharedSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("Navego a la página de inicio")
    public void iNavigateToSentraTsk() {
        landingPage.iNavigateToSentraTsk();
    }

    // @When("Ingreso el email {string} y contraseña {string}")
    // public void fillLoginForm(String email, String contraseña) {
    // landingPage.fillLoginForm(email, contraseña);
    // }

    // @And("Hago clic en el botón Ingresar")
    // public void hago_clic_en_el_botón_ingresar() {
    // landingPage.clickLogin();
    // }
}
