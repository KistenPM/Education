import java.util.Scanner;

public class Paintree {
    public static void main(String[] args) {

        System.out.println("Hello there, unknown user.");
        System.out.print("Enter the number of branches:");

        Scanner in = new Scanner(System.in);

        int branches = in.nextInt();

        for (int p = 1; p < branches; p++) {
            System.out.println("-");
            for (int i = 1; i < branches-p; i++) {
                System.out.print(" ");
            }
            for (int n = 1; n < p*2; n++) {
                System.out.print("*");
            }
        }
        System.out.println("-");
        for (int k = 1; k < branches/2; k++) {
            System.out.print("  ");
        }
        System.out.print("|");
    }
}
