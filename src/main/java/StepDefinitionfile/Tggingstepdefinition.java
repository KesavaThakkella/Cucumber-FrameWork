package StepDefinitionfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Tggingstepdefinition {

	@Given("^This is a valid login test$")
	public void This_is_a_valid_login_test() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//kesava//Downloads//Softwares//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.facebook.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		
	}

	@Given("^This is a invalid login test$")
	public void This_is_a_invalid_login_test() {

	}

	@Given("^This is a contact test case$")
	public void This_is_a_contact_test_case() {

	}

	@Given("^This is a deal test case$")
	public void This_is_a_deal_test_case() {

	}

	@Given("^This is a tasks test case$")
	public void This_is_a_tasks_test_case() {

	}

	@Given("^This is a case test case$")
	public void This_is_a_case_test_case() {

	}

	@Given("^clicking on left panel links$")
	public void clicking_on_left_panel_links() {

	}

	@Given("^This is a search deal test$")
	public void This_is_a_search_deal_test() {

	}

	@Given("^This is a search contact test$")
	public void This_is_a_search_contact_test() {

	}

	@Given("^This is a search case test$")
	public void This_is_a_search_case_test() {

	}

	@Given("^This is a search task test$")
	public void This_is_a_search_task_test() {

	}

	@Given("^This is a search call test$")
	public void This_is_a_search_call_test() {

	}

	@Given("^This is a search email test$")
	public void This_is_a_search_email_test() {

	}

	@Given("^This is a search docs test$")
	public void This_is_a_search_docs_test() {

	}

	@Given("^This is a search forms test$")
	public void This_is_a_search_forms_test() {

	}

	@Given("^This is a report test$")
	public void This_is_a_report_test() {

	}

	@Given("^This is a logout test$")
	public void This_is_a_logout_test() {

	}

	@Given("^This is a close broswer test$")
	public void This_is_a_close_broswer_test() {

	}

}
