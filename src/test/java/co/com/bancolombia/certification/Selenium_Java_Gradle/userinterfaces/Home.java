//CREACIÓN DE RUTAS PARA HOOME
package co.com.bancolombia.certification.Selenium_Java_Gradle.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {

    //Etiqueta a de la clase login (Boton de la página) a[@class="login"]
    public static final Target LOGIN = Target.the("Register").
            locatedBy("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    public static final Target WOMEN = Target.the("Women").
            locatedBy("a[@class=\"sf-with-ul\"]");

}
