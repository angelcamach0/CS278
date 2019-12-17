//Angel Camacho
//CS 278
import java.util.*;
public class MasterMind {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int inputGuess=0;

        System.out.print("Please enter a 4 digit codes: ");
        int code =scnr.nextInt();
        System.out.print("Please enter a guess or 0 to stop: ");
        inputGuess =scnr.nextInt();
        while(inputGuess !=0){
            Response(code,inputGuess);
            System.out.print("Please enter a guess or 0 to stop: ");
            inputGuess = scnr.nextInt();
        }
        System.out.print("Bye");
    }

    public static void Response(int code, int guess) {
        int pointsPerPlace =0;

        // to turn my codes into a array so I can more facilitate comparison
        String myArray1 = Integer.toString(guess);
        String myArray2 = Integer.toString(code);
        int[] secondGuess = new int[myArray1.length()];
        int[] secondCode = new int [myArray1.length()];
        for ( int i = 0 ; i < myArray1.length(); i++ ) {
            secondGuess[i] = myArray1.charAt(i) - '0';
            secondCode[i] = myArray2.charAt(i)-'0';
        }
        // comparison perplace
        for( int i=0; i<myArray1.length() ; i++ ) {
            if(secondGuess[i]==secondCode[i]) {
                pointsPerPlace+=10;
                secondGuess[i]=0;
                secondCode[i]=0;
            }
        }

        // to fill in characters with values of zero for the next comparison.
        Arrays.sort(secondCode); Arrays.sort(secondGuess);
        for( int i=0; i < myArray1.length()-1; i++ ) {
            if(secondCode[i+1]==secondCode[i]) {
                secondCode[i+1]=0;
            }
            if(secondGuess[i+1]==secondGuess[i]) {
                secondGuess[i+1]=0;
            }
        }

        // codes comparison per place
        for(int i=0; i < myArray1.length(); i++) {
            for( int k=0; k < myArray2.length(); k++ ) {
                if( secondCode[i]==secondGuess[k] && secondCode[i]!=0 && secondGuess[k] !=0 ) {
                    pointsPerPlace++;
                }
            }
        }

        System.out.println(pointsPerPlace);
    }
}