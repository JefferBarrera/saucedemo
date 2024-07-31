package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.CheckoutUI;
import userinterfaces.LoginUI;

public class PurchaseQuestions implements Question<String> {

    public static Question<String> text() {
        return new PurchaseQuestions();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CheckoutUI.LBL_COMPLETE_HEADER).answeredBy(actor);
    }
}
