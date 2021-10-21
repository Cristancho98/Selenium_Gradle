// Bancolombia es un protocolo de nombramiento (Preguntar......)

package co.com.bancolombia.certification.Selenium_Java_Gradle.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

// Cucumber me permite reconocer del texto plano a
@RunWith(CucumberWithSerenity.class)

// Con cucumber apuntamos a las precondicones registradas en feature de registro de usuarios, lo pegamos(Glue) en la carpeta creada con anterioridad
// SnippetType.CAMELCASE Permite que el texto salga sin guiones

    @CucumberOptions(features = "src/test/resources/features/register_user.feature",
    glue = "co.com.bancolombia.certification.Selenium_Java_Gradle.stepdefinitions",
    snippets = SnippetType.CAMELCASE)

// La clase RegisterUser debe su nombre al Feature creado para cucumber
public class RegisterUser {
}
