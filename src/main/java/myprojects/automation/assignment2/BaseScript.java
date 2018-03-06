package myprojects.automation.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        try{
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
        catch (UnsupportedOperationException e){
            System.out.println("Method doesn't return WebDriver instance");
            throw e;
        }
    }
}
