package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by a_sia on 8/6/2016.
 */
public class BookHomePage{
    private static WebDriver driver;
    private final By byRadioOutFlight= By.xpath("//*[@id='outbound']//input[@type='radio'][1]");
    private final By byRadioInFlight= By.xpath("//*[@id='inbound']//input[@type='radio'][1]");
    private final By byContinueButton=By.xpath("//div[contains(@class,'trips-basket')]//button");
    private final String bookingExtras="/booking/extras";

    public BookHomePage(WebDriver driver) {
        super();
        this.driver=driver;
    }
    private BookHomePage selectFlight(By locator){
        driver.manage().window().maximize();
        UtilClass.waitForVisibility(locator,driver);
        WebElement radioButton=driver.findElement(locator);
        radioButton.click();
        return this;
    }

    public BookHomePage selectOutboundFlight(){
        return selectFlight(byRadioOutFlight);
    }

    public BookHomePage selectInboundFlight(){
        return selectFlight(byRadioInFlight);
    }

    public BookHomePage clickContinue() {
        UtilClass.waitForVisibility(byContinueButton,driver);
        driver.findElement(byContinueButton).click();
        return new BookHomePage(driver);
    }

    public boolean isRedirected(){
        return UtilClass.isRedirected(bookingExtras,driver);
    }

}
