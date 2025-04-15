import java.util.Scanner;

public class WordsFencefier {
    public static void main(String[] args) {
        System.out.print("Enter word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (i % 2 == 0) {  // Четные индексы (0, 2, 4...) в верхнем регистре
                result.append(Character.toUpperCase(currentChar));
            } else {          // Нечетные индексы (1, 3, 5...) в нижнем регистре
                result.append(Character.toLowerCase(currentChar));
            }
        }
        System.out.print("Result: " + result);
    }
}