package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginUI extends PageObject {

    public static final Target TXT_USERNAME = Target.the("input username").located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("input password").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("button login").located(By.id("login-button"));
    public static final Target LBL_ERROR = Target.the("label error").located(By.className("error-message-container"));

}
