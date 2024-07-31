package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.PurchaseQuestions;
import tasks.AddProductTask;
import tasks.CompletePurchaseSuccessTask;
import userinterfaces.CartUI;
import userinterfaces.CheckoutUI;
import userinterfaces.InventoryUI;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class VerifyVisualErrorsStepDefinitions {

    @Then("the user sees that some elements are faulty")
    public void theUserSeesThatSomeElementsAreFaulty() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(InventoryUI.LBL_ITEM_NAME_4).hasCssClass("align_right"),
                Ensure.that(InventoryUI.BTN_BURGER_MENU).hasCssClass("visual_failure"),
                Ensure.that(InventoryUI.BTN_SHOPPING_CART).hasCssClass("visual_failure"),
                Ensure.that(InventoryUI.BTN_ADD_CART_4).hasCssClass("btn_inventory_misaligned")
        );
    }

    @When("the user adds an item to shopping cart")
    public void theUserAddsAnItemToShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductTask.on()
        );
    }

    @Then("the user sees that checkout button is faulty")
    public void theUserSeesThatCheckoutButtonIsFaulty() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(CartUI.BTN_CHECKOUT).hasCssClass("btn_visual_failure")
        );
    }

    @When("the user completes the purchase with {string} {string} {string}")
    public void theUserCompletesThePurchaseWith(String firstName, String lastName, String postalCode) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompletePurchaseSuccessTask.withData(firstName, lastName, postalCode)
        );
    }

    @Then("the user sees their purchase completed")
    public void theUserSeesTheirPurchaseCompleted() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Success message",
                        PurchaseQuestions.text(),
                        equalTo("Thank you for your order!")
                )
        );
    }

}
