
public class disproofCounterExample {
	
	public static boolean isItPrime(int x) {
		
		int input = x;
		///int truthValNum = 0;
		if(x < 0) {
			return false;
		}
		for(int i = 2; i < x; i++) {
			if(x % i == 0)  {
				return false;
			}
		}
		return true;
	}
	

	public static int canItBeTheSumm(int arrayOfSquares[]) {
		
		//check weather it can be written as the sum of two squares and a prime number

		int i = 0;
		for(int n = 3; n < 10000; n = n + 2) {
			if(isIt(n, arrayOfSquares)) {
				
			}else {
				return n;
			}
			

		}
		
		return 0;
	}
	
	public static boolean isIt(int i, int arrayOfSquares[]) {
		for(int k = 0; k < 100;k++) {
			
			if(isItPrime( i - arrayOfSquares[k])){
				return true;
			}
			
		}
		return false;
	}
	

	
	public static void main(String args[]) {
		int myArrayOfSquares[] = new int [100];
		//alocating values for the array
		for(int i = 0; i < 100; i++) {
			myArrayOfSquares[i] = 2*(i*i);
		}
		
		
//		for(int i = 1; i<100; i++) {
//			System.out.println("Number: "+ i + " is:  "+ isItPrime(i) );
//		}
	
		System.out.println("Smallest Counter Example: "+canItBeTheSumm(myArrayOfSquares));
		
		
		

	}
	
	
}
