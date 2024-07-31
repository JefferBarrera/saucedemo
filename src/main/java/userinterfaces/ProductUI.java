package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ProductUI extends PageObject {

    public static final Target BTN_ADD_TO_CART = Target.the("button add to cart").located(By.id("add-to-cart"));
    public static final Target BTN_REMOVE = Target.the("button remove").located(By.id("remove"));


}
