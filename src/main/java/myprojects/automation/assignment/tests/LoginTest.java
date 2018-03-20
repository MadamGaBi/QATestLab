package myprojects.automation.assignment.tests;

import myprojects.automation.assignment.BaseTest;
import myprojects.automation.assignment.utils.Properties;
import myprojects.automation.assignment.utils.logging.CustomReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "getLoginData")
    public void logIn(String login, String password) {

        CustomReporter.logAction("Login");
        driver.get(Properties.getBaseAdminUrl());

        actions.login(login, password);
        actions.waitForContentLoad();

        WebElement avatar = driver.findElement(By.xpath(".//*[@class = 'employee_avatar_small']/*[1]"));
        Assert.assertTrue(avatar.isDisplayed(), "Login failed");

        CustomReporter.logAction("Logout");
        actions.logout();
    }
}
