package co.com.bancolombia.certification.Selenium_Java_Gradle.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class authentication {

    //input[@id=\"email"\             Email usuario ya registrado
    // input[@id="passwd"           Contraseña
    // input[@id="email_create"     Email usuario nuevo

    public static final Target EMAIL = Target.the("User").
            locatedBy("//*[@id=\"email\"]");

    public static final Target PASSWD = Target.the("Password").
            locatedBy("//*[@id=\"passwd\"]");

    public static final Target EMAIL_CREATE = Target.the("New user").
            locatedBy("//*[@id=\"SubmitCreate\"]");

    public static final Target SUBMITLOGIN = Target.the("Login Button").
            locatedBy("//*[@id=\"SubmitLogin\"]");



}
