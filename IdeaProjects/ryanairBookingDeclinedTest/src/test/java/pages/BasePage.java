package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

/**
 * Created by a_sia on 8/6/2016.
 */
public class BasePage {

    protected WebDriver driver;
    private final By byPageName=By.xpath("//article[@id='home']");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public StartPage navigateTo() {
        driver.get("https://www.ryanair.com/ie/en/");
        boolean isHomePage=driver.findElement(byPageName).isDisplayed();
        Assert.assertTrue("Home Page was not opened",isHomePage);
        return new StartPage(driver);
    }

    public void waitForVisibility(By locator){
        (new WebDriverWait(driver, 30))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
