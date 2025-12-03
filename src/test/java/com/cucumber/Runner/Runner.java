package com.cucumber.Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"C:\\Workspace\\CucumberFramework\\Featurefiles\\UserMenu.feature"},
		glue= {"com.cucumber.Steps"},
		tags="@tc05",
		plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json"}
		
		)
public class Runner {

}
