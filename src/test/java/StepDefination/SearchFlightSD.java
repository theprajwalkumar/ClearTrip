package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.network.model.CrossOriginEmbedderPolicyStatus;

import PageObject.SearchFlightPO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFlightSD {
	WebDriver driver;
	SearchFlightPO ct;
	
	@Given("User launches a Chrome Browser")
	public void user_launches_a_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    ct=new SearchFlightPO(driver);
	}

	@When("User opens the url {string}")
	public void user_opens_the_url(String url) throws InterruptedException {
	    driver.get(url);
	 
	    Thread.sleep(5000);
	}
	
	@And ("User clicks on the crossbutton")
	public void User_clicks_on_the_crossbutton() throws InterruptedException {
		ct.clickcross();
		
	}

	@And("User selects Where From as {string}")
	public void user_selects_where_from_as(String From) throws InterruptedException {
	    ct.enter_where_flight(From);
	    Thread.sleep(3000);
	}

	@And("User selects Where To as {string}")
	public void user_selects_where_to_as(String To) throws InterruptedException {
		ct.enter_to_flight(To);
	    Thread.sleep(3000);
	}

	@And("User selects the month-year as {string}")
	public void user_selects_the_month_year_as(String date) throws InterruptedException {
		ct.enter_mydate(date);
		Thread.sleep(5000);
	    
	}

	@And("User selects the date")
	public void user_selects_the_date() throws InterruptedException {
		ct.date();
		Thread.sleep(3000);
	    
	}

	@Then("User clicks on the Search Flight")
	public void user_clicks_on_the_search_flight() throws InterruptedException {
		ct.SearchFlight();
		Thread.sleep(3000);
	    
	}

	@And("User wait on Search Flight Page")
	public void user_wait_on_search_flight_page() throws InterruptedException {
		Thread.sleep(3000);
	    
	}


}
