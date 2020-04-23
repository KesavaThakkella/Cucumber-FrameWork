package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {

	public static void launchbrowser(WebDriver driver) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/flights/");
			driver.manage().window().maximize();
		} catch (Exception e) {

			System.out.println("Exception While Launching The Entered Site URL" + e.getMessage());
		}

	}

}
