package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by a_sia on 8/6/2016.
 */
public class StartPage extends BasePage {
    private final By byTabFlights=By.className("flights");
    private final By byDepartureAirport = By.xpath("//input[@placeholder='Departure airport']");
    private final By byDestinationAirport=By.xpath("//input[@placeholder='Destination airport']");
    private final By byStartDate=By.xpath("//input[@name='startDate']");
    private final By byStartDateDay=By.xpath("//div[@label='Fly out:']//input[@name='dateInput0']");
    private final By byStartDateMonth=By.xpath("//div[@label='Fly out:']//input[@name='dateInput1']");
    private final By byStartDateYear=By.xpath("//div[@label='Fly out:']//input[@name='dateInput2']");
    private final By byEndDateDay=By.xpath("//div[@label='Fly back:']//input[@name='dateInput0']");
    private final By byEndDateMonth=By.xpath("//div[@label='Fly back:']//input[@name='dateInput1']");
    private final By byEndDateYear=By.xpath("//div[@label='Fly back:']//input[@name='dateInput2']");
    private final By byPassengers=By.xpath("//div[@name='passengers']");
    private final By byAdults=By.xpath("//input[@aria-label='Adults 16+ years']");
    private final By byGoButton=By.xpath("//button[@ngClick='searchFlights()']");


    public StartPage(WebDriver driver) {
        super(driver);
    }

    public StartPage selectFlightTab() {
        WebElement flights = driver.findElement(byTabFlights);
        flights.click();

        return new StartPage(driver);
    }

    public StartPage setDepartureAirport(String departureAirport) {
        WebElement from = driver.findElement(byDepartureAirport);
        from.clear();
        from.sendKeys(departureAirport);

        return new StartPage(driver);
    }

    public StartPage setDestinationAirport(String destinationAirport) {
        WebElement to = driver.findElement(byDestinationAirport);
        to.clear();
        String destionationEnter = Keys.chord(destinationAirport, Keys.ENTER);
        to.sendKeys(destionationEnter);

        to.sendKeys(Keys.ENTER);
/*
        WebElement clickClearFix = driver.findElement(By.xpath("//div[@class='pane right']/div/div[1]"));
        clickClearFix.click();*/

        return new StartPage(driver);
    }

    public StartPage setDayOut() {
        WebElement dayOutD = driver.findElement(byStartDateDay);
        dayOutD.sendKeys("14");

        WebElement dayOutM = driver.findElement(byStartDateMonth);
        dayOutM.sendKeys("08");

        WebElement dayOutY =driver.findElement(byStartDateYear);
        dayOutY.sendKeys("16");

        return new StartPage(driver);
    }

    public StartPage setFlyBack() {
        WebElement dayOutD = driver.findElement(byEndDateDay);
        dayOutD.sendKeys("21");

        WebElement dayOutM = driver.findElement(byEndDateMonth);
        dayOutM.sendKeys("08");

        WebElement dayOutY = driver.findElement(byEndDateYear);
        dayOutY.sendKeys("16");

        return new StartPage(driver);
    }

    public StartPage setPassengersNumber(String number){
        WebElement passengersField = driver.findElement(byPassengers);
        passengersField.click();

        WebElement dropDownSelect = driver.findElement(byAdults);
        dropDownSelect.sendKeys(number);

        return new StartPage(driver);
    }

    public StartPage clickGoButton(){
        WebElement goButton = driver.findElement(byGoButton);
        goButton.click();

        return new StartPage(driver);
    }
}
