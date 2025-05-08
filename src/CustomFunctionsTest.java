public class CustomFunctionsTest {
    public static void main(String[] args) {
        float t = multiply(1, 2, 3,4);
        System.out.println(t);
        float t2 = pi(1000000);
        System.out.println(t2);
    }
    static float multiply(float a, float b, float c, float d) {
        return a * b * c * d;
    }
    static float pi(float c) {
        boolean sign = true;
        float b, d = 0;
        for (b = 1; c > b; b+=2) {
            if (sign) {
                d += 4 / b;
            }
            else {
                d -= 4 / b;
            }
            sign = !sign;
        }
        return d;
    }
}