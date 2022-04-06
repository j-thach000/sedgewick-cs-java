public class RollDie {
    public static void main(String[] args) {

        // represents the sides of dice
        int DIE = 6;

        // roll becomes 1-6
        int roll = (int) (Math.random() * DIE) + 1;

        System.out.println(roll);
    }
}
