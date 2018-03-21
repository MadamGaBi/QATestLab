package myprojects.automation.assignment.tests;

import myprojects.automation.assignment.BaseTest;
import myprojects.automation.assignment.model.ProductData;
import myprojects.automation.assignment.utils.Properties;
import myprojects.automation.assignment.utils.logging.CustomReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class CreateProductTest extends BaseTest {

    @Test(dataProvider = "getLoginData")
    public void createNewProduct(String login, String password) {

        // Login
        CustomReporter.logAction("Login");
        driver.get(Properties.getBaseAdminUrl());
        actions.login(login, password);

        // Create product
        CustomReporter.logAction("Create product");
        ProductData product = ProductData.generate();
        actions.createProduct(product);

        // Check product in a list
        CustomReporter.logAction("Check product in a list");
        driver.get(Properties.getBaseUrl());
        WebElement allProducts = driver.findElement(By.className("all-product-link"));
        allProducts.click();

        List<WebElement> productList = driver.findElements(By.className("product-miniature"));
        Assert.assertTrue(productList.stream().map(x->x.getText().contains(product.getName())).count() > 0,
                "Product is not in a list");

        // Open product page and check product data
        CustomReporter.logAction("Check product data");
        WebElement productToCheck = driver.findElement(By.xpath(String.format(".//a[contains(text(), '%s')]", product.getName())));
        productToCheck.click();
        actions.waitForContentLoad();
        WebElement productName = driver.findElement(By.className("h1"));
        WebElement productQty = driver.findElement(By.className("product-quantities"));
        WebElement productPrice = driver.findElement(By.className("current-price"));

        Assert.assertEquals(productName.getText().toLowerCase(), product.getName().toLowerCase(), "Product names deffer");
        Assert.assertTrue(productPrice.getText().contains(product.getPrice()), "Product prices differ");
        Assert.assertTrue(productQty.getText().contains(product.getQty().toString()), "Product qty differs");
    }

}
