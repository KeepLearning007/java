import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = false;
		boolean b = true;
		System.out.print(isFactor(9,3));
		
		

	}
	
	
	public static boolean isFactor(int n, int k) {
		if (n%k==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isPerfect(int perfect) {
		int sum = 0;
		for (int i = 0; i < perfect; i++) {
			if (isFactor(perfect, i)) {
				sum = sum + i;
			}
		}
		if(sum == perfect) {
			return true;
		}else {
			return false;
		}
	}
}
