package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.CommonStep;
import steps.Timesteps;

import static Objects.GivenObjects.*;

public class GivenTask extends CommonStep {

    WebDriver driver = getDriver();
    private Timesteps times = new Timesteps();

    public void Abrirpaginaweb()
    {
        driver.navigate().to(pagweb);
        driver.manage().window().maximize();
        times.esperauntiempo();
    }

    public void entraracercanosotros()
    {
        driver.findElement(By.xpath(btnAcercaNosotros)).click();
        times.esperaelemento(lblParamejorFuturo);
    }

    public void entrarproveedores()
    {
        driver.findElement(By.xpath(btnInfoCorporativa)).click();
        times.esperaelemento(btnProveedores);
        driver.findElement(By.xpath(btnProveedores)).click();
        times.esperaelemento(btnDescargarPoliticaTratamiento);
    }

    public void entrarnegocios()
    {
        driver.findElement(By.xpath(btnNegocios)).click();
        times.esperaelemento(lblPensandoenti);
    }
}
