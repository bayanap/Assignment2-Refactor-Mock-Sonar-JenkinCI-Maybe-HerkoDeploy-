package acceptance_test;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	private FinderApp f;
	private List<Home> bymaterialList;
	private List<Home> byTypes;
	private List<Home> byPlacement;
	private List<Home> byPriceList;
	private String Specif;
	private int Price;
	
	public SearchSteps(FinderApp f) {
		this.f =f;
	}
	
 	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(Map<String,String> feature_repsitory) {
 		 
	 
 	}

	@When("I search about home by {string}")
	public void iSearchAboutHomeBy(String string) {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the  type specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 
 

	@Then("A list of homes that matches the material   specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	 

	@Then("A list of homes that matches the palcement speecification should be returnd and printed on the console")
	public void aListOfHomesThatMatchesThePalcementSpeecificationShouldBeReturndAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	@When("I search about home with price less than {int}")
	public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	@When("I search about home with price between {int} and {int}")
	public void iSearchAboutHomeWithPriceBetweenAnd(Integer int1, Integer int2) {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the price rang should be returned and printed on the console")
	public void aListOfHomesThatMatchesThePriceRangShouldBeReturnedAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	@When("I search about home with area less than {int}")
	public void iSearchAboutHomeWithAreaLessThan(Integer int1) {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the area speecification should be returnd and printed on the console")
	public void aListOfHomesThatMatchesTheAreaSpeecificationShouldBeReturndAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	@When("I search about home with area between {int} and {int}")
	public void iSearchAboutHomeWithAreaBetweenAnd(Integer int1, Integer int2) {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the area rang should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheAreaRangShouldBeReturnedAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	@When("I search about home with bedrooms number less than {int}")
	public void iSearchAboutHomeWithBedroomsNumberLessThan(Integer int1) {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the bedrooms number specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheBedroomsNumberSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	@When("I search about home with bathrooms number less than {int}")
	public void iSearchAboutHomeWithBathroomsNumberLessThan(Integer int1) {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the bathrooms number specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheBathroomsNumberSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	@When("I search about homes with  allow pets")
	public void iSearchAboutHomesWithAllowPets() {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of home that matches the homes allow pets  should be retuerned and printed on the console")
	public void aListOfHomeThatMatchesTheHomesAllowPetsShouldBeRetuernedAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 

	@When("I search about home by short term")
	public void iSearchAboutHomeByShortTerm() {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the {int} months speecification should be returnd and printed on the console")
	public void aListOfHomesThatMatchesTheMonthsSpeecificationShouldBeReturndAndPrintedOnTheConsole(Integer int1) {
 	    throw new io.cucumber.java.PendingException();
	}
 

	@When("I search about home by long term")
	public void iSearchAboutHomeByLongTerm() {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of homes that matches the year speecification should be returnd and printed on the console")
	public void aListOfHomesThatMatchesTheYearSpeecificationShouldBeReturndAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}

	 
	@When("I search about home  AirConditioning")
	public void iSearchAboutHomeAirConditioning() {
 	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of yes about Amenities exixtance should be returnd and printed on the console")
	public void aListOfYesAboutAmenitiesExixtanceShouldBeReturndAndPrintedOnTheConsole() {
 	    throw new io.cucumber.java.PendingException();
	}
 

	@When("I search about home  Balcony")
	public void iSearchAboutHomeBalcony() {
 	    throw new io.cucumber.java.PendingException();
 
	}
	 

	@When("I search about home  Elevator")
	public void iSearchAboutHomeElevator() {
 	    throw new io.cucumber.java.PendingException();
	}

 

 

	@When("I search about home  FirePlace")
	public void iSearchAboutHomeFirePlace() {
 	    throw new io.cucumber.java.PendingException();
	}
 

 

	@When("I search about home  SwimmingPool")
	public void iSearchAboutHomeSwimmingPool() {
 	    throw new io.cucumber.java.PendingException();
	}

	 


	 }

