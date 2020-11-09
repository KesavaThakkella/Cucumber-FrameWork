package StepDefinitionfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import library.Data;

public class HashData {

	WebDriver driver;

	@Given("^I open the chrome browser$")
	public void I_open_the_chrome_browser() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
	}

	@And("^I navigating to facebook website$")
	public void I_navigating_to_facebook_website() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	@Then("^Enter \"(.*)\" and \"(.*)\"$")
	public void Then_Enter_firstname_and_lastname(String firstname, String lastname) {

		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);

	}

	@And("^Select month from month drop down$")
	public void And_Select_month_from_month_drop_down() {

		Select totalmonths = new Select(driver.findElement(By.id("month")));
		List<WebElement> monthnames = totalmonths.getOptions();
		System.out.println(monthnames.size());
		for (int i = 0; i < monthnames.size(); i++) {

			System.out.println(monthnames.get(5).getText());

		}

		// Selecting the month using Data library of hashmap

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText(Data.monthmap().get(10));

	}

}
