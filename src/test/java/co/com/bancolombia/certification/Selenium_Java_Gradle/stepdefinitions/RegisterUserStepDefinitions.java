// Corremos Runners/RegisterUser para generar los metodos
package co.com.bancolombia.certification.Selenium_Java_Gradle.stepdefinitions;

import co.com.bancolombia.certification.Selenium_Java_Gradle.tasks.SignIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

//Libreria que me permite emplear un actor para hacer validaciones
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    //Esto ejecuta antes del given, permite garantizar las propiedades de serenity.properties (Abrir en incognito, maximizar pantalla, etc)

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniel");
    }

    @Given("^User in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("http://www.automationpractice.com"));

    }

    @When("^The user creates an account by registering their data and filling out the form$")
    public void theUserCreatesAnAccountByRegisteringTheirDataAndFillingOutTheForm() {

        theActorInTheSpotlight().attemptsTo(SignIn.makeinfromation());
    }

    @Then("^User sees its username$")
    public void userSeesItsUsername() {
    }

}
