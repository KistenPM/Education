import java.util.Scanner;

public class recursive {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        System.out.println(factorial(a));
        int b = sc.nextInt();
        System.out.println(fibonachi(b));
    }
    static int factorial(int c){
        if (c == 0) {
        return 0;
        }
        if (c == 1) {
            return 1;
        }
        return c * factorial(c - 1);
    }
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}
