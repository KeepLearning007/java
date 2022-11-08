package Dealership;

public class Address {
	
	private String Street;
	private String City;
	private String State;
	private String ZipCode;
	
	public Address() {
		
	}

	public Address(String street, String city, String state, String zipCode) {
		super();
		Street = street;
		City = city;
		State = state;
		ZipCode = zipCode;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	
	public void printAddress() {
		System.out.println("Street: " + Street + "City: "+"State: "+ State +"Zipcode"+ ZipCode);
	}
	
	
	
}
