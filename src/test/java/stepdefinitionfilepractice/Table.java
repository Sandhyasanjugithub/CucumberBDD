package stepdefinitionfilepractice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Table {
	WebDriver driver;
	@Given("launch")
	public void launch() {
	  driver=new ChromeDriver();
	}

	@Then("go to url")
	public void go_to_url() {
	 System.out.println("URL done");
	}

	@Then("enter us and pw")
	public void enter_us_and_pw(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		String S = data.get(0).get(0);
	String s1 = data.get(0).get(1);
	String s2 = data.get(0).get(2);
	System.out.println(S);
	System.out.println(s1);
	System.out.println(s2);
	}

	@Then("login")
	public void login() {
	   System.out.println("login done"); 
	}


}
