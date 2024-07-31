package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginUI;

public class LoginTask implements Task {

    private final String user;
    private final String password;

    public LoginTask(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(LoginUI.TXT_USERNAME),
                Enter.theValue(password).into(LoginUI.TXT_PASSWORD),
                Click.on(LoginUI.BTN_LOGIN)
        );
    }

    public static Performable withCredentials(String user, String password) {
        return Instrumented.instanceOf(LoginTask.class).withProperties(user, password);
    }
}
