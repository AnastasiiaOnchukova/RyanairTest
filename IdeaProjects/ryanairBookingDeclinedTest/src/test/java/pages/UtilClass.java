package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by a_sia on 8/8/2016.
 */
public class UtilClass {

    public static void waitForVisibility(By locator,WebDriver driver){
        (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForUrl(String part,WebDriver driver){
        (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.urlContains(part));
    }

    public static boolean isRedirected(String pageName,WebDriver driver) {
        UtilClass.waitForUrl(pageName,driver);
        return driver.getCurrentUrl().contains(pageName);

    }
}
