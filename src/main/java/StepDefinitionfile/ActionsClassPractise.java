package StepDefinitionfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import library.utility;

public class ActionsClassPractise {

	WebDriver driver;

	@Given("^if user is on login page$")
	public void user_is_on_login_page() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://mrbool.com/search/";
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Then("^click on more menu$")
	public void click_on_more_menu() throws Exception {

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
		utility.capturescreenshot(driver, "context");
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[contains(text(),'Courses')]")).click();

		/*
		 * 2nd---------------------------way: WebElement menu =
		 * driver.findElement(By.className("menulink"));
		 * action.moveToElement(menu).build().perform();
		 * driver.findElement(By.xpath(
		 * "//ul[@class='submenu']//li//a[contains(text(),'Courses')]")).click()
		 * ;
		 */
	}

	@Then("^wait until webelement is located$")
	public void wait_until_webelement_is_located() {

		System.out.println("kxfubjvfn");

	}

	@Then("^select and click Deals from more menu$")
	public void select_and_click_Deals_from_more_menu() {

		System.out.println("kxfubjvfn");

	}

}
