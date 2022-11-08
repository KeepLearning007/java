package Dealership;

public class Services {
	// business logic - logic that communicate between user and program/database

	Customer[] person= new Customer[0];
	// add a customer to the array above
	public void addCustomer(Customer newCustomer) {
		// make an array 1 larger than the current
		Customer[] temp = new Customer[person.length+1];
		// add the people to original array to the temporary array
		for(int i=0; i <person.length; i++) {
			//populate temporary array with previous values from old array
			temp[i] = person[i];
		} 
		//add new customer to the temp array
		temp[temp.length -1] = newCustomer;
		// reset the original array to the temporary array
		person = temp;
	}
	public Customer[] getCustomer() {
		return person;
	}
	
	public void printDirectory() {
		for(int i =0; i < person.length; i++) {
			person[i].printCustomer();
		}
	}
	
}
