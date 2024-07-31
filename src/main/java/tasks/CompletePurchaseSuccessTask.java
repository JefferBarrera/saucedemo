package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.CartUI;
import userinterfaces.CheckoutUI;

public class CompletePurchaseSuccessTask implements Task {

    private final String firstName;
    private final String lastName;
    private final String postalCode;

    public CompletePurchaseSuccessTask(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartUI.BTN_CHECKOUT),
                Enter.theValue(firstName).into(CheckoutUI.TXT_FIRST_NAME),
                Enter.theValue(lastName).into(CheckoutUI.TXT_LAST_NAME),
                Enter.theValue(postalCode).into(CheckoutUI.TXT_POSTAL_CODE),
                Click.on(CheckoutUI.BTN_CONTINUE),
                Click.on(CheckoutUI.BTN_FINISH)
        );
    }

    public static Performable withData(String firstName, String lastName, String postalCode) {
        return Instrumented.instanceOf(CompletePurchaseSuccessTask.class).withProperties(firstName, lastName, postalCode);
    }
}
