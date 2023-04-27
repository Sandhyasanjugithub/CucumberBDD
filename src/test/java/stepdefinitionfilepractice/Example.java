package stepdefinitionfilepractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Example {

	
WebDriver driver;
@Given("launch the browser")
public void launch_the_browser() {
    driver=new ChromeDriver();
}

@When("get url")
public void get_url() {
    driver.get("http://www.makemytrip.com/");
}

@Then("enter the src {string}")
public void enter_the_src(String src) {
    System.out.println(src);
}

@Then("enter the dst {string}")
public void enter_the_dst(String dst) {
    System.out.println(dst);
}

@Then("enter the seats {string}")
public void enter_the_seats(String seat) {
   System.out.println(seat);
}

	}


