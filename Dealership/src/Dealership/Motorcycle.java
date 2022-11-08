package Dealership;

public class Motorcycle extends vehicle implements Rates{
	private int numberOfWheels;
	private boolean sideCar;
	private boolean helmet;
	
	public Motorcycle() {
		
	}
	public Motorcycle(int numberOfWheels, boolean sideCar, boolean helmet) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.sideCar = sideCar;
		this.helmet = helmet;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public boolean getSideCar() {
		return sideCar;
	}
	public void setSideCar(boolean sideCar) {
		this.sideCar = sideCar;
	}
	public boolean getHelmet() {
		return helmet;
	}
	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n# of wheel: " + numberOfWheels + "\nsideCar: " + sideCar + "\nhelmet?:" + helmet;
				
	}
	public Motorcycle(String tires, String engine, String color, int year, String make, String model, String lights,
			String accessories, boolean electric, int numberOfWheels, boolean sideCar, boolean helmet) {
		super(tires, engine, color, year, make, model, lights, accessories, electric);
		// TODO Auto-generated constructor stub
		this.numberOfWheels = numberOfWheels;
		this.sideCar = sideCar;
		this.helmet = helmet;
	}
	@Override
	public double salesTax() {
		// TODO Auto-generated method stub
		return 0.14;
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
