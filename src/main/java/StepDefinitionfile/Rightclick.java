package StepDefinitionfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Rightclick {

	WebDriver driver;

	@When("^user is on login page$")
	public void user_is_on_login_page() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

	}

	@Then("^Right click and copy the content$")
	public void Right_click_and_copy_the_content() {

		Actions action = new Actions(driver);
		WebElement rightclickme = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(rightclickme).build().perform();

	}

}
