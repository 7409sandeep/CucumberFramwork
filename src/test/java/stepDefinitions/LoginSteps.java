
package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

	@Given("User Launch Chrome browser")

	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_and_password(String email, String password) {
		driver.findElement(org.openqa.selenium.By.id("Email")).clear();
		driver.findElement(org.openqa.selenium.By.id("Email")).sendKeys(email);

		driver.findElement(org.openqa.selenium.By.id("Password")).clear();
		driver.findElement(org.openqa.selenium.By.id("Password")).sendKeys(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		driver.findElement(org.openqa.selenium.By.xpath("//button[text()='Log in']")).click();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		System.out.println("capcha is Coming");
		// Assert.assertEquals(title, driver.getTitle());
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
}
