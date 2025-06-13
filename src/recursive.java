public class recursive {
    static int factorial(int c){
        int result = 1;
        for (int i = 1; i <= c; i++) {
            result *= i;
        }
        return result;
    }
}
