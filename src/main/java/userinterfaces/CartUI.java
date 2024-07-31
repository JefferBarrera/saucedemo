package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CartUI extends PageObject {

    public static final Target BTN_CHECKOUT = Target.the("button checkout").located(By.id("checkout"));
    public static final Target BTN_CONTINUE_SHOPPING = Target.the("button continue shopping").located(By.id("continue-shopping"));

}
