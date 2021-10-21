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

public class New_Account {

    public static void main(String[] args) {

        //Creación de algunas variables
        String URL="http://automationpractice.com/index.php";
        //String URL="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
        String EMAIL="PRUEBA1@HOLA.COM";
        String NAME="DANIEL";
        String LASTNAME="SANCHEZ";
        String PSW="123456789";

        //Todo lo relacionado con la ventana de Chrome
        WebDriver driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);


        //-------------------------- AUTHENTICATION PAGE ---------------------------------

        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector("[name='email_create']")).sendKeys(EMAIL);
        driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();

        //-------------------------- CREATE AN ACCOUNT-----------------------------------

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.name("customer_firstname")).sendKeys(NAME);
        driver.findElement(By.name("customer_lastname")).sendKeys(LASTNAME);
        driver.findElement(By.id("passwd")).sendKeys(PSW);


    }

}






