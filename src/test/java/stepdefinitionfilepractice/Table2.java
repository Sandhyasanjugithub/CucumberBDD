package stepdefinitionfilepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import sun.awt.SunHints.Value;

public class Table2 {
	WebDriver driver;
	@Given("launching")
	public void launching() {
	  driver=new ChromeDriver();
	   driver.get("http://localhost:8888/");
	   driver.manage().window().maximize();
	}

	@Then("enter user and pass")
	public void enter_user_and_pass(io.cucumber.datatable.DataTable dataTable) {
	 driver.findElement(By.name("user_name")).sendKeys(dataTable.values().get(0));
	 driver.findElement(By.name("user_password")).sendKeys(dataTable.values().get(1));
	}
	
	@Then("loginings")
	public void loginings() {
	driver.findElement(By.id("submitButton")) .click();
	}

}
