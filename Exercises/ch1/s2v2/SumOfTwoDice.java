public class SumOfTwoDice {
    public static void main(String[] args) {
        // Write a program SumOfTwoDice.java that prints the sum of two random
        // integers between 1 and 6 (such as you might get when rolling dice).

        int die = 6;

        double roll1 = 1 + (int) (Math.random() * die);
        System.out.println("The result of die 1 was " + (int) roll1);
        double roll2 = 1 + (int) (Math.random() * die);
        System.out.println("The result of die 2 was " + (int) roll2);

        double result = roll1 + roll2;
        System.out.println("The sum of the dice was " + (int) result);
    }
}
