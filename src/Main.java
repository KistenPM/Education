import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //----------------------------------------------------------------------------------------

        // ВИДЫ ПЕРЕМЕННЫХ (основные)

        // int a = 10; //целое число
        // double b = 10.5432; //дробное число
        // String c = "Hello there"; //строка (состоит из символов char)
        // char d = 'B'; //символ
        // boolean e = true; //принимает значение True/False

        //----------------------------------------------------------------------------------------

        // ПРОЦЕДУРЫ ВВОДА И ВЫВОДА

        System.out.println("Hello there!"); //Вывод текста

        //----------------------------------------------------------------------------------------

        // РАБОТА С ПЕРЕМЕННЫМИ

        int a = 50;
        System.out.println(a); //Вывод переменной

        int b = 20;
        System.out.println("b = " +b); //Вывод текста с переменной

        // АРИФМЕТИЧЕСКИЕ ДЕЙСТВИЯ С ПЕРЕМЕННЫМИ

        int c = 10;
        System.out.println(c + b); //Сложение
        System.out.println(c - b); //Вычитание
        System.out.println(c * b); //Умножение
        System.out.println(c / b); //Деление
        System.out.println(c % b); //Остаток от деления

        //----------------------------------------------------------------------------------------

        //СЧИТЫВАНИЕ ДАННЫХ С КЛАВИАТУРЫ

        Scanner sc = new Scanner(System.in); //Scanner (класс Джавы, считывающий данные с клавиатуры) sc (название, любое)

        int d, e;

        d = sc.nextInt(); //Считывание целого числа
        e = sc.nextInt();

        System.out.println(d + e);

        String f;

        f = sc.nextLine(); //Считывание строки
        System.out.println(f);

    }
}