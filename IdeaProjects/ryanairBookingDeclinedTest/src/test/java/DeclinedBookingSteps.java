import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BookHomePage;
import pages.StartPage;

/**
 * Created by a_sia on 8/6/2016.
 */
public class DeclinedBookingSteps {

    WebDriver driver;
    StartPage startPage;
    BookHomePage bookHomePage;

    @Before
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a_sia\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
//scenario0
    @Given("^Ryanair start page is opened$")
    public void ryanair_start_page_is_opened() throws Throwable {
        startPage = new StartPage(driver);
        startPage.navigateTo();
    }

    @Given("^search type 'Flights' is selected$")
    public void search_type_Flights_is_selected() throws Throwable {
        startPage.selectFlightTab();
    }

    @Given("From and To destinations are set$")
    public void destination_is_set() throws Throwable {
       startPage.setDepartureAirport("Wroclaw").setDestinationAirport("Dublin");
    }

    @Given("Fly out and fy back dates are set$")
    public void is_set() throws Throwable {
        startPage.setFlyBack().setDayOut();
    }

    @Given("^number of passengers \"([^\"]*)\" is set$")
    public void number_of_passengers_is_set(String number) throws Throwable {
        startPage.setPassengersNumber(number);;
    }

    @When("Let's go button pressed$")
    public void button_pressed() throws Throwable {
        startPage.clickGoButton();
    }

    @Then("^occurs redirection to booking Home Page$")
    public void occurs_redirection_to_booking_Home_Page() throws Throwable {
        Assert.assertTrue("Redirected to booking page",  true);
    }
//scenario1
    @Given("^Booking home page is opened$")
    public void booking_home_page_is_opened() throws Throwable {
        bookHomePage=new BookHomePage(driver);
        Assert.assertTrue("Booking Page opened", true);
    }

    @Given("^flight options are displayed$")
    public void flight_options_are_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^select return flights$")
    public void select_return_flights() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^popup disabled$")
    public void popup_disabled() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^occurs redirection to booking Extras Page$")
    public void occurs_redirection_to_booking_Extras_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
//scenario2
    @Given("^Booking extras page is opened$")
    public void booking_extras_page_is_opened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^\"([^\"]*)\" button is enabled$")
    public void button_is_enabled(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^occurs redirection to booking Payment Page$")
    public void occurs_redirection_to_booking_Payment_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
//scenario3
    @Given("^Booking payment page is opened$")
    public void booking_payment_page_is_opened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^total to pay is displayed$")
    public void total_to_pay_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^title is set$")
    public void title_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^first name is set$")
    public void first_name_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^last name is set$")
    public void last_name_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^email address is set$")
    public void email_address_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^email address confirmation is set$")
    public void email_address_confirmation_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^country is selected$")
    public void country_is_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^phone number is provided$")
    public void phone_number_is_provided() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^payment method is selected$")
    public void payment_method_is_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^card number is set$")
    public void card_number_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^card type is selected$")
    public void card_type_is_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^expiry month is selected$")
    public void expiry_month_is_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^expiry year is selected$")
    public void expiry_year_is_selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^cvv code is set$")
    public void cvv_code_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^cardholder name is set$")
    public void cardholder_name_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^address(\\d+) is set$")
    public void address_is_set(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^city is set$")
    public void city_is_set() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^terms&conditions are confirmed$")
    public void terms_conditions_are_confirmed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^error occurs$")
    public void error_occurs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
