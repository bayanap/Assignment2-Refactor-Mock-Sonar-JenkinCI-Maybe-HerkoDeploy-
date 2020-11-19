Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR                      |230_120_4_2_12|
                |HOUSE_BRICK_VILLAGE_NO_SwimmingBool               |185_140_3_3_7|
                |APARTMENT_BRICK_CITY_NO_FIREPLACE                     |200_220_4_4_6|
                |HOUSE_BRICK_CITY_YES_AirCondition                 |210_160_3_4_12|
                
                
  @byType              
Scenario Outline: Search home by type
  When I search about home by <type>
  Then A list of homes that matches the  type specification should be returned and printed on the console
  Examples:
  |type|
  |"HOUSE"|
  |"APARTMENT""|
  
  
  
  
 @bymaterial
Scenario Outline: Search home by material
When i search about home by <material>
Then A list of homes that matches the material   specification should be returned and printed on the console 
 Examples:
  |material|
  |"WOOD""|
  |"STONE""|
  |"BRIKE""|

    @byPlacment   
   Scenario Outline: Search home by placement 
   When I search about home by <placement>
   Then A list of homes that matches the palcement speecification should be returnd and printed on the console
 And email with the result should be send to user"tharaaabuhamed49@gmail.com";
Examples:
  |placement|
  |"CITY"|
  |"VILLAGE"|
   



    @byprice                 
  Scenario Outline: Search about home with less than a specific price
    When I search about home with <price> less than specific price
    Then A list of homes that matches the price specification should be returned and printed on the console    
     And email with the result should be send to user"tharaaabuhamed49@gmail.com";
    Examples:
  |price|
  | 500 |
  | 370 |
    
    
    
    
      @byPriceRangee
 Scenario Outline:: Search about home with a price rang
  When  I search about home with price between <price_1> and <price_2>
   Then A list of homes that matches the price rang should be returned and printed on the console
    And email with the result should be send to user"tharaaabuhamed49@gmail.com";
    Examples:
  |price_1|  |price_2|
  | 400 |  | 1000|
  | 200 |  |670|
  
  
   
   
 
 @byArea
  Scenario Outline: search about home with less than a specific area 
 When I search about home with <area> less than specific area 
 Then  A list of homes that matches the area speecification should be returnd and printed on the console
 And email with the result should be send to user"tharaaabuhamed49@gmail.com";
  Examples:
  |area|
  | 400 |
  | 650 |
 
 
 
   @byAreaRangee
 Scenario Outline: Search about home with a area rang
  When  I search about home with  area  between <area_1> and <area_2>
   Then A list of homes that matches the area rang should be returned and printed on the console 
   Examples:
 |area_1|  |area_2|
  | 400 |  | 500|
  | 200 |  |370|
 

@byNumberOfbedrooms
Scenario Outline: Search about home with less than a specific number of bedrooms 
    When I search about home with <bedrooms_number> less than specific number
    Then A list of homes that matches the bedrooms number specification should be returned and printed on the console 
   Examples:
  |bedrooms_number|
  | 3 |
  | 4 |

    @byBathRoosNum
    Scenario Outline: Search about home with less than a specific number of bathrooms 
    When I search about home with <bathrooms_number> less than pecific number
    Then A list of homes that matches the bathrooms number specification should be returned and printed on the console 
    Examples:
   |bathrooms_number|
   | 3 |
   | 2 |

    @byPets
     Scenario Outline: Search about homes pets
     When I search about homes with  <allow_pets>    
     Then A list of home that matches the homes allow pets  should be retuerned and printed on the console 
    Examples:
   |allow_pets|
   | "YES" |
   | "NO"|
   
      @byAmenities
     Scenario Outline: Search home by Amenities
   When I search about home  by <Amenities>
   Then A list of homes that matches the Amenities specification   should be returnd and printed on the console
   Examples:
   |Amenities|
   | "SwimmingBool" |
   | "AirCondition"|
   | "ELEVATOR"|
   | "FIREPLACE"|
   | "BALANCY"|
   | "GARAGPARKING"|
   
   

   @byLease
   Scenario Outline: Search home by  lease length 
   When I search about home by <lease>
   Then A list of homes that matches the  length  specification should be returnd and printed on the console
   
   Examples:
   |lease | 
      |6| 
       |12 | 
   
   
     @bymultiple
   Scenario Outline: Search home   by multiple specification
    When I search about home by  <multibiels>
    Then A list of homes that matches the multiples specification should be returnd and printed on the console

Examples:                       
    |type|  |material||placement||price|  |price_1|  |price_2|  |area|  |area_1|  |area_2| |bedrooms_number||bathrooms_number||allow_pets||Amenities|             |lease | 
    |"HOUSE"|  |"WOOD"|  |"CITY"|  | 500 || 400 |  | 1000|    | 400  || 400 |  | 500|   | 3 |             | 3 |                 | "YES" |  | "SwimmingBool" |       |6| 
   |"APARTMENT"|  |"STONE"|  |"VILLAGE"|| 370 |   | 200 |     |670|  | 650 | | 200 |    | 4 |               | 2 |              | "NO"|     | "AirCondition"|          |12 | 
                   |"BRIKE|                                                                                                               | "ELEVATOR"|
                                                                                                                                           | "FIREPLACE"|
                                                                                                                                             | "BALANCY"|
                                                                                                                                           | "GARAGPARKING"|
  
                            
 
         
      
      
 
   
  
  
   


                                  
  
  
  
  
 

 
 
  
  
 
    
             