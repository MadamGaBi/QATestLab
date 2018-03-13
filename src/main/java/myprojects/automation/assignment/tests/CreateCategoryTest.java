package myprojects.automation.assignment.tests;

import myprojects.automation.assignment.BaseScript;
import myprojects.automation.assignment.GeneralActions;
import myprojects.automation.assignment.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CreateCategoryTest extends BaseScript {
    public static void main(String[] args) {
        // prepare driver object
        EventFiringWebDriver driver = getConfiguredDriver();
        driver.get(Properties.getBaseAdminUrl());

        // login
        String defaultAdminLogin = Properties.getDefaultAdminLogin();
        String defaultAdminPassword = Properties.getDefaultAdminPassword();
        GeneralActions actions = new GeneralActions(driver);
        actions.login(defaultAdminLogin, defaultAdminPassword);
        actions.waitForContentLoad();

        // create category
        String newTestCategory = Properties.getTestCategory();
        actions.createCategory(newTestCategory);
        WebElement alertMessage = driver.findElement(By.className("alert-success"));
        if (alertMessage.isDisplayed()) {
            System.out.println("New category is saved successfully");

            // check that new category appears in Categories table
            WebElement orderCategory = driver.findElement
                    (By.xpath(".//a[contains(@href, 'categoryOrderby=name&categoryOrderway=desc')]"));
            orderCategory.click();
            actions.waitForContentLoad();
            WebElement actualCategory = driver.findElement
                    (By.xpath(".//*[@id = 'table-category']//td[contains(text(), '"
                            + Properties.getTestCategory() + "')]"));
            if (actualCategory.getText().equals(newTestCategory))
                System.out.println("New category appears in Categories table");
            else System.out.println("New category does not appear in Categories table");
        }
        else System.out.println("New category is not saved");

        // finish script
        driver.quit();

    }
}
