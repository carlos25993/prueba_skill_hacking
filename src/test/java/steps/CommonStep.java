package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.ArrayList;


public class CommonStep {

    protected static WebDriver driver;

    @Before
    protected WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver",
                Paths.get("src/test/resources/driver/chromedriver.exe").toString());
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    @After
    protected WebDriver tearDown()
    {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        return driver;
    }

    public void cambiotab()
    {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
