public class ForPowersOfTwo {
    public static void main(String[] args) {
        // prints the powers of two
        int n = Integer.parseInt(args[0]);
        int power = 1;
        for (int i = 0; i <= n; i++)
        {
            System.out.println(i + " " + power);
            power = 2 * power;
        }
        System.out.println(power);
        //
    }
}
