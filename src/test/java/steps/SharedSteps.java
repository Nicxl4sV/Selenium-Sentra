package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class SharedSteps {

    MainPage landingPage = new MainPage();

    @When("Ingreso el email {string} y contraseña {string}")
    public void fillLoginForm(String email, String contraseña) {
        landingPage.fillLoginForm(email, contraseña);
    }

    @And("Hago click en el botón Ingresar")
    public void hago_click_en_el_botón_ingresar() {
        landingPage.clickLogin();
    }

    @Given("Navego a la página de inicio")
    public void iNavigateToSentraTsk() {
        landingPage.iNavigateToSentraTsk();
    }

}
