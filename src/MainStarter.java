import java.util.Scanner;

public class MainStarter {
    static String[] Pink = {
            "Pink",
            "Green",
            "Blue"
    };
    // Можно записывать массивы и задавать переменные в пространстве класса, чтобы они не мешались в основном пространстве кода.
    public static void main(String[] args) {

        System.out.println("Hello there, unknown user.\n");
        System.out.print("Enter your name, please: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("\nWelcome to the session, " + name + ".\n");
        System.out.println("What do you want to do?\n");

        String[] UserOptionsList = {
                "Identify",
                "List",
                "Exit"
        };
        // Массив 'UserOptionsList' составлен более оптимально, т.к. использует статичную память и программа запрашивает её один раз при запуске, необходимо
        // для уже известных и статичных данных, по типу списка.
        String[] choices = new String[6];

        choices[0] = 1 + " - Conditions";
        choices[1] = 2 + " - Fibonacci";
        choices[2] = 3 + " - Massive";
        choices[3] = 4 + " - Operators";
        choices[4] = 5 + " - Paintree";
        choices[5] = 6 + " - WordsFencefier";
        // Массив 'choices' составлен менее оптимально, т.к. использует динамическую память, чтобы создать статическую и программа запрашивает её после запуска и несколько раз,
        // что необходимо для неизвестных данных, которые могут изменяться.
        for (String list : UserOptionsList) {
            System.out.println(list);
        }

        System.out.println();
        String choice1 = sc.nextLine();
        switch (choice1) {
            case "Identify" -> System.out.println("You are identifying in session as " + name);
            case "List" -> {
                System.out.println();
                for (String choice : choices) {
                    System.out.println(choice);
                }
                System.out.println();
            }
            case "Exit" -> System.exit(0);
        }
        // Оператор Switch управляет потоком выполнения программы. Позволяет выбирать один вариант из множества, на основе выражения. Полезно использовать
        // когда надо выполнить разные действия от одной переменной или когда значений очень много и использование оператора if-else усложняет и угромождает.
        System.out.print("Write the choised number: ");

        String choice2 = sc.nextLine();
        switch (choice2) {
            case "1" -> Conditions();
            case "2" -> Fibonacci();
            case "3" -> Massive();
            case "4" -> Operators();
            case "5" -> Paintree();
            case "6" -> WordsFencefier();
        }
    }
    static void Conditions(){
        System.out.println();
        System.out.println("You have chosen Conditions.");
        Conditions.main(new String[0]);
    }
    static void Fibonacci(){
        System.out.println();
        System.out.println("You have chosen Fibonacci.");
        Fibonacci.main(new String[0]);
    }
    static void Massive(){
        System.out.println();
        System.out.println("You have chosen Massive.");
        Massive.main(new String[0]);
    }
    static void Operators(){
        System.out.println();
        System.out.println("You have chosen Operators.");
        Operators.main(new String[0]);
    }
    static void Paintree(){
        System.out.println();
        System.out.println("You have chosen Paintree.");
        Paintree.main(new String[0]);
    }
    static void WordsFencefier(){
        System.out.println();
        System.out.println("You have chosen WordsFencefier.");
        WordsFencefier.main(new String[0]);
    }
}