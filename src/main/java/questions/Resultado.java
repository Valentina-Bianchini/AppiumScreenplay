package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.HomePage.MESSAGE_SIGN_UP;

public class Resultado implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MESSAGE_SIGN_UP).viewedBy(actor).asString();
    }
}
