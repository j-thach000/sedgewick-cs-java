public class MyProgram {
    public static void main(String[] args) {

        int a = 7, b = 8;
        a = b;
        b = a;
        System.out.println("a = " + a + ", b = " + b);
        // Prediction: a = 8 + , b = 7
        // 50% certainty
        // Result: a = 8, b = 8
        // Explanation:
    }
}
