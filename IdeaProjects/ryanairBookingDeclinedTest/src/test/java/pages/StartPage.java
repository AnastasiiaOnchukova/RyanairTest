package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by a_sia on 8/6/2016.
 */
public class StartPage extends BasePage {
    private final By byTabFlights=By.className("flights");
    private final By byDepartureAirport = By.xpath("//input[@placeholder='Departure airport']");
    private final By byDestinationAirport=By.xpath("//input[@placeholder='Destination airport']");
    private final By byStartDateDay=By.xpath("//div[@label='Fly out:']//input[@name='dateInput0']");
    private final By byStartDateMonth=By.xpath("//div[@label='Fly out:']//input[@name='dateInput1']");
    private final By byStartDateYear=By.xpath("//div[@label='Fly out:']//input[@name='dateInput2']");
    private final By byEndDateDay=By.xpath("//div[@label='Fly back:']//input[@name='dateInput0']");
    private final By byEndDateMonth=By.xpath("//div[@label='Fly back:']//input[@name='dateInput1']");
    private final By byEndDateYear=By.xpath("//div[@label='Fly back:']//input[@name='dateInput2']");
    private final By byPassengers=By.xpath("//div[@name='passengers']//div[@class='value']");
    private final By byAdults=By.xpath("//input[@aria-label='Adults 16+ years']");
    private final By byGoButton=By.xpath("//div[@class='col-flight-search-right']//button[@aria-hidden='false']");
    private final By byBookingHomePage=By.xpath("//total-header//section[@id='booking-selection']");


    public StartPage(WebDriver driver) {
        super(driver);
    }

    public StartPage selectFlightTab() {
        WebElement flights = driver.findElement(byTabFlights);
        flights.click();

        return new StartPage(driver);
    }

    public StartPage setDepartureAirport(String departureAirport) {
        return setAirport(byDepartureAirport, departureAirport);
    }

    public StartPage setDestinationAirport(String destinationAirport) {
       return setAirport(byDestinationAirport,destinationAirport);
    }

    public StartPage setDayOut() {
        return setDate(byStartDateDay,byStartDateMonth,byStartDateYear);
    }

    public StartPage setFlyBack() {
        return setDate(byEndDateDay,byEndDateMonth,byEndDateYear);
    }

    public StartPage setPassengersNumber(String number){
        WebElement passengersField = driver.findElement(byPassengers);
        passengersField.click();

        waitForVisibility(byAdults);

        WebElement dropDownSelect = driver.findElement(byAdults);
        dropDownSelect.clear();
        dropDownSelect.sendKeys(number);

        return new StartPage(driver);
    }

    public  StartPage  clickGoButton(){
        waitForVisibility(byGoButton);

        WebElement goButton = driver.findElement(byGoButton);
        goButton.click();

        return new StartPage(driver);
    }

    public boolean isRedirected() {
        waitForVisibility(byBookingHomePage);
        return driver.findElement(byBookingHomePage).isDisplayed();

    }

    private StartPage setAirport(By locator, String city){
        WebElement to = driver.findElement(locator);
        to.clear();
        String locatorEnter = Keys.chord(city, Keys.ENTER);
        to.sendKeys(locatorEnter);

        return new StartPage(driver);
    }

    private StartPage setDate(By dateDay, By dateMonth, By dateYear){
        waitForVisibility(dateDay);

        WebElement dayOutD = driver.findElement(dateDay);
        dayOutD.sendKeys("21");

        WebElement dayOutM = driver.findElement(dateMonth);
        dayOutM.sendKeys("08");

        WebElement dayOutY =driver.findElement(dateYear);
        dayOutY.sendKeys("16");

        return new StartPage(driver);
    }
}
