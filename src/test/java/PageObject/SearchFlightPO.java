package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightPO {
	
	WebDriver ldriver;
	public SearchFlightPO(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//body/div[@class='p-fixed l-0 r-0 b-0 t-0 flex flex-center flex-middle z-70']/div[@class='p-relative']/div/div[@class='d-flex']/div[2]/div[1]/div[1]/div[2]//*[name()='svg']")
	WebElement Cross;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div[1]/input")
	WebElement FromWhere;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div[3]/input")
	WebElement FromTo;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[4]/div/div[1]/div/div/button[1]")
	WebElement DatePicker;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[4]/div/div[2]/span")
	WebElement SearchFlight;
	
	public void clickcross() throws InterruptedException {
		Thread.sleep(5000);
	
		Cross.click();
	}
	
	public void enter_where_flight(String From) throws InterruptedException {
		
		FromWhere.sendKeys(From);
		Thread.sleep(3000);
		List<WebElement>auto=ldriver.findElements(By.xpath("//ul[@class=\"airportList\"]/li"));
		int count=auto.size();
		System.err.println(count);
		auto.get(0).click();
	}
	
	public void enter_to_flight(String To) throws InterruptedException {
		FromTo.sendKeys(To);
		Thread.sleep(3000);
		List<WebElement>auto=ldriver.findElements(By.xpath("//li[@class=\"m-1\"]"));
		int count=auto.size();
		System.err.println(count);
		auto.get(0).click();
	}
	
	public void enter_mydate(String date) {
		DatePicker.click();
		String Expected_Date="August 2024";
		while(true) {
			String Actual_Date=ldriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div[2]/div[4]/div/div[1]/div/div/div/ul/div[3]/div/div[2]/div[1]/div[1]/div")).getText();
			if (Expected_Date.equals(Actual_Date)) {
				break;
			}
			else {
				ldriver.findElement(By.xpath("//div[@class='flex-1 ta-right']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='path' and contains(@fill,'currentCol')]")).click();
			}
		}
	}
	public void date() throws InterruptedException {
		Thread.sleep(10000);
		ldriver.findElement(By.xpath("//div[contains(@aria-label,'Tue Aug 20 2024')]//div[contains(@class,'p-1 day-gridContent fs-14 fw-500 flex flex-middle flex-column flex-center flex-top')]")).click();
	}
	
	public void SearchFlight() {
		SearchFlight.click();
	}
	
	
	

}
