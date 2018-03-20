package myprojects.automation.assignment.tests;

import myprojects.automation.assignment.BaseTest;
import myprojects.automation.assignment.utils.Properties;
import myprojects.automation.assignment.utils.logging.CustomReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMainMenuTest extends BaseTest {

    @Test(dataProvider = "getLoginData")
    public void checkMainMenu(String login, String password){
        // Login
        CustomReporter.logAction("Login");
        driver.get(Properties.getBaseAdminUrl());
        actions.login(login, password);
        actions.waitForContentLoad();

        // Check menu item 'Dashboard'
        checkMenuItemLocatedBy(".//li[@id = 'tab-AdminDashboard']/a");
        // Check menu item 'Orders'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminParentOrders']/a");
        // Check menu item 'Catalog'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminCatalog']/a");
        // Check menu item 'Customers'
        checkMenuItemLocatedBy(".//a[contains(@href, 'AdminCustomers')]");
        // Check menu item 'Customer Threads'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminParentCustomerThreads']/a");
        // Check menu item 'Stats'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminStats']/a");
        // Check menu item 'Modules'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminParentModulesSf']/a");
        // Check menu item 'Design'
        checkMenuItemLocatedBy(".//a[contains(@href, 'AdminThemes')]");
        // Check menu item 'Shipping'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminParentShipping']/a");
        // Check menu item 'Payment'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminParentPayment']/a");
        // Check menu item 'International'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminInternational']/a");
        // Check menu item 'Parameters'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-ShopParameters']/a");
        // Check menu item 'Advanced Parameters'
        checkMenuItemLocatedBy(".//li[@id = 'subtab-AdminAdvancedParameters']/a");
    }

    private void checkMenuItemLocatedBy(String value){
        CustomReporter.logAction("Check menu item");
        WebElement menuItem = driver.findElement(By.xpath(value));
        menuItem.click();
        String title = driver.getTitle();
        driver.navigate().refresh();
        actions.waitForContentLoad();
        String newTitle = driver.getTitle();
        Assert.assertEquals(newTitle, title, "Warning! Page is refreshed. Title changed. New title: " + newTitle);
    }
}
