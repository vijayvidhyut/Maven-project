package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OpenGoogleStepDefinitions {
    WebDriver driver;
	@Given("user is entered in google page")
	public void user_is_entered_in_google_page() {
	   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.google.co.in");
	}

		
	
	@When("user is typing the title is {.*}")
	public void user_is_typing_the_title_is(String place) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(place+Keys.ENTER);

		Thread.sleep(2000);
	}
	    

//@When("user is typing the title {string}")
//public void user_is_typing_the_title(String string) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
	@And("click the search button")
	public void click_the_search_button() {
	   
	}

	@Then("user to see   result of what he searched")
	public void user_to_see_result_of_what_he_searched() {
		boolean displayed = driver.findElement(By.xpath("//*[@id=\"rcnt\"]/div[2]/div/div/div[3]/div/div[1]/div/div/div/div[1]/div/div")).isDisplayed();
	   System.out.println("is thanjavur text displayed "+displayed);
	}
}
