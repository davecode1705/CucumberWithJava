package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	public static WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path is: " + projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath + "/src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
