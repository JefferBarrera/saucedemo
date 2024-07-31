package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.InventoryUI;

public class AddProductTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryUI.BTN_ADD_CART_4),
                Click.on(InventoryUI.BTN_SHOPPING_CART)
        );
    }

    public static Performable on() {
        return Instrumented.instanceOf(AddProductTask.class).withProperties();
    }
}
