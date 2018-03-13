package myprojects.automation.assignment.tests;

import myprojects.automation.assignment.BaseScript;
import myprojects.automation.assignment.GeneralActions;
import myprojects.automation.assignment.utils.Properties;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        EventFiringWebDriver driver = getConfiguredDriver();
        driver.get(Properties.getBaseAdminUrl());
        String defaultAdminLogin = Properties.getDefaultAdminLogin();
        String defaultAdminPassword = Properties.getDefaultAdminPassword();

        GeneralActions actions = new GeneralActions(driver);
        actions.login(defaultAdminLogin, defaultAdminPassword);
        actions.waitForContentLoad();
        actions.logout();

        driver.quit();
    }
}
