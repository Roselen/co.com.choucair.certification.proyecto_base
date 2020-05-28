package co.com.choucair.certification.proyecto_base.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").
            located(By.xpath("(//STRONG[text()='Ingresar'][text()='Ingresar'])[1]"));
    public static final  Target USER = Target.the("where do we write the user").
            located(By.xpath("//INPUT[@id='username']"));
    public static final Target PASSWORD = Target.the("where do we write the password").
            located(By.xpath("//INPUT[@id='password']"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").
            located(By.xpath("//BUTTON[@type='submit'][text()='Acceder']"));
}
