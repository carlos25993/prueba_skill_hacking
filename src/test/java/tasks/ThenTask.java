package tasks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.CommonStep;
import steps.Timesteps;

public class ThenTask extends CommonStep {
    WebDriver driver = getDriver();
    private Timesteps times = new Timesteps();

    public void valirdardocumento()
    {
        times.esperauntiempo();
        String titu;
        titu = driver.getCurrentUrl();
        System.out.println("El robot abrio el documento:"+titu);
        if (titu.contains("datos-personales-de-proveedores-grupo-bancolombia.pdf"))
        {
            System.out.println("El robot se abrio el documento correcto");
        }
        else
        {
            Assert.fail("No se abrio el documento correcto");
        }
    }

    public void validaropciones(String etiquetas)
    {
        Boolean validacion = driver.findElement(By.xpath("//*[text()='"+etiquetas+"']")).isDisplayed();
        System.out.println("El robot se encontro la etiqueta:"+etiquetas);
    }
}
