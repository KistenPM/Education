import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KKLPerID {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter Nickname:");
        String nick= sc.nextLine();
        System.out.print("Enter ID:");
        int id = sc.nextInt();

        Period period = Period.of(3, 7, 11);
        System.out.println(period+" вы с нами. ");

        LocalTime first = LocalTime.of(12, 15, 25);
        LocalTime last = LocalTime.of(15, 30, 50);
        Duration durationT = Duration.between(first, last);

        long hours = durationT.toHours();
        long minutes = durationT.toMinutesPart();
        long seconds = durationT.toSecondsPart();

        String Duration = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Время текущей сессии:"+Duration);

        Person KKL = new Person();
        KKL.displayInfo();

        KKL.Nickname=nick;
        KKL.ID=id;
        KKL.strAge=period.toString();
        KKL.strTime=Duration;
        KKL.displayInfo();
    }
}
class Person {
    String Nickname;    //Никнейм пользователя
    int ID;          //Уникальный ID пользователя
    String strAge;      //Сколько времени с первого захода пользователя
    LocalDate Date = LocalDate.parse(strAge,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    String strTime;     //Сколько времени у пользователя за текущую сессию
    LocalTime Time = LocalTime.parse(strTime,DateTimeFormatter.ofPattern("HH:mm:ss"));
    public void displayInfo(){
        System.out.printf("Nickname: %s \tID: %s \tAge: %s \tTime: %s\n",Nickname,ID,strAge,strTime);
    }
}