package cucumberframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addcustomer {
	static WebDriver driver;

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\cucumberframework\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("user should be in telecom page")
	public void user_should_be_in_telecom_page() {

		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

	}

	@When("user should enter all the details")
	public void user_should_enter_all_the_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Mohamed");
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("Hazeeb");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mhd.hzb14@gmail.com");
		WebElement adrs = driver.findElement(By.xpath("//textarea[@name='addr']"));
		adrs.sendKeys("chennai");
		WebElement phone = driver.findElement(By.id("telephoneno"));
		phone.sendKeys("8754789507");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("user should be displayed id is generated")
	public void user_should_be_displayed_id_is_generated() {
		WebElement id = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']"));
	boolean check = id.isDisplayed();
	System.out.println(check);
	}



}
