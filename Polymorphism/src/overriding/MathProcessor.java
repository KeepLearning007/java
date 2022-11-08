package overriding;

public class MathProcessor extends Processor{
	@Override
	public void process(int i, int j) {
		System.out.println("Sum of intergers is " + (i +j));
	}
	
	public void process(int[]  ints) {
		int sum = 0;
		for (int i = 0; i <ints.length; i++) {
			sum += ints[i];
		}
		System.out.println("\nTotal of the array is "+sum);
	}
	
}
