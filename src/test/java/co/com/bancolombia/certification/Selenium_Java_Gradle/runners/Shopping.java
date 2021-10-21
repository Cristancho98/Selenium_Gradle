package co.com.bancolombia.certification.Selenium_Java_Gradle.runners;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*
---------------------- WEB LOCATORS ------------------
    linkText    =   texto           --  "Create an account"
    Id          =   Identificador   --  id="email"
    xpath       =   Código          --  Extrae solo las partes de la página que me interesan (Click derecho/copy/copy full xpad

 */

public class Shopping {

    public static void main(String[] args){

        //Creación de algunas variables
        String URL="http://automationpractice.com/index.php";
        String EMAIL="daniel@hotmail.com";
        String PSW="123456789";
        String TALLA="S";
        String QUANTIFY="1";

        //Todo lo relacionado con la ventana de Chrome
        WebDriver driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

        //--------------------------------REGISTRO---------------------------------------
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys(EMAIL);
        driver.findElement(By.id("passwd")).sendKeys(PSW);
        driver.findElement(By.id("SubmitLogin")).click();

        // ACA DEBERIA BUSCAR LA FORMA DE RECHAZAR EMAILS NO REGISTRADO (PENDIENTE)

        //--------------------------------COMPRA---------------------------------------

        driver.findElement(By.linkText("DRESSES")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[1]/div/a[1]/img"));

        //Problema al dar click sobre la imagen, corregir

        driver.findElement(By.id("color_15")).click();                                  //COlOR (Color 15 = Verde)
        WebElement Size =driver.findElement(By.xpath("//*[@id='group_1']"));            //SIZE
        Select Option =new Select( Size );
        Option.selectByVisibleText( TALLA );
        driver.findElement(By.id("quantity_wanted")).clear();                           //QUANTIFY
        driver.findElement(By.id("quantity_wanted")).sendKeys(QUANTIFY);
        driver.findElement(By.xpath( "//p[@id='add_to_cart']//span[.='Add to cart']" )).click();

    }
}


