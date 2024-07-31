package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.*;
import userinterfaces.CartUI;
import userinterfaces.CheckoutUI;
import userinterfaces.ProductUI;

public class VerifyFunctionalitiesStepDefinitions {

    @When("the user selects a product and tries to add it to the cart")
    public void theUserSelectsAProductAndTriesToAddItToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TryBuyProductTask.then()
        );
    }

    @Then("the user sees that the button add to cart is faulty")
    public void theUserSeesThatTheButtonAddToCartIsFaulty() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ProductUI.BTN_ADD_TO_CART).isDisplayed()
        );
    }

    @When("the user wants to buy a product from inventory {string} {string} {string}")
    public void theUserWantsToBuyAProductFromInventory(String name, String lastName, String postalCode) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductFaultyTask.on(),
                CompletePurchaseFailedTask.withData(name, lastName, postalCode)
        );
    }

    @Then("the user sees an error when filling the form")
    public void theUserSeesAnErrorWhenFillingTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(CheckoutUI.LBL_ERROR_MESSAGE).isDisplayed()
        );
    }

    @When("the user adds a product and wants to remove it")
    public void theUserAddsAProductAndWantsToRemoveIt() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RemoveProductFaultyTask.on()
        );
    }

    @Then("the user sees that the product has not been removed")
    public void theUserSeesThatTheProductHasNotBeenRemoved() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ProductUI.BTN_REMOVE).isDisplayed()
        );
    }

    @When("the user adds and wants to pay a product that is not found")
    public void theUserAddsAndWantsToPayAProductThatIsNotFound() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductNotFoundTask.on()
        );
    }

    @Then("the user sees a blank page")
    public void theUserSeesABlankPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(CartUI.BTN_CHECKOUT).isNotDisplayed()
        );
    }
}
