import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        int a = 10;

        if (a == 10) { //условие
            System.out.println("a = 10"); //то, что выполняется если условие верное
        }

        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        int b, c;
        b = intScanner.nextInt();
        String operator = stringScanner.nextLine();

        c = intScanner.nextInt();

        if (operator.equals("+")){
            System.out.println(b + c);
        }
        else if (operator.equals("-")){
            System.out.println(b - c);
        }
        else if (operator.equals("*")){
            System.out.println(b * c);
        }
        else if (operator.equals("/")){
            System.out.println(b / c);
        }
        else if (operator.equals("%")){
            System.out.println(b % c);
        }
        else{
            System.out.println("Вы ввели неверный знак вычисления");
        }
    }
}