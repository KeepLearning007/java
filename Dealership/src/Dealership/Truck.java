package Dealership;

public class Truck extends vehicle implements Rates{
	private String truckBed;
	private int doorNumber;
	private Boolean fourWheelDrive;
	private Boolean offRoadPackage;
	
	
	public Truck() {
		
	}
	public Truck(String truckBed, int doorNumber, Boolean fourWheelDrive, Boolean offRoadPackage) {
		super();
		this.truckBed = truckBed;
		this.doorNumber = doorNumber;
		this.fourWheelDrive = fourWheelDrive;
		this.offRoadPackage = offRoadPackage;
	}

	public String getTruckBed() {
		return truckBed;
	}
	public void setTruckBed(String truckBed) {
		this.truckBed = truckBed;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public Boolean getFourWheelDrive() {
		return fourWheelDrive;
	}
	public void setFourWheelDrive(Boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	public Boolean getOffRoadPackage() {
		return offRoadPackage;
	}
	public void setOffRoadPackage(Boolean offRoadPackage) {
		this.offRoadPackage = offRoadPackage;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTruck Bed Type" + truckBed + "\n# of Doors: " + doorNumber + "\nfourWheelDrive: " + fourWheelDrive + 
				"\noffRoadPackage?:"+ offRoadPackage;
				
	}
	public Truck(String tires, String engine, String color, int year, String make, String model, String lights,
			String accessories, boolean electric,String truckBed, int doorNumber, Boolean fourWheelDrive, Boolean offRoadPackage) {
		super(tires, engine, color, year, make, model, lights, accessories, electric);
		// TODO Auto-generated constructor stub
		this.truckBed = truckBed;
		this.doorNumber = doorNumber;
		this.fourWheelDrive = fourWheelDrive;
		this.offRoadPackage = offRoadPackage;
	}
	@Override
	public double salesTax() {
		// TODO Auto-generated method stub
		return 0.07;
	}
	@Override
	public double comission() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double dealerFee() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double processingFee() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double liabilityTax() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
