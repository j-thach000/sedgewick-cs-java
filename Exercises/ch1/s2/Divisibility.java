public class Divisibility {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Uses the modulo operator to produce a remainder for comparison
        boolean isDivisible = (a % 7 == 0) && (b % 7 == 0);

        System.out.println(isDivisible);
    }
}
