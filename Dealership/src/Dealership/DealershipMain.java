package Dealership;
import java.util.*;
public class DealershipMain {
boolean leap = false;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice =0;
		
		
		while(choice != 5) {
			try {
			choice = menu();
			switch(choice) {
			case 1:
				System.out.println("Enter your first name: ");
				String fName = input.nextLine();
				
				System.out.println("Please Enter you Last name: ");
				String lName = input.nextLine();
				
			    System.out.println("Please Enter your Phone Number as such : (XXX)-XXX-XXXX");
			    String phone = input.nextLine();
			    
			    System.out.println("Please Enter your email Address such as : test@test.com");
			    String email= input.nextLine();
			    
			    System.out.println("Enter your street name and number");
			    String street = input.nextLine();
			    
			    System.out.println("Enter your city : ");
			    String city = input.nextLine();
			    
			    System.out.println("Enter your state: ");
			    String state = input.nextLine();
			    
			    System.out.println("Enter your zipcode");
			    String zip = input.nextLine();
			    
			    System.out.println("Enter your account balanace: ");
			    double cash = input.nextDouble();
			    
			    System.out.println("Enter your credit card number : ");
			    String cardNumber = input.next();
			    
			    System.out.println("Enter your expiry date: ");
			    String expiry = input.next();
			    
			    System.out.println("Enter CVV number: ");
			    int cvv = input.nextInt();
			    
			   // Account cc1 = new Account();
			    //Address a1 = new Address();
			    Customer c1 = new Customer(fName, lName, phone,email);
			    c1.addAddress(street, city, state, zip);
			    c1.addAccount(cash, cardNumber, expiry, cvv);
			    Services s1 = new Services();
			    s1.addCustomer(c1);
			    s1.printDirectory();
			    
			    
				break;
			case 2:
				break;
			case 3:
				listing();
				break;
			case 4:
				break;
			case 5:
					System.out.println("Enter your 10th Grade GPA: ");
					double tenthgpa =  input.nextDouble();
					System.out.println("Enter your 11th Grade GPA: ");
					double eleventhgpa =  input.nextDouble();
					System.out.println("Enter your 12th Grade GPA: ");
					double twelthgpa =  input.nextDouble();
					//c1.addchoolRecord(tenthgpa, eleventhgpa, twelthgpa);
					 
					
				break;
			case 6:
				System.out.println("Thank You and Good bye");
				break;
			default:
				System.out.println("Enter a Numebr from 1 to 5");
			}
		} catch(InputMismatchException e) {
			System.out.println("Invalid input "+ e);
		} catch(Exception f) {
			System.out.println("Error here : " + f);
		}
		}
		
		//menu();
		//Truck t1 = new Truck();
		//t1.doorNumber = 4;
		
//		Address Add1 = new Address();
	
//	c2.toString();
//	
//	System.out.println(c2);
//		Truck t1 = new  Truck();
//		vehicle v1 = new vehicle();
//		Account a1 = new Account();
	
	}
	
	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("********Welcome To DealerShip********");
		System.out.println("Enter 1 to enter your information");
		System.out.println("Enter 2 to purchase a vehicle");
		System.out.println("Enter 3 to view a current list of vehicles");
		System.out.println("Enter 4 for vehicle services: ");
		System.out.println("Enter 5 to add school records: ");
		System.out.println("Enter 6 to exit");
		System.out.println("Please Enter a Number");
		int choice = input.nextInt();
		return choice;
	}
		public static boolean IsLeap(int year) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter year were born :");
//		int year = input.nextInt();
//		Boolean IsleapOrnot= IsLeap(year);
	//	
//		if(IsleapOrnot) {
//			System.out.println( "The year "+ year + " is Leap Year.");
//		}else {
//			System.out.println("The year " + year + "is not Leap year");
//		}
	//

		boolean leap= false;
		
		if( year%4 == 0 ) {
			if(year%100==0) {
				if(year%400==0) {
					leap = true;
				}
			}else {
				leap = true;
			}
		}else {
			leap = false;
		} return leap;
	} 
	
		public static void listing() {
		
			Car c1 = new Car("Mchilen", "HEMI", "Matte Black", 2023,"Dodge", "Challenger", "Holegyn", "Leather interior, Hermon karzen, Fully tinted nwindows", false, 2, false);
			
			c1.setAccessories("Surround sound, snow tires, back-up camera, 15% tint rear windows");
			System.out.print(c1);
			System.out.println("**************************************************************");
			Truck t1 = new Truck("FireStone", "Cummins Diesel","Slate Grey", 2023, "Dodge", "RAM", "LED", 
					"Simple Radio AM/FM", false, "Plastic liner", 4, true, true);
			System.out.println(t1);
			System.out.println("**************************************************************");
			Motorcycle m1 = new Motorcycle("Goodyear Classic Military", "883", "Harley Orange", 2018," Harley Davidson", "Sportster", "Standard",
					"After market exhaust, DVR recording,Alarm System", false, 2, false, true);
			System.out.println(m1);
		}
		
		
	

}
