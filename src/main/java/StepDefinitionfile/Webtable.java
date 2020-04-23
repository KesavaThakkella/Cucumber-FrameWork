package StepDefinitionfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Webtable {

	WebDriver driver;

	@Given("^when user is on login page$")
	public void when_user_is_on_login_page() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Then("^featch all the details from webtable$")
	public void featch_all_the_details_from_webtable() {

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[7]/td[1]

		try {
			System.out.println(driver.findElement(By.xpath("(//table)/tbody/tr[1]/td[2]")).getText());
		} catch (Exception e) {

			e.printStackTrace();

			System.out.println(e.getMessage());
		}

		/*
		 * String beforeXpath = "// *[@id='customers']/tbody/tr["; String
		 * afterXpath = "]/td[1]";
		 * 
		 * for (int i = 2; i <= 7; i++) {
		 * 
		 * String ActualXpath = beforeXpath + i + afterXpath; WebElement element
		 * = driver.findElement(By.xpath(ActualXpath));
		 * System.out.println(element.getText()); // String text =
		 * element.getText(); // System.out.println(
		 * "company name text found is " + text); if (element.getText().equals(
		 * "Ernst Handel")) { System.out.println("Company name is found " +
		 * element.getText() + "at position: " + i);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println(
		 * "***********************************************************");
		 * 
		 * String BeforeXpath = "// *[@id='customers']/tbody/tr["; String
		 * AfterXpath = "]/td[2]";
		 * 
		 * for (int i = 2; i <= 7; i++) {
		 * 
		 * String ActualXpath = BeforeXpath + i + AfterXpath; WebElement element
		 * = driver.findElement(By.xpath(ActualXpath));
		 * System.out.println(element.getText()); if (element.getText().equals(
		 * "Roland Mendel")) { System.out.println("Contact name is found " +
		 * element.getText() + "at position: " + (i - 1)); break;
		 * 
		 * } } System.out.println(
		 * "************************************************************");
		 * 
		 * String BeforeXpath1 = "// *[@id='customers']/tbody/tr["; String
		 * AfterXpath1 = "]/td[3]";
		 * 
		 * for (int i = 2; i <= 7; i++) {
		 * 
		 * String ActualXpath = BeforeXpath1 + i + AfterXpath1; WebElement
		 * element = driver.findElement(By.xpath(ActualXpath));
		 * System.out.println(element.getText()); if (element.getText().equals(
		 * "Roland Mendel")) { System.out.println("Country name is found " +
		 * element.getText() + "at position: " + (i - 1)); break;
		 * 
		 * } }
		 */
	}

}
