package StepDefinitionfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.utility;

public class LoginStepDefinition {

	WebDriver driver;

	@Given("^user is in login page$")
	public void userloginpage() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.manage().window().maximize();
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File Source =
		 * ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(Source, new
		 * File("./Screenshots/fb.png"));
		 */
		utility.capturescreenshot(driver, "loginpage");
	}

	@When("^titile of login page is Free CRM$")
	public void titileofloginpageisFacebook() {

		String title = driver.getTitle();
		System.out.println("title of the page is " + title);

	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void userentersusernameandpassword(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("^close the browser$")
	public void close_the_browser() {

		driver.close();
	}

}
