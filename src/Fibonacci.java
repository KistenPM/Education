import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Enter the key word, to get access to Fibonacci reader: ");

        Scanner sc = new Scanner(System.in);

        if (sc.hasNext("Start") || sc.hasNext("start")) {
            System.out.println("Access approved");
            System.out.println();
            System.out.println("Loading program...");
            System.out.println();
        }

        else {
            System.out.println("Wrong key input!");
            System.out.println("Shutting down...");
            System.exit(0);
        }

        System.out.print("Enter the consecutive number: ");

        Scanner sc2 = new Scanner(System.in);

        int n, f, f1, f2;

        f = 0;
        f1 = 0;
        f2 = 1;

        n = sc2.nextInt();

        System.out.println();

        for (int x = 0; x < n; x++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        System.out.print("Fibonacci number " + n);
        System.out.println(" is " + f);
    }
}
//                                                                                                                      f1=0
//                                                                                                                      f2=1
//                                                                                                                      f = f1+f2 0+1=1
//                                                                                                                      f1=f2     f1=1
//                                                                                                                      f2=f      f2=1
//
//                                                                                                                      f=f1+f2   1+1=2
//                                                                                                                      f1=f2     f1=1
//                                                                                                                      f2=f      f2=2
//
//                                                                                                                      f=f1+f2   1+2=3
//                                                                                                                      f1=f2     f1=2
//                                                                                                                      f2=f      f2=3
//
//                                                                                                                      f=f1+f2   2+3=5
//                                                                                                                      f1=f2     f1=3
//                                                                                                                      f2=f      f2=5