package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class IngresarUserYPass implements Task {

    private String usuario, contrasenia;

    public IngresarUserYPass(String user, String pass){
        this.usuario=user;
        this.contrasenia=pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_MENU_LOGIN),
                Click.on(PESTANIA_LOGIN),
                Enter.theValue(usuario).into(INPUT_EMAIL),
                Enter.theValue(contrasenia).into(INPUT_PASS),
                Click.on(BTN_LOGIN)
        );
    }

    public static IngresarUserYPass conDatos(String s, String s1) {
        return instrumented(IngresarUserYPass.class, s, s1);
    }
}
