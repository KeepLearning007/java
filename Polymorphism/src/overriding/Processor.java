package overriding;

import java.util.Arrays;

public class Processor {

	
	
	
	
	
	public void process(int i, int j) {
		System.out.printf("Processing two integers:%d, %d", i, j);
	}
	void process(int[] ints) {
		System.out.println("adding integer array " + Arrays.toString(ints));
	}
	public void process(Object[] objs) {
		System.out.println("Addubg integer array: " + Arrays.toString(objs));
		
	}
}
