package stepdefinitionfilepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class MakemyTrip {
	WebDriver driver;
	@Given("launch the brower")
	public void launch_the_brower() {
	  driver=new ChromeDriver(); 
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("url")
	public void url() throws InterruptedException {
	  driver.get("http://www.makemytrip.com/"); 

		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
	}

	@Then("select source {string}")
	public void select_source(String from) {
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(from); 
		driver.findElement(By.xpath("//p[text()='"+from+", India']")).click();
	}

	@Then("select destination {string}")
	public void select_destination(String to) {
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys(to);
		driver.findElement(By.xpath("//p[text()='"+to+", India']")).click();
	}

	@Then("select travellers {string}")
	public void select_travellers(int seats) {
	driver.findElement(By.xpath("//*[text()='Travellers & Class']")).click();
	 driver.findElement(By.xpath("//li[@data-cy='adults-"+seats+"']")).click();
	}

	@Then("click on apply")
	public void click_on_apply() {
	 driver.findElement(By.xpath("(//button[@type='button'])[1]")).click() ;  

	}


}
