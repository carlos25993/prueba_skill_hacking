package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timesteps extends CommonStep{

    WebDriverWait wait = new WebDriverWait(driver,5);

    public void esperauntiempo()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void esperaelemento(String xpath)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        esperauntiempo();
    }
}
