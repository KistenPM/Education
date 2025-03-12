import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the key word: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext("Start")) {
            System.out.println("Access approved");
        }
        else {
            System.out.println("Wrong key input");
        }
    }
}