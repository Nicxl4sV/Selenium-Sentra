package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class OrderBySteps {
    HomePage homePage = new HomePage();
   

    //ORDENAR SEGUN TITULO
    @When("Hago click en el botón del {string}, ordenar de manera descendente")
    public void clickTitle(String option){
        homePage.clickOnGrid(option);
    }

    @When("Hago click en el botón del {string}, ordenar de manera ascendente")
    public void doubleClickTitle(String option){
        homePage.doubleClickOnGrid(option);
    }

    @Then("Las tareas se ordenan de manera descendente")
    public void validateTitleDescOrder(){
        org.testng.Assert.assertEquals(homePage.validateOrder(), "descending");
    }

    @Then("Las tareas se ordenan de manera ascendente")
    public void validateTitleAscOrder(){
        org.testng.Assert.assertEquals(homePage.validateOrder(), "ascending");
    }

}
