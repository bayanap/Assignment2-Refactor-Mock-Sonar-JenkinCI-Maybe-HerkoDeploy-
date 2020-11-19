package acceptance_test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
 import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 public class SearchSteps {
	private FinderApp f;
	private List<Home> matchHomes;
	private List<Home> bymaterialList;
	private MockEmailHolder MokHolder;
	private static List<Home> byTypes;
 private String type,material ,Amenities,placement,area_S,area_1_S,area_2_S,bedrooms_S_number,bathrooms_S_number,leaselengthspec;
 private String Price_S,price_2_S,price_1_S;
	private List<Home> byPlacement;
	private List<Home> byPriceList;
	private String Specif;
	private int Price,price_2,price_1,area,area_1,area_2,bedrooms_number,bathrooms_number;
	private boolean allow_pets;
	private int leaselength;
		//depedencies
	public SearchSteps(FinderApp f,MockEmailHolder MokHolderin) {
		this.f = f;
		MokHolder=MokHolderin;
	}

	 
	
 	@Given("these homes are contained in the system")
	public void theseHomesAreContainedInTheSystem(Map<String,String> feature_repsitory) {
 		if(f.getFeature_repository().size() == 0) {
 			f.setFeature_repository(feature_repsitory);
 		}
	 
 	}

	@When("I search about home by {string}")
	public void iSearchAboutHomeBy(String Specif) {
 	    this.Specif =Specif;
 	    if(Specif.equals(HomeType.APARTMENT.toString()) ||Specif.equals(HomeType.HOUSE.toString())){
 	    	byTypes =f.ByType(Specif);
 	  /*  }else if(Specif.equals(HomeMaterial.STONE.toString())  || Specif.equals(HomeMaterial.WOOD.toString())
 	    		||Specif.equals(HomeMaterial.BRIKE.toString())){
 	    	bymaterialList =f.ByMaterialt(Specif);
 	    	
 	    }*/
	}}

	@Then("A list of homes that matches the  type specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		Iterator<Home> it = byTypes.iterator();
		if(Specif.equals(HomeType.APARTMENT.toString())) {
			assertEquals("Found 2 Apartments Home ",2 ,byTypes.size());
			while(it.hasNext()) {
				assertTrue(it.next().getType().APARTMENT.toString().equals(Specif));
			}
		}
		else if (Specif.equals(HomeType.HOUSE.toString())) {
			
			assertEquals("Found 1 house",1,byTypes.size());
			while(it.hasNext()) {
			assertTrue(it.next().getType().HOUSE.toString().equals(Specif));
		}
			
		}
 	}

	 
 
	
	@When("I search about home with price less than {int}")
	public void iSearchAboutHomeWithPriceLessThan(Integer Pricee) {
		
		Price=Pricee.intValue();
		byPriceList = f.ByPricet(Price);
 	}
	
	

	@Then("A list of homes that matches the price specification should be returned and printed on the console")
	public  void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		
		assertEquals("Found 2 Home",3,byPriceList.size());
		Iterator<Home> it = byPriceList.iterator();			 
			while(it.hasNext()) {
				Home h = it.next();
				assertTrue(h.getPrice()<Price);

			}
			
			}
				
 	 
	
	//*****
	
	  @When("I search about home by Materialt{string}") 
	  public void iSearchAboutHomeByMaterialt(String Specif) { 
		  this.material =Specif;
	  
	  if(Specif.equals(HomeMaterial.STONE.toString()) ||
	  Specif.equals(HomeMaterial.WOOD.toString())
	  ||Specif.equals(HomeMaterial.BRIKE.toString())) 
		 
		  bymaterialList =f.checkMateriale(Specif);
	  
	 
	}
	@Then("A list of homes that matches the material   specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		System.out.println("\n "+bymaterialList);
		Iterator<Home> it = bymaterialList.iterator();
		if(Specif.equals(HomeMaterial.WOOD.toString())) {
			assertEquals("Found 1 wood Home ",1 ,byTypes.size());
			while(it.hasNext()) {
				assertTrue(it.next().getMat().WOOD.toString().equals(Specif));
			}
		
		}
		else if (Specif.equals(HomeMaterial.STONE.toString())) 
		{
			assertEquals("Found 1 STONE Home ",1 ,bymaterialList.size());
			while(it.hasNext()) {
				assertTrue(it.next().getMat().STONE.toString().equals(Specif));
			}
		}   
		else  if (Specif.equals(HomeMaterial.BRIKE.toString())) 
		{
			assertEquals("Found 2 BRIKE Home ",2 ,bymaterialList.size());
			while(it.hasNext()) {
				assertTrue(it.next().getMat().BRIKE.toString().equals(Specif));
			}
		}   
		 
 	}
	//******
	
	@When("I search about home by {string} placement")
	public void iSearchAboutHomeByplacement(String string) {
		
 	    
		this.placement=string;
		if(string.equals(HomePlacement.VELLAGE.toString()) ||string.equals(HomePlacement.CITY.toString())){
			byPlacement=f.checkPlacement(string);
		
	
	    
	}
	@Then("A list of homes that matches the palcement speecification should be returnd and printed on the console")
	public void aListOfHomesThatMatchesThePalcementSpeecificationShouldBeReturndAndPrintedOnTheConsole() {

		System.out.println("\n "+byPlacement);
		Iterator<Home> it = byPlacement.iterator();
		if(Specif.equals(HomePlacement.CITY.toString())) {
			assertEquals("Found 1 City Home ",1 ,byPlacement.size());
			while(it.hasNext()) {
				assertTrue(it.next().getPlacment().CITY.toString().equals(Specif));
			}
		
		}
		

		else  if (Specif.equals(HomePlacement.VELLAGE.toString())) 
		{
			assertEquals("Found 2 BRIKE Home ",2 ,bymaterialList.size());
			while(it.hasNext()) {
				assertTrue(it.next().getPlacment().VELLAGE.toString().equals(Specif));
			}
		}  
	}
//******
	
	@When("I search about home with area less than {int}")
	public void iSearchAboutHomeWithAreaLessThan(Integer area) {
		this.area=area;

	}

	@Then("A list of homes that matches the area speecification should be returnd and printed on the console")
	public void aListOfHomesThatMatchesTheAreaSpeecificationShouldBeReturndAndPrintedOnTheConsole() {


	}
	@Then("email with the result should be send to user{string}")
	 public void emailWithTheResultShouldBeSendToUser1(String email_1,String email_2) {
		 verify(MokHolder.getEmailservise(),times(1)).sendEmail(email_1,FinderApp.pricelist);
		 verify(MokHolder.getEmailservise(),times(1)).sendEmail( email_2 ,FinderApp.pricelist);

	 }
	 	 
//********
	
	@When("I search about home with price between {int} and {int}")
	public void iSearchAboutHomeWithPriceBetweenAnd(Integer p1, Integer p2) {
		
		this.price_1=p1;
		this.price_2=p2;
		
 	}

	@Then("A list of homes that matches the price rang should be returned and printed on the console")
	public void aListOfHomesThatMatchesThePriceRangShouldBeReturnedAndPrintedOnTheConsole() {

		assertEquals("Found 2 Home",3,byPriceList.size());
		Iterator<Home> it = byPriceList.iterator();			 
			while(it.hasNext()) {
				Home h = it.next();
				assertTrue(h.getPrice()>price_1 && h.getPrice()<price_2);

			}
	}

		 @Then("email with the result should be send to user{string}")
	 public void emailWithTheResultShouldBeSendToUser(String email_1,String email_2) {
		 verify(MokHolder.getEmailservise(),times(1)).sendEmail(email_1,FinderApp.pricelist);
		 verify(MokHolder.getEmailservise(),times(1)).sendEmail( email_2 ,FinderApp.pricelist);

	 }

//****
		 
	@When("I search about home with area between {int} and {int}")
	public void iSearchAboutHomeWithAreaBetweenAnd(Integer int1, Integer int2) {
		area_1=int1;
		area_2=int2;
		matchHomes=f.ByRangeOfAreas(int1.intValue(),int2.intValue());	}

	@Then("A list of homes that matches the area rang should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheAreaRangShouldBeReturnedAndPrintedOnTheConsole() {
		for(int i=0;i<matchHomes.size();i++) {
			assertTrue(matchHomes.get(i).getArea()<area_2 &&  matchHomes.get(i).getArea()>area_1);
			
		}
		System.out.println("List of Homes that have area between \""+Integer.toString(area_1)+"\" and \""+Integer.toString(area_1)+"\" per meter square");
		f.printRepository();
		System.out.println("\n");
		}

	 //*********

	@When("I search about home with bedrooms number less than {int}")
	public void iSearchAboutHomeWithBedroomsNumberLessThan(Integer int1) {
		  this.bedrooms_number=int1;
	 	   matchHomes=f.findNumBathrooms(int1.intValue());
	}

	@Then("A list of homes that matches the bedrooms number specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheBedroomsNumberSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		for(int i=0;i<matchHomes.size();i++) {
			assertTrue(matchHomes.get(i).getNM_OF_BedRooms()==this.bedrooms_number);}
		System.out.println("List of Homes that have \""+Integer.toString(this.bedrooms_number)+"\" bedrooms_number");
		//
		f.printRepository();	}

	 //********

	@When("I search about home by {int} numberbathrooms ")
	public void iSearchAboutHomeByNumberBathrooms(Integer int1) {
 	    this.bathrooms_number=int1;
 	   matchHomes=f.findNumBathrooms(int1.intValue());
	}

	@Then("A list of homes that matches the bathrooms number specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheBathroomsNumberSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		for(int i=0;i<matchHomes.size();i++) {
			assertTrue(matchHomes.get(i).getNM_OF_BathRooms()==this.bathrooms_number);}
		System.out.println("List of Homes that have \""+Integer.toString(this.bathrooms_number)+"\" bathrooms_number");
		//
		f.printRepository();
	}

	 //*******

	@When("I search about homes with  allow pets")
	public void iSearchAboutHomesWithAllowPets(String string) {

		if(string.equals("YES")){
			this.allow_pets=true;
		}
		else {
			this.allow_pets=false;
		}
				}

	@Then("A list of home that matches the homes allow pets  should be retuerned and printed on the console")
	public void aListOfHomeThatMatchesTheHomesAllowPetsShouldBeRetuernedAndPrintedOnTheConsole() {

		for(int i=0;i<matchHomes.size();i++) {
			
		assertTrue(feature_repository.get(i).getPets()==allow_pets);
		}
		if(allow_pets) {
			System.out.println("List of Homes that allow pets");
			f.printRepository();
			

			System.out.println("\n");
		}
		else {
			System.out.println("List of Homes that dont allow pets");
			f.printRepository();
			System.out.println("\n");
		}	}

	 //**********
	

	
		
	
	@Then("A list of homes that matches the LeaseLength specification should be returned and printed on the console")
	public void aListOfHomesThatMatchesTheLeaseLengthSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
	    // Write code here that turns the phrase above into concrete actions
		
		for(int i=0;i<matchHomes.size();i++) {
			assertTrue(matchHomes.get(i).getLease_Length()==this.leaselength);}
		
		System.out.println("List of Homes that have lease length of \""+Integer.toString(this.leaselength)+"\" months");
		f.printRepository();
		System.out.println("\n");
	}

	@When("I search about home by {int} Lease")
	public void iSearchAboutHomeByLease(Integer int1) {
		this.leaselength=int1;
		matchHomes=f.FindByLeaseLength(int1.intValue());
	}

		
		
		
	

	@Then("A list of homes that matches the {int}  speecification should be returnd and printed on the console")
	public void aListOfHomesThatMatchesTheMonthsSpeecificationShouldBeReturndAndPrintedOnTheConsole(Integer int1) {
 	    throw new io.cucumber.java.PendingException();
	}
 
