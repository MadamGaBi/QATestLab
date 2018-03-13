package myprojects.automation.assignment.utils;

import org.openqa.selenium.remote.BrowserType;

/**
 * Help class to get passed parameters from environment for further usage in the automation project
 */
public class Properties {
    private static final String DEFAULT_BASE_URL = "http://prestashop-automation.qatestlab.com.ua/";
    private static final String DEFAULT_BASE_ADMIN_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    private static final String DEFAULT_BROWSER = BrowserType.CHROME;
    private static final String DEFAULT_ADMIN_LOGIN = "webinar.test@gmail.com";
    private static final String DEFAULT_ADMIN_PASSWORD = "Xcg7299bnSmMuRLp9ITw";
    private static final String TEST_CATEGORY = "test category";

    /**
     *
     * @return Website frontend.
     */
    public static String getBaseUrl() {
        return System.getProperty(EnvironmentVariables.BASE_URL.toString(), DEFAULT_BASE_URL);
    }

    /**
     *
     * @return Website backend (ULR of the Admin Panel.)
     */
    public static String getBaseAdminUrl() {
        return System.getProperty(EnvironmentVariables.BASE_ADMIN_URL.toString(), DEFAULT_BASE_ADMIN_URL);
    }

    /**
     *
     * @return The name of the browser that need to be used for execution.
     */
    public static String getBrowser() {
        return System.getProperty(EnvironmentVariables.BROWSER.toString(), DEFAULT_BROWSER);
    }

    /**
     *
     * @return The admin login.
     */
    public static String getDefaultAdminLogin() {
        return System.getProperty(EnvironmentVariables.DEFAULT_ADMIN_LOGIN.toString(), DEFAULT_ADMIN_LOGIN);
    }

    /**
     *
     * @return The admin password.
     */
    public static String getDefaultAdminPassword() {
        return System.getProperty(EnvironmentVariables.DEFAULT_ADMIN_PASSWORD.toString(), DEFAULT_ADMIN_PASSWORD);
    }

    /**
     *
     * @return The name of new test category.
     */
    public static String getTestCategory() {
        return System.getProperty(EnvironmentVariables.TEST_CATEGORY.toString(), TEST_CATEGORY);
    }
}

/**
 * All parameters that are passed to automation project
 */
enum EnvironmentVariables {
    BASE_URL("env.url"),
    BASE_ADMIN_URL("env.admin.url"),
    BROWSER("browser"),
    DEFAULT_ADMIN_LOGIN("login"),
    DEFAULT_ADMIN_PASSWORD("password"),
    TEST_CATEGORY("category");

    private String value;
    EnvironmentVariables(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}