package co.com.bancolombia.certification.Selenium_Java_Gradle.tasks;

import co.com.bancolombia.certification.Selenium_Java_Gradle.userinterfaces.Home;
import co.com.bancolombia.certification.Selenium_Java_Gradle.userinterfaces.authentication;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignIn implements Task {

    String EMAIL="daniel@hotmail.com";
    String PSW="123456789";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(Home.LOGIN),
                SendKeys.of(EMAIL).into(authentication.EMAIL),
                SendKeys.of(PSW).into(authentication.PASSWD),
                Click.on(authentication.SUBMITLOGIN)
                // El navegador abre y d click en Sign In
        );
    }

    public static SignIn makeinfromation(){
        return instrumented(SignIn.class);

    }
}
