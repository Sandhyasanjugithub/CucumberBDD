package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(features="C:\\Users\\sandh\\eclipse-workspace\\SDET_10_San_BDD\\src\\test\\java\\practiceFeature\\background.feature",//its used to copy the directory path
glue={"stepdefinitionfilepractice","hook"},//it is used to run step definition file,hook=it acts as a testng annotation but here we use only two methods like @Before ,@After
dryRun=false, //it is used to check whether the statements is present or not in actual code,the default value of dryrun is false,it means it executes the code,  and if we give true then it doesn't launch the browser just check the methods present or not
tags="@smoketest ",//it is used for group execution
monochrome=true,//it will make the console o/p be readable format and it removes unreadable characters
plugin={"pretty","html:reports/cucumber.html"}) // pretty=it is used to print statements present in feature file like given,then  //html:reports/cucumber.html=its used to generate reports
public class Runner  extends AbstractTestNGCucumberTests {

}

