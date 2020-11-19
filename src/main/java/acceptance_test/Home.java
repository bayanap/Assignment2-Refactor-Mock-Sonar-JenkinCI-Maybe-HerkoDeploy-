package acceptance_test;

import java.util.List;

public class Home {
	//public amenities HomeAmenitie {   Balcony,Elevator,FirePlace,SwimmingPool,GraragParking}

	private int id;
	private int price;
	private int area;
	private int NM_OF_BedRooms;
	private int NM_OF_BathRooms;
	private int Lease_Length;
	private HomePlacement placment;
	private HomeType type;
	private HomeMaterial mat;
	private HomePets pets;
	private List<HomeAmenities> amenities;
	
	
	public Home( 
			  int id,int price,
			  int area, int NM_OF_BedRooms,
			  int NM_OF_BathRooms,int Lease_Length,
			  HomePlacement placment, HomeType type,HomeMaterial mat,
			  HomePets pets, List<HomeAmenities> amenities)
			
			
	{
		
		super();
		this.id= id;
		this.price= price; this.area= area;  
     	this.NM_OF_BedRooms= NM_OF_BedRooms;
		this.NM_OF_BathRooms= NM_OF_BathRooms;
		this.Lease_Length= Lease_Length;
		this.placment= placment;
		this.type= type; 
        this.pets=pets;
		this.mat= mat;this.amenities= amenities;	
	}


	

	public Home(int id2, int area2, int numofBedroom, int numofBathrooms, int leaselenth, HomeMaterial material,
			HomePlacement placement, HomePets pets2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Home [id=" + id + ", price=" + price + ", area=" + area + ", NM_OF_BedRooms=" + NM_OF_BedRooms
				+ ", NM_OF_BathRooms=" + NM_OF_BathRooms + ", Lease_Length=" + Lease_Length + ", placment=" + placment
				+ ", type=" + type + ", mat=" + mat + ", pets=" + pets + ", amen=" + amenities + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public int getNM_OF_BedRooms() {
		return NM_OF_BedRooms;
	}


	public void setNM_OF_BedRooms(int nM_OF_BedRooms) {
		NM_OF_BedRooms = nM_OF_BedRooms;
	}


	public int getNM_OF_BathRooms() {
		return NM_OF_BathRooms;
	}


	public void setNM_OF_BathRooms(int nM_OF_BathRooms) {
		NM_OF_BathRooms = nM_OF_BathRooms;
	}


	public int getLease_Length() {
		return Lease_Length;
	}


	public void setLease_Length(int lease_Length) {
		Lease_Length = lease_Length;
	}


	public HomePlacement getPlacment() {
		return placment;
	}


	public void setPlacment(HomePlacement placment) {
		this.placment = placment;
	}


	public HomeType getType() {
		return type;
	}


	public void setType(HomeType type) {
		this.type = type;
	}


	public HomeMaterial getMat() {
		return mat;
	}


	public void setMat(HomeMaterial mat) {
		this.mat = mat;
	}


	public HomePets getPets() {
		return pets;
	}


	public void setPets(HomePets pets) {
		this.pets = pets;
	}


	public List<HomeAmenities> getAmen() {
		return amenities;
	}


	public void setAmen(List<HomeAmenities> amen) {
		this.amenities = amenities;
	}




	public int getLeaselength() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
}
