package Dealership;

public class Account {
	private double cash;
	private String creditCardNumber;
	private String ExpirationDate;
	private int ccv;
	
	public Account() {
		
	}
	public Account(double cash, String creditCardNumber, String expirationDate, int ccv) {
		super();
		this.cash = cash;
		this.creditCardNumber = creditCardNumber;
		ExpirationDate = expirationDate;
		this.ccv = ccv;
	}
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		if(cash>0) {
			this.cash = cash;
		}else {
			this.cash = 0;
		}
		
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getExpirationDate() {
		return ExpirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}
	public int getCcv() {
		return ccv;
	}
	public void setCcv(int ccv) {
		this.ccv = ccv;
	}	
	public void printAccount() {
		String maskNum = creditCardNumber.substring(12);
		System.out.println("Credit Card Ending in: XXXX-XXXX-XXXX-" + maskNum);
		
	}
	
}
