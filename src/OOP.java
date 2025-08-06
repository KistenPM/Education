import java.util.logging.Logger;

public class OOP {
    public static void main(String[] args){
        Box Boxification = new Box();

        Boxification.img = 
        """
        ┌─────┐
        │winky│
        └─────┘
        """;
        Boxification.displayInfo();
    }
}
class Box {
        String img;
        void displayInfo(){
            System.out.printf("This shuld be output like a box.\n%s", img);
        }
    }