package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.InventoryUI;
import userinterfaces.ProductUI;

public class AddProductNotFoundTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InventoryUI.LBL_ITEM_NAME_4),
                Click.on(ProductUI.BTN_ADD_TO_CART),
                Click.on(InventoryUI.BTN_SHOPPING_CART)
        );
    }

    public static Performable on() {
        return Instrumented.instanceOf(AddProductNotFoundTask.class).withProperties();
    }
}
