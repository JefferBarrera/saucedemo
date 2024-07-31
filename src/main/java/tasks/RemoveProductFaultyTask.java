package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.InventoryUI;
import userinterfaces.ProductUI;

public class RemoveProductFaultyTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryUI.LBL_ITEM_NAME_3),
                Click.on(ProductUI.BTN_ADD_TO_CART),
                Click.on(ProductUI.BTN_REMOVE)
        );
    }

    public static Performable on() {
        return Instrumented.instanceOf(RemoveProductFaultyTask.class).withProperties();
    }
}
