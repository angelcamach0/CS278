import java.util.Scanner;

public class MasterMindLab11 {
    public static void main(String[] args) {
        solver();
    }

    public static void solver() throws IndexOutOfBoundsException {

        String num = "";
        Scanner scan = new Scanner(System.in);

        int[] possNums = new int[1296];
        boolean[] possibilities = new boolean[1296];
        int i = 0;

        for (int first = 1; first <= 6; first++) {
            for (int second = 1; second <= 6; second++) {
                for (int third = 1; third <= 6; third++) {
                    for (int last = 1; last <= 6; last++) {
                        num = "" + first + second + third + last;
                        possNums[i] = Integer.parseInt(num);
                        i++;
                    }
                }
            }
        }

        for (int j = 0; j < 1296; j++)             // come back to this
            possibilities[j] = true;

        System.out.println("Please think of a 4 digit code and let me guess it.");
        int responce;
        int lastGuess = 1111;
        int currentGuess = 0;
        int possibleCount = 0;
        int nextPossibleIndex = 0;
        System.out.println("There are 1296 possible sequences. I am guessing 1111");
        System.out.println("Please enter your response: ");

        responce = scan.nextInt();

        if (responce == 0) {
            currentGuess = 2222;
        } else if (responce == 10) {
            currentGuess = 1222;
        } else if (responce == 20) {
            currentGuess = 1122;
        } else if (responce == 30){
            currentGuess = 1112;
        }else {
            throw new IndexOutOfBoundsException("Invalid response");
        }
        //  while(responce != 40) {
        //            nextPossibleIndex = 0;
        //            possibleCount = 0;
        //            for(int m = 0; m < 1296; m++) {
        //                if(respondGuess(lastGuess, possNums[m]) != responce) {
        //                    possibilities[m] = false;
        //                }
        //            }

        responce = respondGuess(lastGuess, currentGuess);
        while(responce != 40) {
            nextPossibleIndex = 0;
            possibleCount = 0;
            for(int m = 0; m < 1296; m++) {
                if(respondGuess(lastGuess, possNums[m]) != responce) {
                    possibilities[m] = false;
                }
            }
            for(int n = 0; n < 1296; n++) {
                if(possibilities[n] == true) {
                    possibleCount++;
                }
            }
            while(possibilities[nextPossibleIndex] != true){
                nextPossibleIndex++;
                if(nextPossibleIndex == 1296) {
                    break;
                }
            }
            if(nextPossibleIndex == 1296) {
                System.out.println("0 posible sequences remain\nsuch sequence does not exist");
                break;
            }
            System.out.println(possibleCount + " posible sequences are remaining. I am guessing " + possNums[nextPossibleIndex]);
            System.out.println("Please enter your response: ");
            lastGuess = possNums[nextPossibleIndex];
            responce = scan.nextInt();

        }
    }


    //        int response = 0;
    //        String stringCode = Integer.toString(code);
    //        String stringGuess = Integer.toString(guess);
    //        int [] codeArray = new int[4]; int [] guessArray = new int[4];
    //
    //        for(int i = 0; i <=

    public static int respondGuess(int code, int guess) {

        int response = 0;
        String stringCode = Integer.toString(code);
        String stringGuess = Integer.toString(guess);
        int [] codeArray = new int[4]; int [] guessArray = new int[4];

        for(int i = 0; i <= 3; i++) { // swap
            codeArray[i] = stringCode.charAt(i);
            guessArray[i] = stringGuess.charAt(i);
        }

        for(int i = 0; i <= 3; i++) {
            if(codeArray[i] == guessArray[i]) {
                response += 10;
                codeArray[i] = -1;
                guessArray[i] = 0;
            }
        }

        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++) {
                if(codeArray[i] == guessArray[j]) {
                    response++;
                    codeArray[i] = -1;
                    guessArray[j] = 0;
                }
            }
        }
        return response;
    }


}
//

//
//
//      for(int i = 0; i <= 3; i++) {
//              for(int j = 0; j <= 3; j++) {
//              if(codeArray[i] == guessArray[j]) {
//              response++;
//              codeArray[i] = -1;
//              guessArray[j] = 0;
//              }