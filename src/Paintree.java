import java.util.Scanner;

public class Paintree {
    public static void main(String[] args) {

        System.out.println("Hello there, unknown user.");
        System.out.print("Enter the number of branches: ");

        Scanner in = new Scanner(System.in);

        int branches = in.nextInt();

        for (int p = 2; p <= branches; p++) {
            System.out.print(" ");
        }
        for (int i = 1; i < branches; i++) {
            System.out.println("-");
            for (int n = 1; n < branches-i; n++) {
                System.out.print(" ");
            }
            System.out.print("-");
            for (int k = 1; k < i*2; k++) {
                System.out.print("*");
            }
        }
        System.out.println("-");
        for (int y = 1; y < branches/2; y++) {
            System.out.print("  ");
        }
        if (branches % 2 == 0) {
            System.out.print(" ||");
        }
        else {
            System.out.print("  ||");
        }
    }
}
