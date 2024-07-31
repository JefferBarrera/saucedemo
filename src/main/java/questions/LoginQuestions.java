package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.LoginUI;

public class LoginQuestions implements Question<String> {

    public static Question<String> text() {
        return new LoginQuestions();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginUI.LBL_ERROR).answeredBy(actor);
    }
}
