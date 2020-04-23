package StepDefinitionfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class tabledata {

	WebDriver driver;

	@Given("^open the wthree schools website$")
	public void open_the_wthree_schools_website() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
	

	}

	@Then("^get data from a webtable$")
	public <Xls_Reader> void get_data_from_a_webtable() throws Exception {

		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Sales')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Orders')]")).click();
		Thread.sleep(3000);
		System.out.println("Order#");
		// *[@id="orders-grid"]/tbody/tr[1]/td[2]

		String beforexpath = "//*[@id='orders-grid']/tbody/tr[";
		String afterxpath = "]/td[2]";
		// Write WebTable values into Excel Sheet in Selenium with Apache POI
		// API

		for (int i = 1; i <= 5; i++) {
			String actualxpath = beforexpath + i + afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			if (element.getText().contains("5")) {
				driver.findElement(By.xpath("//input[@value='5']")).click();

			}

		}

	}

}
