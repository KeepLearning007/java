package Dealership;

public class vehicle {
	private String tires;
	private String engine;
	private String color;
	private int year;
	private String make;
	private String model;
	private String lights;
	private String accessories;
	private boolean electric;
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Vehicle info:\nTires: " + tires + "\nEngine Type: " + engine + "\nColor" + color + "\nYear" + year + "\nMake"
				+ make + "\nModel" + model + "\nLights" + lights + "\nAccessories" + accessories + "\nElectric="
				+ electric;
	}
	public void drive() {
		
	}
	public void park() {
		
	}
	public void turn() {
		
	}
	public void speedUp() {
		
	}
	public void slowDown() {
		
	}
	public vehicle() {
		
	}
	public vehicle(String tires, String engine, String color, int year, String make, String model, String lights,
			String accessories, boolean electric) {
		super();
		this.tires = tires;
		this.engine = engine;
		this.color = color;
		this.year = year;
		this.make = make;
		this.model = model;
		this.lights = lights;
		this.accessories = accessories;
		this.electric = electric;
	}
	public String getTires() {
		return tires;
	}
	public void setTires(String tires) {
		this.tires = tires;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLights() {
		return lights;
	}
	public void setLights(String lights) {
		this.lights = lights;
	}
	public String getAccessories() {
		return accessories;
	}
	public void setAccessories(String accessories) {
		this.accessories = accessories;
	}
	public boolean isElectric() {
		return electric;
	}
	public void setElectric(boolean electric) {
		this.electric = electric;
	}
	
	
	
	
	
}

