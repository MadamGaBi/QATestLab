package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get(Properties.getBaseAdminUrl());
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement login = driver.findElement(By.name("submitLogin"));

        email.sendKeys(Properties.getDefaultAdminLogin());
        password.sendKeys(Properties.getDefaultAdminPassword());
        login.submit();

        WebElement userImg = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@class = 'employee_avatar_small']/*[1]")));
        WebElement logout = driver.findElement(By.id("header_logout"));
        userImg.click();
        logout.click();

        driver.quit();
    }
}
