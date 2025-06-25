import java.util.Scanner;
public class Overloading {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
            System.out.println("Enter a 2 values of integer:");
            int intValue = input.nextInt();
            int intValue2 = input.nextInt();
            System.out.println(mod(intValue, intValue2));
            System.out.println("Enter a 2 values of float:");
            float floatValue = input.nextFloat();
            float floatValue2 = input.nextFloat();
            System.out.println(mod(floatValue, floatValue2));
            System.out.println("Enter a value: (int, float or string)");
            input.nextLine();
            if (input.hasNextInt()){
                int Int = input.nextInt();
                System.out.println(wut_is_this("You have typed integer: "+Int));
            }
            else if (input.hasNextFloat()){
                float Float = input.nextFloat();
                System.out.println(wut_is_this("You have typed float: "+Float));
            }
            else if (input.hasNext()){
                String String = input.nextLine();
                System.out.println(wut_is_this("You have typed string: "+String));
            }
            System.out.println("Type a number of factorial: ");
            if (input.hasNextInt()){
                int Int = input.nextInt();
                System.out.println(factorial(Int));
            }else if (input.hasNextFloat()){
                System.out.println("Reconsider");
                input.close();
            }
    }
    static int mod(int a, int b) {
        return a % b;
    }

    static float mod(float a, float b) {
        return a % b;
    }
    static int wut_is_this(int a){
        return a;
    }
    static float wut_is_this(float a){
        return a;
    }
    static String wut_is_this(String a){
        return a;
    }
    static int factorial(int c) {
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        return c * factorial(c - 1);
    }
}
