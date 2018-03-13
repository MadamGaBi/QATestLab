package myprojects.automation.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private EventFiringWebDriver driver;
    private WebDriverWait wait;

    public GeneralActions(EventFiringWebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    /**
     * Logs in to Admin Panel.
     * @param login
     * @param password
     */
    public void login(String login, String password) {
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("passwd"));
        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.submit();
    }

    /**
     * Logs out from Admin Panel.
     */
    public void logout() {
        WebElement userImg = driver.findElement(By.xpath(".//*[@class = 'employee_avatar_small']/*[1]"));
        WebElement logout = driver.findElement(By.id("header_logout"));
        userImg.click();
        logout.click();
    }

    /**
     * Adds new category in Admin Panel.
     * @param categoryName
     */
    public void createCategory(String categoryName) {
        WebElement catalog = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminCatalog']/a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(catalog).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//li[@id = 'subtab-AdminCategories']/a")));
        WebElement category = driver.findElement(By.xpath(".//li[@id = 'subtab-AdminCategories']/a"));
        category.click();
        waitForContentLoad();
        WebElement addCategory = driver.findElement(By.id("page-header-desc-category-new_category"));
        addCategory.click();
        waitForContentLoad();
        WebElement nameCategory = driver.findElement(By.id("name_1"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("$(window).on(\"scroll\", function() {\n" +
                "\tvar scrollHeight = $(document).height();\n" +
                "\tvar scrollPosition = $(window).height() + $(window).scrollTop();\n});");
        WebElement saveCategory = driver.findElement(By.id("category_form_submit_btn"));
        nameCategory.sendKeys(categoryName);
        saveCategory.click();
        waitForContentLoad();
    }

    /**
     * Waits until page loader disappears from the page
     */
    public void waitForContentLoad() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajax_running")));
    }
}
