package acceptance_test;

public  class  HomeAmenities {

 
		boolean AirConditioning, Balcony, Elevator, FirePlace, GarageParking,SwimmingPool;

		public boolean isAirConditioning() {
			return AirConditioning;
		}

		public void setAirConditioning(boolean airConditioning) {
			AirConditioning = airConditioning;
		}

		public boolean isBalcony() {
			return Balcony;
		}

		public void setBalcony(boolean balcony) {
			Balcony = balcony;
		}

		public boolean isElevator() {
			return Elevator;
		}

		public void setElevator(boolean elevator) {
			Elevator = elevator;
		}

		public boolean isFirePlace() {
			return FirePlace;
		}

		public void setFirePlace(boolean firePlace) {
			FirePlace = firePlace;
		}

		public boolean isGarageParking() {
			return GarageParking;
		}

		public void setGarageParking(boolean garageParking) {
			GarageParking = garageParking;
		}

		public boolean isSwimmingPool() {
			return SwimmingPool;
		}

		public void setSwimmingPool(boolean swimmingPool) {
			SwimmingPool = swimmingPool;
		}

		@Override
		public String toString() {
			return "HomeAmenities [AirConditioning=" + AirConditioning + ", Balcony=" + Balcony + ", Elevator=" + Elevator
					+ ", FirePlace=" + FirePlace + ", GarageParking=" + GarageParking + ", SwimmingPool=" + SwimmingPool
					+ "]";
		}
		
	}


