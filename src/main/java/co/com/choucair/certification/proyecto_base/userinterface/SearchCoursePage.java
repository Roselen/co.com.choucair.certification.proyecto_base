package co.com.choucair.certification.proyecto_base.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona universidad Choucair").
            located(By.xpath("(//DIV[@class='card-header'])[1]"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso").
            located(By.xpath("//INPUT[@id='coursesearchbox']"));
    public static final Target BUTTON_GO = Target.the("click para buscar el curso").
            located(By.xpath("//BUTTON[@class='btn btn-secondary'][text()='Ir']"));
    public static final Target SELECT_COURSE = Target.the("selecciona el curso").
            located(By.xpath("//DIV[@class='course-title']"));
    public static final Target NAME_COURSE = Target.the("nombre del curso").
            located(By.xpath("//A[@class=''][text()='Metodología Bancolombia']"));
}
