package stepdefinitions;

import configuraciones.AndroidConfigEmulador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import tasks.IngresarUserYPass;
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

    @Given("^usuario es nuevo en app$")
    public void usuario_es_nuevo_en_app() throws MalformedURLException {
        driver=new AndroidConfigEmulador().RetornaConfigEmul();
        actor.can(BrowseTheWeb.with(driver));
    }

    @When("^ingreso datos de registro$")
    public void ingreso_datos_de_registro(List<String> datos) {
        actor.attemptsTo(WaitUntil.the(BUTTON_MENU_LOGIN, isVisible()).forNoMoreThan(30).seconds());

        actor.should(seeThat(the(BUTTON_MENU_LOGIN),isPresent()));

        actor.wasAbleTo(
                RegistrarNuevoUsuario.conDatos(datos.get(0),datos.get(1))
        );
    }

    @Then("^verifico registro correcto$")
    public void verifico_registro_correcto() {
        actor.attemptsTo(WaitUntil.the(MESSAGE_SIGN_UP, isVisible()).forNoMoreThan(30).seconds());

        actor.should(seeThat(the(MESSAGE_SIGN_UP), isPresent()));
    }

    @When("^ingreso usuario y contraseña$")
    public void ingreso_usuario_y_contraseña(List<String> datos) {
        actor.attemptsTo(WaitUntil.the(BUTTON_MENU_LOGIN, isVisible()).forNoMoreThan(30).seconds());

        actor.should(seeThat(the(BUTTON_MENU_LOGIN),isPresent()));

        actor.wasAbleTo(
                IngresarUserYPass.conDatos(datos.get(0),datos.get(1))
        );

    }

    @Then("^verifico logueo correcto$")
    public void verifico_logueo_correcto() {
        actor.attemptsTo(WaitUntil.the(MESSAGE_LOGIN, isVisible()).forNoMoreThan(30).seconds());

        actor.should(seeThat(the(MESSAGE_LOGIN), isPresent()));
    }

}
