//Angel Camacho
//CS 278
//Lab 2
//Logical Connectives, Tautologies, and Contradictions
public class propositions {

	//public static void main(String[] args) {
		
	
	//part 1
		//negation method ~
		public static char negation(char P) {
			char R;
			if ( P == 'T' ) {
				R = 'F';
			}else if(P == 'F') {
				R = 'T';
			}else {
				R = 'T';
			}
			return R;
		}
		
		//disjunctive OR
		public static char disjunctive(char P, char Q) {
			char R;

			if(P == 'F' && Q == 'F') {
				R = 'F';
			}else {
				R = 'T';
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
		//implicative ->
		public static char implicative(char P, char Q) {
			char R;
			if(P == 'F') {
				R = 'T';
			}else if((P == 'T' && Q == 'F')) {
				R = 'F';
			}else{
				R = 'T';
			}
			return R;
		}
		
		//Part 2
		public static void main(String args[]) {
		System.out.println("");
		System.out.println("All possible combinations for proposition 1");
		System.out.println("P Q R  Truth Value");
		System.out.println("-------------------");
		char P;
		char Q;
		char R;
		int propCounter = 0;
		int truthCounter =0;

		//proposition 1
		for(int Pline = 0; Pline < 2; Pline++) {
			for(int Qline = 0; Qline < 2; Qline++) {
				for(int Rline = 0; Rline < 2; Rline++) {
					
					if(Pline == 0) {
						P = 'T';
					}else {
						P = 'F';
					}
					if(Qline == 0) {
						Q = 'T';
					}else {
						Q = 'F';
					}
					if(Rline == 0) {
						R = 'T';
					}else {
						R = 'F';
					}
	
					System.out.println(P + " " + Q + " " + R + "      " + conjunctive((implicative(negation(P), Q)), (implicative(R,P))));
					if( conjunctive((implicative(negation(P), Q)), (implicative(R,P))) == 'T') {
						propCounter++;
					}
					truthCounter++;
				}
			}
		}
		if(propCounter==truthCounter) {
			System.out.print("Tutology!");
			System.out.println("");

		}else if(propCounter==0){
			System.out.print("Contradiction!");
			System.out.println("");

		}else {
			System.out.print("Neither!");
			System.out.println("");

		}

		//proposition 2
		propCounter = 0;
		truthCounter = 0;
		System.out.println("");
		System.out.println("All possible combinations for proposition 2");
		System.out.println("P Q R  Truth Value");
		System.out.println("-------------------");
		for(int Pline = 0; Pline < 2; Pline++) {
			for(int Qline = 0; Qline < 2; Qline++) {
				for(int Rline = 0; Rline < 2; Rline++) {
					
					if(Pline == 0) {
						P = 'T';
					}else {
						P = 'F';
					}
					if(Qline == 0) {
						Q = 'T';
					}else {
						Q = 'F';
					}
					if(Rline == 0) {
						R = 'T';
					}else {
						R = 'F';
					}
	
					System.out.println(P + " " + Q + " " + R + "      " + conjunctive(disjunctive(P,negation(Q)),disjunctive(R,negation(implicative(P,Q)))));
					if( conjunctive(disjunctive(P,negation(Q)),disjunctive(R,negation(implicative(P,Q)))) == 'T') {
						propCounter++;
					}
					truthCounter++;
				}
			}
		}
		if(propCounter==truthCounter) {
			System.out.print("Tutology!");
			System.out.println("");

		}else if(propCounter==0){
			System.out.print("Contradiction!");
			System.out.println("");

		}else {
			System.out.print("Neither!");
			System.out.println("");

		}
		
		//proposition 3
		propCounter = 0;
		truthCounter = 0;
		System.out.println("");
		System.out.println("All possible combinations for proposition 3");
		System.out.println("P Q    Truth Value");
		System.out.println("-------------------");
		for(int Pline = 0; Pline < 2; Pline++) {
			for(int Qline = 0; Qline < 2; Qline++) {
					
					if(Pline == 0) {
						P = 'T';
					}else {
						P = 'F';
					}
					if(Qline == 0) {
						Q = 'T';
					}else {
						Q = 'F';
					}

					System.out.println(P + " " + Q + " " + " " + "      " + implicative(P,implicative(negation(conjunctive(P,negation(Q))), conjunctive(P,Q))) );
					if( implicative(P,implicative(negation(conjunctive(P,negation(Q))), conjunctive(P,Q))) == 'T') {
						propCounter++;
					}
					truthCounter++;

			}
		}
		if(propCounter==truthCounter) {
			System.out.print("Tutology!");
			System.out.println("");

		}else if(propCounter==0){
			System.out.print("Contradiction!");
			System.out.println("");

		}else {
			System.out.print("Neither!");
			System.out.println("");

		}

		//proposition 4
		propCounter = 0;
		truthCounter = 0;
		System.out.println("");
		System.out.println("All possible combinations for proposition 4");
		System.out.println("P Q    Truth Value");
		System.out.println("-------------------");
		for(int Pline = 0; Pline < 2; Pline++) {
			for(int Qline = 0; Qline < 2; Qline++) {
				
					if(Pline == 0) {
						P = 'T';
					}else {
						P = 'F';
					}
					if(Qline == 0) {
						Q = 'T';
					}else {
						Q = 'F';
					}

					System.out.println(P + " " + Q + " " + " " + "      " + conjunctive(conjunctive(P,(implicative(P,Q))),negation(Q)) );
					if( conjunctive(conjunctive(P,(implicative(P,Q))),negation(Q)) == 'T') {
						propCounter++;
					}
					truthCounter++;
			}
		}
		if(propCounter==truthCounter) {
			System.out.print("Tutology!");
			System.out.println("");

		}else if(propCounter==0){
			System.out.print("Contradiction!");
			System.out.println("");

		}else {
			System.out.print("Neither!");
			System.out.println("");

		}

		
	
		
		}

		
		
		
		
		

}
