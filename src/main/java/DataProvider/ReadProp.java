package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadProp {

	public static void testconig() throws IOException {

		WebDriver driver = null;

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("F://code//Cucumber-FrameWork//Config//config.properties");
		prop.load(fis);

		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));

		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browsername.equals("FF")) {

			driver = new FirefoxDriver();

		} else if (browsername.equals("IE")) {

			driver = new InternetExplorerDriver();

		} else {

			System.out.println("No browser value is given");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginbutton"))).click();
		prop.get("username");
	}

}
