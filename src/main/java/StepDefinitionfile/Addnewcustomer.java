package StepDefinitionfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addnewcustomer {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://demo.guru99.com/V1/index.php";
		driver.get(url);
		driver.manage().window().maximize();

	}

	@When("^title of login page is guru$")
	public void title_of_login_page_is_guru() {

		String titile = driver.getTitle();
		System.out.println("title of the page is " + titile);
	}

	@Then("^enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {

		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {

		driver.findElement(By.name("btnLogin")).click();

	}

	@Then("^clicks on new customer tab$")
	public void clicks_on_new_customer_tab() {

		driver.findElement(By.xpath("//a[contains(text(), 'New Customer')]")).click();

	}

	@Then("^enter customername \"([^\"]*)\"$")
	public void enter_customername(String CustomerName) {

		driver.findElement(By.name("name")).sendKeys(CustomerName);
	}

	@Then("^add address \"([^\"]*)\"$")
	public void add_address(String Address) {

		driver.findElement(By.name("addr")).sendKeys(Address);
	}

}
