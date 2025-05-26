import java.util.Scanner;
public class Jaba {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome! You have launched the Jaba program.");
        while (true) {
            listik();
        }
    }

    static void listik() {
        System.out.println("\nWhat function do you want to start?");
        String[] Choices = {
                "1 - integer",
                "2 - evenger",
                "3 - evengerProgression",
                "4 - evengerIdentifier",
                "5 - evengerIdentifierReturn",
                "6 - Multiplier\n",
                "0 - Exit\n"
        };
        for (String choice : Choices) {
            System.out.println(choice);
        }

        String choice = sc.nextLine();
        switch (choice) {
            case "1" -> integer();
            case "2" -> evenger();
            case "3" -> evengerProgression();
            case "4" -> evengerIdentifier();
            case "5" -> System.out.println(evengerIdentifierReturn());
            case "6" -> System.out.println("\nMultiplied number is:"+Multiplier());
            case "0" -> {
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
        if (i % 2 == 0) {
            t=("\nThis number is evenger.");
        } else {
            t=("\nThis number is not evenger.");
        }return(t);
    }

    static float Multiplier() {
        System.out.println("\nEnter a five float numbers in line. Example:\"1, 2, 3, 4, 5\"");
        float a = sc.nextFloat(), b = sc.nextFloat(), c = sc.nextFloat(), d = sc.nextFloat(), e = sc.nextFloat();
        sc.nextLine();
        return(a * b * c * d * e);
    }

    static  {

    }

    static  {

    }

    static  {

    }

    static  {

    }

    static  {

    }
}
