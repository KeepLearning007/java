package ArrayP;
import java.util.*;
public class ArrayCl {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double[] newarr = new double[10];
		int[] arr = {2,4,6,8,9};
		String[] strarr = {"Name", "Fname", "Lname"};
		char[] chararr = {'a', 'e', 'i', 'o', 'u', 'y'};
		double[] dblarr = {2.5, 5.6, 89.9, 45.6, 98.1};
		int[] list = new int[100];
		//populateArray(list);
		//printArray(list);
//	printArraywhile(list);
	//	randomizeArray(list);	
	//	printArray(list);	
//		int money = 2000;
//		if (money%4 == 0) {
//			System.out.println("divisible by 4 ");
//			if (money%100==0) {
//				System.out.println(money + "divisible by 100");
//			}
//		}
//		
		
// method to sum all items in array
		
//		sortGreatestToLeast(list);
//		System.out.println();
//		printArray(list);
		
		double[] values = {20.3, 12.4, 66.5, 17.6, 9.7};
		//                {12.4, 66.5, 17.6, 9.7, 20.3}
	//	printArray(shiftRightArray(values));
		
		
		adddoubleToArray(values);
		
		
	}
	
	
	public static void printArray(double[] dblarr) {
		for (int i=0; i< dblarr.length; i++) {
			System.out.print(dblarr[i] + " | ");
		}
		
	}
	
	public static void printArray(String[] strarr) {
		for (int i=0; i< strarr.length; i++) {
			System.out.print(strarr[i] + " | ");
		}
	}
	
	public static void printArray(int[] intarr) {
		for (int i=0; i< intarr.length; i++) {
			System.out.print(intarr[i] + " | ");
		}
		
	}
	
	public static int[] populateArray(int[] strArr) {
		System.out.println("Enter "+ strArr.length + " values");
		for (int i=0; i < strArr.length; i++) {
			strArr[i] = input.nextInt();
		}
		return strArr;
	}
	
	public static void printArraywhile(int[] intArr) {
		int i = 0;
		while(i < intArr.length) {
			System.out.print(intArr[1]+" | ");
			i++;
		}
	}
	
	public static int[] randomizeArray(int[] intArr) {
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random()*100);
		}
		return intArr;
	}
	
	public static int sumArrayElements(int[] intArr) {
		int total = 0;
		for (int i = 0; i <intArr.length; i++) {
			total += intArr[i];
			// total = total + intArr[i];
		}
		return total;
	}
	
	public static int findMaxInt(int[] intArr) {
		int max = 0;
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i]>intArr[i]+1) {
				max = intArr[i];
			}else {
				max = intArr[i]+1;
			}
		}
		return max;
		//Bad method
	}
	
	public static int findmaxInt(int[] intArr) {
		int max = 0;
		for( int i =0; i < intArr.length; i++) {
			if(intArr[i] > max) {
				max = intArr[i];
			}
			continue;
		}
		return max;
	}

	public static int findminInt(int[] intArr) {
		int min = 0;
		for( int i =0; i < intArr.length; i++) {
			if(intArr[i] < min) {
				min = intArr[i];
			}
			continue;
		}
		return min;
	}

	public static double[] sortGreatestToLeast(double[] dblArr) {
		for(int i = 0; i < dblArr.length; i++) {
			System.out.println("Outer loop " + i + " values pointing at " + dblArr[i]);
			for(int j = 0; j <dblArr.length; j++) {
				System.out.println("Inner Loop "+ j + " values pointing at " + dblArr[i]);
				if(dblArr[i] > dblArr[j]) {
					double temp = dblArr[i];
					dblArr[i] = dblArr[j];
					dblArr[j] = temp;
				}
			}
		} 
		return dblArr;
	}

	public static int[] sortGreatestToLeast(int[] intArr) {
		for(int i = 0; i < intArr.length; i++) {
			for(int j=0; j<intArr.length; j++) {
				int temp=0;
				if(intArr[i] > intArr[j]) {
					temp = intArr[i];
					intArr[i]=intArr[j];
					intArr[j]=temp;
				}
			}
		} return intArr;
	}

	public static double[] shiftLeftArray(double[] dblArr) {
		double temp = dblArr[0];
		for(int i=1; i <dblArr.length; i++) {
			dblArr[i-1] = dblArr[i];
		}
		dblArr[dblArr.length-1] = temp;
		return dblArr;
	}
	
	public static double[] shiftRightArray(double[] dblArr) {
		double temp = dblArr[dblArr.length-1];
		for(int i = dblArr.length -2; i >= 0; i--) {
			dblArr[i+1] = dblArr[i];
		}  dblArr[0] = temp;
		return dblArr;
	}

	public static void printArrayforEach(double[] dblArr) {
		for(double u:dblArr) {
			System.out.print(u+ " |");
		}
	}

	public static void adddoubleToArray(double[] dblArr) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		double dblvalue = input.nextDouble();
		
		double[] tempArr = new double[dblArr.length+1];
		for(int i =0; i < dblArr.length;i++) {
			tempArr[i] = dblArr[i];
		} tempArr[tempArr.length - 1] = dblvalue;
		dblArr = tempArr;
		printArray(dblArr);
		
	}

}
