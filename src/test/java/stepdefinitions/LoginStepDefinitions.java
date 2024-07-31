package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.model.util.EnvironmentVariables;
import questions.LoginQuestions;
import tasks.LoginTask;
import tasks.OpenUrlTask;
import userinterfaces.LoginUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

    EnvironmentVariables environmentVariables;

    @Given("the user is on the saucedemo login page")
    public void theUserIsOnTheSaucedemoLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                OpenUrlTask.on(environmentVariables.getProperty("pages.saucedemo"))
        );
    }

    @When("the user enters the credentials {string} {string}")
    public void theUserEntersTheCredentials(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginTask.withCredentials(user, password)
        );
    }

    @Then("the user sees that the account is blocked")
    public void theUserSeesThatTheAccountIsBlocked() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Login error",
                        LoginQuestions.text(),
                        equalTo("Epic sadface: Sorry, this user has been locked out.")
                )
        );
    }

}
