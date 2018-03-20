package myprojects.automation.assignment.tests;

import myprojects.automation.assignment.BaseTest;
import myprojects.automation.assignment.utils.Properties;
import myprojects.automation.assignment.utils.logging.CustomReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateCategoryTest extends BaseTest {

    @Test(dataProvider = "getLoginData")
    @Parameters("category")
    public void createNewCategory(String login, String password) {

        // login
        CustomReporter.logAction("Login");
        driver.get(Properties.getBaseAdminUrl());
        actions.login(login, password);

        // create category
        String newTestCategory = Properties.getTestCategory();
        actions.createCategory(newTestCategory);
        WebElement alertMessage = driver.findElement(By.className("alert-success"));
        Assert.assertTrue(alertMessage.isDisplayed(),"New category is not saved");
    }

    @Test(dependsOnMethods = "createNewCategory")
    public void checkCategory() {
        String expectedCategory = Properties.getTestCategory();
        // check that category appears in Categories table
        WebElement orderCategory = driver.findElement
                    (By.xpath(".//a[contains(@href, 'categoryOrderby=name&categoryOrderway=desc')]"));
        orderCategory.click();
        actions.waitForContentLoad();
        WebElement actualCategory = driver.findElement
                    (By.xpath(".//*[@id = 'table-category']//td[contains(text(), '"
                            + Properties.getTestCategory() + "')]"));
        Assert.assertEquals(actualCategory, expectedCategory, "New category does not appear in Categories table");
    }
}
