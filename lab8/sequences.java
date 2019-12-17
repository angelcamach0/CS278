import java.util.Scanner;
public class sequences {


    public static void main(String args[]) {
        int a, b, c, M;
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a: ");
        a = scn.nextInt();
        System.out.print("Please enter b: ");
        b = scn.nextInt();
        System.out.print("Please enter c: ");
        c = scn.nextInt();
        System.out.print("Please enter M: ");
        M = scn.nextInt();
        System.out.println("You inputed: \na: " + a + " b: " + b + " c: " + c + " M :" + M);

        print1(a, b, c, M);

        System.out.print("\nSample run 1:");
        print1(22,1,0,72);
        floyed(22,1,0,72);

        System.out.print("\nSample run 2:");
        print1(123, 456, 789, 1000000);
        floyed(123,456, 789, 1000000);

        System.out.print("\nSample run 3:");
        print1(124, 456, 789, 1000000);
        floyed(124, 456, 789, 1000000);

        System.out.print("\nSample run 4:");
        print1(78, 60, 89, 129024);
        floyed(78, 60, 89, 129024);

    }

    public static void print1(int a, int b, int c, int M) {
        int x = c;
        int to = c + 100;
        int dontprintTill = 0;
        for (int i = c; i < to; i++) {

            if ((dontprintTill % 10) == 0) {
                System.out.println("");
            }
            System.out.print(x + " ");
            x = (a * x + b) % M;

            dontprintTill++;
        }
    }

    public static void floyed(int a, int b, int c, int M) {
        int x = c;
        int dx = 0;
        int howManytimes = M;

        for (int i = 0; i < M; i++) {
            if(( dx != x) && (i + 1 == M)) {
                x = (a * x + b) % M;
                dx = x;
                i = 0;
            }
            dx = (a * dx + b) % M;
            if(dx == x) {
                System.out.println("\nCycle length is: " + ++i );
                break;
            }
        }

    }


}
