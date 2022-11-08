package Dealership;

public class schoolRecord extends Customer{
	double TenthGPA= 0;
	double eleventhGPA = 0;
	double twelthGPA = 0;
	public schoolRecord(double tenthGPA, double eleventhGPA, double twelthGPA) {
		super();
		TenthGPA = tenthGPA;
		this.eleventhGPA = eleventhGPA;
		this.twelthGPA = twelthGPA;
	}
	
	
	
	@Override
	public String toString() {
		return "schoolRecord [TenthGPA=" + TenthGPA + ", eleventhGPA=" + eleventhGPA + ", twelthGPA=" + twelthGPA + "]";
	}



	public double getTenthGPA() {
		return TenthGPA;
	}
	public void setTenthGPA(double tenthGPA) {
		TenthGPA = tenthGPA;
	}
	public double getEleventhGPA() {
		return eleventhGPA;
	}
	public void setEleventhGPA(double eleventhGPA) {
		this.eleventhGPA = eleventhGPA;
	}
	public double getTwelthGPA() {
		return twelthGPA;
	}
	public void setTwelthGPA(double twelthGPA) {
		this.twelthGPA = twelthGPA;
	}
	
}
