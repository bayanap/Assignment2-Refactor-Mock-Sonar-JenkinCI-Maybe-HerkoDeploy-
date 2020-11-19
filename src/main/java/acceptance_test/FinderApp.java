package acceptance_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressWarnings({ "static-access" })
public class FinderApp {

	private static List<Home> repository;
	static Map<String,String> feature_repository=new HashMap<String,String>();
  private static WebEmailService  emailservice;
	public static List<Home> pricelist;
	
	
//	public static WebEmailserver getEmailservice() {	return emailservice;}
	
	
	public  void setEmailservice(WebEmailService emailservice) {
		this.emailservice = emailservice;
	}



	public static List<Home> getRepository() {
		return repository;
	}


	public static WebEmailService getEmailservice() {
		return emailservice;
	}


	

	public static Map<String, String> getFeature_repository() {
		return feature_repository;
	}


	 

	public   void setFeature_repository(Map<String, String> feature_repository) {
		this.feature_repository = feature_repository;
		createRepoFromFeatRepo();
	}

	
	
	

	public FinderApp() {
		repository = new ArrayList<Home>();
	}


	static void createRepoFromFeatRepo() {
 		String currentKey;
		String currentvalue;
		Iterator it =feature_repository.entrySet().iterator();
		int id =0;
		int price,area,numofBedroom,numofBathrooms,leaselenth;
		while(it.hasNext()) {
			Map.Entry pair =(Map.Entry )it.next();
			currentvalue = (String) pair.getValue();
			String Aint[] =currentvalue.split("_");
			
			price =Integer.parseInt(Aint[0]);
			area =Integer.parseInt(Aint[1]);
			numofBedroom =Integer.parseInt(Aint[2]);
			numofBathrooms =Integer.parseInt(Aint[3]);
			leaselenth =Integer.parseInt(Aint[4]);

			currentKey = (String) pair.getKey() ;
			String ar[] =currentvalue.split("_");
			
			HomeType type =checkType(ar[0]);
			HomeMaterial material =checkMateriale(ar[1]);
			HomePlacement Placement =checkPlacement(ar[2]);
			HomePets Pets =checkPets(ar[3]);
			 
			String arrayofAmenities[] =ar[4].split(",");
			List<HomeAmenities> listofAmenities = new ArrayList<HomeAmenities> ();
			
			
			for(String amenity:arrayofAmenities) {
				HomeAmenities amen  = checkHomeAmenities(amenity);
				listofAmenities.add(amen);
			}
			
			repository.add(new Home(id, area,numofBedroom,
					numofBathrooms,leaselenth,material,Placement,Pets));
			
			id+=1;
			
			
			
		}
		printRepository();
	}


	
	
	private static   HomeMaterial checkMateriale(String material) {
 		if(material.equals(HomeMaterial.BRIKE.toString()))
			return HomeMaterial.BRIKE;
		else if (material.equals(HomeMaterial.STONE.toString()))
			return HomeMaterial.STONE;
		else if (material.equals(HomeMaterial.WOOD.toString()))
			return HomeMaterial.WOOD;
		else
		return null;
	}

	
	static HomeAmenities checkHomeAmenities(String amenity) {
 		if(amenity.equals(HomeAmenities.SWIMMINGBOOL.toString()))
			return HomeAmenities.SWIMMINGBOOL;
		else if(amenity.equals(HomeAmenities.AIRECONDITION.toString()))
			return HomeAmenities.AIRECONDITION;
		else	if(amenity.equals(HomeAmenities.BALANCY.toString()))
			return HomeAmenities.BALANCY;
		else	if(amenity.equals(HomeAmenities.ELEVATOR.toString()))
			return HomeAmenities.ELEVATOR;
		else	if(amenity.equals(HomeAmenities.FIREPLACE.toString()))
			return HomeAmenities.FIREPLACE;
		else	if(amenity.equals(HomeAmenities.GARAGPARKING.toString()))
			return HomeAmenities.GARAGPARKING;
		else	 
		return null;
	}
	
	
	
	
	
