import java.util.Scanner;

public class SquareRooter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        float A = sc.nextFloat();
        display(A);
    }
    static void display(float A) {
        System.out.print(Math.sqrt(A));
        //Переделать без класса Math
    }
}