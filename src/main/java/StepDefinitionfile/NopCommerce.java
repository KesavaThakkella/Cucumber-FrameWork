
package StepDefinitionfile;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NopCommerce {

	WebDriver driver;

	@Given("^if user is on admin area demo$")
	public void if_user_is_on_admin_area_demo() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);

	}

	@When("^Enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void Enter_username_and_password(String email, String password) {

		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(password);

	}

	@Then("^Click on login button$")
	public void Click_on_login_button() throws Exception {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
	}

	@Then("^Click on sales and Orders tab$")
	public void Click_on_sales_and_Orders_tab() throws Exception {

		driver.findElement(By.xpath("//span[contains(text(),'Sales')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Orders')]")).click();
		Thread.sleep(3000);
	}

	@Then("^Get the order numbers from orders table$")
	public void Get_the_order_numbers_from_orders_table() {

		System.out.println("Order#");
		// *[@id="orders-grid"]/tbody/tr[1]/td[2]

		String beforexpath = "//*[@id='orders-grid']/tbody/tr[";
		String afterxpath = "]/td[2]";
		// Write WebTable values into Excel Sheet in Selenium with Apache POI
		// API

		// Xls_Reader reader = new Xls_Reader("");

		for (int i = 1; i <= 5; i++) {
			String actualxpath = beforexpath + i + afterxpath;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			if (element.getText().contains("5")) {
				driver.findElement(By.xpath("//input[@value='5']")).click();

			}

		}

	}

	@Then("^Also get the data of customer from table$")
	public void Also_get_the_data_of_customer_from_table() {

		System.out.println("Customer");
		String beforexpath = "//*[@id='orders-grid']/tbody/tr[";
		String afterxpath = "]/td[6]/a";
		for (int i = 1; i <= 5; i++) {
			String ActualXpath = beforexpath + i + afterxpath;
			WebElement element1 = driver.findElement(By.xpath(ActualXpath));
			System.out.println(element1.getText());
			if (element1.getText().equals("steve_gates@nopCommerce.com")) {
				driver.findElement(By.xpath("//input[@value='1']")).click();

			}

		}

	}

	@Then("^Get the Created On date from orders table$")
	public void Get_the_Created_On_date_from_orders_table() throws Exception {

		System.out.println("Created On");
		String CreatedOn = "//*[@id='orders-grid']/tbody/tr[";
		String CreatedOndate = "]/td[8]";
		for (int i = 1; i <= 5; i++) {

			String finalxpath = CreatedOn + i + CreatedOndate;
			WebElement element2 = driver.findElement(By.xpath(finalxpath));
			System.out.println(element2.getText());

		}

	}

	@Then("^Edit the order status pending for order$")
	public void Edit_the_order_status_pending_for_order() throws Exception {

		driver.findElement(By.xpath("//a[@href='Edit/3']")).click();
		// driver.findElement(By.xpath("//i[@class='toggle-icon fa
		// fa-plus']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Change status')]")).click();
		Thread.sleep(2000);
		Select OrderStatusId = new Select(driver.findElement(By.xpath("//select[@name='OrderStatusId']")));
		Thread.sleep(2000);
		OrderStatusId.selectByVisibleText("Processing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnSaveOrderStatus']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='btnSaveOrderStatus-action-confirmation-submit-button']")).click();

	}

	@Then("^Download the pdf$")
	public void Download_the_pdf() throws Exception {

		driver.findElement(By.xpath("//a[@class='btn bg-purple']")).click();

	}

	@Then("^Attach a file in Order Notes section$")
	public void Attach_a_file_in_Order_Notes_section() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(800, 0)");

		driver.findElement(By.xpath("//input[@id='AddOrderNoteHasDownload']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='qq-upload-button-selector qq-upload-button']")).click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		// copy file path into the clipboard
		StringSelection filelocation = new StringSelection("C:\\Users\\kesava\\Desktop\\order_3.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filelocation, null);
		// Pressing ctrl+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		// Releasing ctrl+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		// Pressing Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		// Releasing Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='AddOrderNoteMessage']"))
				.sendKeys("Order status has been changed and Invoice(PDF)has been attached successfuuly");
		driver.findElement(By.xpath("//input[@id='AddOrderNoteDisplayToCustomer']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Add order note')]")).click();

	}

	@Then("^Click on backbutton and select the Start date and End date$")
	public void Click_on_backbutton_and_select_the_Start_date_and_End_date() throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'back to order list')]")).click();

	}
}
