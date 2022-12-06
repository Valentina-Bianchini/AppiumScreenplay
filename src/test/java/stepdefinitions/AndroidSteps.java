package stepdefinitions;

import configuraciones.AndroidConfigEmulador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import tasks.RegistrarNuevoUsuario;

import java.net.MalformedURLException;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.HomePage.*;

public class AndroidSteps {
    WebDriver driver;
    private Actor actor = Actor.named("Christina Aguilera");
    @Given("^usuario es visitante en app$")
    public void usuario_es_nuevo_en_app() throws MalformedURLException {
        driver=new AndroidConfigEmulador().RetornaConfigEmul();
        actor.can(BrowseTheWeb.with(driver));
    }

    @When("^ingreso usuario y contraseña$")
    public void ingreso_usuario_y_contraseña(List<String> datos) {
        actor.attemptsTo(
                WaitUntil.the(PESTANIA_LOGIN, isVisible()).forNoMoreThan(30).seconds()
        );

        actor.should(seeThat(the(PESTANIA_SIGN_UP),isPresent()));

        actor.attemptsTo(
                Click.on(PESTANIA_SIGN_UP)
        );

        actor.attemptsTo(
                Click.on(INPUT_EMAIL)
        );

        actor.attemptsTo(
                Click.on(INPUT_PASS)
        );

        actor.attemptsTo(
                Click.on(INPUT_REPEAT_PASS)
        );

        actor.wasAbleTo(
                RegistrarNuevoUsuario.conDatos(datos.get(0),datos.get(1))
        );
    }

    @Then("^verifico logueo correcto$")
    public void verifico_logueo_correcto() {

    }
}
