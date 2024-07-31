package stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.ContinueShoppingTask;

public class VerifyPerformanceStepDefinitions {

    @When("the user wants to add a new product")
    public void theUserWantsToAddANewProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ContinueShoppingTask.then()
        );
    }
}
