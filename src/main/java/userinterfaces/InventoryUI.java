package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class InventoryUI extends PageObject {

    public static final Target BTN_BURGER_MENU = Target.the("button context menu").locatedBy("//div[@class='bm-burger-button']/img");
    public static final Target BTN_SHOPPING_CART = Target.the("button shopping cart").located(By.id("shopping_cart_container"));
    public static final Target BTN_ADD_CART_4 = Target.the("button add to cart").located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    public static final Target BTN_ADD_CART_1 = Target.the("button add to cart").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target LBL_ITEM_NAME_4 = Target.the("label item name 4").locatedBy("(//div[contains(@class, 'inventory_item_name')])[4]");
    public static final Target LBL_ITEM_NAME_1 = Target.the("label item name 1").located(By.id("item_4_title_link"));
    public static final Target LBL_ITEM_NAME_3 = Target.the("label item name 3").located(By.id("item_1_title_link"));

}
