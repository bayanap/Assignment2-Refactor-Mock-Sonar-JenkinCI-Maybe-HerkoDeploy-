package acceptance_test;
 

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Use_Cases",
  plugin = {"html: target/cucumber/wikipedia.html"},
  monochrome = true,
  snippets = SnippetType.CAMELCASE,
  glue = {"AcceptanceTest"},
  strict = true 
  )
 
public class AcceptanceTest {

}
