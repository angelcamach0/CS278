//Angel Camacho
//CS 278
//Lab 3
//Quantified Statements
import java.util.Scanner;
public class quantifieStatements {
		
	//Was not able to compute the last statement but everything else should work fine. 
	
	//implicative ->
	public static char implicative(char P, char Q) {
		char R = 'F';
		if(P == 'F') {
			return 'T';
		}
		if(P == 'T' && Q == 'F') {
			return 'F';
		}
		if(P == 'T' && Q == 'T'){
			return 'T';
		}
		return R;
	}
	
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
	
	public static String All(char a) {
		if(a == 'F') {
			return "is False.";
		}else {
		return "is True.";
		}
	}
	
	
	public static String Either(char a) {
		if(a == 'T') {
			return "is True.";
		}
		return "is False.";
	}
	
	//this case is for ALL but im still not sure if it applys to others.
	public static char graterThanZeroAll(int a[]) {
		int howManyTrue = 0;
		
		//Quantifing number of truths and number of false's in array
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				return 'F';
			}
			if(a[i] > 0) {
				howManyTrue++;
			}
		}
		
		//my return values
		if(howManyTrue == a.length) {
			return 'T';
		}
		return 'F';
	}
	
	//this case is for ALL but im still not sure if it applys to others.
	public static char graterThanZeroEither(int a[]) {
		
		int howManyFalse = 0;
		
		///Quantifing number of truths and number of false's in array
		for(int i = 0; i < a.length; i++) {
			if(a[i] > 0) {
				return 'T';
			}
			if(a[i] < 0) {
				howManyFalse++;
			}
		}
		
		//my return values
		if(howManyFalse == a.length) {
			return 'F';
		}
		return 'T';
	}
	
	public static char isItEvenAll(int a[]) {
		int howManyTrue = 0;
		
		for(int i = 0; i < a.length; i++) {
			if((a[i] % 2) == 0) {
				howManyTrue++;
			}
		}// end of for
		
		//my return values
		if(howManyTrue == a.length) {
			return 'T';		
		}else{			
		return 'F';
		}
		
	}
	
	public static char isItEvenEither(int a[]) {
		
		char returnVal = 'F';
		//int counter = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0) {
				returnVal = 'T';
				return 'T';
			}
		}// end of far
		
		return returnVal;
	}
	
//	//this case is for ALL but im still not sure if it applys to others.
//	public static char graterThanZeroAll(int a) {
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
	

	
//	public static char isItEvenEither(int a) {
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
	
	
	
//	public static void bubbleSort(int a[]) {
//		int length = a.length;
//		int temp3 = 0;
//		for(int k = 0; k < length; k++) {
//			for(int l = 1; l < (length - k); l++) {
//				if(a[l-1]>a[l]) {
//					temp3 = a[l-1];
//					a[l-1] = a[l];
//					a[l] = temp3;
//				}
//			}
//		}
//	}
	
	
	public static void main(String[] args) {
		
		int []d = new int [10];
		Scanner scan = new Scanner(System.in);
		int counter = 9;
		
		System.out.println("Please input 10 integers. (With no repeated entries)");
		for(int i = 0; i < 10; i++) {
			d[i] = scan.nextInt();
			if(counter > 0) {
				System.out.println("Please input another value.");
				counter--;
			}
		}
		scan.close();
		
//		System.out.println("This is your counter: "+counter);
//		System.out.print("This is in your array: ");
//		for(int p = 0; p < 10; p++) {
//				System.out.print(d[p] + " ");
//		}
////		System.out.println("");
////		System.out.print("This is your sorted array: ");
////		bubbleSort(mainArray);
////		for(int p = 0; p < 10; p++) {
////			System.out.print(mainArray[p] + " ");
////		}
//		
//		System.out.println("");
//		System.out.println("Testing graterThanZeroAll: " + graterThanZeroAll(d));
//		System.out.println("Testing graterThanZeroEither: " + graterThanZeroEither(d));
//		System.out.println("Testing isItEvenAll: " + isItEvenAll(d));
//		System.out.println("Testing isItEvenEither: " + isItEvenEither(d));
//		//System.out.println("Is it grater thatn zero?: "+ graterThanZero(mainArray));
//		
//		System.out.println("Array length: " + d.length);
//		//System.out.println("Is it even?: "+ isItEven(mainArray));
			
		//Statement a
		System.out.println("A)"+All(implicative(graterThanZeroAll(d),isItEvenEither(d))));
		//Statement b
		System.out.println("B)"+Either(implicative(graterThanZeroEither(d),isItEvenEither(d))));
		//Statement c
		System.out.println("C)"+Either(conjunctive(graterThanZeroAll(d),isItEvenEither(d))));
		//Statement d
		System.out.println("D)"+All(implicative(graterThanZeroAll(d),graterThanZeroAll(d))));

	}
	
	
	
	
}