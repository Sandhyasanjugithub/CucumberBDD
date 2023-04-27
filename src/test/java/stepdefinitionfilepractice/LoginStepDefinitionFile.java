package stepdefinitionfilepractice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginStepDefinitionFile {

	WebDriver driver;
	@Given("launch browser")
	public void launch_browser() {
		driver=new ChromeDriver();

	}

	@Then("enter url")
	public void enter_url() {

		driver.get("http://localhost:8888/");
	}

	@Then("validate login page is displayed or not")
	public void validate_login_page_is_displayed_or_not() {
		Assert.assertEquals(false, false);
	}

	@Then("enter username")
	public void enter_username() {
driver.findElement(By.name("user_name")).sendKeys("admin");
	}

	@Then("enter password")
	public void enter_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}

	@Then("click on login button")
	public void click_on_login_button() {
driver.findElement(By.id("submitButton")).click();
	}

	@Then("validate home page is displayed or not")
	public void validate_home_page_is_displayed_or_not() {
		Assert.assertEquals(false, false);
	}




	

	

	@Then("enter username {string}")
	public void enter_username(String user) {
		driver.findElement(By.name("user_name")).sendKeys(user);
	}

	@Then("enter password  {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}
	    
	}

