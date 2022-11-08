package Dealership;

public class Car extends vehicle implements Rates{
	private int doorNumber;
	private boolean convertable;
	
	
	public Car() {
		
		
	}


	public Car(int doorNumber, boolean convertable) {
		super();
		this.doorNumber = doorNumber;
		this.convertable = convertable;
	}


	@Override
	public String toString() {
		return super.toString() + "\n# of Doors: " + doorNumber + "\nConvertible?: " + convertable;
				
	}


	public Car(String tires, String engine, String color, int year, String make, String model, String lights,
			String accessories, boolean electric, int doorNumber, boolean convertable) {
		super(tires, engine, color, year, make, model, lights, accessories, electric);
		// TODO Auto-generated constructor stub
	}


	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public boolean isConvertable() {
		return convertable;
	}
	public void setConvertable(boolean convertable) {
		this.convertable = convertable;
	}


	@Override
	public double salesTax() {
		// TODO Auto-generated method stub
		return 0.025;
	}


	@Override
	public double comission() {
		// TODO Auto-generated method stub
		return ;
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
