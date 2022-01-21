public class SumOfTwoDice {
    public static void main(String[] args) {
        // Write a program SumOfTwoDice.java that prints the sum of two random
        // integers between 1 and 6 (such as you might get when rolling dice).

        int die = 6;
        double rng = Math.random();

        double roll1 = (die * rng);
        double roll2 = (die * rng);

        double result = (int) ((roll1 + roll2) + 1);
        System.out.println("The sum of the dice was " + (int) result);
    }
}
