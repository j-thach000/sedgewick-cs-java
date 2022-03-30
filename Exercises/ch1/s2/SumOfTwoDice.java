public class SumOfTwoDice {
    public static void main(String[] args) {
        int DICE = 6;

        // Generates a random number and converts it to integer type
        int d1 = (int) (Math.random() * DICE) + 1;
        int d2 = (int) (Math.random() * DICE) + 1;

        int sum = (d1 + d2);

        System.out.println(sum);
    }
}
