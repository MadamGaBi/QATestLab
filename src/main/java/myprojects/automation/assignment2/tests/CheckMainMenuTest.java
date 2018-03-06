package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get(Properties.getBaseAdminUrl());
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement login = driver.findElement(By.name("submitLogin"));

        // Login
        email.sendKeys(Properties.getDefaultAdminLogin());
        password.sendKeys(Properties.getDefaultAdminPassword());
        login.submit();
        Thread.sleep(1000);

        // Check menu item 'Dashboard'
        WebElement dashboard = driver.findElement(By.xpath(".//li[@id = 'tab-AdminDashboard']/a"));
        dashboard.click();
        String titleDashboard = driver.getTitle();
        System.out.println("Page title is " + titleDashboard);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleDashboard = driver.getTitle();
        if (titleDashboard.equals(newTitleDashboard))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleDashboard);

        // Check menu item 'Orders'
        WebElement orders = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminParentOrders']/a"));
        orders.click();
        String titleOrders = driver.getTitle();
        System.out.println("Page title is " + titleOrders);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleOrders = driver.getTitle();
        if (titleOrders.equals(newTitleOrders))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleOrders);

        // Check menu item 'Catalog'
        WebElement catalog = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminCatalog']/a"));
        catalog.click();
        String titleCatalog = driver.getTitle();
        System.out.println("Page title is " + titleCatalog);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleCatalog = driver.getTitle();
        if (titleCatalog.equals(newTitleCatalog))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleCatalog);

        // Check menu item 'Customers'
        WebElement customers = driver.findElement(By.xpath(".//a[contains(@href, 'AdminCustomers')]"));
        customers.click();
        String titleCustomer = driver.getTitle();
        System.out.println("Page title is " + titleCustomer);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleCustomer = driver.getTitle();
        if (titleCustomer.equals(newTitleCustomer))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleCustomer);

        // Check menu item 'Customer Threads'
        WebElement helpdesk = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminParentCustomerThreads']/a"));
        helpdesk.click();
        String titleCustomerThreads = driver.getTitle();
        System.out.println("Page title is " + titleCustomerThreads);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleCustomerThreads = driver.getTitle();
        if (titleCustomerThreads.equals(newTitleCustomerThreads))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleCustomerThreads);

        // Check menu item 'Stats'
        WebElement stats = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminStats']/a"));
        stats.click();
        String titleStats = driver.getTitle();
        System.out.println("Page title is " + titleStats);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleStats = driver.getTitle();
        if (titleStats.equals(newTitleStats))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleStats);

        // Check menu item 'Modules'
        WebElement modules = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminParentModulesSf']/a"));
        modules.click();
        String titleModules = driver.getTitle();
        System.out.println("Page title is " + titleModules);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleModules = driver.getTitle();
        if (titleModules.equals(newTitleModules))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleModules);

        // Check menu item 'Design'
        WebElement design = driver.findElement(By.xpath(".//a[contains(@href, 'AdminThemes')]"));
        design.click();
        String titleDesign = driver.getTitle();
        System.out.println("Page title is " + titleDesign);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleDesign = driver.getTitle();
        if (titleDesign.equals(newTitleDesign))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleDesign);

        // Check menu item 'Shipping'
        WebElement shipping = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminParentShipping']/a"));
        shipping.click();
        String titleShipping = driver.getTitle();
        System.out.println("Page title is " + titleShipping);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleShipping = driver.getTitle();
        if (titleShipping.equals(newTitleShipping))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleShipping);

        // Check menu item 'Payment'
        WebElement payment = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminParentPayment']/a"));
        payment.click();
        String titlePayment = driver.getTitle();
        System.out.println("Page title is " + titlePayment);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitlePayment = driver.getTitle();
        if (titlePayment.equals(newTitlePayment))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitlePayment);

        // Check menu item 'International'
        WebElement international = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminInternational']/a"));
        international.click();
        String titleInternational = driver.getTitle();
        System.out.println("Page title is " + titleInternational);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleInternational = driver.getTitle();
        if (titleInternational.equals(newTitleInternational))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleInternational);

        // Check menu item 'Parameters'
        WebElement parameters = driver.findElement(By.xpath(".//li[@id = 'subtab-ShopParameters']/a"));
        parameters.click();
        String titleParameters = driver.getTitle();
        System.out.println("Page title is " + titleParameters);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleParameters = driver.getTitle();
        if (titleParameters.equals(newTitleParameters))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleParameters);

        // Check menu item 'Advanced Parameters'
        WebElement advancedParameters = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminAdvancedParameters']/a"));
        advancedParameters.click();
        String titleAdvancedParameters = driver.getTitle();
        System.out.println("Page title is " + titleAdvancedParameters);
        driver.navigate().refresh();
        Thread.sleep(1000);
        String newTitleAdvancedParameters = driver.getTitle();
        if (titleAdvancedParameters.equals(newTitleAdvancedParameters))
            System.out.println("When page is refreshed user is still on the same page");
        else System.out.println("Warning! Page is refreshed. Title changed. New title: " + newTitleAdvancedParameters);

        driver.quit();
    }
}