//**********
	/*
	 * @When("I search about home by long term") public void
	 * iSearchAboutHomeByLongTerm() { throw new io.cucumber.java.PendingException();
	 * }
	 * 
	 * @Then("A list of homes that matches the year speecification should be returnd and printed on the console"
	 * ) public void
	 * aListOfHomesThatMatchesTheYearSpeecificationShouldBeReturndAndPrintedOnTheConsole
	 * () { throw new io.cucumber.java.PendingException(); }
	 */
	
	
	
	///***
	@When("I search about home  by {string}  Amenities")
	public void iSearchAboutHomeByAmenities(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    this.Amenities=string;
	    matchHomes=f.checkHomeAmenities(string);
	}
	
	
	@Then("A list of homes that matches the Amenities specification   should be returnd and printed on the console")
	public void aListOfHomesThatMatchesTheAmenitiesSpecificationShouldBeReturndAndPrintedOnTheConsole {
		int found;
		for(int i=0;i<matchHomes.size();i++) {
			found=0;
			for(int j=0;j<matchHomes.get(i).getAmen().size();j++) {
if(matchHomes.get(i).getAmen().get(j).toString().equalsIgnoreCase(Amenities)) {
	found=1;
}

			}
			assertTrue(found==1);
			
	}
		System.out.println("List of Homes that have the amenity \""+Amenities+"\"");
		f.printRepository();
		System.out.println("\n");

	}
	
	
	
	
	
	
	 }

