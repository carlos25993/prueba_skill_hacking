package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import steps.CommonStep;
import steps.Timesteps;

import static Objects.GivenObjects.btnDescargarPoliticaTratamiento;
import static Objects.WhenObjects.*;


public class WhenTask extends CommonStep {
    WebDriver driver = getDriver();

    private Timesteps times = new Timesteps();

    public void descargarPoliticaTratamiento()
    {
        driver.findElement(By.xpath(btnDescargarPoliticaTratamiento)).click();
        cambiotab();
    }

    public void seEligeNecesito(String necesito)
    {
        WebElement dropdown = driver.findElement(By.xpath(selectNecesito));
        Select select = new Select(dropdown);
        select.selectByVisibleText(necesito);
    }

    public void seEligePara(String para)
    {
        WebElement dropdown = driver.findElement(By.xpath(selectPara));
        Select select = new Select(dropdown);
        select.selectByVisibleText(para);
    }

    public void presionarMuestrame()
    {
        driver.findElement(By.xpath(btnMuestrame)).click();
        times.esperauntiempo();
    }
}
