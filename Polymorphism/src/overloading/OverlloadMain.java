package overloading;
import java.util.*;
public class OverlloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		double decimal = input.nextDouble();
//		int round = (int)Math.round(decimal);
		
	}
	
	
	
	//overloading : occurs during compile time 
	//when two or more methods in use the same Class have the same name
	// but different parameters
	
	public void process(int i, int j) {
		System.out.printf("Processing two integers:%d, %d", i, j);
	}
	private void process(int[] ints) {
		System.out.println("adding integer array " + Arrays.toString(ints));
	}
	public void process(Object[] objs) {
		System.out.println("Addubg integer array: " + Arrays.toString(objs));
		
	}

}
