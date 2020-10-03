Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR       |230_120_4_2_12|
  @byType              
Scenario: Search home by type
  When I search about home by "HOUSE"
  Then A list of homes that matches the  type specification should be returned and printed on the console
  
 @bymaterial
Scenario: Search home by material
When i search about home by "WOOD"
Then A list of homes that matches the material   specification should be returned and printed on the console 


    @byPlacment   
   Scenario: Search home by placement 
   When I search about home by "CITY" 
   Then A list of homes that matches the palcement speecification should be returnd and printed on the console




    @byprice                 
   Scenario: Search about home with less than a specific price
    When I search about home with price less than 400
    Then A list of homes that matches the price specification should be returned and printed on the console    
    
      @byPriceRangee
  Scenario: Search about home with a price rang
  When  I search about home with price between 300 and 400 
   Then A list of homes that matches the price rang should be returned and printed on the console
   
   
   
 
 @byArea
  Scenario: search about home with less than a specific area 
 When I search about home with area less than 200
 Then  A list of homes that matches the area speecification should be returnd and printed on the console
 
   @byAreaRangee
   Scenario: Search about home with a area rang
  When  I search about home with area between 150 and 200 
   Then A list of homes that matches the area rang should be returned and printed on the console 

 

@byNumberOfbedrooms
Scenario: Search about home with less than a specific number of bedrooms 
    When I search about home with bedrooms number less than 5
    Then A list of homes that matches the bedrooms number specification should be returned and printed on the console 
   

    @byBathRoosNum
    Scenario: Search about home with less than a specific number of bathrooms 
    When I search about home with bathrooms number less than 3
    Then A list of homes that matches the bathrooms number specification should be returned and printed on the console 

    @byPets
     Scenario: Search about homes pets
     When I search about homes with  allow pets    
     Then A list of home that matches the homes allow pets  should be retuerned and printed on the console 
   
     

   @byLease
   Scenario Outline: Search home by  lease length 
   When I search about home by <lease>
   Then A list of homes that matches the <length> speecification should be returnd and printed on the console
   
   Examples:
   |lease  |length| 
   |short term|6 months|
   |long term|year|
   
     @byAmenities
     Scenario Outline: Search home by Amenities
   When I search about home  <Amenities>
   Then A list of <result> about Amenities exixtance should be returnd and printed on the console
   
  Examples:
  |Amenities            |result|
  |AirConditioning|        yes    |
  |Balcony|                  yes  |
  |Elevator|                 no   |
  |FirePlace|               no    | 
  |Swimming Pool|           no    | 
   
   



    
             