package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CheckoutUI extends PageObject {

    public static final Target BTN_CONTINUE = Target.the("button checkout").located(By.id("continue"));
    public static final Target TXT_FIRST_NAME = Target.the("input first name").located(By.id("first-name"));
    public static final Target TXT_LAST_NAME = Target.the("input last name").located(By.id("last-name"));
    public static final Target TXT_POSTAL_CODE = Target.the("input code postal").located(By.id("postal-code"));
    public static final Target BTN_FINISH = Target.the("button finish purchase").located(By.id("finish"));
    public static final Target LBL_COMPLETE_HEADER = Target.the("button finish purchase").located(By.className("complete-header"));
    public static final Target LBL_ERROR_MESSAGE = Target.the("label error message").located(By.className("error-message-container"));


}
