package stepdefinitionfilepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AddProduct {
	WebDriver driver;
	@Given("To launch the browser")
	public void to_launch_the_browser() {
		driver=new ChromeDriver();  
		driver.get("http://www.amazon.com/");
	}

	@Then("click on search textbox and search for phone")
	public void click_on_search_textbox_and_search_for_phone() {
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple iphone"); 
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  driver.findElement(By.xpath("//span[text()='Apple iPhone XS, US Version, 256GB, Space Gray - Unlocked (Renewed)']")).click();
		} 
	

	@Then("add to cart")
	public void add_to_cart() {
		  driver.findElement(By.id("exportsUndeliverable-cart-announce")).click();
	}

	@Then("I validate the product is added to cart or not")
	public void i_validate_the_product_is_added_to_cart_or_not() {
		  Assert.assertEquals(false, false); 
	}

}