	static HomePets checkPets(String pets) {
 		if(pets.equals(HomePets.YES.toString()))
			return HomePets.YES;
		else if(pets.equals(HomePets.NO.toString()))
			return HomePets.NO;
		else return null;
 		
 		
			}
	
	
	
	static void printRepository() {
 		for(Home h :repository) {
			System.out.println(h);
		}
	}

   public List<Home> ByType(String Spec)	{
	   List<Home> FoundEstates = new ArrayList<Home>();
	   Iterator<Home> it =repository.iterator();
	   while(it.hasNext()) {
		   Home estate = it.next();
		   if(estate.getType().equals(checkType(Spec)))
			   FoundEstates.add(estate);
	   }
	return FoundEstates;
	   
   }


	
	/*
	 * public List<Home> FindByPlacement(String string) { List<Home>
	 * matchedhomes=new ArrayList<Home>(); for(int i=0;i<homes.size();i++) {
	 * if(homes.get(i).getPlacement().toString().equalsIgnoreCase(string)) {
	 * matchedhomes.add(homes.get(i)); } } return matchedhomes; }
	 */
	static   HomePlacement checkPlacement(String Place) {
 		if(Place.equals(HomePlacement.CITY))
			return HomePlacement.CITY;
		else if(Place.equals(HomePlacement.VELLAGE))
			return HomePlacement.VELLAGE;
		return null;
	}


	

	private static   HomeType checkType(String Type) {
		if(Type.equals(HomeType.APARTMENT.toString()))
			return HomeType.APARTMENT;
		else if(Type.equals(HomeType.HOUSE.toString()))
			return HomeType.HOUSE;
 		return null;
	}

 	  
   public List<Home>ByPlacment(String Spec){
	return null;
	   
   }
	
   
   public List<Home>ByPricet(Integer Price){
	   List<Home> FoundEstates = new ArrayList<Home>();
	   Iterator<Home> it =repository.iterator();
	   while(it.hasNext()) {
		   Home estate = it.next();
		   if(estate.getPrice()<Price)
			   
			   FoundEstates.add(estate);
	
	   
   }
	pricelist =  FoundEstates;
	emailservice.sendEmail("tharaaabuhamed49@gmail.com",  FoundEstates);
	emailservice.sendEmail("tharaaqil@gmail.com",  FoundEstates);
	
	   return FoundEstates;
   }



public List<Home> ByMaterialt(String specif) {
 	return null;
}




public List<Home> findNumBathrooms(int Numberofbathrooms) {
	List<Home> feature_repository=new ArrayList<Home>();
	for(int i=0;i<repository.size();i++) {
		if(repository.get(i).getNM_OF_BathRooms()==Numberofbathrooms) {
			feature_repository.add(repository.get(i));
		}
	}
	return feature_repository;
}


public List<Home> findNumBedrooms(int Numberofbedrooms) {
	List<Home> feature_repository=new ArrayList<Home>();
	for(int i=0;i<repository.size();i++) {
		if(repository.get(i).getNM_OF_BedRooms()==Numberofbedrooms) {
			feature_repository.add(repository.get(i));
		}
	}
	return feature_repository;
}




public List<Home> ByRangeOfAreas(int range1,int range2) {
	List<Home> feature_repository=new ArrayList<Home>();

	for(int i=0;i<repository.size();i++) {
		if(repository.get(i).getArea()<range2 && repository.get(i).getArea()>range1) {
			feature_repository.add(repository.get(i));
		}
	}
	return feature_repository;
}




public List<Home> FindByLeaseLength(int LeaseLength) {
	List<Home> feature_repository=new ArrayList<Home>();
	for(int i=0;i<repository.size();i++) {
		if(repository.get(i).getLease_Length()==LeaseLength) {
			feature_repository.add(repository.get(i));
		}
	}
	return feature_repository;
}





}


