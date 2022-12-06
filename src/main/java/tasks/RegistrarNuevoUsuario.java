package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class RegistrarNuevoUsuario implements Task {
    private final String usuario, contrasenia;

    public RegistrarNuevoUsuario(String user, String pass) {
        this.usuario = user;
        this.contrasenia = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_MENU_LOGIN),
                Click.on(PESTANIA_SIGN_UP),
                Enter.theValue(usuario).into(INPUT_EMAIL),
                Enter.theValue(contrasenia).into(INPUT_PASS),
                Enter.theValue(contrasenia).into(INPUT_REPEAT_PASS),
                Click.on(BTN_SIGN_UP)
        );
    }

    public static RegistrarNuevoUsuario conDatos(String s, String s1) {
        return instrumented(RegistrarNuevoUsuario.class, s, s1);
    }
}
