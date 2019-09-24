//Angel Camacho
//CS 278
//Lab 3
//Quantified Statements
package lab3;
import java.util.Scanner;
public class quantifieStatements {
	
	static int[]mainArray = new int [10];
	
	
//	public static String All(int a[]) {
//		String temp = "is False";
//		
//		for(int i = 0; i < a.length; i++) {
//			
//		}
//		return temp;
//	}
	
	//conjunctive AND
	public static char conjunctive(char P, char Q) {
		char R;
		if(P== 'T' && Q == 'T') {
			R = 'T';
		}else {
			R = 'F';
		}
		return R;		
	}
	
	//All
	public static String All(char a[]) {
		String temp = "is False";
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			if( a[i] == 'T') {
				count ++;
			}
		}
		if(count == a.length) {
			return "Is True";
		}
		return temp;
	}
	
	
	//graterThanZero method for array
	public static []char graterThanZero(int a[]) {
		String returnVal = "True";
		bubbleSort(a);
		int howManyTrue = 0;
		int howManyFalse = 0;
		char caseTrue = 'T';
		
		//idea
		char []truthValOfArray = new char [10];
		
		//Quantifing number of truths and number of false's in array
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				//this will insert the truth value in the array.
				truthValOfArray[i] = 'T';
				howManyTrue++;
			}
			if(a[i]<0) {
				//this will insert the truthValue in the array
				truthValOfArray[i] = 'F';
				howManyFalse++;
			}
			
		}
		
//		//my return values
//		if(howManyTrue == a.length) {
//			return caseTrue;
//		}
		
		return truthValOfArray[];
	}
	
//	//this case is for ALL but im still not sure if it applys to others.
//	public static char graterThanZero(int a) {
//		String returnVal = "True";
//		int howManyTrue = 0;
//		int howManyFalse = 0;
//		char caseTrue = 'T';
//		
//		//Quantifing number of truths and number of false's in array
//			if(a > 0) {
//				howManyTrue++;
//			}
//			
//		//my return values
//			if(howManyTrue > 0) {
//				return caseTrue;
//			}
//			return 'F';
//	}
	
	
	public static char isItEven(int a[]) {
		bubbleSort(a);
		char caseTrue = 'T';
		
		int howManyTrue = 0;
		for(int i = 0; i < a.length; i++) {
			if((a[i] % 2) == 0) {
				howManyTrue++;
			}
		}
		if(howManyTrue == a.length) {
			return caseTrue;
		}
		return 'F';
	}
	
//	public static char isItEven(int a) {
//		char caseTrue = 'T';
//		int howManyTrue = 0;
//			if((a % 2) == 0) {
//				howManyTrue++;
//			}
//			if(howManyTrue > 0) {
//				return caseTrue;
//			}
//		return 'F';
//	}
	
	
	
	public static void bubbleSort(int a[]) {
		int length = a.length;
		int temp3 = 0;
		for(int k = 0; k < length; k++) {
			for(int l = 1; l < (length - k); l++) {
				if(a[l-1]>a[l]) {
					temp3 = a[l-1];
					a[l-1] = a[l];
					a[l] = temp3;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		//int []d = new int [10];
		Scanner scan = new Scanner(System.in);
		int counter = 9;
		
		System.out.println("Please input 10 integers. (With no repeated entries)");
		for(int i = 0; i < 10; i++) {
			mainArray[i] = scan.nextInt();
			if(counter > 0) {
				System.out.println("Please input another value.");
				counter--;
			}
		}

		System.out.println("This is your counter: "+counter);
		System.out.print("This is in your array: ");
		for(int p = 0; p < 10; p++) {
				System.out.print(mainArray[p] + " ");
		}
		System.out.println("");
		System.out.print("This is your sorted array: ");
		bubbleSort(mainArray);
		for(int p = 0; p < 10; p++) {
			System.out.print(mainArray[p] + " ");
		}
		
		System.out.println("");
		//System.out.println("Is it grater thatn zero?: "+ graterThanZero(mainArray));
		
		System.out.println("");
		//System.out.println("Is it even?: "+ isItEven(mainArray));
		
		
		//Statement a
		
		//Statement b
		
		//Statement c
		
		//Statement d
		
	}
	
	
	
	
}
