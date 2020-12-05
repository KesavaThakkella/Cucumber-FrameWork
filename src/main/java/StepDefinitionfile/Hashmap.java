package StepDefinitionfile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class Hashmap {

	WebDriver driver;

	@Given("^customer is on crm page enter user and password$")
	public void customer_is_on_crm_page_enter_user_and_password() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		// driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'No, thanks')]")).click();
		driver.findElement(By.xpath("//input[@id='holiday_category_id']")).sendKeys("Hyderabad");

		// WebElement duration =
		// driver.findElement(By.xpath("//select[@id='duration_d']"));
		// or
		// Select dropdown = new
		// Select(driver.findElement(By.xpath("//select[@id='duration_d']")));

		Select dropdownvalue = new Select(driver.findElement(By.xpath("//select[@id='duration_d']")));
		List<WebElement> values = dropdownvalue.getOptions();
		dropdownvalue.selectByVisibleText("36Nights+37Days");
		System.out.println("size is" + values.size());
		System.out.println("the fifth position value is : " + values.get(5).getText());
		for (int i = 0; i <=values.size(); i++) {
			System.out.println(values.get(i).getText());

			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'SEARCH HOLIDAYS ')]")).click();
			driver.navigate().forward();
			driver.navigate().back();
			driver.navigate().refresh();

			/*
			 * 2nd approach of list:
			 * 
			 * List<WebElement> countryList =
			 * driver.findElements(By.cssSelector("#select2-drop ul li"));
			 * for(WebElement country : countryList){
			 * if(country.getText().equals("India")) { country.click(); } }
			 * 
			 * 
			 */

		}

	}

}
