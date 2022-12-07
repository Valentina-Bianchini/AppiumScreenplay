package userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject {
    //Tasks en pestaña Login
    public static final Target BUTTON_MENU_LOGIN = Target.the("Boton login de menu principal").located(MobileBy.AccessibilityId("Login"));
    public static final Target PESTANIA_LOGIN = Target.the("Pestania login").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-login-container\"]/android.view.ViewGroup"));
    public static final Target INPUT_EMAIL = Target.the("Cuadro de texto para ingreso de mail").located(MobileBy.AccessibilityId("input-email"));
    public static final Target INPUT_PASS = Target.the("Cuadro de texto para ingreso de contrasenia").located(MobileBy.AccessibilityId("input-password"));
    public static final Target INPUT_REPEAT_PASS = Target.the("Confirmacion de contrasenia").located(MobileBy.AccessibilityId("input-repeat-password"));
    public static final Target BTN_LOGIN = Target.the("Boton [LOGIN]").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup"));

    //Tasks pestaña Sign Up
    public static final Target PESTANIA_SIGN_UP = Target.the("Pestania sign up").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView"));
    public static final Target BTN_SIGN_UP = Target.the("Botón [SIGN UP]").located(MobileBy.xpath("//*[@content-desc=\"button-SIGN UP\"]"));

    //Questions sign up
    public static final Target MESSAGE_SIGN_UP = Target.the("Mensaje sign up finalizado").located(MobileBy.xpath("//*[@text=\"You successfully signed up!\"]"));
    public static final Target BTN_OK = Target.the("Boton [OK] sign up").located(MobileBy.xpath("//*[@text=\"OK\"]"));

    //Questions login
    public static final Target MESSAGE_LOGIN = Target.the("Texto logueo finalizado").located(MobileBy.xpath("//*[@text=\"You are logged in!\"]"));

}
