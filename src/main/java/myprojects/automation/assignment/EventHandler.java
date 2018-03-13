package myprojects.automation.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("Accept alert");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("Alert is accepted successfully");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("Dismiss alert");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("Alert is dismissed successfully");
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Navigate to " + url.toString());
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println(url + " is opened successfully");
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Navigate back");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
        System.out.println("Navigate back run successfully");
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("Navigate forward");
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
        System.out.println("Navigate forward run successfully");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("Refresh");
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("Successfully refreshed");
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Search for element: " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Element is found successfully");
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Click on element: " + element.getTagName());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("Element is clicked successfully");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Fill input " + webElement.getAttribute("id") +
                " with value " + charSequences[0].toString());
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Value is changed successfully");
    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
        System.out.println("Start script");
    }

    @Override
    public void afterScript(String script, WebDriver driver) {
        System.out.println("Script is finished");
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
    }
}
