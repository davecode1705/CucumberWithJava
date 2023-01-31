package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
public static WebDriver driver;
	/*@Given("browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is: " +projectPath );
		System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.ca/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
	   WebElement txtName= driver.findElement(By.name("q"));
	   txtName.sendKeys("Automation");
	   Thread.sleep(3000);
	}

	@And("hit enter")
	public void hit_enter() throws InterruptedException {
	 driver.findElement(By.xpath("//input[@name='btnK']")).click();
	 Thread.sleep(3000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	   System.out.println("Page is displayed");
	   driver.getPageSource().contains("What is automation? - IBM");
	   
	   driver.close();
	}
*/
}
