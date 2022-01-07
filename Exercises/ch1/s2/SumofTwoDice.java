public class SumofTwoDice {
    public static void main(String[] args) {
        int SIDES = 6;
        int diceA = 1 + (int) (Math.random() * SIDES);
        int diceB = 1 + (int) (Math.random() * SIDES);
        int sum = diceA + diceB;
        System.out.println(sum);
    }
}
