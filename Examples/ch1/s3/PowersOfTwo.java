public class PowersOfTwo {
    public static void main(String[] args) {
        // prints out the powers of 2 until n
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int power = 1;

        while (i <= n) {
            System.out.println(i + " " + power);
            power = 2 * power;
            i = i + 1;
        }
    }
}
