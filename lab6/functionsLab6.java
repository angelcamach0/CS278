//Angel Camacho
//CS278
//CSlab6
package lab6;
import java.util.Scanner;

public class functionsLab6 {
	

	public static void main(String [] args) {
	Scanner scn = new Scanner (System.in);

		int N;
		System.out.println ( " Please enter N: ");
		N = scn.nextInt();
		int counterFunc = 1, OneToOne = 0, BiJection = 0, OnToCounter = 0;
		
		for ( int z = 0; z <= N; z++) {
			for ( int y = 0; y <= N; y++) {
				for ( int x = 0; x <= N; x++) {
						System.out.print("f" + counterFunc + "(a)=" +  z + "\t " );
						System.out.print("f" + counterFunc + "(b)=" +  y + "\t " );
						System.out.print("f" + counterFunc + "(c)=" +  x + "\t " );
		
		//ONE TO ONE
		boolean injective = false; 
		if ((x == y)|| (z == y) || ( z == x ) ) {
			System.out.print("\nf" + counterFunc + " is not one to one ");
		}else {
			System.out.print("\nf" + counterFunc + "is a one-to-one ");
			injective = true; OneToOne++;
		}
		
		//ON TO
		boolean onto = false;
		if ( onto = false){ 
		System.out.print(", Is onto! ");
		OnToCounter++; onto = true;
		}else{
			System.out.print("Not onto! ");
		}
		//BIJECTION
			if( injective && onto){
				System.out.println("Bijective! ");
				BiJection++;
			}else{System.out.println("Not Bijective! " );}
			counterFunc++; System.out.println("");
			
			//     END OF FOR LOOPS
					}
				}
			}
		
		System.out.println(" There are " + counterFunc + " functions total");
		System.out.println(OneToOne + " of them are one-to-one");
		System.out.println(OnToCounter + " of them are onto");
		System.out.println(BiJection + " of them are bijections");
		}

}
