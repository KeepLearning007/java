package Dealership;

public class Customer {
	
	private String firstname;
	private String lastname;
	private String PhoneNumber;
	private String email;
	private Address address;
	private Account account;
	private schoolRecord 	scoreGrade;
	
	
	
	public  Customer() {
		
	}

	public Customer(String firstname, String lastname, String phoneNumber, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.PhoneNumber = phoneNumber;
		this.email = email;
		
	}
	public void addAddress(String street, String city, String state, String zipCode) {
		Address tempAddress = new Address(street, city, state, zipCode);
		address = tempAddress;
	}
	
	public void addAccount(double cash, String creditCardNumber, String expirationDate, int ccv) {
		Account tempAccount = new Account(cash, creditCardNumber, expirationDate, ccv);
		account = tempAccount;
	}
	
	public void addchoolRecord(double tenthGPA, double eleventhGPA, double twelthGPA) {
		schoolRecord tempScore = new schoolRecord(tenthGPA, eleventhGPA, twelthGPA);
		scoreGrade = tempScore;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void printCustomer() {
		System.out.println("Firstname: "+ firstname + "Last name "+ lastname + " Phone Number "+ PhoneNumber+" EMail: "+ email);
		address.printAddress();
		account.printAccount();
		System.out.println("-------------------------------------------------");
	}
	
	
}
