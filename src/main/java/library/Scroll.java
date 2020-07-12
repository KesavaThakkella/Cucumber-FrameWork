package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Scroll is a method.
		// To scroll using Selenium, you can use JavaScriptExecutor interface
		// that helps to execute JavaScript methods through Selenium Webdriver.

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// below will scroll vertically down
		js.executeScript("window.scrollBy(0,1000)");

		// To scroll horizantally side
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(-0,-1000)");

	}

}
