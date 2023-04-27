package stepdefinitionfilepractice;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class Table3 {
	@Given("browser")
	public void browser() {
	  System.out.println("browser launched");
	}

	@Given("enter usname and psword")
	public void enter_usname_and_psword(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> d = dataTable.asMaps();
	String mail = d.get(0).get("mailid");
	String user = d.get(0).get("usname");
	String pass = d.get(0).get("psword");
	System.out.println(mail+" "+user+" "+pass);
	}

	@Then("login to app")
	public void login_to_app() {
	   System.out.println("logged");
	}
}
