import java.util.Arrays;
import java.util.Scanner;
public class Jaba {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome! You have launched the Jaba program.");
        //Вызываем функцию-список и делаем её вызов постоянным
        while (true) {
            listik();
        }
    }

    static void listik() {
        //Создаём массив-список типа String.
        System.out.println("\nWhat function do you want to start?");
        String[] Choices = {
                "1 - integer",
                "2 - evenger",
                "3 - evengerProgression",
                "4 - evengerIdentifier",
                "5 - evengerIdentifierReturn",
                "6 - Multiplier",
                "7 - WhichBetter",
                "8 - LVLetter",
                "9 - Massive",
                "10 - FibonacciMassive",
                "11 - HardMassive\n",
                "0 - Exit\n"
        };
        //Создаём цикл, выполняющий итерацию по массиву Choices.
        for (String choice : Choices) {
            System.out.println(choice);
        }
        //Создаём список оператором switch, для выбора функций.
        String choice = sc.nextLine();
        switch (choice) {
            case "1" -> integer();
            case "2" -> evenger();
            case "3" -> evengerProgression();
            case "4" -> evengerIdentifier();
            case "5" -> System.out.println(evengerIdentifierReturn());
            case "6" -> System.out.println("\nMultiplied number is:"+Multiplier());
            case "7" -> System.out.println("\n"+WhichBetter()+" is bigger.");
            case "8" -> System.out.println("\n"+LVLetter()+", Yori mo anata <3");
            case "9" -> System.out.println("\nHere comes the massive:"+ Arrays.toString(Massive()));
            case "10" -> System.out.println("\nHere comes the Fibonacci massive:"+ Arrays.toString(FibonacciMassive()));
            case "11" -> System.out.println("\nHere comes the HardMassive:\n"+ Arrays.toString(HardMassive()));
            case "0" -> {
                //Для предотвращения вечного цикла-вызова списка делаем остановку.
                System.out.println("\nExiting the program...");
                System.exit(0);
            }
            default -> System.out.println("\nInvalid choice! Select the provided function");
        }
    }

    static void integer() {
        System.out.print("\nEnter the number of integers:");
        int integers = sc.nextInt();
        sc.nextLine();
        System.out.println("\nList of integers:");
        //Создаём простой цикл последовательных чисел.
        for (int i = 0; i < integers; i++ ) {
            System.out.print(i);
            if (i < integers - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
        System.out.println("\nReturning back.");
    }

    static void evenger() {
        System.out.print("\nEnter the number of evengers:");
        int evengers = sc.nextInt();
        sc.nextLine();
        System.out.println("\nList of evengers:");
        int e = 0;
        //Создаём цикл последовательных натуральных чисел
        for (int i = 0; i < evengers; i++) {
            System.out.print(e);
            e = e + 2;
            if (i < evengers - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
        System.out.println("\nReturning back.");
    }

    static void evengerProgression() {
        System.out.print("\nEnter the number evenger progression:");
        int evengerProgression = sc.nextInt();
        sc.nextLine();
        System.out.println("\nList of evenger progression:");
        int e = 1;
        //Создаём цикл последовательных натуральных чётных чисел.
        for (int i = 0; i < evengerProgression; i++) {
            e = e * 2;
            System.out.print(e);
            if (i < evengerProgression - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
        System.out.println("\nReturning back.");
    }

    static void evengerIdentifier() {
        System.out.print("\nEnter an evenger identifier:");
        int i = sc.nextInt();
        sc.nextLine();
        //Создаём оператором условий определение чётности числа.
        if (i % 2 == 0) {
            System.out.println("\nThis number is evenger.");
        } else {
            System.out.println("\nThis number is not evenger.");
        }
    }

    static String evengerIdentifierReturn() {
        System.out.print("\nEnter an evenger identifier return: ");
        int i = sc.nextInt();
        String t;
        sc.nextLine();
        //Создаём оператором условий определение чётности числа.
        if (i % 2 == 0) {
            t=("\nThis number is evenger.");
        } else {
            t=("\nThis number is not evenger.");
        }return(t);
    }

    static float Multiplier() {
        System.out.println("""
                
                Number multiplier started.
                
                Follow the lead.
                """);
        System.out.print("Enter first number:");
        float a = sc.nextFloat();
        System.out.print("Enter second number:");
        float b = sc.nextFloat();
        System.out.print("Enter third number:");
        float c = sc.nextFloat();
        System.out.print("Enter fourth number:");
        float d = sc.nextFloat();
        System.out.print("Enter fifth number:");
        float e = sc.nextFloat();
        sc.nextLine();
        return(a * b * c * d * e);
    }

    static float WhichBetter() {
        System.out.println("""
                
                Number determiner started.
                
                Follow the lead.""");
        System.out.print("\nEnter the number 1:");
        float a = sc.nextFloat();
        System.out.print("\nEnter the number 2:");
        float b = sc.nextFloat();
        sc.nextLine();
        return Math.max(a, b);
    }

    static String LVLetter() {
        System.out.print("\nEnter the text to make it prettier:");
        String Text = sc.nextLine();
        return Text.formatted();
    }

    static int[] Massive() {
        System.out.print("\nWrite length of massive:");
        int i = sc.nextInt(), j;
        int[] numbers = new int[i];
        for (j = 0; j < i; j++) {
            numbers[j] = j;
        }
        sc.nextLine();
        return numbers;
    }

    static int[] FibonacciMassive(){
        System.out.print("\nWrite length of fibonacci massive:");
        int n=sc.nextInt(), f, f1=0, f2=1;
        int[] fibonacci = new int[n];
        for (int x =0; x < n; x++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            fibonacci[x] = f;
        }
        sc.nextLine();
        return fibonacci;
    }

    static boolean[] HardMassive(){
        System.out.print("\nEnter the number of massive:");
        int i = sc.nextInt(), l;
        int[] amount = new int[i];
        for (l = 0; l < i; l++) {
            amount[l] = l;
        }
        System.out.println("\n"+ Arrays.toString(amount));
        boolean[] filter = new boolean[amount.length];
        for (l = 0; l < amount.length; l++) {
            filter[l] = amount[l] % 2 == 0;
        }
        sc.nextLine();
        return filter;
    }
}
