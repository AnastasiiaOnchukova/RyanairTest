package pages;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by a_sia on 8/6/2016.
 */
public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public StartPage navigateTo() {
        driver.get("https://www.ryanair.com/ie/en/");
        assertEquals("Ryanair", "Ryanair");
        return new StartPage(driver);
    }
}
