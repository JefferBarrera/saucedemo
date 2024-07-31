package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.AddProductFaultyTask;
import tasks.AddProductTask;
import tasks.CompletePurchaseFailedTask;
import userinterfaces.CheckoutUI;

public class VerifyOtherFunctionalitiesStepDefinitions {

    @Then("the user does not see the complete purchase message")
    public void theUserDoesNotSeeTheCompletePurchaseMessage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(CheckoutUI.LBL_COMPLETE_HEADER).isNotDisplayed(),
                Ensure.that(CheckoutUI.BTN_FINISH).isDisplayed()
        );
    }
}
