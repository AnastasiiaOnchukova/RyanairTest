package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by a_sia on 8/6/2016.
 */
public class StartPage {
    private static WebDriver driver;
    private final By byPageName=By.xpath("//article[@id='home']");
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
    private final String bookingHome="/booking/home";


    public StartPage(WebDriver driver) {
        super();
        this.driver=driver;
    }

    public StartPage navigateTo() {
        boolean isHomePage=driver.findElement(byPageName).isDisplayed();
        Assert.assertTrue("Home Page was not opened",isHomePage);
        return this;
    }
    public StartPage selectFlightTab() {
        WebElement flights = driver.findElement(byTabFlights);
        flights.click();

        return this;
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

        UtilClass.waitForVisibility(byAdults,driver);

        WebElement dropDownSelect = driver.findElement(byAdults);
        dropDownSelect.clear();
        dropDownSelect.sendKeys(number);

        return this;
    }

    public  BookHomePage  clickGoButton(){
        UtilClass.waitForVisibility(byGoButton,driver);

        WebElement goButton = driver.findElement(byGoButton);
        goButton.click();
        UtilClass.waitForVisibility(byBookingHomePage,driver);

        return new BookHomePage(driver);
    }

    public boolean isRedirected() {
        return UtilClass.isRedirected(bookingHome,driver);
    }

    private StartPage setAirport(By locator, String city){
        WebElement to = driver.findElement(locator);
        to.clear();
        String locatorEnter = Keys.chord(city, Keys.ENTER);
        to.sendKeys(locatorEnter);

        return this;
    }

    private StartPage setDate(By dateDay, By dateMonth, By dateYear){
        UtilClass.waitForVisibility(dateDay,driver);

        WebElement dayOutD = driver.findElement(dateDay);
        dayOutD.sendKeys("28");

        WebElement dayOutM = driver.findElement(dateMonth);
        dayOutM.sendKeys("08");

        WebElement dayOutY =driver.findElement(dateYear);
        dayOutY.sendKeys("16");

        return this;
    }

}
