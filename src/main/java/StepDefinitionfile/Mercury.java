package StepDefinitionfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.calendar;
import library.utility;

public class Mercury {

	WebDriver driver;

	@Given("^user is on titile page$")
	public void user_is_on_titile_page() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.mercurytravels.co.in/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'No, thanks')]")).click();

	}

	@When("^titile of login page is MERCURY$")
	public void titile_of_login_page_is_MERCURY() {

		String title = driver.getTitle();
		System.out.println("title of the page :" + title);

	}

	@Then("^Select destination from dropdown$")
	public void Enter_destination() {

		driver.findElement(By.xpath("//input[@id='holiday_category_id']")).sendKeys("Hyderabad");
		utility.capturescreenshot(driver, "destiny");
		System.out.println("Destination is !...Hyderabad...!");

	}

	@Then("^Select duration from dropdown$")
	public void Select_duration_from_dropdown() {

		try {
			Select duration = new Select(driver.findElement(By.xpath("//select[@id='duration_d']")));
			duration.selectByVisibleText("7Nights+8Days");
			/*
			 * duration.selectByValue("4Nights / 5Days");
			 * duration.selectByIndex(1);
			 * 
			 * //span[@class='white-text'] //a[contains(text(),'No, thanks')]
			 */

			utility.capturescreenshot(driver, "duration");
			System.out.println("7Nights+8Days");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Then("^Select start date from dropdown$")
	public void Select_start_date_from_dropdown() {

		WebElement date = driver.findElement(By.xpath("//input[@id='dphh1']"));
		String dateval = "08/04/2019";
		calendar.selectdatebyjs(driver, date, dateval);
		utility.capturescreenshot(driver, "selected date");

	}

	@Then("^select type of holiday from dropdown$")
	public void select_type_of_holiday_from_dropdown() {

		try {
			Select type_holiday = new Select(driver.findElement(By.xpath("//select[@name='theme']")));
			type_holiday.selectByVisibleText("Island");
			utility.capturescreenshot(driver, "Island");
			System.out.println("Type of holiday is Island");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e);
		}
	}

	@Then("^click on search holidays icon$")
	public void click_on_search_holidays_icon() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-search2']")).click();
		utility.capturescreenshot(driver, "final screen");

	}

	@Then("^Select the Indian holidays screen$")
	public void Select_the_Indian_holidays_screen() {

		driver.findElement(By
				.xpath("//a[contains(text(),'Indian Holidays') and @class='ind_link font14' and @title='Indian Holidays']"))
				.click();
		driver.findElement(By.xpath("//input[@name='holiday_category' and @type='text']")).sendKeys("Delhi");
		Select dura = new Select(driver.findElement(By.xpath("//select[@name='nights' and @ id='duration_d']")));
		dura.selectByVisibleText("20Nights+21Days");
		driver.findElement(By.xpath("//button[@type='submit' and @ class='btn btn-primary btn-search2']")).click();
		utility.capturescreenshot(driver, "indian holidays screen");

	}

	@Then("^After click on About Us menu$")
	public void After_click_on_About_Us_menu() {

		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(driver.findElement(By.xpath(
		 * "//li[@class='dropdown open']"))).build().perform();
		 */

	}
}
