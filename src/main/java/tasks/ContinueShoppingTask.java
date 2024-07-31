package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.CartUI;
import userinterfaces.InventoryUI;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ContinueShoppingTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartUI.BTN_CONTINUE_SHOPPING),
                WaitUntil.the(InventoryUI.BTN_ADD_CART_1, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(InventoryUI.BTN_ADD_CART_1),
                Click.on(InventoryUI.BTN_SHOPPING_CART)
        );
    }

    public static Performable then() {
        return Instrumented.instanceOf(ContinueShoppingTask.class).withProperties();
    }
}
