import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

        if (a == 10) {
            System.out.println("a = 10");
        } else {
            System.out.println("a =/= 10");
        }
    }
}