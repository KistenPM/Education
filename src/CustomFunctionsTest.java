public class CustomFunctionsTest {
    public static void main(String[] args) {
        float t = multiply(1, 2, 3,4);
        System.out.println(t);
        float t2 = pi(4, 1, 1000000, 0);
        System.out.println(t2);
    }
    static float multiply(float a, float b, float c, float d) {
        return a * b * c * d;
    }
    static float pi(float a, float b, float c, float d) {
        boolean sign = true;
        for (b = 1; c > b; b+=2) {
            if (sign) {
                d += a / b;
            }
            else {
                d -= a / b;
            }
            sign = !sign;
        }
        return d;
    }
}